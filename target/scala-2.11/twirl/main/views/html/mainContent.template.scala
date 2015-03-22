
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

        <!-- Yandex.Metrika counter -->
        <script type="text/javascript">
        (function (d, w, c) """),format.raw/*29.29*/("""{"""),format.raw/*29.30*/("""
        """),format.raw/*30.9*/("""(w[c] = w[c] || []).push(function() """),format.raw/*30.45*/("""{"""),format.raw/*30.46*/("""
        """),format.raw/*31.9*/("""try """),format.raw/*31.13*/("""{"""),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""w.yaCounter28644136 = new Ya.Metrika("""),format.raw/*32.46*/("""{"""),format.raw/*32.47*/("""id:28644136,
        webvisor:true,
        clickmap:true,
        trackLinks:true,
        accurateTrackBounce:true"""),format.raw/*36.33*/("""}"""),format.raw/*36.34*/(""");
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/(""" """),format.raw/*37.11*/("""catch(e) """),format.raw/*37.20*/("""{"""),format.raw/*37.21*/(""" """),format.raw/*37.22*/("""}"""),format.raw/*37.23*/("""
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/(""");

        var n = d.getElementsByTagName("script")[0],
        s = d.createElement("script"),
        f = function () """),format.raw/*42.25*/("""{"""),format.raw/*42.26*/(""" """),format.raw/*42.27*/("""n.parentNode.insertBefore(s, n); """),format.raw/*42.60*/("""}"""),format.raw/*42.61*/(""";
        s.type = "text/javascript";
        s.async = true;
        s.src = (d.location.protocol == "https:" ? "https:" : "http:") + "//mc.yandex.ru/metrika/watch.js";

        if (w.opera == "[object Opera]") """),format.raw/*47.42*/("""{"""),format.raw/*47.43*/("""
        """),format.raw/*48.9*/("""d.addEventListener("DOMContentLoaded", f, false);
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""" """),format.raw/*49.11*/("""else """),format.raw/*49.16*/("""{"""),format.raw/*49.17*/(""" """),format.raw/*49.18*/("""f(); """),format.raw/*49.23*/("""}"""),format.raw/*49.24*/("""
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""")(document, window, "yandex_metrika_callbacks");
        </script>
        <noscript><div><img src="//mc.yandex.ru/watch/28644136" style="position:absolute; left:-9999px;" alt="" /></div></noscript>
        <!-- /Yandex.Metrika counter -->

        <!--LiveInternet counter--><script type="text/javascript"><!--
        new Image().src = "//counter.yadro.ru/hit?r"+
        escape(document.referrer)+((typeof(screen)=="undefined")?"":
        ";s"+screen.width+"*"+screen.height+"*"+(screen.colorDepth?
        screen.colorDepth:screen.pixelDepth))+";u"+escape(document.URL)+
        ";h"+escape(document.title.substring(0,80))+
        ";"+Math.random();//--></script><!--/LiveInternet-->

        """),format.raw/*63.27*/("""
        """),format.raw/*64.9*/("""<div id="fb-root"></div>
        <script>(function(d, s, id) """),format.raw/*65.37*/("""{"""),format.raw/*65.38*/("""
        """),format.raw/*66.9*/("""var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
        fjs.parentNode.insertBefore(js, fjs);
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/("""(document, 'script', 'facebook-jssdk'));</script>


            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div id="content-layer">

            <nav class="mobile-nav">
                <ul>
                    <li><a href=""""),_display_(/*84.35*/routes/*84.41*/.Application.about()),format.raw/*84.61*/("""">О проекте</a></li>
                    <li><a href=""""),_display_(/*85.35*/routes/*85.41*/.Application.blogCategory("")),format.raw/*85.70*/("""">Статьи</a></li>
                    <li><a href=""""),_display_(/*86.35*/routes/*86.41*/.Application.authors()),format.raw/*86.63*/("""">Авторы</a></li>
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
                        <a href=""""),_display_(/*105.35*/routes/*105.41*/.Application.index()),format.raw/*105.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Молодежный информационно-<br/>аналитический портал</h1>
                        </a>
                    </div>

                    <nav class="topmenu">
                        <ul>
                            <li><a href=""""),_display_(/*113.43*/routes/*113.49*/.Application.about()),format.raw/*113.69*/("""" """),_display_(/*113.72*/if(active=="О проекте")/*113.95*/{_display_(Seq[Any](format.raw/*113.96*/("""class="topmenu-active"""")))}),format.raw/*113.119*/(""">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*114.43*/routes/*114.49*/.Application.blogCategory("")),format.raw/*114.78*/("""">СТАТЬИ</a></li>
                            <li><a href=""""),_display_(/*115.43*/routes/*115.49*/.Application.authors()),format.raw/*115.71*/("""" """),_display_(/*115.74*/if(active=="Авторы")/*115.94*/{_display_(Seq[Any](format.raw/*115.95*/("""class="topmenu-active"""")))}),format.raw/*115.118*/(""">АВТОРЫ</a></li>
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


        """),_display_(/*141.10*/content),format.raw/*141.17*/("""

        """),_display_(/*143.10*/footer(blogCategories)),format.raw/*143.32*/("""

    """),format.raw/*145.5*/("""</div>

        <script src=""""),_display_(/*147.23*/routes/*147.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*147.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*148.23*/routes/*148.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*148.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*149.23*/routes/*149.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*149.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*150.23*/routes/*150.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*150.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*151.23*/routes/*151.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*151.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*152.23*/routes/*152.29*/.Assets.at("javascripts/main.js")),format.raw/*152.62*/(""""></script>

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
                  DATE: Sun Mar 22 12:29:55 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/Girhub/DoneDia/DoneDia/app/views/mainContent.scala.html
                  HASH: 932127bf13bf75fed3b957d2d5796bc96ad51abc
                  MATRIX: 568->1|764->108|791->109|1228->519|1254->524|1283->525|1796->1011|1811->1017|1864->1049|1933->1091|1948->1097|2003->1131|2071->1172|2086->1178|2144->1215|2196->1240|2211->1246|2287->1301|2336->1334|2377->1347|2705->1647|2734->1648|2770->1657|2834->1693|2863->1694|2899->1703|2931->1707|2960->1708|2996->1717|3061->1754|3090->1755|3234->1871|3263->1872|3301->1883|3330->1884|3359->1885|3396->1894|3425->1895|3454->1896|3483->1897|3519->1906|3548->1907|3696->2027|3725->2028|3754->2029|3815->2062|3844->2063|4084->2275|4113->2276|4149->2285|4234->2343|4263->2344|4292->2345|4325->2350|4354->2351|4383->2352|4416->2357|4445->2358|4481->2367|4510->2368|5237->3085|5273->3094|5362->3155|5391->3156|5427->3165|5738->3449|5767->3450|6252->3908|6267->3914|6308->3934|6390->3989|6405->3995|6455->4024|6534->4076|6549->4082|6592->4104|7104->4588|7120->4594|7162->4614|7546->4970|7562->4976|7604->4996|7635->4999|7668->5022|7708->5023|7764->5046|7854->5108|7870->5114|7921->5143|8009->5203|8025->5209|8069->5231|8100->5234|8130->5254|8170->5255|8226->5278|9296->6320|9325->6327|9364->6338|9408->6360|9442->6366|9500->6396|9516->6402|9591->6455|9676->6512|9692->6518|9760->6564|9845->6621|9861->6627|9921->6665|10006->6722|10022->6728|10105->6789|10190->6846|10206->6852|10269->6893|10354->6950|10370->6956|10425->6989
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|41->20|42->21|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|57->36|57->36|58->37|58->37|58->37|58->37|58->37|58->37|58->37|59->38|59->38|63->42|63->42|63->42|63->42|63->42|68->47|68->47|69->48|70->49|70->49|70->49|70->49|70->49|70->49|70->49|70->49|71->50|71->50|84->63|85->64|86->65|86->65|87->66|92->71|92->71|105->84|105->84|105->84|106->85|106->85|106->85|107->86|107->86|107->86|126->105|126->105|126->105|134->113|134->113|134->113|134->113|134->113|134->113|134->113|135->114|135->114|135->114|136->115|136->115|136->115|136->115|136->115|136->115|136->115|162->141|162->141|164->143|164->143|166->145|168->147|168->147|168->147|169->148|169->148|169->148|170->149|170->149|170->149|171->150|171->150|171->150|172->151|172->151|172->151|173->152|173->152|173->152
                  -- GENERATED --
              */
          