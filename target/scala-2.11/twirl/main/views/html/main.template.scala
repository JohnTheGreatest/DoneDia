
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
                        <a href=""""),_display_(/*105.35*/routes/*105.41*/.Application.index()),format.raw/*105.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Молодежный информационно-<br/>аналитический портал</h1>
                        </a>
                    </div>

                    <nav class="topmenu">
                        <ul>
                            <li><a href=""""),_display_(/*113.43*/routes/*113.49*/.Application.about()),format.raw/*113.69*/("""" """),_display_(/*113.72*/if(title=="О проекте")/*113.94*/{_display_(Seq[Any](format.raw/*113.95*/("""class="topmenu-active"""")))}),format.raw/*113.118*/(""">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*114.43*/routes/*114.49*/.Application.blogCategory("")),format.raw/*114.78*/("""">СТАТЬИ</a></li>
                            <li><a href=""""),_display_(/*115.43*/routes/*115.49*/.Application.authors()),format.raw/*115.71*/("""" """),_display_(/*115.74*/if(title=="Авторы")/*115.93*/{_display_(Seq[Any](format.raw/*115.94*/("""class="topmenu-active"""")))}),format.raw/*115.117*/(""">АВТОРЫ</a></li>
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

            """),_display_(/*140.14*/if(typeOfHeader.getOrElse("big").equals("big"))/*140.61*/ {_display_(Seq[Any](format.raw/*140.63*/("""
                """),_display_(/*141.18*/post/*141.22*/.map/*141.26*/{post =>_display_(Seq[Any](format.raw/*141.34*/("""
                    """),format.raw/*142.21*/("""<section  class="dg-banner">
                        <div id="layerslider" style="width: 100%; height: 500px;">
                            <div class="ls-layer" rel="slidedelay: 3000; slidedirection: right;" """),_display_(/*144.99*/post/*144.103*/.getImage("blog.image", "main").map/*144.138*/{img =>_display_(Seq[Any](format.raw/*144.145*/(""" """),format.raw/*144.146*/("""style="background-image: url("""),_display_(/*144.176*/img/*144.179*/.url),format.raw/*144.183*/(""")""")))}),format.raw/*144.185*/("""; background-position: top center">
                                <div class="container">
                                    <div class="dg-banner__info">
                                        <h2 class="dg-banner__info__header">"""),_display_(/*147.78*/post/*147.82*/.getText("blog.title").map/*147.108*/{title =>_display_(Seq[Any](format.raw/*147.117*/(""" """),_display_(/*147.119*/title)))}),format.raw/*147.125*/("""</h2>
                                        <div class="dg-banner__info__util">
                                            <p class="dg-banner__info__util__section">"""),_display_(/*149.88*/post/*149.92*/.getText("blog.category").getOrElse("Общая")),format.raw/*149.136*/("""</p>
                                            <div class="dg-banner__info__time">
                                                <p class="dg-banner__info__time__content">"""),_display_(/*151.92*/post/*151.96*/.getText("blog.body").map/*151.121*/{text =>_display_(Seq[Any](format.raw/*151.129*/(""" """),_display_(/*151.131*/{text.length/900})))}),format.raw/*151.149*/(""" """),format.raw/*151.150*/("""МИН</p>
                                            </div>
                                        </div>
                                        <p class="dg-banner__info__description">"""),_display_(/*154.82*/post/*154.86*/.getText("blog.shortlede").map/*154.116*/{lede =>_display_(Seq[Any](format.raw/*154.124*/(""" """),_display_(/*154.126*/lede)))}),format.raw/*154.131*/("""</p>
                                        <a class="dg-banner__info__btn" href=""""),_display_(/*155.80*/routes/*155.86*/.Application.blogPost(post.id, post.slug)),format.raw/*155.127*/("""">
                                            <span>ЧИТАТЬ</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="dg-banner__bgshadow"></div>
                            </div>
                        </div>
                    </section>
                """)))}),format.raw/*164.18*/("""
            """)))}),format.raw/*165.14*/("""

            """),_display_(/*167.14*/content),format.raw/*167.21*/("""

            """),format.raw/*169.13*/("""<section class="dg-team">
                <div class="container">
                    <ul class="dg-team__content">
                        """),_display_(/*172.26*/authors/*172.33*/.map/*172.37*/{authors =>_display_(Seq[Any](format.raw/*172.48*/("""
                                """),_display_(/*173.34*/authors/*173.41*/.map/*173.45*/{ author =>_display_(Seq[Any](format.raw/*173.56*/("""
                                    """),format.raw/*174.37*/("""<li>
                                        <a href=""""),_display_(/*175.51*/routes/*175.57*/.Application.author(author.id, author.slug)),format.raw/*175.100*/("""" class="dg-team__person box-6col-horizont-imgwrapper" style="background-image: url("""),_display_(/*175.185*/author/*175.191*/.getImage("author.image", "main").map/*175.228*/{imgUrl=>_display_(_display_(/*175.238*/imgUrl/*175.244*/.url))}),format.raw/*175.249*/(""")">
                                            <div class="dg-team__person__hover flag">
                                                <span class="flag__body">"""),_display_(/*177.75*/author/*177.81*/.getText("author.full_name").map/*177.113*/{name=>_display_(_display_(/*177.121*/name))}),format.raw/*177.126*/("""</span>
                                            </div>
                                        </a>
                                    </li>
                                """)))}),format.raw/*181.34*/("""
                        """)))}),format.raw/*182.26*/("""
                    """),format.raw/*183.21*/("""</ul>
                </div>
            </section>

            """),_display_(/*187.14*/footer(blogCategories)),format.raw/*187.36*/("""

        """),format.raw/*189.9*/("""</div>

        <script src=""""),_display_(/*191.23*/routes/*191.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*191.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*192.23*/routes/*192.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*192.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*193.23*/routes/*193.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*193.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*194.23*/routes/*194.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*194.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*195.23*/routes/*195.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*195.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*196.23*/routes/*196.29*/.Assets.at("javascripts/main.js")),format.raw/*196.62*/(""""></script>

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
                  DATE: Sun Mar 22 12:29:55 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/Girhub/DoneDia/DoneDia/app/views/main.scala.html
                  HASH: 5a0b41f8a2b1484049b36cf8f40b81cdfe109b9e
                  MATRIX: 630->1|919->201|947->203|1392->621|1418->626|1447->627|1965->1118|1980->1124|2033->1156|2103->1199|2118->1205|2173->1239|2242->1281|2257->1287|2315->1324|2368->1350|2383->1356|2459->1411|2518->1454|2560->1468|2904->1784|2933->1785|2970->1795|3034->1831|3063->1832|3100->1842|3132->1846|3161->1847|3198->1857|3263->1894|3292->1895|3440->2015|3469->2016|3508->2028|3537->2029|3566->2030|3603->2039|3632->2040|3661->2041|3690->2042|3727->2052|3756->2053|3908->2177|3937->2178|3966->2179|4027->2212|4056->2213|4301->2430|4330->2431|4367->2441|4453->2500|4482->2501|4511->2502|4544->2507|4573->2508|4602->2509|4635->2514|4664->2515|4701->2525|4730->2526|5446->3232|5479->3238|5565->3296|5594->3297|5627->3303|5923->3572|5951->3573|6465->4060|6480->4066|6521->4086|6604->4142|6619->4148|6669->4177|7260->4740|7276->4746|7318->4766|7710->5130|7726->5136|7768->5156|7799->5159|7831->5181|7871->5182|7927->5205|8018->5268|8034->5274|8085->5303|8174->5364|8190->5370|8234->5392|8265->5395|8294->5414|8334->5415|8390->5438|9480->6500|9537->6547|9578->6549|9625->6568|9639->6572|9653->6576|9700->6584|9751->6606|9991->6818|10006->6822|10052->6857|10099->6864|10130->6865|10189->6895|10203->6898|10230->6902|10265->6904|10531->7142|10545->7146|10582->7172|10631->7181|10662->7183|10694->7189|10893->7360|10907->7364|10974->7408|11180->7586|11194->7590|11230->7615|11278->7623|11309->7625|11353->7643|11384->7644|11602->7834|11616->7838|11657->7868|11705->7876|11736->7878|11767->7883|11880->7968|11896->7974|11960->8015|12381->8404|12428->8419|12473->8436|12502->8443|12547->8459|12719->8603|12736->8610|12750->8614|12800->8625|12863->8660|12880->8667|12894->8671|12944->8682|13011->8720|13095->8776|13111->8782|13177->8825|13291->8910|13308->8916|13356->8953|13396->8963|13413->8969|13443->8974|13637->9140|13653->9146|13696->9178|13734->9186|13764->9191|13979->9374|14038->9401|14089->9423|14187->9493|14231->9515|14271->9527|14331->9559|14347->9565|14422->9618|14508->9676|14524->9682|14592->9728|14678->9786|14694->9792|14754->9830|14840->9888|14856->9894|14939->9955|15025->10013|15041->10019|15104->10060|15190->10118|15206->10124|15261->10157
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|41->20|42->21|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|57->36|57->36|58->37|58->37|58->37|58->37|58->37|58->37|58->37|59->38|59->38|63->42|63->42|63->42|63->42|63->42|68->47|68->47|69->48|70->49|70->49|70->49|70->49|70->49|70->49|70->49|70->49|71->50|71->50|84->63|85->64|86->65|86->65|87->66|92->71|92->71|105->84|105->84|105->84|106->85|106->85|106->85|126->105|126->105|126->105|134->113|134->113|134->113|134->113|134->113|134->113|134->113|135->114|135->114|135->114|136->115|136->115|136->115|136->115|136->115|136->115|136->115|161->140|161->140|161->140|162->141|162->141|162->141|162->141|163->142|165->144|165->144|165->144|165->144|165->144|165->144|165->144|165->144|165->144|168->147|168->147|168->147|168->147|168->147|168->147|170->149|170->149|170->149|172->151|172->151|172->151|172->151|172->151|172->151|172->151|175->154|175->154|175->154|175->154|175->154|175->154|176->155|176->155|176->155|185->164|186->165|188->167|188->167|190->169|193->172|193->172|193->172|193->172|194->173|194->173|194->173|194->173|195->174|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|198->177|198->177|198->177|198->177|198->177|202->181|203->182|204->183|208->187|208->187|210->189|212->191|212->191|212->191|213->192|213->192|213->192|214->193|214->193|214->193|215->194|215->194|215->194|216->195|216->195|216->195|217->196|217->196|217->196
                  -- GENERATED --
              */
          