
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
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.at("stylesheets/magnific-popup.css")),format.raw/*18.89*/("""">
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js")),format.raw/*19.84*/(""""></script>

        """),format.raw/*21.21*/("""
            """),format.raw/*22.13*/("""<!-- Put this script tag to the <head> of your page -->
        <script type="text/javascript" src="http://vk.com/js/api/share.js?90" charset="windows-1251"></script>

    </head>
    <body>

        <!-- Yandex.Metrika counter -->
        <script type="text/javascript">
        (function (d, w, c) """),format.raw/*30.29*/("""{"""),format.raw/*30.30*/("""
        """),format.raw/*31.9*/("""(w[c] = w[c] || []).push(function() """),format.raw/*31.45*/("""{"""),format.raw/*31.46*/("""
        """),format.raw/*32.9*/("""try """),format.raw/*32.13*/("""{"""),format.raw/*32.14*/("""
        """),format.raw/*33.9*/("""w.yaCounter28644136 = new Ya.Metrika("""),format.raw/*33.46*/("""{"""),format.raw/*33.47*/("""id:28644136,
        webvisor:true,
        clickmap:true,
        trackLinks:true,
        accurateTrackBounce:true"""),format.raw/*37.33*/("""}"""),format.raw/*37.34*/(""");
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/(""" """),format.raw/*38.11*/("""catch(e) """),format.raw/*38.20*/("""{"""),format.raw/*38.21*/(""" """),format.raw/*38.22*/("""}"""),format.raw/*38.23*/("""
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/(""");

        var n = d.getElementsByTagName("script")[0],
        s = d.createElement("script"),
        f = function () """),format.raw/*43.25*/("""{"""),format.raw/*43.26*/(""" """),format.raw/*43.27*/("""n.parentNode.insertBefore(s, n); """),format.raw/*43.60*/("""}"""),format.raw/*43.61*/(""";
        s.type = "text/javascript";
        s.async = true;
        s.src = (d.location.protocol == "https:" ? "https:" : "http:") + "//mc.yandex.ru/metrika/watch.js";

        if (w.opera == "[object Opera]") """),format.raw/*48.42*/("""{"""),format.raw/*48.43*/("""
        """),format.raw/*49.9*/("""d.addEventListener("DOMContentLoaded", f, false);
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""" """),format.raw/*50.11*/("""else """),format.raw/*50.16*/("""{"""),format.raw/*50.17*/(""" """),format.raw/*50.18*/("""f(); """),format.raw/*50.23*/("""}"""),format.raw/*50.24*/("""
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""")(document, window, "yandex_metrika_callbacks");
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

        """),format.raw/*64.27*/("""
        """),format.raw/*65.9*/("""<div id="fb-root"></div>
        <script>(function(d, s, id) """),format.raw/*66.37*/("""{"""),format.raw/*66.38*/("""
        """),format.raw/*67.9*/("""var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
        fjs.parentNode.insertBefore(js, fjs);
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/("""(document, 'script', 'facebook-jssdk'));</script>


            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div id="content-layer">

            <nav class="mobile-nav">
                <ul>
                    <li><a href=""""),_display_(/*85.35*/routes/*85.41*/.Application.about()),format.raw/*85.61*/("""">О проекте</a></li>
                    <li><a href=""""),_display_(/*86.35*/routes/*86.41*/.Application.blogCategory("")),format.raw/*86.70*/("""">Статьи</a></li>
                    <li><a href=""""),_display_(/*87.35*/routes/*87.41*/.Application.authors()),format.raw/*87.63*/("""">Авторы</a></li>
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
                        <div class="logo-center">
                            <a href=""""),_display_(/*107.39*/routes/*107.45*/.Application.index()),format.raw/*107.65*/("""" class="logo">Диапост</a>
                        </div>
                        <h1 class="logo__descr">Молодёжный информационно-<br/>аналитический портал</h1>
                    </div>

                    <nav class="topmenu">
                        <ul>
                            <li><a href=""""),_display_(/*114.43*/routes/*114.49*/.Application.about()),format.raw/*114.69*/("""" """),_display_(/*114.72*/if(active=="О проекте")/*114.95*/{_display_(Seq[Any](format.raw/*114.96*/("""class="topmenu-active"""")))}),format.raw/*114.119*/(""">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*115.43*/routes/*115.49*/.Application.blogCategory("")),format.raw/*115.78*/("""">СТАТЬИ</a></li>
                            <li><a href=""""),_display_(/*116.43*/routes/*116.49*/.Application.authors()),format.raw/*116.71*/("""" """),_display_(/*116.74*/if(active=="Авторы")/*116.94*/{_display_(Seq[Any](format.raw/*116.95*/("""class="topmenu-active"""")))}),format.raw/*116.118*/(""">АВТОРЫ</a></li>
                            <li><a href=""""),_display_(/*117.43*/routes/*117.49*/.Application.videos()),format.raw/*117.70*/("""" """),_display_(/*117.73*/if(title=="Видео")/*117.91*/{_display_(Seq[Any](format.raw/*117.92*/("""class="topmenu-active"""")))}),format.raw/*117.115*/(""">ВИДЕО</a></li>
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
                                <a href="https://www.facebook.com/myslelab" class="facebook-icon"></a>
                            </li>
                            <!--<li>
                                <a href="#" class="twitter-icon"></a>
                            </li>-->
                        </ul>
                    </div>

                </div>

            </header>


        """),_display_(/*143.10*/content),format.raw/*143.17*/("""

        """),_display_(/*145.10*/footer(blogCategories)),format.raw/*145.32*/("""

    """),format.raw/*147.5*/("""</div>

        <script src=""""),_display_(/*149.23*/routes/*149.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*149.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*150.23*/routes/*150.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*150.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*151.23*/routes/*151.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*151.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*152.23*/routes/*152.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*152.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*153.23*/routes/*153.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*153.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*154.23*/routes/*154.29*/.Assets.at("javascripts/main.js")),format.raw/*154.62*/(""""></script>
        <script src=""""),_display_(/*155.23*/routes/*155.29*/.Assets.at("javascripts/jquery.magnific-popup.min.js")),format.raw/*155.83*/(""""></script>

        <script>
            $('.popup-youtube').magnificPopup("""),format.raw/*158.47*/("""{"""),format.raw/*158.48*/("""
                """),format.raw/*159.17*/("""disableOn: 700,
                type: 'iframe',
                mainClass: 'mfp-fade',
                removalDelay: 160,
                preloader: false,
                fixedContentPos: false
            """),format.raw/*165.13*/("""}"""),format.raw/*165.14*/(""");
        </script>

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
                  DATE: Mon Sep 28 13:56:37 MSK 2015
                  SOURCE: C:/Users/d1sp/Documents/GitHub/DoneDia/app/views/mainContent.scala.html
                  HASH: 008828ba4b62d518d84a8fbb78a09a4ddd6026a7
                  MATRIX: 568->1|764->108|791->109|1228->519|1254->524|1283->525|1796->1011|1811->1017|1864->1049|1933->1091|1948->1097|2003->1131|2071->1172|2086->1178|2144->1215|2212->1256|2227->1262|2292->1306|2344->1331|2359->1337|2435->1392|2484->1425|2525->1438|2853->1738|2882->1739|2918->1748|2982->1784|3011->1785|3047->1794|3079->1798|3108->1799|3144->1808|3209->1845|3238->1846|3382->1962|3411->1963|3449->1974|3478->1975|3507->1976|3544->1985|3573->1986|3602->1987|3631->1988|3667->1997|3696->1998|3844->2118|3873->2119|3902->2120|3963->2153|3992->2154|4232->2366|4261->2367|4297->2376|4382->2434|4411->2435|4440->2436|4473->2441|4502->2442|4531->2443|4564->2448|4593->2449|4629->2458|4658->2459|5385->3176|5421->3185|5510->3246|5539->3247|5575->3256|5886->3540|5915->3541|6400->3999|6415->4005|6456->4025|6538->4080|6553->4086|6603->4115|6682->4167|6697->4173|6740->4195|7306->4733|7322->4739|7364->4759|7695->5062|7711->5068|7753->5088|7784->5091|7817->5114|7857->5115|7913->5138|8003->5200|8019->5206|8070->5235|8158->5295|8174->5301|8218->5323|8249->5326|8279->5346|8319->5347|8375->5370|8462->5429|8478->5435|8521->5456|8552->5459|8580->5477|8620->5478|8676->5501|9784->6581|9813->6588|9852->6599|9896->6621|9930->6627|9988->6657|10004->6663|10079->6716|10164->6773|10180->6779|10248->6825|10333->6882|10349->6888|10409->6926|10494->6983|10510->6989|10593->7050|10678->7107|10694->7113|10757->7154|10842->7211|10858->7217|10913->7250|10975->7284|10991->7290|11067->7344|11172->7420|11202->7421|11248->7438|11484->7645|11514->7646
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|42->21|43->22|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|58->37|58->37|59->38|59->38|59->38|59->38|59->38|59->38|59->38|60->39|60->39|64->43|64->43|64->43|64->43|64->43|69->48|69->48|70->49|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|72->51|72->51|85->64|86->65|87->66|87->66|88->67|93->72|93->72|106->85|106->85|106->85|107->86|107->86|107->86|108->87|108->87|108->87|128->107|128->107|128->107|135->114|135->114|135->114|135->114|135->114|135->114|135->114|136->115|136->115|136->115|137->116|137->116|137->116|137->116|137->116|137->116|137->116|138->117|138->117|138->117|138->117|138->117|138->117|138->117|164->143|164->143|166->145|166->145|168->147|170->149|170->149|170->149|171->150|171->150|171->150|172->151|172->151|172->151|173->152|173->152|173->152|174->153|174->153|174->153|175->154|175->154|175->154|176->155|176->155|176->155|179->158|179->158|180->159|186->165|186->165
                  -- GENERATED --
              */
          