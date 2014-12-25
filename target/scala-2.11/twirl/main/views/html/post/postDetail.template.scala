
package views.html.post

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
object postDetail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[io.prismic.Document,Seq[io.prismic.Document],io.prismic.Document,collection.immutable.ListMap[String, String],Option[io.prismic.Document],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: io.prismic.Document, relatedPosts: Seq[io.prismic.Document], author: io.prismic.Document, blogCategories: collection.immutable.ListMap[String, String], jumbo: Option[io.prismic.Document])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.227*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>"""),_display_(/*11.17*/post/*11.21*/.getText("blog.seo-title").map/*11.51*/{title=>_display_(_display_(/*11.60*/title))}),format.raw/*11.66*/(""" """),format.raw/*11.67*/("""- Диапост.ру</title>
        <meta name="description" content=""""),_display_(/*12.44*/post/*12.48*/.getText("blog.seo-description").map/*12.84*/{dscr=>_display_(_display_(/*12.92*/dscr))}),format.raw/*12.97*/("""">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- ADD all SEO meta and OpenGraph -->
        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.at("stylesheets/main.css")),format.raw/*16.79*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.at("stylesheets/animate.css")),format.raw/*17.82*/("""">
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js")),format.raw/*18.84*/(""""></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div class="overlay overlay-contentscale">
            <button type="button" class="overlay-close">Close</button>
            <nav>
                <ul>
                    """),_display_(/*31.22*/blogCategories/*31.36*/.map/*31.40*/{cat=>_display_(Seq[Any](format.raw/*31.46*/("""
                        """),format.raw/*32.25*/("""<li><a href="#">"""),_display_(/*32.42*/cat/*32.45*/._2),format.raw/*32.48*/("""</a></li>
                    """)))}),format.raw/*33.22*/("""
                """),format.raw/*34.17*/("""</ul>
            </nav>
        </div>

        <div class="main-transform">

            <header class="dg-header dg-blog-header">
                <div class="container">
                    <div class="dg-header__menubtn">
                        <button class="ir icon-navigation" id="trigger-overlay" type="button"></button>
                    </div>
                    <div class="logo-wrapper">
                        <a href=""""),_display_(/*46.35*/routes/*46.41*/.Application.index()),format.raw/*46.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Информационно-аналитический<br/>молодежный портал</h1>
                        </a>
                    </div>
                </div>
            </header>

            <section class="dg-blog">

                <div class="dg-blog__banner" """),_display_(/*56.47*/post/*56.51*/.getImage("blog.image", "main").map/*56.86*/ {img =>_display_(Seq[Any](format.raw/*56.94*/(""" """),format.raw/*56.95*/("""style="background-image: url("""),_display_(/*56.125*/img/*56.128*/.url),format.raw/*56.132*/(""")""")))}),format.raw/*56.134*/("""">
                    <div class="overlay-dark"></div>
                        <div class="dg-blog__banner__content">
                            <div class="container">
                                <div class="dg-blog__banner__content--center">
                                    <div class="dg-feed__info__header">
                                        <h1>"""),_display_(/*62.46*/post/*62.50*/.getText("blog.title").map/*62.76*/{title =>_display_(Seq[Any](format.raw/*62.85*/(""" """),_display_(/*62.87*/title)))}),format.raw/*62.93*/("""</h1>
                                    </div>
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*65.81*/post/*65.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*65.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*66.79*/post/*66.83*/.getText("blog.body").map/*66.108*/{text =>_display_(Seq[Any](format.raw/*66.116*/(""" """),_display_(/*66.118*/{text.length/900})))}),format.raw/*66.136*/(""" """),format.raw/*66.137*/("""мин</p>
                                    </div>
                                    <div class="dg-blog__banner_2header">
                                        <p>"""),_display_(/*69.45*/post/*69.49*/.getText("blog.shortlede").map/*69.79*/{lede =>_display_(Seq[Any](format.raw/*69.87*/(""" """),_display_(/*69.89*/lede)))}),format.raw/*69.94*/("""</p>
                                    </div>
                                </div>
                            </div>
                      </div>
                </div>

            </section>

        <section class="dg-blog__body">
            <div class="container">

                <div class="db-blog__body__utility">
                    <div class="dg-blog__body__author">
                        <img src=""""),_display_(/*83.36*/author/*83.42*/.getImage("author.image", "authorthumb").map/*83.86*/{imgUrl=>_display_(_display_(/*83.96*/imgUrl/*83.102*/.url))}),format.raw/*83.107*/(""""/>
                    </div>

                    <div class="dg-blog__body__actions">
                        <ul class="dg-feed__info__actions">
                            <li>
                                <a href="#" class="dg-feed__info__actions--repost">15</a>
                            </li>
                            <li>
                                <a href="#" class="dg-feed__info__actions--like">117</a>
                            </li>
                            <li>
                                <a href="#" class="dg-feed__info__actions--comment">7</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="clear"></div>
                <article>
                    """),_display_(/*102.22*/post/*102.26*/.getHtml("blog.body", ctx.linkResolver).map(Html.apply)),format.raw/*102.81*/("""
                """),format.raw/*103.17*/("""</article>
            </div>

        </section>

        <div class="clear"></div>

        """),_display_(/*110.10*/if(!jumbo.isEmpty)/*110.28*/ {_display_(Seq[Any](format.raw/*110.30*/("""
            """),format.raw/*111.13*/("""<div class="jumbo-video" data-vide-bg=""""),_display_(/*111.53*/jumbo/*111.58*/.map/*111.62*/{jmb=>_display_(_display_(/*111.69*/jmb/*111.72*/.getLink("jumbo-video.video-mp4").map/*111.109*/{link=>_display_(_display_(/*111.117*/link/*111.121*/.getUrl(ctx.linkResolver).dropRight(4)))}))}),format.raw/*111.161*/("""" data-vide-options="loop: true, muted: false, position: 50% 50%">

                <div class="jumbo-video__content-wrapper">
                    <div class="container">
                        <div class="jumbo-video__content-layout">
                            <div class="jumbo-video__content">
                                <h3>"""),_display_(/*117.38*/jumbo/*117.43*/.map/*117.47*/{jmb=>_display_(_display_(/*117.54*/jmb/*117.57*/.getText("jumbo-video.title").map/*117.90*/{txt=>_display_(_display_(/*117.97*/txt))}))}),format.raw/*117.102*/("""</h3>
                                <p>"""),_display_(/*118.37*/jumbo/*118.42*/.map/*118.46*/{jmb=>_display_(_display_(/*118.53*/jmb/*118.56*/.getStructuredText("jumbo-video.content").flatMap(_.getFirstParagraph).map/*118.130*/{txt=>_display_(_display_(/*118.137*/txt/*118.140*/.text))}))}),format.raw/*118.147*/("""</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*124.10*/("""

        """),format.raw/*126.9*/("""<div class="clear"></div>

        """),_display_(/*128.10*/footer()),format.raw/*128.18*/("""

        """),format.raw/*130.9*/("""</div>

        <script src="http://yastatic.net/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
        <script src=""""),_display_(/*133.23*/routes/*133.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*133.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*134.23*/routes/*134.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*134.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*135.23*/routes/*135.29*/.Assets.at("javascripts/classie.js")),format.raw/*135.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*136.23*/routes/*136.29*/.Assets.at("javascripts/navigation.js")),format.raw/*136.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*137.23*/routes/*137.29*/.Assets.at("javascripts/jquery.vide.min.js")),format.raw/*137.73*/("""" type="text/javascript"></script>
        """),_display_(/*138.10*/postDetailScripts()),format.raw/*138.29*/("""

    """),format.raw/*140.5*/("""</body>
</html>

"""))}
  }

  def render(post:io.prismic.Document,relatedPosts:Seq[io.prismic.Document],author:io.prismic.Document,blogCategories:collection.immutable.ListMap[String, String],jumbo:Option[io.prismic.Document],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(post,relatedPosts,author,blogCategories,jumbo)(ctx)

  def f:((io.prismic.Document,Seq[io.prismic.Document],io.prismic.Document,collection.immutable.ListMap[String, String],Option[io.prismic.Document]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (post,relatedPosts,author,blogCategories,jumbo) => (ctx) => apply(post,relatedPosts,author,blogCategories,jumbo)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 25 07:39:54 MSK 2014
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/Diapost/app/views/post/postDetail.scala.html
                  HASH: 78e338f75b78967478a18b14dc55be36ee6238fa
                  MATRIX: 662->1|976->226|1006->230|1451->648|1464->652|1503->682|1540->691|1569->697|1598->698|1690->763|1703->767|1748->803|1784->811|1812->816|2093->1070|2108->1076|2163->1110|2232->1152|2247->1158|2305->1195|2358->1221|2373->1227|2449->1282|2982->1788|3005->1802|3018->1806|3062->1812|3116->1838|3160->1855|3172->1858|3196->1861|3259->1893|3305->1911|3782->2361|3797->2367|3838->2387|4247->2769|4260->2773|4304->2808|4350->2816|4379->2817|4437->2847|4450->2850|4476->2854|4510->2856|4910->3229|4923->3233|4958->3259|5005->3268|5034->3270|5064->3276|5293->3478|5306->3482|5372->3526|5483->3610|5496->3614|5531->3639|5578->3647|5608->3649|5651->3667|5681->3668|5880->3840|5893->3844|5932->3874|5978->3882|6007->3884|6036->3889|6497->4323|6512->4329|6565->4373|6603->4383|6619->4389|6648->4394|7483->5201|7497->5205|7574->5260|7621->5278|7751->5380|7779->5398|7820->5400|7863->5414|7931->5454|7946->5459|7960->5463|7996->5470|8009->5473|8057->5510|8095->5518|8110->5522|8177->5562|8548->5905|8563->5910|8577->5914|8613->5921|8626->5924|8669->5957|8705->5964|8737->5969|8808->6012|8823->6017|8837->6021|8873->6028|8886->6031|8971->6105|9008->6112|9022->6115|9056->6122|9243->6277|9283->6289|9349->6327|9379->6335|9419->6347|9582->6482|9598->6488|9660->6528|9746->6586|9762->6592|9830->6638|9916->6696|9932->6702|9990->6738|10076->6796|10092->6802|10153->6841|10239->6899|10255->6905|10321->6949|10394->6994|10435->7013|10471->7021
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|52->31|52->31|52->31|52->31|53->32|53->32|53->32|53->32|54->33|55->34|67->46|67->46|67->46|77->56|77->56|77->56|77->56|77->56|77->56|77->56|77->56|77->56|83->62|83->62|83->62|83->62|83->62|83->62|86->65|86->65|86->65|87->66|87->66|87->66|87->66|87->66|87->66|87->66|90->69|90->69|90->69|90->69|90->69|90->69|104->83|104->83|104->83|104->83|104->83|104->83|123->102|123->102|123->102|124->103|131->110|131->110|131->110|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|138->117|138->117|138->117|138->117|138->117|138->117|138->117|138->117|139->118|139->118|139->118|139->118|139->118|139->118|139->118|139->118|139->118|145->124|147->126|149->128|149->128|151->130|154->133|154->133|154->133|155->134|155->134|155->134|156->135|156->135|156->135|157->136|157->136|157->136|158->137|158->137|158->137|159->138|159->138|161->140
                  -- GENERATED --
              */
          