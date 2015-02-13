
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
object posts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: Seq[io.prismic.Document], blogCategories: collection.immutable.ListMap[String, String])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title> - Диапост.ру</title>
        <meta name="description" content="">
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
                """),_display_(/*31.18*/blogCategories/*31.32*/.map/*31.36*/{cat=>_display_(Seq[Any](format.raw/*31.42*/("""
                    """),format.raw/*32.21*/("""<li><a href="#">"""),_display_(/*32.38*/cat/*32.41*/._2),format.raw/*32.44*/("""</a></li>
                """)))}),format.raw/*33.18*/("""
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

            <section class="dg-blog-feed">



            </section>

        <div class="clear"></div>

        """),_display_(/*62.10*/footer()),format.raw/*62.18*/("""

        """),format.raw/*64.9*/("""</div>

        <script src=""""),_display_(/*66.23*/routes/*66.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*66.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*67.23*/routes/*67.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*67.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*68.23*/routes/*68.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*68.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*69.23*/routes/*69.29*/.Assets.at("javascripts/classie.js")),format.raw/*69.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*70.23*/routes/*70.29*/.Assets.at("javascripts/navigation.js")),format.raw/*70.68*/("""" type="text/javascript"></script>
        """),_display_(/*71.10*/postDetailScripts()),format.raw/*71.29*/("""

    """),format.raw/*73.5*/("""</body>
</html>

"""))}
  }

  def render(posts:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,blogCategories)(ctx)

  def f:((Seq[io.prismic.Document],collection.immutable.ListMap[String, String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,blogCategories) => (ctx) => apply(posts,blogCategories)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 12 17:10:32 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/post/posts.scala.html
                  HASH: 9dd18c80586f5e9454cc4fed88d3302ec31c1a6a
                  MATRIX: 589->1|804->127|832->129|1590->860|1605->866|1660->900|1728->941|1743->947|1801->984|1853->1009|1868->1015|1944->1070|2464->1563|2487->1577|2500->1581|2544->1587|2593->1608|2637->1625|2649->1628|2673->1631|2731->1658|2776->1675|3241->2113|3256->2119|3297->2139|3725->2540|3754->2548|3791->2558|3848->2588|3863->2594|3937->2647|4021->2704|4036->2710|4097->2750|4181->2807|4196->2813|4263->2859|4347->2916|4362->2922|4419->2958|4503->3015|4518->3021|4578->3060|4649->3104|4689->3123|4722->3129
                  LINES: 19->1|22->1|24->3|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|52->31|52->31|52->31|52->31|53->32|53->32|53->32|53->32|54->33|55->34|67->46|67->46|67->46|83->62|83->62|85->64|87->66|87->66|87->66|88->67|88->67|88->67|89->68|89->68|89->68|90->69|90->69|90->69|91->70|91->70|91->70|92->71|92->71|94->73
                  -- GENERATED --
              */
          