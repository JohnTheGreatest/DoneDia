
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
        <meta name="description" content="Гостиницы Риги приглашают гостей на незабываемый отдых. Доступные цены в гостинице в Риге приятно удивят. Вы легко можете забронировать номер.">
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
    """),format.raw/*27.5*/("""<div id="fb-root"></div>
    <script>(function(d, s, id) """),format.raw/*28.33*/("""{"""),format.raw/*28.34*/("""
    """),format.raw/*29.5*/("""var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
    fjs.parentNode.insertBefore(js, fjs);
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/("""(document, 'script', 'facebook-jssdk'));</script>
        
        
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
                            <li><a href="#">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*77.43*/routes/*77.49*/.Application.blogCategory("")),format.raw/*77.78*/("""">СТАТЬИ</a></li>
                            <li><a href="#">АВТОРЫ</a></li>
                            <li><a href="#">ПОИСК</a><span class="search-icon"></span></li>
                            <!--<li><a href="#">ВОЙТИ</a><span class="person-icon"></span></li>-->
                        </ul>
                    </nav>

                    <a class="button button-flat-primary dg-header__btn" href="#">ИЩЕМ АВТОРОВ</a>

                </div>

            </header>

            """),_display_(/*90.14*/if(typeOfHeader.getOrElse("big").equals("big"))/*90.61*/ {_display_(Seq[Any](format.raw/*90.63*/("""
                """),_display_(/*91.18*/post/*91.22*/.map/*91.26*/{post =>_display_(Seq[Any](format.raw/*91.34*/("""
                    """),format.raw/*92.21*/("""<section  class="dg-banner">
                        <div id="layerslider" style="width: 100%; height: 500px;">
                            <div class="ls-layer" rel="slidedelay: 3000; slidedirection: right;" """),_display_(/*94.99*/post/*94.103*/.getImage("blog.image", "main").map/*94.138*/{img =>_display_(Seq[Any](format.raw/*94.145*/(""" """),format.raw/*94.146*/("""style="background-image: url("""),_display_(/*94.176*/img/*94.179*/.url),format.raw/*94.183*/(""")""")))}),format.raw/*94.185*/("""; background-position: top center">
                                <div class="container">
                                    <div class="dg-banner__info">
                                        <h2 class="dg-banner__info__header">"""),_display_(/*97.78*/post/*97.82*/.getText("blog.title").map/*97.108*/{title =>_display_(Seq[Any](format.raw/*97.117*/(""" """),_display_(/*97.119*/title)))}),format.raw/*97.125*/("""</h2>
                                        <div class="dg-banner__info__util">
                                            <p class="dg-banner__info__util__section">"""),_display_(/*99.88*/post/*99.92*/.getText("blog.category").getOrElse("Общая")),format.raw/*99.136*/("""</p>
                                            <div class="dg-banner__info__time">
                                                <p class="dg-banner__info__time__content">"""),_display_(/*101.92*/post/*101.96*/.getText("blog.body").map/*101.121*/{text =>_display_(Seq[Any](format.raw/*101.129*/(""" """),_display_(/*101.131*/{text.length/900})))}),format.raw/*101.149*/(""" """),format.raw/*101.150*/("""МИН</p>
                                            </div>
                                        </div>
                                        <p class="dg-banner__info__description">"""),_display_(/*104.82*/post/*104.86*/.getText("blog.shortlede").map/*104.116*/{lede =>_display_(Seq[Any](format.raw/*104.124*/(""" """),_display_(/*104.126*/lede)))}),format.raw/*104.131*/("""</p>
                                        <a class="dg-banner__info__btn" href=""""),_display_(/*105.80*/routes/*105.86*/.Application.blogPost(post.id, post.slug)),format.raw/*105.127*/("""">
                                            <span>ЧИТАТЬ</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="dg-banner__bgshadow"></div>
                            </div>
                        </div>
                    </section>
                """)))}),format.raw/*114.18*/("""
            """)))}),format.raw/*115.14*/("""

            """),_display_(/*117.14*/content),format.raw/*117.21*/("""

            """),format.raw/*119.13*/("""<section class="dg-team">
                <div class="container">
                    <ul class="dg-team__content">
                        """),_display_(/*122.26*/authors/*122.33*/.map/*122.37*/{authors =>_display_(Seq[Any](format.raw/*122.48*/("""
                                """),_display_(/*123.34*/authors/*123.41*/.map/*123.45*/{ author =>_display_(Seq[Any](format.raw/*123.56*/("""
                                    """),format.raw/*124.37*/("""<li>
                                        <a class="dg-team__person box-6col-horizont-imgwrapper" style="background-image: url("""),_display_(/*125.127*/author/*125.133*/.getImage("author.image", "main").map/*125.170*/{imgUrl=>_display_(_display_(/*125.180*/imgUrl/*125.186*/.url))}),format.raw/*125.191*/(""")">
                                            <div class="dg-team__person__hover flag">
                                                <span class="flag__body">"""),_display_(/*127.75*/author/*127.81*/.getText("author.full_name").map/*127.113*/{name=>_display_(_display_(/*127.121*/name))}),format.raw/*127.126*/("""</span>
                                            </div>
                                        </a>
                                    </li>
                                """)))}),format.raw/*131.34*/("""
                        """)))}),format.raw/*132.26*/("""
                    """),format.raw/*133.21*/("""</ul>
                </div>
            </section>

            """),_display_(/*137.14*/footer(blogCategories)),format.raw/*137.36*/("""

        """),format.raw/*139.9*/("""</div>

        <script src=""""),_display_(/*141.23*/routes/*141.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*141.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*142.23*/routes/*142.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*142.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*143.23*/routes/*143.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*143.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*144.23*/routes/*144.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*144.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*145.23*/routes/*145.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*145.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*146.23*/routes/*146.29*/.Assets.at("javascripts/main.js")),format.raw/*146.62*/(""""></script>

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
                  DATE: Thu Feb 19 21:06:50 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/main.scala.html
                  HASH: ba81255795ac07c22ab363c152ab9d0928b76949
                  MATRIX: 630->1|919->201|946->202|1383->612|1409->617|1438->618|1920->1073|1935->1079|1990->1113|2058->1154|2073->1160|2131->1197|2183->1222|2198->1228|2274->1283|2331->1324|2372->1337|2616->1571|2648->1576|2733->1633|2762->1634|2794->1639|3085->1903|3113->1904|3669->2433|3684->2439|3734->2468|4297->3004|4312->3010|4353->3030|4798->3448|4813->3454|4863->3483|5377->3970|5433->4017|5473->4019|5518->4037|5531->4041|5544->4045|5590->4053|5639->4074|5876->4284|5890->4288|5935->4323|5981->4330|6011->4331|6069->4361|6082->4364|6108->4368|6142->4370|6404->4605|6417->4609|6453->4635|6501->4644|6531->4646|6562->4652|6758->4821|6771->4825|6837->4869|7041->5045|7055->5049|7091->5074|7139->5082|7170->5084|7214->5102|7245->5103|7460->5290|7474->5294|7515->5324|7563->5332|7594->5334|7625->5339|7737->5423|7753->5429|7817->5470|8229->5850|8275->5864|8318->5879|8347->5886|8390->5900|8559->6041|8576->6048|8590->6052|8640->6063|8702->6097|8719->6104|8733->6108|8783->6119|8849->6156|9009->6287|9026->6293|9074->6330|9114->6340|9131->6346|9161->6351|9353->6515|9369->6521|9412->6553|9450->6561|9480->6566|9691->6745|9749->6771|9799->6792|9893->6858|9937->6880|9975->6890|10033->6920|10049->6926|10124->6979|10209->7036|10225->7042|10293->7088|10378->7145|10394->7151|10454->7189|10539->7246|10555->7252|10638->7313|10723->7370|10739->7376|10802->7417|10887->7474|10903->7480|10958->7513
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|40->19|41->20|47->26|48->27|49->28|49->28|50->29|55->34|55->34|69->48|69->48|69->48|89->68|89->68|89->68|98->77|98->77|98->77|111->90|111->90|111->90|112->91|112->91|112->91|112->91|113->92|115->94|115->94|115->94|115->94|115->94|115->94|115->94|115->94|115->94|118->97|118->97|118->97|118->97|118->97|118->97|120->99|120->99|120->99|122->101|122->101|122->101|122->101|122->101|122->101|122->101|125->104|125->104|125->104|125->104|125->104|125->104|126->105|126->105|126->105|135->114|136->115|138->117|138->117|140->119|143->122|143->122|143->122|143->122|144->123|144->123|144->123|144->123|145->124|146->125|146->125|146->125|146->125|146->125|146->125|148->127|148->127|148->127|148->127|148->127|152->131|153->132|154->133|158->137|158->137|160->139|162->141|162->141|162->141|163->142|163->142|163->142|164->143|164->143|164->143|165->144|165->144|165->144|166->145|166->145|166->145|167->146|167->146|167->146
                  -- GENERATED --
              */
          