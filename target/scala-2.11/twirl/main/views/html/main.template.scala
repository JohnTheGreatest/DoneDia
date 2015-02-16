
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,Option[String],Option[io.prismic.Document],Option[Seq[io.prismic.Document]],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, typeOfHeader: Option[String], post: Option[io.prismic.Document], authors: Option[Seq[io.prismic.Document]])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.140*/("""
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
                    <li><a href="#">Статьи</a></li>
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
                            <li><a href="#">СТАТЬИ</a></li>
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

            """),_display_(/*137.14*/footer()),format.raw/*137.22*/("""

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

  def render(title:String,typeOfHeader:Option[String],post:Option[io.prismic.Document],authors:Option[Seq[io.prismic.Document]],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,typeOfHeader,post,authors)(content)

  def f:((String,Option[String],Option[io.prismic.Document],Option[Seq[io.prismic.Document]]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,typeOfHeader,post,authors) => (content) => apply(title,typeOfHeader,post,authors)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 16 22:04:43 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/main.scala.html
                  HASH: 9573ecf436e46c8fc28672e4cd6586b8f6555d66
                  MATRIX: 585->1|812->139|839->140|1276->550|1302->555|1331->556|1813->1011|1828->1017|1883->1051|1951->1092|1966->1098|2024->1135|2076->1160|2091->1166|2167->1221|2224->1262|2265->1275|2509->1509|2541->1514|2626->1571|2655->1572|2687->1577|2978->1841|3006->1842|4098->2907|4113->2913|4154->2933|5086->3838|5142->3885|5182->3887|5227->3905|5240->3909|5253->3913|5299->3921|5348->3942|5585->4152|5599->4156|5644->4191|5690->4198|5720->4199|5778->4229|5791->4232|5817->4236|5851->4238|6113->4473|6126->4477|6162->4503|6210->4512|6240->4514|6271->4520|6467->4689|6480->4693|6546->4737|6750->4913|6764->4917|6800->4942|6848->4950|6879->4952|6923->4970|6954->4971|7169->5158|7183->5162|7224->5192|7272->5200|7303->5202|7334->5207|7446->5291|7462->5297|7526->5338|7938->5718|7984->5732|8027->5747|8056->5754|8099->5768|8268->5909|8285->5916|8299->5920|8349->5931|8411->5965|8428->5972|8442->5976|8492->5987|8558->6024|8718->6155|8735->6161|8783->6198|8823->6208|8840->6214|8870->6219|9062->6383|9078->6389|9121->6421|9159->6429|9189->6434|9400->6613|9458->6639|9508->6660|9602->6726|9632->6734|9670->6744|9728->6774|9744->6780|9819->6833|9904->6890|9920->6896|9988->6942|10073->6999|10089->7005|10149->7043|10234->7100|10250->7106|10333->7167|10418->7224|10434->7230|10497->7271|10582->7328|10598->7334|10653->7367
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|40->19|41->20|47->26|48->27|49->28|49->28|50->29|55->34|55->34|89->68|89->68|89->68|111->90|111->90|111->90|112->91|112->91|112->91|112->91|113->92|115->94|115->94|115->94|115->94|115->94|115->94|115->94|115->94|115->94|118->97|118->97|118->97|118->97|118->97|118->97|120->99|120->99|120->99|122->101|122->101|122->101|122->101|122->101|122->101|122->101|125->104|125->104|125->104|125->104|125->104|125->104|126->105|126->105|126->105|135->114|136->115|138->117|138->117|140->119|143->122|143->122|143->122|143->122|144->123|144->123|144->123|144->123|145->124|146->125|146->125|146->125|146->125|146->125|146->125|148->127|148->127|148->127|148->127|148->127|152->131|153->132|154->133|158->137|158->137|160->139|162->141|162->141|162->141|163->142|163->142|163->142|164->143|164->143|164->143|165->144|165->144|165->144|166->145|166->145|166->145|167->146|167->146|167->146
                  -- GENERATED --
              */
          