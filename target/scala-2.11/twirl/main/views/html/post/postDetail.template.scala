
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

            """),_display_(/*164.14*/footer()),format.raw/*164.22*/("""

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
        var disqus_shortname = 'diapost-portal'; // required: replace example with your forum shortname

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
                  DATE: Tue Feb 17 14:26:19 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/post/postDetail.scala.html
                  HASH: 74661e0e0b2f1461c8d27ca572af55a2eb4a41ee
                  MATRIX: 662->1|976->226|1004->228|1441->638|1454->642|1493->672|1530->681|1559->687|1588->688|1679->752|1692->756|1737->792|1773->800|1801->805|2078->1055|2093->1061|2148->1095|2216->1136|2231->1142|2289->1179|2341->1204|2356->1210|2432->1265|2952->1758|2975->1772|2988->1776|3032->1782|3085->1807|3129->1824|3141->1827|3165->1830|3227->1861|3272->1878|3737->2316|3752->2322|3793->2342|4192->2714|4205->2718|4249->2753|4295->2761|4324->2762|4382->2792|4395->2795|4421->2799|4455->2801|4849->3168|4862->3172|4897->3198|4944->3207|4973->3209|5003->3215|5229->3414|5242->3418|5308->3462|5418->3545|5431->3549|5466->3574|5513->3582|5543->3584|5586->3602|5616->3603|5812->3772|5825->3776|5864->3806|5910->3814|5939->3816|5968->3821|6415->4241|6430->4247|6483->4291|6521->4301|6537->4307|6566->4312|6646->4382|6695->4403|6766->4446|6795->4447|6844->4468|6993->4589|7022->4590|7051->4591|7504->5016|7533->5017|7562->5018|7624->5074|7674->5096|8301->5694|8331->5695|8462->5796|8493->5797|9019->6295|9033->6299|9110->6354|9156->6371|9296->6483|9324->6501|9365->6503|9407->6516|9475->6556|9490->6561|9504->6565|9540->6572|9553->6575|9601->6612|9639->6620|9654->6624|9721->6664|10086->7001|10101->7006|10115->7010|10151->7017|10164->7020|10207->7053|10243->7060|10275->7065|10345->7107|10360->7112|10374->7116|10410->7123|10423->7126|10508->7200|10545->7207|10559->7210|10593->7217|10774->7366|10812->7376|10967->7514|11017->7535|11430->7919|11460->7920|11510->7941|11856->8258|11886->8259|12197->8542|12227->8550|12265->8560|12425->8692|12441->8698|12503->8738|12588->8795|12604->8801|12672->8847|12757->8904|12773->8910|12831->8946|12916->9003|12932->9009|12993->9048|13078->9105|13094->9111|13160->9155|13232->9199|13273->9218|13320->9262|13357->9271|13678->9563|13708->9564|13745->9573|14052->9852|14082->9853
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|52->31|52->31|52->31|52->31|53->32|53->32|53->32|53->32|54->33|55->34|67->46|67->46|67->46|77->56|77->56|77->56|77->56|77->56|77->56|77->56|77->56|77->56|83->62|83->62|83->62|83->62|83->62|83->62|86->65|86->65|86->65|87->66|87->66|87->66|87->66|87->66|87->66|87->66|90->69|90->69|90->69|90->69|90->69|90->69|104->83|104->83|104->83|104->83|104->83|104->83|107->86|108->87|108->87|108->87|109->88|110->89|110->89|110->89|116->95|116->95|116->95|117->96|119->98|127->106|127->106|127->106|127->106|138->117|138->117|138->117|139->118|147->126|147->126|147->126|148->127|148->127|148->127|148->127|148->127|148->127|148->127|148->127|148->127|148->127|154->133|154->133|154->133|154->133|154->133|154->133|154->133|154->133|155->134|155->134|155->134|155->134|155->134|155->134|155->134|155->134|155->134|161->140|163->142|166->145|167->146|173->152|173->152|174->153|177->156|177->156|185->164|185->164|187->166|190->169|190->169|190->169|191->170|191->170|191->170|192->171|192->171|192->171|193->172|193->172|193->172|194->173|194->173|194->173|195->174|195->174|197->176|198->177|203->182|203->182|204->183|208->187|208->187
                  -- GENERATED --
              */
          