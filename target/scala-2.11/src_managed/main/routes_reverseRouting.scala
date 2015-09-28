// @SOURCE:C:/Users/d1sp/Documents/GitHub/DoneDia/conf/routes
// @HASH:400ed7ebfe0fb4f9819b597dcc318cb215e3c547
// @DATE:Mon Sep 28 13:56:36 MSK 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:6
package controllers {

// @LINE:28
class ReverseAssets {


// @LINE:28
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:20
// @LINE:19
def blogCategory(category:String): Call = {
   (category: @unchecked) match {
// @LINE:19
case (category)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "blog" + queryString(List(if(category == "") None else Some(implicitly[QueryStringBindable[String]].unbind("category", category)))))
                                         
   }
}
                                                

// @LINE:15
def videos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "videos")
}
                        

// @LINE:8
def about(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                        

// @LINE:22
def blogAjax(category:Option[String] = None, page:Int = 1): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "blogAjax" + queryString(List(if(category == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("category", category)), if(page == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("page", page)))))
}
                        

// @LINE:21
def blogPost(id:String, slug:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("slug", dynamicString(slug)))
}
                        

// @LINE:12
def author(id:String, slug:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authors/" + implicitly[PathBindable[String]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("slug", dynamicString(slug)))
}
                        

// @LINE:25
def brokenLink(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "not-found")
}
                        

// @LINE:11
def authors(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authors")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:16
def video(id:String, slug:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "videos/" + implicitly[PathBindable[String]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("slug", dynamicString(slug)))
}
                        

}
                          
}
                  


// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:28
class ReverseAssets {


// @LINE:28
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:20
// @LINE:19
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
                        

// @LINE:15
def videos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.videos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videos"})
      }
   """
)
                        

// @LINE:8
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:22
def blogAjax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blogAjax",
   """
      function(category,page) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogAjax" + _qS([(category == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("category", category)), (page == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("page", page))])})
      }
   """
)
                        

// @LINE:21
def blogPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blogPost",
   """
      function(id,slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("slug", encodeURIComponent(slug))})
      }
   """
)
                        

// @LINE:12
def author : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.author",
   """
      function(id,slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authors/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("slug", encodeURIComponent(slug))})
      }
   """
)
                        

// @LINE:25
def brokenLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.brokenLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "not-found"})
      }
   """
)
                        

// @LINE:11
def authors : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authors",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authors"})
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
                        

// @LINE:16
def video : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.video",
   """
      function(id,slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videos/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("slug", encodeURIComponent(slug))})
      }
   """
)
                        

}
              
}
        


// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:28
class ReverseAssets {


// @LINE:28
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:19
def blogCategory(category:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogCategory(category), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogCategory", Seq(classOf[String]), "GET", """ Blog""", _prefix + """blog""")
)
                      

// @LINE:15
def videos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.videos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "videos", Seq(), "GET", """ Videos""", _prefix + """videos""")
)
                      

// @LINE:8
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:22
def blogAjax(category:Option[String], page:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogAjax(category, page), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogAjax", Seq(classOf[Option[String]], classOf[Int]), "GET", """""", _prefix + """blogAjax""")
)
                      

// @LINE:21
def blogPost(id:String, slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blogPost(id, slug), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blogPost", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>""")
)
                      

// @LINE:12
def author(id:String, slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.author(id, slug), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "author", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """authors/$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>""")
)
                      

// @LINE:25
def brokenLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.brokenLink(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "brokenLink", Seq(), "GET", """ NotFound""", _prefix + """not-found""")
)
                      

// @LINE:11
def authors(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authors(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authors", Seq(), "GET", """ Authors""", _prefix + """authors""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:16
def video(id:String, slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.video(id, slug), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "video", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """videos/$id<[-_a-zA-Z0-9]{16}>/$slug<[^/]+>""")
)
                      

}
                          
}
        
    