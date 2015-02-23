package controllers

import play.api._
import play.api.mvc._
import org.joda.time._

import play.api.libs.concurrent.Execution.Implicits._
import scala.concurrent._

import Play.current
import io.prismic._

import play.api.libs.json._
import play.api.libs.functional.syntax._

import models.Post
import scala.collection.mutable.ListBuffer

object Application extends Controller {

  import Prismic._

  // -- Page not found

  def PageNotFound(implicit ctx: Prismic.Context) = NotFound(views.html.pageNotFound(BlogCategories))

  def brokenLink = Prismic.action { implicit request =>
    Future.successful(PageNotFound)
  }

  // -- Resolve links to documents
  def linkResolver(api: Api)(implicit request: RequestHeader) = DocumentLinkResolver(api) {

    // Blog
    case (Fragment.DocumentLink(id, "blog-posts", _, slug, false), _) => routes.Application.blogPost(id, slug).absoluteURL()

    // Author
    case (Fragment.DocumentLink(id, "authors", _, slug, false), _) => routes.Application.author(id, slug).absoluteURL()

    case anyOtherLink => routes.Application.brokenLink.absoluteURL()
  }

  def index = Prismic.action { implicit request =>
    for {
      posts <- ctx.api.forms("blog-posts").orderings("[my.blog.date desc]").ref(ctx.ref).submit()
      authors <- ctx.api.forms("authors")
        .pageSize(4)
        .ref(ctx.ref)
        .submit()
      firstPost <- ctx.api.forms("blog-posts")
        .query(s"""[[:d = at(my.blog.first, "Yes")]]""")
        .pageSize(1)
        .ref(ctx.ref)
        .submit()
    } yield {
      Ok(views.html.index(posts.results, firstPost.results, authors.results, BlogCategories))
    }
  }

  def about = Prismic.action { implicit request =>
    Future.successful(Ok(views.html.about.about(BlogCategories)))
  }


  /*// Json writer for Post class
  implicit val postWriter: Writes[Post] = (
    (JsPath \ "id").write[Int] and
    (JsPath \ "thumbUrl").write[String] and
    (JsPath \ "category").write[String] and
    (JsPath \ "minToRead").write[Int] and
    (JsPath \ "title").write[String] and
    (JsPath \ "tags").write[Seq[String]] and
    (JsPath \ "likes").write[Int]
  )(unlift(Post.unapply))*/

  implicit val postWrites = Json.writes[Post]

  /**
   * Делает запрос в призмик, на получение статей (постов). 
   * @param maybeCategory - категория, из которой необходимо получить посты. Если не указана,
   *                      возвращаются все.*
   * @param page - страница постов. На одной странице по 4 поста. По умолчанию возвращается первая.
   * @return json формата
   *         {
   *          hasNext: boolean,
   *          posts: [<объекты постов>]
   *         }         
   */
  def blogAjax(maybeCategory: Option[String], page: Int) = Prismic.action { implicit request =>
    for {
      posts <- maybeCategory.map {category =>
        ctx.api.forms("blog-posts")
          .query(s"""[[:d = at(my.blog.category, "$category")]]""")
          .pageSize(4)
          .page(page)
          .orderings("[my.blog.date desc]")
          .ref(ctx.ref)
          .submit()
      }.getOrElse(ctx.api.forms("blog-posts").pageSize(4).page(page).orderings("[my.blog.date desc]").ref(ctx.ref).submit())
    } yield {
      val postsJsonArr = Json.toJson(Post.toList(posts.results))
      Ok(JsObject(Seq(
        "hasNext" -> JsBoolean(posts.nextPage.isDefined),
        "posts" -> postsJsonArr
      )))
    }
  }

  def blogCategory(category: String) = Prismic.action { implicit request =>
    for {
      posts <- BlogCategories.get(category).map{ cat =>
        ctx.api.forms("blog-posts")
          .query(s"""[[:d = at(my.blog.category, "$cat")]]""")
          .orderings("[my.blog.date desc]")
          .ref(ctx.ref)
          .submit()
      }.getOrElse(ctx.api.forms("blog-posts").orderings("[my.blog.date desc]").ref(ctx.ref).submit())
    } yield {
      Ok(views.html.post.posts(posts.results, BlogCategories, BlogCategories.get(category)))
    }
  }

  // -- Blog

  val BlogCategories = collection.immutable.ListMap(
    "izvestiya" -> "Известия",
    "vlast" -> "Власть",
    "domostroitelstvo" -> "Домостроительство",
    "obshestvo" -> "Общество",
    "kon" -> "Культура.Образование.Наука",
    "mirovozzrenie" -> "Мировоззрение",
    "letopis" -> "Летопись",
    "obrazi" -> "Образы"
  )

  def blogPost(id: String, slug: String) = Prismic.action { implicit request =>
    for {
      maybePost <- getDocument(id)
      relatedPosts <- getDocuments(maybePost.map(_.getAll("blog.relatedpost").collect {
        case Fragment.DocumentLink(id, "blog", _, _, false) => id
      }).getOrElse(Nil): _*)
      author <- getDocument(maybePost.get.get("blog.author").collect{
        case Fragment.DocumentLink(id, "author", _, _, false) => id
      }.getOrElse("No"))
      jumbo <- getDocument(maybePost.get.get("blog.jumbo").collect{
        case Fragment.DocumentLink(id, "jumbo-video", _, _, false) => id
      }.getOrElse("Haha"))
    } yield {
      checkSlug(maybePost, slug) {
        case Left(newSlug) => MovedPermanently(routes.Application.blogPost(id, newSlug).url)
        case Right(post)   => Ok(views.html.post.postDetail(post, relatedPosts, author.get, BlogCategories, jumbo))
      }
    }
  }

  def authors = Prismic.action { implicit request =>
    for {
      authors <- ctx.api.forms("authors")
        .ref(ctx.ref)
        .submit()
    } yield {
      Ok(views.html.authors.authors(authors.results, BlogCategories))
    }
  }

  def author(id: String, slug: String) = Prismic.action { implicit request =>
    for {
      author <- getDocument(id)
    } yield {
      checkSlug(author, slug) {
        case Left(newSlug) => MovedPermanently(routes.Application.author(id, newSlug).url)
        case Right(author)   => Ok(views.html.authors.author(author, BlogCategories))
      }
    }
  }

}
