
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
object mainContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,collection.immutable.ListMap[String, String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(active: String, title: String, blogCategories: collection.immutable.ListMap[String,String])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.109*/("""
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
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.at("images/favicon.ico")),format.raw/*15.97*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.at("stylesheets/main.css")),format.raw/*16.79*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.at("stylesheets/animate.css")),format.raw/*17.82*/("""">
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js")),format.raw/*18.84*/(""""></script>

        """),format.raw/*20.21*/("""
            """),format.raw/*21.13*/("""<!-- Put this script tag to the <head> of your page -->
        <script type="text/javascript" src="http://vk.com/js/api/share.js?90" charset="windows-1251"></script>

    </head>
    <body>

        """),format.raw/*27.27*/("""
        """),format.raw/*28.9*/("""<div id="fb-root"></div>
        <script>(function(d, s, id) """),format.raw/*29.37*/("""{"""),format.raw/*29.38*/("""
        """),format.raw/*30.9*/("""var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
        fjs.parentNode.insertBefore(js, fjs);
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""(document, 'script', 'facebook-jssdk'));</script>


            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div id="content-layer">

            <nav class="mobile-nav">
                <ul>
                    <li><a href=""""),_display_(/*48.35*/routes/*48.41*/.Application.about()),format.raw/*48.61*/("""">О проекте</a></li>
                    <li><a href=""""),_display_(/*49.35*/routes/*49.41*/.Application.blogCategory("")),format.raw/*49.70*/("""">Статьи</a></li>
                    <li><a href=""""),_display_(/*50.35*/routes/*50.41*/.Application.authors()),format.raw/*50.63*/("""">Авторы</a></li>
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
                        <a href=""""),_display_(/*69.35*/routes/*69.41*/.Application.index()),format.raw/*69.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Молодежный информационно-<br/>аналитический портал</h1>
                        </a>
                    </div>

                    <nav class="topmenu">
                        <ul>
                            <li><a href=""""),_display_(/*77.43*/routes/*77.49*/.Application.about()),format.raw/*77.69*/("""" """),_display_(/*77.72*/if(active=="О проекте")/*77.95*/{_display_(Seq[Any](format.raw/*77.96*/("""class="topmenu-active"""")))}),format.raw/*77.119*/(""">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*78.43*/routes/*78.49*/.Application.blogCategory("")),format.raw/*78.78*/("""">СТАТЬИ</a></li>
                            <li><a href=""""),_display_(/*79.43*/routes/*79.49*/.Application.authors()),format.raw/*79.71*/("""" """),_display_(/*79.74*/if(active=="Авторы")/*79.94*/{_display_(Seq[Any](format.raw/*79.95*/("""class="topmenu-active"""")))}),format.raw/*79.118*/(""">АВТОРЫ</a></li>
                            <!--<li><a href="#">ПОИСК</a><span class="search-icon"></span></li>-->
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


        """),_display_(/*105.10*/content),format.raw/*105.17*/("""

        """),_display_(/*107.10*/footer(blogCategories)),format.raw/*107.32*/("""

    """),format.raw/*109.5*/("""</div>

        <script src=""""),_display_(/*111.23*/routes/*111.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*111.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*112.23*/routes/*112.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*112.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*113.23*/routes/*113.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*113.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*114.23*/routes/*114.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*114.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*115.23*/routes/*115.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*115.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*116.23*/routes/*116.29*/.Assets.at("javascripts/main.js")),format.raw/*116.62*/(""""></script>

    </body>
</html>
"""))}
  }

  def render(active:String,title:String,blogCategories:collection.immutable.ListMap[String, String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(active,title,blogCategories)(content)

  def f:((String,String,collection.immutable.ListMap[String, String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (active,title,blogCategories) => (content) => apply(active,title,blogCategories)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 00:49:19 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/mainContent.scala.html
                  HASH: 703f8bd45617499ac6ff5aff7e6b9ac04a0fd00b
                  MATRIX: 568->1|764->108|791->109|1228->519|1254->524|1283->525|1796->1011|1811->1017|1864->1049|1933->1091|1948->1097|2003->1131|2071->1172|2086->1178|2144->1215|2196->1240|2211->1246|2287->1301|2336->1334|2377->1347|2605->1565|2641->1574|2730->1635|2759->1636|2795->1645|3106->1929|3135->1930|3620->2388|3635->2394|3676->2414|3758->2469|3773->2475|3823->2504|3902->2556|3917->2562|3960->2584|4471->3068|4486->3074|4527->3094|4910->3450|4925->3456|4966->3476|4996->3479|5028->3502|5067->3503|5122->3526|5211->3588|5226->3594|5276->3623|5363->3683|5378->3689|5421->3711|5451->3714|5480->3734|5519->3735|5574->3758|6644->4800|6673->4807|6712->4818|6756->4840|6790->4846|6848->4876|6864->4882|6939->4935|7024->4992|7040->4998|7108->5044|7193->5101|7209->5107|7269->5145|7354->5202|7370->5208|7453->5269|7538->5326|7554->5332|7617->5373|7702->5430|7718->5436|7773->5469
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|41->20|42->21|48->27|49->28|50->29|50->29|51->30|56->35|56->35|69->48|69->48|69->48|70->49|70->49|70->49|71->50|71->50|71->50|90->69|90->69|90->69|98->77|98->77|98->77|98->77|98->77|98->77|98->77|99->78|99->78|99->78|100->79|100->79|100->79|100->79|100->79|100->79|100->79|126->105|126->105|128->107|128->107|130->109|132->111|132->111|132->111|133->112|133->112|133->112|134->113|134->113|134->113|135->114|135->114|135->114|136->115|136->115|136->115|137->116|137->116|137->116
                  -- GENERATED --
              */
          