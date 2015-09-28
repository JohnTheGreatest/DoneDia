
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,Option[String],Option[io.prismic.Document],Option[Seq[io.prismic.Document]],collection.immutable.ListMap[String, String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, typeOfHeader: Option[String], post: Option[io.prismic.Document], authors: Option[Seq[io.prismic.Document]],  blogCategories: collection.immutable.ListMap[String,String])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.202*/("""
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
        
    """),format.raw/*63.23*/("""
    """),format.raw/*64.5*/("""<div id="fb-root"></div>
    <script>(function(d, s, id) """),format.raw/*65.33*/("""{"""),format.raw/*65.34*/("""
    """),format.raw/*66.5*/("""var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
    fjs.parentNode.insertBefore(js, fjs);
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""(document, 'script', 'facebook-jssdk'));</script>
        
        
            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div id="content-layer">

            <nav class="mobile-nav">
                <ul>
                    <li><a href=""""),_display_(/*84.35*/routes/*84.41*/.Application.about()),format.raw/*84.61*/("""">О проекте</a></li>
                    <li><a href=""""),_display_(/*85.35*/routes/*85.41*/.Application.blogCategory("")),format.raw/*85.70*/("""">Статьи</a></li>
                    <!--<li><a href="#">Авторы</a></li>-->
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
                            <a href=""""),_display_(/*106.39*/routes/*106.45*/.Application.index()),format.raw/*106.65*/("""" class="logo">Диапост</a>
                        </div>
                        <h1 class="logo__descr">Молодежный информационно-<br/>аналитический портал</h1>
                    </div>

                    <nav class="topmenu">
                        <ul>
                            <li><a href=""""),_display_(/*113.43*/routes/*113.49*/.Application.about()),format.raw/*113.69*/("""" """),_display_(/*113.72*/if(title=="О проекте")/*113.94*/{_display_(Seq[Any](format.raw/*113.95*/("""class="topmenu-active"""")))}),format.raw/*113.118*/(""">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*114.43*/routes/*114.49*/.Application.blogCategory("")),format.raw/*114.78*/("""">СТАТЬИ</a></li>
                            <li><a href=""""),_display_(/*115.43*/routes/*115.49*/.Application.authors()),format.raw/*115.71*/("""" """),_display_(/*115.74*/if(title=="Авторы")/*115.93*/{_display_(Seq[Any](format.raw/*115.94*/("""class="topmenu-active"""")))}),format.raw/*115.117*/(""">АВТОРЫ</a></li>
                            <li><a href=""""),_display_(/*116.43*/routes/*116.49*/.Application.videos()),format.raw/*116.70*/("""" """),_display_(/*116.73*/if(title=="Видео")/*116.91*/{_display_(Seq[Any](format.raw/*116.92*/("""class="topmenu-active"""")))}),format.raw/*116.115*/(""">ВИДЕО</a></li>
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

            """),_display_(/*141.14*/if(typeOfHeader.getOrElse("big").equals("big"))/*141.61*/ {_display_(Seq[Any](format.raw/*141.63*/("""
                """),_display_(/*142.18*/post/*142.22*/.map/*142.26*/{post =>_display_(Seq[Any](format.raw/*142.34*/("""
                    """),format.raw/*143.21*/("""<section  class="dg-banner">
                        <div id="layerslider" style="width: 100%; height: 500px;">
                            <div class="ls-layer" rel="slidedelay: 3000; slidedirection: right;" """),_display_(/*145.99*/post/*145.103*/.getImage("blog.image", "main").map/*145.138*/{img =>_display_(Seq[Any](format.raw/*145.145*/(""" """),format.raw/*145.146*/("""style="background-image: url("""),_display_(/*145.176*/img/*145.179*/.url),format.raw/*145.183*/(""")""")))}),format.raw/*145.185*/("""; background-position: top center">
                                <div class="container">
                                    <div class="dg-banner__info">
                                        <h2 class="dg-banner__info__header">"""),_display_(/*148.78*/post/*148.82*/.getText("blog.title").map/*148.108*/{title =>_display_(Seq[Any](format.raw/*148.117*/(""" """),_display_(/*148.119*/title)))}),format.raw/*148.125*/("""</h2>
                                        <div class="dg-banner__info__util">
                                            <p class="dg-banner__info__util__section">"""),_display_(/*150.88*/post/*150.92*/.getText("blog.category").getOrElse("Общая")),format.raw/*150.136*/("""</p>
                                            <div class="dg-banner__info__time">
                                                <p class="dg-banner__info__time__content">"""),_display_(/*152.92*/post/*152.96*/.getText("blog.body").map/*152.121*/{text =>_display_(Seq[Any](format.raw/*152.129*/(""" """),_display_(/*152.131*/{text.length/900})))}),format.raw/*152.149*/(""" """),format.raw/*152.150*/("""МИН</p>
                                            </div>
                                        </div>
                                        <p class="dg-banner__info__description">"""),_display_(/*155.82*/post/*155.86*/.getText("blog.shortlede").map/*155.116*/{lede =>_display_(Seq[Any](format.raw/*155.124*/(""" """),_display_(/*155.126*/lede)))}),format.raw/*155.131*/("""</p>
                                        <a class="dg-banner__info__btn" href=""""),_display_(/*156.80*/routes/*156.86*/.Application.blogPost(post.id, post.slug)),format.raw/*156.127*/("""">
                                            <span>ЧИТАТЬ</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="dg-banner__bgshadow"></div>
                            </div>
                        </div>
                    </section>
                """)))}),format.raw/*165.18*/("""
            """)))}),format.raw/*166.14*/("""

            """),_display_(/*168.14*/content),format.raw/*168.21*/("""

            """),format.raw/*170.13*/("""<section class="dg-team">
                <div class="container">
                    <ul class="dg-team__content">
                        """),_display_(/*173.26*/authors/*173.33*/.map/*173.37*/{authors =>_display_(Seq[Any](format.raw/*173.48*/("""
                                """),_display_(/*174.34*/authors/*174.41*/.map/*174.45*/{ author =>_display_(Seq[Any](format.raw/*174.56*/("""
                                    """),format.raw/*175.37*/("""<li>
                                        <a href=""""),_display_(/*176.51*/routes/*176.57*/.Application.author(author.id, author.slug)),format.raw/*176.100*/("""" class="dg-team__person box-6col-horizont-imgwrapper" style="background-image: url("""),_display_(/*176.185*/author/*176.191*/.getImage("author.image", "main").map/*176.228*/{imgUrl=>_display_(_display_(/*176.238*/imgUrl/*176.244*/.url))}),format.raw/*176.249*/(""")">
                                            <div class="dg-team__person__hover flag">
                                                <span class="flag__body">"""),_display_(/*178.75*/author/*178.81*/.getText("author.full_name").map/*178.113*/{name=>_display_(_display_(/*178.121*/name))}),format.raw/*178.126*/("""</span>
                                            </div>
                                        </a>
                                    </li>
                                """)))}),format.raw/*182.34*/("""
                        """)))}),format.raw/*183.26*/("""
                    """),format.raw/*184.21*/("""</ul>
                </div>
            </section>

            """),_display_(/*188.14*/footer(blogCategories)),format.raw/*188.36*/("""

        """),format.raw/*190.9*/("""</div>

        <script src=""""),_display_(/*192.23*/routes/*192.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*192.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*193.23*/routes/*193.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*193.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*194.23*/routes/*194.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*194.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*195.23*/routes/*195.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*195.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*196.23*/routes/*196.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*196.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*197.23*/routes/*197.29*/.Assets.at("javascripts/main.js")),format.raw/*197.62*/(""""></script>

    </body>
</html>
"""))}
  }

  def render(title:String,typeOfHeader:Option[String],post:Option[io.prismic.Document],authors:Option[Seq[io.prismic.Document]],blogCategories:collection.immutable.ListMap[String, String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,typeOfHeader,post,authors,blogCategories)(content)

  def f:((String,Option[String],Option[io.prismic.Document],Option[Seq[io.prismic.Document]],collection.immutable.ListMap[String, String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,typeOfHeader,post,authors,blogCategories) => (content) => apply(title,typeOfHeader,post,authors,blogCategories)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Sep 28 13:56:37 MSK 2015
                  SOURCE: C:/Users/d1sp/Documents/GitHub/DoneDia/app/views/main.scala.html
                  HASH: 7b4931f235daacd0acc8654691df8fd6f05cd0bd
                  MATRIX: 630->1|919->201|946->202|1383->612|1409->617|1438->618|1951->1104|1966->1110|2019->1142|2088->1184|2103->1190|2158->1224|2226->1265|2241->1271|2299->1308|2351->1333|2366->1339|2442->1394|2499->1435|2540->1448|2876->1756|2905->1757|2941->1766|3005->1802|3034->1803|3070->1812|3102->1816|3131->1817|3167->1826|3232->1863|3261->1864|3405->1980|3434->1981|3472->1992|3501->1993|3530->1994|3567->2003|3596->2004|3625->2005|3654->2006|3690->2015|3719->2016|3867->2136|3896->2137|3925->2138|3986->2171|4015->2172|4255->2384|4284->2385|4320->2394|4405->2452|4434->2453|4463->2454|4496->2459|4525->2460|4554->2461|4587->2466|4616->2467|4652->2476|4681->2477|5384->3170|5416->3175|5501->3232|5530->3233|5562->3238|5853->3502|5881->3503|6382->3977|6397->3983|6438->4003|6520->4058|6535->4064|6585->4093|7210->4690|7226->4696|7268->4716|7599->5019|7615->5025|7657->5045|7688->5048|7720->5070|7760->5071|7816->5094|7906->5156|7922->5162|7973->5191|8061->5251|8077->5257|8121->5279|8152->5282|8181->5301|8221->5302|8277->5325|8364->5384|8380->5390|8423->5411|8454->5414|8482->5432|8522->5433|8578->5456|9681->6531|9738->6578|9779->6580|9825->6598|9839->6602|9853->6606|9900->6614|9950->6635|10188->6845|10203->6849|10249->6884|10296->6891|10327->6892|10386->6922|10400->6925|10427->6929|10462->6931|10725->7166|10739->7170|10776->7196|10825->7205|10856->7207|10888->7213|11085->7382|11099->7386|11166->7430|11370->7606|11384->7610|11420->7635|11468->7643|11499->7645|11543->7663|11574->7664|11789->7851|11803->7855|11844->7885|11892->7893|11923->7895|11954->7900|12066->7984|12082->7990|12146->8031|12558->8411|12604->8425|12647->8440|12676->8447|12719->8461|12888->8602|12905->8609|12919->8613|12969->8624|13031->8658|13048->8665|13062->8669|13112->8680|13178->8717|13261->8772|13277->8778|13343->8821|13457->8906|13474->8912|13522->8949|13562->8959|13579->8965|13609->8970|13801->9134|13817->9140|13860->9172|13898->9180|13928->9185|14139->9364|14197->9390|14247->9411|14341->9477|14385->9499|14423->9509|14481->9539|14497->9545|14572->9598|14657->9655|14673->9661|14741->9707|14826->9764|14842->9770|14902->9808|14987->9865|15003->9871|15086->9932|15171->9989|15187->9995|15250->10036|15335->10093|15351->10099|15406->10132
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|41->20|42->21|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|57->36|57->36|58->37|58->37|58->37|58->37|58->37|58->37|58->37|59->38|59->38|63->42|63->42|63->42|63->42|63->42|68->47|68->47|69->48|70->49|70->49|70->49|70->49|70->49|70->49|70->49|70->49|71->50|71->50|84->63|85->64|86->65|86->65|87->66|92->71|92->71|105->84|105->84|105->84|106->85|106->85|106->85|127->106|127->106|127->106|134->113|134->113|134->113|134->113|134->113|134->113|134->113|135->114|135->114|135->114|136->115|136->115|136->115|136->115|136->115|136->115|136->115|137->116|137->116|137->116|137->116|137->116|137->116|137->116|162->141|162->141|162->141|163->142|163->142|163->142|163->142|164->143|166->145|166->145|166->145|166->145|166->145|166->145|166->145|166->145|166->145|169->148|169->148|169->148|169->148|169->148|169->148|171->150|171->150|171->150|173->152|173->152|173->152|173->152|173->152|173->152|173->152|176->155|176->155|176->155|176->155|176->155|176->155|177->156|177->156|177->156|186->165|187->166|189->168|189->168|191->170|194->173|194->173|194->173|194->173|195->174|195->174|195->174|195->174|196->175|197->176|197->176|197->176|197->176|197->176|197->176|197->176|197->176|197->176|199->178|199->178|199->178|199->178|199->178|203->182|204->183|205->184|209->188|209->188|211->190|213->192|213->192|213->192|214->193|214->193|214->193|215->194|215->194|215->194|216->195|216->195|216->195|217->196|217->196|217->196|218->197|218->197|218->197
                  -- GENERATED --
              */
          