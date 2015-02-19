// @SOURCE:/home/n0tel/projects/DoneDia/conf/routes
// @HASH:875b351b2dc5e7090cd86cdfb3de73c9ad6c3a51
// @DATE:Thu Feb 19 17:23:49 MSK 2015


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
        

// @LINE:9
private[this] lazy val controllers_Application_blogCategory1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blog"))))
private[this] lazy val controllers_Application_blogCategory1_invoker = createInvoker(
controllers.Application.blogCategory(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogCategory", Seq(classOf[String]),"GET", """ Blog""", Routes.prefix + """blog"""))
        

// @LINE:10
private[this] lazy val controllers_Application_blogCategory2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blog/"),DynamicPart("category", """[^/]+""",true))))
private[this] lazy val controllers_Application_blogCategory2_invoker = createInvoker(
controllers.Application.blogCategory(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogCategory", Seq(classOf[String]),"GET", """""", Routes.prefix + """blog/$category<[^/]+>"""))
        

// @LINE:11
private[this] lazy val controllers_Application_blogPost3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[-_a-zA-Z0-9]{16}""",false),StaticPart("/"),DynamicPart("slug", """[^/]+""",true))))
private[this] lazy val controllers_Application_blogPost3_invoker = createInvoker(
controllers.Application.blogPost(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogPost", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_Application_blogAjax4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blogAjax"))))
private[this] lazy val controllers_Application_blogAjax4_invoker = createInvoker(
controllers.Application.blogAjax(fakeValue[Option[String]], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogAjax", Seq(classOf[Option[String]], classOf[Int]),"GET", """""", Routes.prefix + """blogAjax"""))
        

// @LINE:15
private[this] lazy val controllers_Application_brokenLink5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("not-found"))))
private[this] lazy val controllers_Application_brokenLink5_invoker = createInvoker(
controllers.Application.brokenLink(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "brokenLink", Nil,"GET", """ NotFound""", Routes.prefix + """not-found"""))
        

// @LINE:18
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog""","""controllers.Application.blogCategory(category:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog/$category<[^/]+>""","""controllers.Application.blogCategory(category:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>""","""controllers.Application.blogPost(id:String, slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blogAjax""","""controllers.Application.blogAjax(category:Option[String] ?= None, page:Int ?= 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-found""","""controllers.Application.brokenLink()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:9
case controllers_Application_blogCategory1_route(params) => {
   call(params.fromQuery[String]("category", Some(""))) { (category) =>
        controllers_Application_blogCategory1_invoker.call(controllers.Application.blogCategory(category))
   }
}
        

// @LINE:10
case controllers_Application_blogCategory2_route(params) => {
   call(params.fromPath[String]("category", None)) { (category) =>
        controllers_Application_blogCategory2_invoker.call(controllers.Application.blogCategory(category))
   }
}
        

// @LINE:11
case controllers_Application_blogPost3_route(params) => {
   call(params.fromPath[String]("id", None), params.fromPath[String]("slug", None)) { (id, slug) =>
        controllers_Application_blogPost3_invoker.call(controllers.Application.blogPost(id, slug))
   }
}
        

// @LINE:12
case controllers_Application_blogAjax4_route(params) => {
   call(params.fromQuery[Option[String]]("category", Some(None)), params.fromQuery[Int]("page", Some(1))) { (category, page) =>
        controllers_Application_blogAjax4_invoker.call(controllers.Application.blogAjax(category, page))
   }
}
        

// @LINE:15
case controllers_Application_brokenLink5_route(params) => {
   call { 
        controllers_Application_brokenLink5_invoker.call(controllers.Application.brokenLink())
   }
}
        

// @LINE:18
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     