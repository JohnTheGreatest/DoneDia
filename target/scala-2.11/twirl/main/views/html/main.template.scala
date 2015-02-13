
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
    </head>
    <body>
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
                        <a href=""""),_display_(/*51.35*/routes/*51.41*/.Application.index()),format.raw/*51.61*/("""" class="logo">
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

            """),_display_(/*73.14*/if(typeOfHeader.getOrElse("big").equals("big"))/*73.61*/ {_display_(Seq[Any](format.raw/*73.63*/("""
                """),_display_(/*74.18*/post/*74.22*/.map/*74.26*/{post =>_display_(Seq[Any](format.raw/*74.34*/("""
                    """),format.raw/*75.21*/("""<section  class="dg-banner">
                        <div id="layerslider" style="width: 100%; height: 500px;">
                            <div class="ls-layer" rel="slidedelay: 3000; slidedirection: right;" """),_display_(/*77.99*/post/*77.103*/.getImage("blog.image", "main").map/*77.138*/{img =>_display_(Seq[Any](format.raw/*77.145*/(""" """),format.raw/*77.146*/("""style="background-image: url("""),_display_(/*77.176*/img/*77.179*/.url),format.raw/*77.183*/(""")""")))}),format.raw/*77.185*/("""; background-position: top center">
                                <div class="container">
                                    <div class="dg-banner__info">
                                        <h2 class="dg-banner__info__header">"""),_display_(/*80.78*/post/*80.82*/.getText("blog.title").map/*80.108*/{title =>_display_(Seq[Any](format.raw/*80.117*/(""" """),_display_(/*80.119*/title)))}),format.raw/*80.125*/("""</h2>
                                        <div class="dg-banner__info__util">
                                            <p class="dg-banner__info__util__section">"""),_display_(/*82.88*/post/*82.92*/.getText("blog.category").getOrElse("Общая")),format.raw/*82.136*/("""</p>
                                            <div class="dg-banner__info__time">
                                                <p class="dg-banner__info__time__content">"""),_display_(/*84.92*/post/*84.96*/.getText("blog.body").map/*84.121*/{text =>_display_(Seq[Any](format.raw/*84.129*/(""" """),_display_(/*84.131*/{text.length/900})))}),format.raw/*84.149*/(""" """),format.raw/*84.150*/("""МИН</p>
                                            </div>
                                        </div>
                                        <p class="dg-banner__info__description">"""),_display_(/*87.82*/post/*87.86*/.getText("blog.shortlede").map/*87.116*/{lede =>_display_(Seq[Any](format.raw/*87.124*/(""" """),_display_(/*87.126*/lede)))}),format.raw/*87.131*/("""</p>
                                        <a class="dg-banner__info__btn" href=""""),_display_(/*88.80*/routes/*88.86*/.Application.blogPost(post.id, post.slug)),format.raw/*88.127*/("""">
                                            <span>ЧИТАТЬ</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="dg-banner__bgshadow"></div>
                            </div>
                        </div>
                    </section>
                """)))}),format.raw/*97.18*/("""
            """)))}),format.raw/*98.14*/("""

            """),_display_(/*100.14*/content),format.raw/*100.21*/("""

            """),format.raw/*102.13*/("""<section class="dg-team">
                <div class="container">
                    <ul class="dg-team__content">
                        """),_display_(/*105.26*/authors/*105.33*/.map/*105.37*/{authors =>_display_(Seq[Any](format.raw/*105.48*/("""
                                """),_display_(/*106.34*/authors/*106.41*/.map/*106.45*/{ author =>_display_(Seq[Any](format.raw/*106.56*/("""
                                    """),format.raw/*107.37*/("""<li>
                                        <a class="dg-team__person box-6col-horizont-imgwrapper" style="background-image: url("""),_display_(/*108.127*/author/*108.133*/.getImage("author.image", "main").map/*108.170*/{imgUrl=>_display_(_display_(/*108.180*/imgUrl/*108.186*/.url))}),format.raw/*108.191*/(""")">
                                            <div class="dg-team__person__hover flag">
                                                <span class="flag__body">"""),_display_(/*110.75*/author/*110.81*/.getText("author.full_name").map/*110.113*/{name=>_display_(_display_(/*110.121*/name))}),format.raw/*110.126*/("""</span>
                                            </div>
                                        </a>
                                    </li>
                                """)))}),format.raw/*114.34*/("""
                        """)))}),format.raw/*115.26*/("""
                    """),format.raw/*116.21*/("""</ul>
                </div>
            </section>

            """),_display_(/*120.14*/footer()),format.raw/*120.22*/("""

        """),format.raw/*122.9*/("""</div>

        <script src=""""),_display_(/*124.23*/routes/*124.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*124.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*125.23*/routes/*125.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*125.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*126.23*/routes/*126.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*126.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*127.23*/routes/*127.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*127.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*128.23*/routes/*128.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*128.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*129.23*/routes/*129.29*/.Assets.at("javascripts/main.js")),format.raw/*129.62*/(""""></script>

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
                  DATE: Thu Feb 12 17:10:32 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/main.scala.html
                  HASH: eba3790dbe380cf1dfb34c54d3d327c17061a140
                  MATRIX: 585->1|812->139|839->140|1276->550|1302->555|1331->556|1813->1011|1828->1017|1883->1051|1951->1092|1966->1098|2024->1135|2076->1160|2091->1166|2167->1221|3226->2253|3241->2259|3282->2279|4214->3184|4270->3231|4310->3233|4355->3251|4368->3255|4381->3259|4427->3267|4476->3288|4713->3498|4727->3502|4772->3537|4818->3544|4848->3545|4906->3575|4919->3578|4945->3582|4979->3584|5241->3819|5254->3823|5290->3849|5338->3858|5368->3860|5399->3866|5595->4035|5608->4039|5674->4083|5877->4259|5890->4263|5925->4288|5972->4296|6002->4298|6045->4316|6075->4317|6289->4504|6302->4508|6342->4538|6389->4546|6419->4548|6449->4553|6560->4637|6575->4643|6638->4684|7049->5064|7094->5078|7137->5093|7166->5100|7209->5114|7378->5255|7395->5262|7409->5266|7459->5277|7521->5311|7538->5318|7552->5322|7602->5333|7668->5370|7828->5501|7845->5507|7893->5544|7933->5554|7950->5560|7980->5565|8172->5729|8188->5735|8231->5767|8269->5775|8299->5780|8510->5959|8568->5985|8618->6006|8712->6072|8742->6080|8780->6090|8838->6120|8854->6126|8929->6179|9014->6236|9030->6242|9098->6288|9183->6345|9199->6351|9259->6389|9344->6446|9360->6452|9443->6513|9528->6570|9544->6576|9607->6617|9692->6674|9708->6680|9763->6713
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|72->51|72->51|72->51|94->73|94->73|94->73|95->74|95->74|95->74|95->74|96->75|98->77|98->77|98->77|98->77|98->77|98->77|98->77|98->77|98->77|101->80|101->80|101->80|101->80|101->80|101->80|103->82|103->82|103->82|105->84|105->84|105->84|105->84|105->84|105->84|105->84|108->87|108->87|108->87|108->87|108->87|108->87|109->88|109->88|109->88|118->97|119->98|121->100|121->100|123->102|126->105|126->105|126->105|126->105|127->106|127->106|127->106|127->106|128->107|129->108|129->108|129->108|129->108|129->108|129->108|131->110|131->110|131->110|131->110|131->110|135->114|136->115|137->116|141->120|141->120|143->122|145->124|145->124|145->124|146->125|146->125|146->125|147->126|147->126|147->126|148->127|148->127|148->127|149->128|149->128|149->128|150->129|150->129|150->129
                  -- GENERATED --
              */
          