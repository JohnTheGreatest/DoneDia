
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
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.at("images/favicon.ico")),format.raw/*16.97*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.at("stylesheets/main.css")),format.raw/*17.79*/("""">
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.at("stylesheets/animate.css")),format.raw/*18.82*/("""">
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js")),format.raw/*19.84*/(""""></script>
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
                    """),_display_(/*32.22*/blogCategories/*32.36*/.map/*32.40*/{cat=>_display_(Seq[Any](format.raw/*32.46*/("""
                        """),format.raw/*33.25*/("""<li><a href=""""),_display_(/*33.39*/routes/*33.45*/.Application.blogCategory(cat._1)),format.raw/*33.78*/("""" """),_display_(/*33.81*/if(cat._1.contains("kon"))/*33.107*/{_display_(Seq[Any](format.raw/*33.108*/("""class="kon"""")))}),format.raw/*33.120*/(""">"""),_display_(/*33.122*/cat/*33.125*/._2),format.raw/*33.128*/("""</a></li>
                    """)))}),format.raw/*34.22*/("""
                """),format.raw/*35.17*/("""</ul>
            </nav>
        </div>

        <div class="main-transform">

            <header class="dg-header dg-blog-header">
                <div class="container">
                    <div class="dg-header__menubtn">
                        <button class="ir icon-navigation" id="trigger-overlay" type="button"></button>
                    </div>
                    <div class="logo-wrapper">
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.Application.index()),format.raw/*47.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Информационно-аналитический<br/>молодежный портал</h1>
                        </a>
                    </div>
                </div>
            </header>

            <section class="dg-blog">

                <div class="dg-blog__banner" """),_display_(/*57.47*/post/*57.51*/.getImage("blog.image", "main").map/*57.86*/ {img =>_display_(Seq[Any](format.raw/*57.94*/(""" """),format.raw/*57.95*/("""style="background-image: url("""),_display_(/*57.125*/img/*57.128*/.url),format.raw/*57.132*/(""")""")))}),format.raw/*57.134*/("""">
                    <div class="overlay-dark"></div>
                        <div class="dg-blog__banner__content">
                            <div class="container">
                                <div class="dg-blog__banner__content--center">
                                    <div class="dg-feed__info__header">
                                        <h1>"""),_display_(/*63.46*/post/*63.50*/.getText("blog.title").map/*63.76*/{title =>_display_(Seq[Any](format.raw/*63.85*/(""" """),_display_(/*63.87*/title)))}),format.raw/*63.93*/("""</h1>
                                    </div>
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*66.81*/post/*66.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*66.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*67.79*/post/*67.83*/.getText("blog.body").map/*67.108*/{text =>_display_(Seq[Any](format.raw/*67.116*/(""" """),_display_(/*67.118*/{text.length/900})))}),format.raw/*67.136*/(""" """),format.raw/*67.137*/("""мин</p>
                                    </div>
                                    <div class="dg-blog__banner_2header">
                                        <p>"""),_display_(/*70.45*/post/*70.49*/.getText("blog.shortlede").map/*70.79*/{lede =>_display_(Seq[Any](format.raw/*70.87*/(""" """),_display_(/*70.89*/lede)))}),format.raw/*70.94*/("""</p>
                                    </div>
                                </div>
                            </div>
                      </div>
                </div>

            </section>

        <section class="dg-blog__body">
            <div class="container">

                <div class="db-blog__body__utility">
                    <a href=""""),_display_(/*83.31*/routes/*83.37*/.Application.author(author.id, author.slug)),format.raw/*83.80*/("""" class="dg-blog__body__author">
                        <img src=""""),_display_(/*84.36*/author/*84.42*/.getImage("author.image", "authorthumb").map/*84.86*/{imgUrl=>_display_(_display_(/*84.96*/imgUrl/*84.102*/.url))}),format.raw/*84.107*/(""""/>
                    </a>

                    """),format.raw/*87.39*/("""
                    """),format.raw/*88.21*/("""<script type="text/javascript">(function() """),format.raw/*88.64*/("""{"""),format.raw/*88.65*/("""
                    """),format.raw/*89.21*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
                    if (window.ifpluso==undefined) """),format.raw/*90.52*/("""{"""),format.raw/*90.53*/(""" """),format.raw/*90.54*/("""window.ifpluso = 1;
                    var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
                    s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
                    s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
                    var h=d[g]('body')[0];
                    h.appendChild(s);
                    """),format.raw/*96.21*/("""}"""),format.raw/*96.22*/("""}"""),format.raw/*96.23*/(""")();</script>
                    """),format.raw/*97.43*/("""

                    """),format.raw/*99.21*/("""<div class="dg-blog__body__actions">
                        <ul class="dg-feed__info__actions">
                            <li>
                                <div class="pluso" data-background="none;" data-options="medium,square,line,horizontal,counter,sepcounter=1,theme=14" data-services="" data-user="1194849155"></div>
                            </li>
                            <li>
                                    <!-- LikeBtn.com BEGIN -->
                                <span class="likebtn-wrapper" data-lang="ru"></span>
                                <script>(function(d,e,s)"""),format.raw/*107.57*/("""{"""),format.raw/*107.58*/("""a=d.createElement(e);m=d.getElementsByTagName(e)[0];a.async=1;a.src=s;m.parentNode.insertBefore(a, m)"""),format.raw/*107.159*/("""}"""),format.raw/*107.160*/(""")(document,"script","//w.likebtn.com/js/w/widget.js");</script>
                                    <!-- LikeBtn.com END -->
                            </li>
                            <li>
                                <a href="#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="clear"></div>
                <article>
                    """),_display_(/*118.22*/post/*118.26*/.getHtml("blog.body", ctx.linkResolver).map(Html.apply)),format.raw/*118.81*/("""
                """),format.raw/*119.17*/("""</article>
                
            </div>

        </section>

        <div class="clear"></div>

        """),_display_(/*127.10*/if(!jumbo.isEmpty)/*127.28*/ {_display_(Seq[Any](format.raw/*127.30*/("""
            """),format.raw/*128.13*/("""<div class="jumbo-video" data-vide-bg=""""),_display_(/*128.53*/jumbo/*128.58*/.map/*128.62*/{jmb=>_display_(_display_(/*128.69*/jmb/*128.72*/.getLink("jumbo-video.video-mp4").map/*128.109*/{link=>_display_(_display_(/*128.117*/link/*128.121*/.getUrl(ctx.linkResolver).dropRight(4)))}))}),format.raw/*128.161*/("""" data-vide-options="loop: true, muted: false, position: 50% 50%">

                <div class="jumbo-video__content-wrapper">
                    <div class="container">
                        <div class="jumbo-video__content-layout">
                            <div class="jumbo-video__content">
                                <h3>"""),_display_(/*134.38*/jumbo/*134.43*/.map/*134.47*/{jmb=>_display_(_display_(/*134.54*/jmb/*134.57*/.getText("jumbo-video.title").map/*134.90*/{txt=>_display_(_display_(/*134.97*/txt))}))}),format.raw/*134.102*/("""</h3>
                                <p>"""),_display_(/*135.37*/jumbo/*135.42*/.map/*135.46*/{jmb=>_display_(_display_(/*135.53*/jmb/*135.56*/.getStructuredText("jumbo-video.content").flatMap(_.getFirstParagraph).map/*135.130*/{txt=>_display_(_display_(/*135.137*/txt/*135.140*/.text))}))}),format.raw/*135.147*/("""</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*141.10*/("""

        """),format.raw/*143.9*/("""<div class="clear"></div>
            <div class="dg-blog__body">
                <div class="container">
                    """),format.raw/*146.33*/("""
                    """),format.raw/*147.21*/("""<div id="disqus_thread"></div>
                    <script type="text/javascript">
                    /*   CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE   */
                    var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

                    /*   DON'T EDIT BELOW THIS LINE  */
                    (function() """),format.raw/*153.33*/("""{"""),format.raw/*153.34*/("""
                    """),format.raw/*154.21*/("""var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;
                    dsq.src = '//' + disqus_shortname + '.disqus.com/embed.js';
                    (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
                    """),format.raw/*157.21*/("""}"""),format.raw/*157.22*/(""")();
                    </script>
                    <noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>

                </div>
            </div>
        <div class="clear"></div>

            """),_display_(/*165.14*/footer(blogCategories)),format.raw/*165.36*/("""

        """),format.raw/*167.9*/("""</div>

        <script src="http://yastatic.net/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
        <script src=""""),_display_(/*170.23*/routes/*170.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*170.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*171.23*/routes/*171.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*171.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*172.23*/routes/*172.29*/.Assets.at("javascripts/classie.js")),format.raw/*172.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*173.23*/routes/*173.29*/.Assets.at("javascripts/navigation.js")),format.raw/*173.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*174.23*/routes/*174.29*/.Assets.at("javascripts/jquery.vide.min.js")),format.raw/*174.73*/("""" type="text/javascript"></script>
        """),_display_(/*175.10*/postDetailScripts()),format.raw/*175.29*/("""
        
        """),format.raw/*177.35*/("""
        """),format.raw/*178.9*/("""<script type="text/javascript">
        /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
        var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

        /* * * DON'T EDIT BELOW THIS LINE * * */
        (function () """),format.raw/*183.22*/("""{"""),format.raw/*183.23*/("""
        """),format.raw/*184.9*/("""var s = document.createElement('script'); s.async = true;
        s.type = 'text/javascript';
        s.src = '//' + disqus_shortname + '.disqus.com/count.js';
        (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
        """),format.raw/*188.9*/("""}"""),format.raw/*188.10*/("""());
        </script>

    </body>
</html>

"""))}
  }

  def render(post:io.prismic.Document,relatedPosts:Seq[io.prismic.Document],author:io.prismic.Document,blogCategories:collection.immutable.ListMap[String, String],jumbo:Option[io.prismic.Document],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(post,relatedPosts,author,blogCategories,jumbo)(ctx)

  def f:((io.prismic.Document,Seq[io.prismic.Document],io.prismic.Document,collection.immutable.ListMap[String, String],Option[io.prismic.Document]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (post,relatedPosts,author,blogCategories,jumbo) => (ctx) => apply(post,relatedPosts,author,blogCategories,jumbo)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 16:59:51 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/post/postDetail.scala.html
                  HASH: abb4669d6d1cb814c4892a7539eec3a2a446fabb
                  MATRIX: 662->1|976->226|1006->230|1451->648|1464->652|1503->682|1540->691|1569->697|1598->698|1690->763|1703->767|1748->803|1784->811|1812->816|2113->1090|2128->1096|2181->1128|2251->1171|2266->1177|2321->1211|2390->1253|2405->1259|2463->1296|2516->1322|2531->1328|2607->1383|3140->1889|3163->1903|3176->1907|3220->1913|3274->1939|3315->1953|3330->1959|3384->1992|3414->1995|3450->2021|3490->2022|3534->2034|3564->2036|3577->2039|3602->2042|3665->2074|3711->2092|4188->2542|4203->2548|4244->2568|4653->2950|4666->2954|4710->2989|4756->2997|4785->2998|4843->3028|4856->3031|4882->3035|4916->3037|5316->3410|5329->3414|5364->3440|5411->3449|5440->3451|5470->3457|5699->3659|5712->3663|5778->3707|5889->3791|5902->3795|5937->3820|5984->3828|6014->3830|6057->3848|6087->3849|6286->4021|6299->4025|6338->4055|6384->4063|6413->4065|6442->4070|6841->4442|6856->4448|6920->4491|7016->4560|7031->4566|7084->4610|7122->4620|7138->4626|7167->4631|7248->4702|7298->4724|7369->4767|7398->4768|7448->4790|7598->4912|7627->4913|7656->4914|8115->5345|8144->5346|8173->5347|8236->5404|8288->5428|8923->6034|8953->6035|9084->6136|9115->6137|9652->6646|9666->6650|9743->6705|9790->6723|9938->6843|9966->6861|10007->6863|10050->6877|10118->6917|10133->6922|10147->6926|10183->6933|10196->6936|10244->6973|10282->6981|10297->6985|10364->7025|10735->7368|10750->7373|10764->7377|10800->7384|10813->7387|10856->7420|10892->7427|10924->7432|10995->7475|11010->7480|11024->7484|11060->7491|11073->7494|11158->7568|11195->7575|11209->7578|11243->7585|11430->7740|11470->7752|11628->7893|11679->7915|12098->8305|12128->8306|12179->8328|12528->8648|12558->8649|12873->8936|12917->8958|12957->8970|13120->9105|13136->9111|13198->9151|13284->9209|13300->9215|13368->9261|13454->9319|13470->9325|13528->9361|13614->9419|13630->9425|13691->9464|13777->9522|13793->9528|13859->9572|13932->9617|13973->9636|14022->9682|14060->9692|14389->9992|14419->9993|14457->10003|14768->10286|14798->10287
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|53->32|53->32|53->32|53->32|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33|55->34|56->35|68->47|68->47|68->47|78->57|78->57|78->57|78->57|78->57|78->57|78->57|78->57|78->57|84->63|84->63|84->63|84->63|84->63|84->63|87->66|87->66|87->66|88->67|88->67|88->67|88->67|88->67|88->67|88->67|91->70|91->70|91->70|91->70|91->70|91->70|104->83|104->83|104->83|105->84|105->84|105->84|105->84|105->84|105->84|108->87|109->88|109->88|109->88|110->89|111->90|111->90|111->90|117->96|117->96|117->96|118->97|120->99|128->107|128->107|128->107|128->107|139->118|139->118|139->118|140->119|148->127|148->127|148->127|149->128|149->128|149->128|149->128|149->128|149->128|149->128|149->128|149->128|149->128|155->134|155->134|155->134|155->134|155->134|155->134|155->134|155->134|156->135|156->135|156->135|156->135|156->135|156->135|156->135|156->135|156->135|162->141|164->143|167->146|168->147|174->153|174->153|175->154|178->157|178->157|186->165|186->165|188->167|191->170|191->170|191->170|192->171|192->171|192->171|193->172|193->172|193->172|194->173|194->173|194->173|195->174|195->174|195->174|196->175|196->175|198->177|199->178|204->183|204->183|205->184|209->188|209->188
                  -- GENERATED --
              */
          