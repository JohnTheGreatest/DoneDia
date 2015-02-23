
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
                        """),format.raw/*32.25*/("""<li><a href=""""),_display_(/*32.39*/routes/*32.45*/.Application.blogCategory(cat._1)),format.raw/*32.78*/("""" """),_display_(/*32.81*/if(cat._1.contains("kon"))/*32.107*/{_display_(Seq[Any](format.raw/*32.108*/("""class="kon"""")))}),format.raw/*32.120*/(""">"""),_display_(/*32.122*/cat/*32.125*/._2),format.raw/*32.128*/("""</a></li>
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

                    """),format.raw/*86.39*/("""
                    """),format.raw/*87.21*/("""<script type="text/javascript">(function() """),format.raw/*87.64*/("""{"""),format.raw/*87.65*/("""
                    """),format.raw/*88.21*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
                    if (window.ifpluso==undefined) """),format.raw/*89.52*/("""{"""),format.raw/*89.53*/(""" """),format.raw/*89.54*/("""window.ifpluso = 1;
                    var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
                    s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
                    s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
                    var h=d[g]('body')[0];
                    h.appendChild(s);
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/("""}"""),format.raw/*95.23*/(""")();</script>
                    """),format.raw/*96.43*/("""

                    """),format.raw/*98.21*/("""<div class="dg-blog__body__actions">
                        <ul class="dg-feed__info__actions">
                            <li>
                                <div class="pluso" data-background="none;" data-options="medium,square,line,horizontal,counter,sepcounter=1,theme=14" data-services="" data-user="1194849155"></div>
                            </li>
                            <li>
                                    <!-- LikeBtn.com BEGIN -->
                                <span class="likebtn-wrapper" data-lang="ru"></span>
                                <script>(function(d,e,s)"""),format.raw/*106.57*/("""{"""),format.raw/*106.58*/("""a=d.createElement(e);m=d.getElementsByTagName(e)[0];a.async=1;a.src=s;m.parentNode.insertBefore(a, m)"""),format.raw/*106.159*/("""}"""),format.raw/*106.160*/(""")(document,"script","//w.likebtn.com/js/w/widget.js");</script>
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
                    """),_display_(/*117.22*/post/*117.26*/.getHtml("blog.body", ctx.linkResolver).map(Html.apply)),format.raw/*117.81*/("""
                """),format.raw/*118.17*/("""</article>
                
            </div>

        </section>

        <div class="clear"></div>

        """),_display_(/*126.10*/if(!jumbo.isEmpty)/*126.28*/ {_display_(Seq[Any](format.raw/*126.30*/("""
            """),format.raw/*127.13*/("""<div class="jumbo-video" data-vide-bg=""""),_display_(/*127.53*/jumbo/*127.58*/.map/*127.62*/{jmb=>_display_(_display_(/*127.69*/jmb/*127.72*/.getLink("jumbo-video.video-mp4").map/*127.109*/{link=>_display_(_display_(/*127.117*/link/*127.121*/.getUrl(ctx.linkResolver).dropRight(4)))}))}),format.raw/*127.161*/("""" data-vide-options="loop: true, muted: false, position: 50% 50%">

                <div class="jumbo-video__content-wrapper">
                    <div class="container">
                        <div class="jumbo-video__content-layout">
                            <div class="jumbo-video__content">
                                <h3>"""),_display_(/*133.38*/jumbo/*133.43*/.map/*133.47*/{jmb=>_display_(_display_(/*133.54*/jmb/*133.57*/.getText("jumbo-video.title").map/*133.90*/{txt=>_display_(_display_(/*133.97*/txt))}))}),format.raw/*133.102*/("""</h3>
                                <p>"""),_display_(/*134.37*/jumbo/*134.42*/.map/*134.46*/{jmb=>_display_(_display_(/*134.53*/jmb/*134.56*/.getStructuredText("jumbo-video.content").flatMap(_.getFirstParagraph).map/*134.130*/{txt=>_display_(_display_(/*134.137*/txt/*134.140*/.text))}))}),format.raw/*134.147*/("""</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*140.10*/("""

        """),format.raw/*142.9*/("""<div class="clear"></div>
            <div class="dg-blog__body">
                <div class="container">
                    """),format.raw/*145.33*/("""
                    """),format.raw/*146.21*/("""<div id="disqus_thread"></div>
                    <script type="text/javascript">
                    /*   CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE   */
                    var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

                    /*   DON'T EDIT BELOW THIS LINE  */
                    (function() """),format.raw/*152.33*/("""{"""),format.raw/*152.34*/("""
                    """),format.raw/*153.21*/("""var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;
                    dsq.src = '//' + disqus_shortname + '.disqus.com/embed.js';
                    (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
                    """),format.raw/*156.21*/("""}"""),format.raw/*156.22*/(""")();
                    </script>
                    <noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>

                </div>
            </div>
        <div class="clear"></div>

            """),_display_(/*164.14*/footer(blogCategories)),format.raw/*164.36*/("""

        """),format.raw/*166.9*/("""</div>

        <script src="http://yastatic.net/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
        <script src=""""),_display_(/*169.23*/routes/*169.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*169.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*170.23*/routes/*170.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*170.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*171.23*/routes/*171.29*/.Assets.at("javascripts/classie.js")),format.raw/*171.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*172.23*/routes/*172.29*/.Assets.at("javascripts/navigation.js")),format.raw/*172.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*173.23*/routes/*173.29*/.Assets.at("javascripts/jquery.vide.min.js")),format.raw/*173.73*/("""" type="text/javascript"></script>
        """),_display_(/*174.10*/postDetailScripts()),format.raw/*174.29*/("""
        
        """),format.raw/*176.35*/("""
        """),format.raw/*177.9*/("""<script type="text/javascript">
        /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
        var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

        /* * * DON'T EDIT BELOW THIS LINE * * */
        (function () """),format.raw/*182.22*/("""{"""),format.raw/*182.23*/("""
        """),format.raw/*183.9*/("""var s = document.createElement('script'); s.async = true;
        s.type = 'text/javascript';
        s.src = '//' + disqus_shortname + '.disqus.com/count.js';
        (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
        """),format.raw/*187.9*/("""}"""),format.raw/*187.10*/("""());
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
                  DATE: Mon Feb 23 00:12:27 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/post/postDetail.scala.html
                  HASH: 0b34f0e1346a2242da66bab2cec48ec7a9d831c3
                  MATRIX: 662->1|976->226|1006->230|1451->648|1464->652|1503->682|1540->691|1569->697|1598->698|1690->763|1703->767|1748->803|1784->811|1812->816|2093->1070|2108->1076|2163->1110|2232->1152|2247->1158|2305->1195|2358->1221|2373->1227|2449->1282|2982->1788|3005->1802|3018->1806|3062->1812|3116->1838|3157->1852|3172->1858|3226->1891|3256->1894|3292->1920|3332->1921|3376->1933|3406->1935|3419->1938|3444->1941|3507->1973|3553->1991|4030->2441|4045->2447|4086->2467|4495->2849|4508->2853|4552->2888|4598->2896|4627->2897|4685->2927|4698->2930|4724->2934|4758->2936|5158->3309|5171->3313|5206->3339|5253->3348|5282->3350|5312->3356|5541->3558|5554->3562|5620->3606|5731->3690|5744->3694|5779->3719|5826->3727|5856->3729|5899->3747|5929->3748|6128->3920|6141->3924|6180->3954|6226->3962|6255->3964|6284->3969|6745->4403|6760->4409|6813->4453|6851->4463|6867->4469|6896->4474|6979->4547|7029->4569|7100->4612|7129->4613|7179->4635|7329->4757|7358->4758|7387->4759|7846->5190|7875->5191|7904->5192|7967->5249|8019->5273|8654->5879|8684->5880|8815->5981|8846->5982|9383->6491|9397->6495|9474->6550|9521->6568|9669->6688|9697->6706|9738->6708|9781->6722|9849->6762|9864->6767|9878->6771|9914->6778|9927->6781|9975->6818|10013->6826|10028->6830|10095->6870|10466->7213|10481->7218|10495->7222|10531->7229|10544->7232|10587->7265|10623->7272|10655->7277|10726->7320|10741->7325|10755->7329|10791->7336|10804->7339|10889->7413|10926->7420|10940->7423|10974->7430|11161->7585|11201->7597|11359->7738|11410->7760|11829->8150|11859->8151|11910->8173|12259->8493|12289->8494|12604->8781|12648->8803|12688->8815|12851->8950|12867->8956|12929->8996|13015->9054|13031->9060|13099->9106|13185->9164|13201->9170|13259->9206|13345->9264|13361->9270|13422->9309|13508->9367|13524->9373|13590->9417|13663->9462|13704->9481|13753->9527|13791->9537|14120->9837|14150->9838|14188->9848|14499->10131|14529->10132
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|52->31|52->31|52->31|52->31|53->32|53->32|53->32|53->32|53->32|53->32|53->32|53->32|53->32|53->32|53->32|54->33|55->34|67->46|67->46|67->46|77->56|77->56|77->56|77->56|77->56|77->56|77->56|77->56|77->56|83->62|83->62|83->62|83->62|83->62|83->62|86->65|86->65|86->65|87->66|87->66|87->66|87->66|87->66|87->66|87->66|90->69|90->69|90->69|90->69|90->69|90->69|104->83|104->83|104->83|104->83|104->83|104->83|107->86|108->87|108->87|108->87|109->88|110->89|110->89|110->89|116->95|116->95|116->95|117->96|119->98|127->106|127->106|127->106|127->106|138->117|138->117|138->117|139->118|147->126|147->126|147->126|148->127|148->127|148->127|148->127|148->127|148->127|148->127|148->127|148->127|148->127|154->133|154->133|154->133|154->133|154->133|154->133|154->133|154->133|155->134|155->134|155->134|155->134|155->134|155->134|155->134|155->134|155->134|161->140|163->142|166->145|167->146|173->152|173->152|174->153|177->156|177->156|185->164|185->164|187->166|190->169|190->169|190->169|191->170|191->170|191->170|192->171|192->171|192->171|193->172|193->172|193->172|194->173|194->173|194->173|195->174|195->174|197->176|198->177|203->182|203->182|204->183|208->187|208->187
                  -- GENERATED --
              */
          