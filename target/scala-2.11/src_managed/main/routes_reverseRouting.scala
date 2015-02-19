// @SOURCE:/home/n0tel/projects/DoneDia/conf/routes
// @HASH:875b351b2dc5e7090cd86cdfb3de73c9ad6c3a51
// @DATE:Thu Feb 19 17:23:49 MSK 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:18
class ReverseAssets {


// @LINE:18
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:10
// @LINE:9
def blogCategory(category:String): Call = {
   (category: @unchecked) match {
// @LINE:9
case (category)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "blog" + queryString(List(if(category == "") None else Some(implicitly[QueryStringBindable[String]].unbind("category", category)))))
                                         
   }
}
                                                

// @LINE:12
def blogAjax(category:Option[String] = None, page:Int = 1): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "blogAjax" + queryString(List(if(category == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("category", category)), if(page == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("page", page)))))
}
                        

// @LINE:11
def blogPost(id:String, slug:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("slug", dynamicString(slug)))
}
                        

// @LINE:15
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
                  


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:18
class ReverseAssets {


// @LINE:18
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:10
// @LINE:9
def blogCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blogCategory",
   """
      function(category) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blog" + _qS([(category == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("category", category))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blog/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("category", encodeURIComponent(category))})
      }
      }
   """
)
                        

// @LINE:12
def blogAjax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blogAjax",
   """
      function(category,page) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogAjax" + _qS([(category == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("category", category)), (page == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("page", page))])})
      }
   """
)
                        

// @LINE:11
def blogPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blogPost",
   """
      function(id,slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("slug", encodeURIComponent(slug))})
      }
   """
)
                        

// @LINE:15
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
        


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:18
class ReverseAssets {


// @LINE:18
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:9
def blogCategory(category:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogCategory(category), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogCategory", Seq(classOf[String]), "GET", """ Blog""", _prefix + """blog""")
)
                      

// @LINE:12
def blogAjax(category:Option[String], page:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogAjax(category, page), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogAjax", Seq(classOf[Option[String]], classOf[Int]), "GET", """""", _prefix + """blogAjax""")
)
                      

// @LINE:11
def blogPost(id:String, slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogPost(id, slug), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogPost", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>""")
)
                      

// @LINE:15
def brokenLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.brokenLink(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "brokenLink", Seq(), "GET", """ NotFound""", _prefix + """not-found""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    