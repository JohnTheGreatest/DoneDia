// @SOURCE:/home/n0tel/projects/DoneDia/conf/routes
// @HASH:ce1c7cea312840c5003e128a988804007841781b
// @DATE:Mon Feb 16 13:48:48 MSK 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {


// @LINE:17
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:9
def blogCategory(category:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "blog/" + implicitly[PathBindable[String]].unbind("category", dynamicString(category)))
}
                        

// @LINE:11
def blogAjax(category:Option[String] = None, page:Int = 1): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "blogAjax" + queryString(List(if(category == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("category", category)), if(page == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("page", page)))))
}
                        

// @LINE:10
def blogPost(id:String, slug:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("slug", dynamicString(slug)))
}
                        

// @LINE:14
def brokenLink(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "not-found")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:17
class ReverseAssets {


// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:9
def blogCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blogCategory",
   """
      function(category) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blog/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("category", encodeURIComponent(category))})
      }
   """
)
                        

// @LINE:11
def blogAjax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blogAjax",
   """
      function(category,page) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogAjax" + _qS([(category == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("category", category)), (page == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("page", page))])})
      }
   """
)
                        

// @LINE:10
def blogPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blogPost",
   """
      function(id,slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("slug", encodeURIComponent(slug))})
      }
   """
)
                        

// @LINE:14
def brokenLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.brokenLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "not-found"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {


// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:9
def blogCategory(category:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogCategory(category), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogCategory", Seq(classOf[String]), "GET", """ Blog""", _prefix + """blog/$category<[^/]+>""")
)
                      

// @LINE:11
def blogAjax(category:Option[String], page:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogAjax(category, page), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogAjax", Seq(classOf[Option[String]], classOf[Int]), "GET", """""", _prefix + """blogAjax""")
)
                      

// @LINE:10
def blogPost(id:String, slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogPost(id, slug), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogPost", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>""")
)
                      

// @LINE:14
def brokenLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.brokenLink(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "brokenLink", Seq(), "GET", """ NotFound""", _prefix + """not-found""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    