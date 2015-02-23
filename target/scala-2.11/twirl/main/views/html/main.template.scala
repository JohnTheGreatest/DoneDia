
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
        
        """),format.raw/*27.27*/("""
    """),format.raw/*28.5*/("""<div id="fb-root"></div>
    <script>(function(d, s, id) """),format.raw/*29.33*/("""{"""),format.raw/*29.34*/("""
    """),format.raw/*30.5*/("""var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
    fjs.parentNode.insertBefore(js, fjs);
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/("""(document, 'script', 'facebook-jssdk'));</script>
        
        
            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div id="content-layer">

            <nav class="mobile-nav">
                <ul>
                    <li><a href=""""),_display_(/*48.35*/routes/*48.41*/.Application.about()),format.raw/*48.61*/("""">О проекте</a></li>
                    <li><a href=""""),_display_(/*49.35*/routes/*49.41*/.Application.blogCategory("")),format.raw/*49.70*/("""">Статьи</a></li>
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
                        <a href=""""),_display_(/*69.35*/routes/*69.41*/.Application.index()),format.raw/*69.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Информационно-аналитический<br/>молодежный портал</h1>
                        </a>
                    </div>

                    <nav class="topmenu">
                        <ul>
                            <li><a href=""""),_display_(/*77.43*/routes/*77.49*/.Application.about()),format.raw/*77.69*/("""" """),_display_(/*77.72*/if(title=="О проекте")/*77.94*/{_display_(Seq[Any](format.raw/*77.95*/("""class="topmenu-active"""")))}),format.raw/*77.118*/(""">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*78.43*/routes/*78.49*/.Application.blogCategory("")),format.raw/*78.78*/("""">СТАТЬИ</a></li>
                            <li><a href=""""),_display_(/*79.43*/routes/*79.49*/.Application.authors()),format.raw/*79.71*/("""" """),_display_(/*79.74*/if(title=="Авторы")/*79.93*/{_display_(Seq[Any](format.raw/*79.94*/("""class="topmenu-active"""")))}),format.raw/*79.117*/(""">АВТОРЫ</a></li>
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

            """),_display_(/*104.14*/if(typeOfHeader.getOrElse("big").equals("big"))/*104.61*/ {_display_(Seq[Any](format.raw/*104.63*/("""
                """),_display_(/*105.18*/post/*105.22*/.map/*105.26*/{post =>_display_(Seq[Any](format.raw/*105.34*/("""
                    """),format.raw/*106.21*/("""<section  class="dg-banner">
                        <div id="layerslider" style="width: 100%; height: 500px;">
                            <div class="ls-layer" rel="slidedelay: 3000; slidedirection: right;" """),_display_(/*108.99*/post/*108.103*/.getImage("blog.image", "main").map/*108.138*/{img =>_display_(Seq[Any](format.raw/*108.145*/(""" """),format.raw/*108.146*/("""style="background-image: url("""),_display_(/*108.176*/img/*108.179*/.url),format.raw/*108.183*/(""")""")))}),format.raw/*108.185*/("""; background-position: top center">
                                <div class="container">
                                    <div class="dg-banner__info">
                                        <h2 class="dg-banner__info__header">"""),_display_(/*111.78*/post/*111.82*/.getText("blog.title").map/*111.108*/{title =>_display_(Seq[Any](format.raw/*111.117*/(""" """),_display_(/*111.119*/title)))}),format.raw/*111.125*/("""</h2>
                                        <div class="dg-banner__info__util">
                                            <p class="dg-banner__info__util__section">"""),_display_(/*113.88*/post/*113.92*/.getText("blog.category").getOrElse("Общая")),format.raw/*113.136*/("""</p>
                                            <div class="dg-banner__info__time">
                                                <p class="dg-banner__info__time__content">"""),_display_(/*115.92*/post/*115.96*/.getText("blog.body").map/*115.121*/{text =>_display_(Seq[Any](format.raw/*115.129*/(""" """),_display_(/*115.131*/{text.length/900})))}),format.raw/*115.149*/(""" """),format.raw/*115.150*/("""МИН</p>
                                            </div>
                                        </div>
                                        <p class="dg-banner__info__description">"""),_display_(/*118.82*/post/*118.86*/.getText("blog.shortlede").map/*118.116*/{lede =>_display_(Seq[Any](format.raw/*118.124*/(""" """),_display_(/*118.126*/lede)))}),format.raw/*118.131*/("""</p>
                                        <a class="dg-banner__info__btn" href=""""),_display_(/*119.80*/routes/*119.86*/.Application.blogPost(post.id, post.slug)),format.raw/*119.127*/("""">
                                            <span>ЧИТАТЬ</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="dg-banner__bgshadow"></div>
                            </div>
                        </div>
                    </section>
                """)))}),format.raw/*128.18*/("""
            """)))}),format.raw/*129.14*/("""

            """),_display_(/*131.14*/content),format.raw/*131.21*/("""

            """),format.raw/*133.13*/("""<section class="dg-team">
                <div class="container">
                    <ul class="dg-team__content">
                        """),_display_(/*136.26*/authors/*136.33*/.map/*136.37*/{authors =>_display_(Seq[Any](format.raw/*136.48*/("""
                                """),_display_(/*137.34*/authors/*137.41*/.map/*137.45*/{ author =>_display_(Seq[Any](format.raw/*137.56*/("""
                                    """),format.raw/*138.37*/("""<li>
                                        <a class="dg-team__person box-6col-horizont-imgwrapper" style="background-image: url("""),_display_(/*139.127*/author/*139.133*/.getImage("author.image", "main").map/*139.170*/{imgUrl=>_display_(_display_(/*139.180*/imgUrl/*139.186*/.url))}),format.raw/*139.191*/(""")">
                                            <div class="dg-team__person__hover flag">
                                                <span class="flag__body">"""),_display_(/*141.75*/author/*141.81*/.getText("author.full_name").map/*141.113*/{name=>_display_(_display_(/*141.121*/name))}),format.raw/*141.126*/("""</span>
                                            </div>
                                        </a>
                                    </li>
                                """)))}),format.raw/*145.34*/("""
                        """)))}),format.raw/*146.26*/("""
                    """),format.raw/*147.21*/("""</ul>
                </div>
            </section>

            """),_display_(/*151.14*/footer(blogCategories)),format.raw/*151.36*/("""

        """),format.raw/*153.9*/("""</div>

        <script src=""""),_display_(/*155.23*/routes/*155.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*155.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*156.23*/routes/*156.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*156.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*157.23*/routes/*157.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*157.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*158.23*/routes/*158.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*158.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*159.23*/routes/*159.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*159.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*160.23*/routes/*160.29*/.Assets.at("javascripts/main.js")),format.raw/*160.62*/(""""></script>

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
                  DATE: Mon Feb 23 15:37:38 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/main.scala.html
                  HASH: 4dbc0a3fcc853c8c1cea9f027db801669e3e7dc1
                  MATRIX: 630->1|919->201|947->203|1392->621|1418->626|1447->627|1965->1118|1980->1124|2033->1156|2103->1199|2118->1205|2173->1239|2242->1281|2257->1287|2315->1324|2368->1350|2383->1356|2459->1411|2518->1454|2560->1468|2810->1708|2843->1714|2929->1772|2958->1773|2991->1779|3287->2048|3315->2049|3829->2536|3844->2542|3885->2562|3968->2618|3983->2624|4033->2653|4623->3216|4638->3222|4679->3242|5069->3605|5084->3611|5125->3631|5155->3634|5186->3656|5225->3657|5280->3680|5370->3743|5385->3749|5435->3778|5523->3839|5538->3845|5581->3867|5611->3870|5639->3889|5678->3890|5733->3913|6823->4975|6880->5022|6921->5024|6968->5043|6982->5047|6996->5051|7043->5059|7094->5081|7334->5293|7349->5297|7395->5332|7442->5339|7473->5340|7532->5370|7546->5373|7573->5377|7608->5379|7874->5617|7888->5621|7925->5647|7974->5656|8005->5658|8037->5664|8236->5835|8250->5839|8317->5883|8523->6061|8537->6065|8573->6090|8621->6098|8652->6100|8696->6118|8727->6119|8945->6309|8959->6313|9000->6343|9048->6351|9079->6353|9110->6358|9223->6443|9239->6449|9303->6490|9724->6879|9771->6894|9816->6911|9845->6918|9890->6934|10062->7078|10079->7085|10093->7089|10143->7100|10206->7135|10223->7142|10237->7146|10287->7157|10354->7195|10515->7327|10532->7333|10580->7370|10620->7380|10637->7386|10667->7391|10861->7557|10877->7563|10920->7595|10958->7603|10988->7608|11203->7791|11262->7818|11313->7840|11411->7910|11455->7932|11495->7944|11555->7976|11571->7982|11646->8035|11732->8093|11748->8099|11816->8145|11902->8203|11918->8209|11978->8247|12064->8305|12080->8311|12163->8372|12249->8430|12265->8436|12328->8477|12414->8535|12430->8541|12485->8574
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|41->20|42->21|48->27|49->28|50->29|50->29|51->30|56->35|56->35|69->48|69->48|69->48|70->49|70->49|70->49|90->69|90->69|90->69|98->77|98->77|98->77|98->77|98->77|98->77|98->77|99->78|99->78|99->78|100->79|100->79|100->79|100->79|100->79|100->79|100->79|125->104|125->104|125->104|126->105|126->105|126->105|126->105|127->106|129->108|129->108|129->108|129->108|129->108|129->108|129->108|129->108|129->108|132->111|132->111|132->111|132->111|132->111|132->111|134->113|134->113|134->113|136->115|136->115|136->115|136->115|136->115|136->115|136->115|139->118|139->118|139->118|139->118|139->118|139->118|140->119|140->119|140->119|149->128|150->129|152->131|152->131|154->133|157->136|157->136|157->136|157->136|158->137|158->137|158->137|158->137|159->138|160->139|160->139|160->139|160->139|160->139|160->139|162->141|162->141|162->141|162->141|162->141|166->145|167->146|168->147|172->151|172->151|174->153|176->155|176->155|176->155|177->156|177->156|177->156|178->157|178->157|178->157|179->158|179->158|179->158|180->159|180->159|180->159|181->160|181->160|181->160
                  -- GENERATED --
              */
          