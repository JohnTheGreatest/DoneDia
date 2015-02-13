package models

import io.prismic._

/**
 * Created by d1sp on 14.12.14.
 */
case class Post (
  id: String,
  thumbUrl: Option[String],
  category: Option[String],
  minToRead: Option[Int],
  title: Option[String],
  tags: Seq[String],
  slug: String,
  likes: Int
)

object Post {
  var ajaxPosts: List[Post] = Nil

  def getAjaxPosts(lastPost: Post): List[Post] = ajaxPosts.::(lastPost)

  def toList(docList: List[Document]): List[Post] = docList.map{doc => new Post(doc.id, doc.getImage("blog.image", "postthumb").map {img => img.url}, doc.getText("blog.category"),
    doc.getText("blog.body").map{text => text.length/900}, doc.getText("blog.title").map{title => title}, doc.tags, doc.slug, 9)}
}


