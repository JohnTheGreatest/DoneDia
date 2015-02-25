// @SOURCE:/home/n0tel/projects/DoneDia/conf/routes
// @HASH:191f936182c4f1aa884f74909ac9980239887a95
// @DATE:Thu Feb 26 00:49:19 MSK 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_about1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
private[this] lazy val controllers_Application_about1_invoker = createInvoker(
controllers.Application.about,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
        

// @LINE:11
private[this] lazy val controllers_Application_authors2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authors"))))
private[this] lazy val controllers_Application_authors2_invoker = createInvoker(
controllers.Application.authors,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authors", Nil,"GET", """ Authors""", Routes.prefix + """authors"""))
        

// @LINE:12
private[this] lazy val controllers_Application_author3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authors/"),DynamicPart("id", """[-_a-zA-Z0-9]{16}""",false),StaticPart("/"),DynamicPart("slug", """[^/]+""",true))))
private[this] lazy val controllers_Application_author3_invoker = createInvoker(
controllers.Application.author(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "author", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """authors/$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_Application_blogCategory4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blog"))))
private[this] lazy val controllers_Application_blogCategory4_invoker = createInvoker(
controllers.Application.blogCategory(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogCategory", Seq(classOf[String]),"GET", """ Blog""", Routes.prefix + """blog"""))
        

// @LINE:16
private[this] lazy val controllers_Application_blogCategory5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blog/"),DynamicPart("category", """[^/]+""",true))))
private[this] lazy val controllers_Application_blogCategory5_invoker = createInvoker(
controllers.Application.blogCategory(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogCategory", Seq(classOf[String]),"GET", """""", Routes.prefix + """blog/$category<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_Application_blogPost6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[-_a-zA-Z0-9]{16}""",false),StaticPart("/"),DynamicPart("slug", """[^/]+""",true))))
private[this] lazy val controllers_Application_blogPost6_invoker = createInvoker(
controllers.Application.blogPost(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogPost", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_Application_blogAjax7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blogAjax"))))
private[this] lazy val controllers_Application_blogAjax7_invoker = createInvoker(
controllers.Application.blogAjax(fakeValue[Option[String]], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogAjax", Seq(classOf[Option[String]], classOf[Int]),"GET", """""", Routes.prefix + """blogAjax"""))
        

// @LINE:21
private[this] lazy val controllers_Application_brokenLink8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("not-found"))))
private[this] lazy val controllers_Application_brokenLink8_invoker = createInvoker(
controllers.Application.brokenLink(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "brokenLink", Nil,"GET", """ NotFound""", Routes.prefix + """not-found"""))
        

// @LINE:24
private[this] lazy val controllers_Assets_at9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authors""","""controllers.Application.authors"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authors/$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>""","""controllers.Application.author(id:String, slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog""","""controllers.Application.blogCategory(category:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog/$category<[^/]+>""","""controllers.Application.blogCategory(category:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>""","""controllers.Application.blogPost(id:String, slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blogAjax""","""controllers.Application.blogAjax(category:Option[String] ?= None, page:Int ?= 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-found""","""controllers.Application.brokenLink()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:8
case controllers_Application_about1_route(params) => {
   call { 
        controllers_Application_about1_invoker.call(controllers.Application.about)
   }
}
        

// @LINE:11
case controllers_Application_authors2_route(params) => {
   call { 
        controllers_Application_authors2_invoker.call(controllers.Application.authors)
   }
}
        

// @LINE:12
case controllers_Application_author3_route(params) => {
   call(params.fromPath[String]("id", None), params.fromPath[String]("slug", None)) { (id, slug) =>
        controllers_Application_author3_invoker.call(controllers.Application.author(id, slug))
   }
}
        

// @LINE:15
case controllers_Application_blogCategory4_route(params) => {
   call(params.fromQuery[String]("category", Some(""))) { (category) =>
        controllers_Application_blogCategory4_invoker.call(controllers.Application.blogCategory(category))
   }
}
        

// @LINE:16
case controllers_Application_blogCategory5_route(params) => {
   call(params.fromPath[String]("category", None)) { (category) =>
        controllers_Application_blogCategory5_invoker.call(controllers.Application.blogCategory(category))
   }
}
        

// @LINE:17
case controllers_Application_blogPost6_route(params) => {
   call(params.fromPath[String]("id", None), params.fromPath[String]("slug", None)) { (id, slug) =>
        controllers_Application_blogPost6_invoker.call(controllers.Application.blogPost(id, slug))
   }
}
        

// @LINE:18
case controllers_Application_blogAjax7_route(params) => {
   call(params.fromQuery[Option[String]]("category", Some(None)), params.fromQuery[Int]("page", Some(1))) { (category, page) =>
        controllers_Application_blogAjax7_invoker.call(controllers.Application.blogAjax(category, page))
   }
}
        

// @LINE:21
case controllers_Application_brokenLink8_route(params) => {
   call { 
        controllers_Application_brokenLink8_invoker.call(controllers.Application.brokenLink())
   }
}
        

// @LINE:24
case controllers_Assets_at9_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     