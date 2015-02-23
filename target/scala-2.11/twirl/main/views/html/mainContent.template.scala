
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object mainContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,collection.immutable.ListMap[String, String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, blogCategories: collection.immutable.ListMap[String,String])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.93*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>"""),_display_(/*10.17*/title),format.raw/*10.22*/(""" """),format.raw/*10.23*/("""- Диапост.ру</title>
        <meta name="description" content="Диапост - это неожиданный ракурс, когда мы говорим на современном языке о вечных ценностях: вере, любви, семье, Родине, правде, справедливости, братстве.">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- ADD all SEO meta and OpenGraph -->
        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.at("stylesheets/main.css")),format.raw/*15.79*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.at("stylesheets/animate.css")),format.raw/*16.82*/("""">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js")),format.raw/*17.84*/(""""></script>

        """),format.raw/*19.21*/("""
            """),format.raw/*20.13*/("""<!-- Put this script tag to the <head> of your page -->
        <script type="text/javascript" src="http://vk.com/js/api/share.js?90" charset="windows-1251"></script>

    </head>
    <body>

        """),format.raw/*26.27*/("""
        """),format.raw/*27.9*/("""<div id="fb-root"></div>
        <script>(function(d, s, id) """),format.raw/*28.37*/("""{"""),format.raw/*28.38*/("""
        """),format.raw/*29.9*/("""var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
        fjs.parentNode.insertBefore(js, fjs);
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""(document, 'script', 'facebook-jssdk'));</script>


            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div id="content-layer">

            <nav class="mobile-nav">
                <ul>
                    <li><a href="#">О проекте</a></li>
                    <li><a href=""""),_display_(/*48.35*/routes/*48.41*/.Application.blogCategory("")),format.raw/*48.70*/("""">Статьи</a></li>
                    <li><a href="#">Авторы</a></li>
                </ul>
            </nav>

        </div>

        <div class="main">

            <div class="hamburger-wrapper">
                <div id="hamburger">
                    <div></div>
                    <div></div>
                    <div></div>
                </div>
            </div>

            <header class="dg-header">
                <div class="container">
                    <div class="logo-wrapper">
                        <a href=""""),_display_(/*68.35*/routes/*68.41*/.Application.index()),format.raw/*68.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Информационно-аналитический<br/>молодежный портал</h1>
                        </a>
                    </div>

                    <nav class="topmenu">
                        <ul>
                            <li><a href=""""),_display_(/*76.43*/routes/*76.49*/.Application.about()),format.raw/*76.69*/("""">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*77.43*/routes/*77.49*/.Application.blogCategory("")),format.raw/*77.78*/("""">СТАТЬИ</a></li>
                                <!--<li><a href="#">АВТОРЫ</a></li>
                            <li><a href="#">ПОИСК</a><span class="search-icon"></span></li>-->
                                <!--<li><a href="#">ВОЙТИ</a><span class="person-icon"></span></li>-->
                        </ul>
                    </nav>

                        <!--<a class="button button-flat-primary dg-header__btn" href="#">ИЩЕМ АВТОРОВ</a>-->
                    <div class="dg-header__btn social-btns">
                        <ul>
                            <li>
                                <a href="http://vk.com/diapost" target="_blank" class="vkontakte-icon"></a>
                            </li>
                            <li>
                                <a href="#" class="facebook-icon"></a>
                            </li>
                            <li>
                                <a href="#" class="twitter-icon"></a>
                            </li>
                        </ul>
                    </div>

                </div>

            </header>


        """),_display_(/*104.10*/content),format.raw/*104.17*/("""

        """),_display_(/*106.10*/footer(blogCategories)),format.raw/*106.32*/("""

    """),format.raw/*108.5*/("""</div>

        <script src=""""),_display_(/*110.23*/routes/*110.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*110.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*111.23*/routes/*111.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*111.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*112.23*/routes/*112.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*112.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*113.23*/routes/*113.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*113.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*114.23*/routes/*114.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*114.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*115.23*/routes/*115.29*/.Assets.at("javascripts/main.js")),format.raw/*115.62*/(""""></script>

    </body>
</html>
"""))}
  }

  def render(title:String,blogCategories:collection.immutable.ListMap[String, String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,blogCategories)(content)

  def f:((String,collection.immutable.ListMap[String, String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,blogCategories) => (content) => apply(title,blogCategories)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 04:23:40 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/mainContent.scala.html
                  HASH: 1abcd2d43193539c14dace39062bc5d6a4f1dc7c
                  MATRIX: 561->1|740->92|767->93|1204->503|1230->508|1259->509|1752->975|1767->981|1822->1015|1890->1056|1905->1062|1963->1099|2015->1124|2030->1130|2106->1185|2155->1218|2196->1231|2424->1449|2460->1458|2549->1519|2578->1520|2614->1529|2925->1813|2954->1814|3494->2327|3509->2333|3559->2362|4122->2898|4137->2904|4178->2924|4560->3279|4575->3285|4616->3305|4706->3368|4721->3374|4771->3403|5906->4510|5935->4517|5974->4528|6018->4550|6052->4556|6110->4586|6126->4592|6201->4645|6286->4702|6302->4708|6370->4754|6455->4811|6471->4817|6531->4855|6616->4912|6632->4918|6715->4979|6800->5036|6816->5042|6879->5083|6964->5140|6980->5146|7035->5179
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|40->19|41->20|47->26|48->27|49->28|49->28|50->29|55->34|55->34|69->48|69->48|69->48|89->68|89->68|89->68|97->76|97->76|97->76|98->77|98->77|98->77|125->104|125->104|127->106|127->106|129->108|131->110|131->110|131->110|132->111|132->111|132->111|133->112|133->112|133->112|134->113|134->113|134->113|135->114|135->114|135->114|136->115|136->115|136->115
                  -- GENERATED --
              */
          