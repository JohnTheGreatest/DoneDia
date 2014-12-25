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

  def PageNotFound(implicit ctx: Prismic.Context) = NotFound(views.html.pageNotFound())

  def brokenLink = Prismic.action { implicit request =>
    Future.successful(PageNotFound)
  }

  // -- Resolve links to documents
  def linkResolver(api: Api)(implicit request: RequestHeader) = DocumentLinkResolver(api) {

    // Blog
    case (Fragment.DocumentLink(id, "blog-posts", _, slug, false), _) => routes.Application.blogPost(id, slug).absoluteURL()

    case anyOtherLink => routes.Application.brokenLink.absoluteURL()
  }

  def index = Prismic.action { implicit request =>
    for {
      posts <- ctx.api.forms("blog-posts").orderings("[my.blog.date desc]").ref(ctx.ref).submit()
      authors <- ctx.api.forms("authors")
        .pageSize(4)
        .ref(ctx.ref)
        .submit()
    } yield {
      Ok(views.html.index(posts.results, authors.results))
    }
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
  /*val ajaxPosts:Seq[Post] = Seq(Post("1dasd", Option("ffff"), Option("ffff"),Option(2), Option("Good"), Seq("любовь", "красота"), 3))*/
  // Написать класс с запросом постов по категориям через jsRouter
  val ajaxPosts: List[Post] = List(Post("asdasd", Option("asdasd"), Option("asdasdasd"), Option(13), Option("Haha"), Seq("красота", "любовь"), 3), Post("asdasd", Option("asdasd"), Option("asdasdasd"), Option(13), Option("Haha"), Seq("красота", "любовь"), 3))

  def blogAjax(maybeCategory: Option[String]) = Prismic.action { implicit request =>
    for {
      posts <- maybeCategory.map {category =>
        ctx.api.forms("blog-posts")
          .query(s"""[[:d = at(my.blog.category, "$category")]]""")
          .orderings("[my.blog.date desc]")
          .ref(ctx.ref)
          .submit()
      }.getOrElse(ctx.api.forms("blog-posts").orderings("[my.blog.date desc]").ref(ctx.ref).submit())
    } yield {
      Ok(Json.toJson(Post.toList(posts.results)))
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
      Ok(views.html.post.posts(posts.results, BlogCategories))
    }
  }

  // -- Blog

  val BlogCategories = collection.immutable.ListMap(
    "izvestiya" -> "Известия",
    "vlast" -> "Власть",
    "domostroitelstvo" -> "Домостроительство",
    "obshestvo" -> "Общество",
    "kon" -> "К.О.Н.",
    "mirovozzrenie" -> "Мировоззрение",
    "letopis" -> "Летопись",
    "obrazi" -> "Хранилище образов"
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

}
