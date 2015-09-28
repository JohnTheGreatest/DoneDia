
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

        <!-- Yandex.Metrika counter -->
        <script type="text/javascript">
        (function (d, w, c) """),format.raw/*25.29*/("""{"""),format.raw/*25.30*/("""
        """),format.raw/*26.9*/("""(w[c] = w[c] || []).push(function() """),format.raw/*26.45*/("""{"""),format.raw/*26.46*/("""
        """),format.raw/*27.9*/("""try """),format.raw/*27.13*/("""{"""),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""w.yaCounter28644136 = new Ya.Metrika("""),format.raw/*28.46*/("""{"""),format.raw/*28.47*/("""id:28644136,
        webvisor:true,
        clickmap:true,
        trackLinks:true,
        accurateTrackBounce:true"""),format.raw/*32.33*/("""}"""),format.raw/*32.34*/(""");
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/(""" """),format.raw/*33.11*/("""catch(e) """),format.raw/*33.20*/("""{"""),format.raw/*33.21*/(""" """),format.raw/*33.22*/("""}"""),format.raw/*33.23*/("""
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/(""");

        var n = d.getElementsByTagName("script")[0],
        s = d.createElement("script"),
        f = function () """),format.raw/*38.25*/("""{"""),format.raw/*38.26*/(""" """),format.raw/*38.27*/("""n.parentNode.insertBefore(s, n); """),format.raw/*38.60*/("""}"""),format.raw/*38.61*/(""";
        s.type = "text/javascript";
        s.async = true;
        s.src = (d.location.protocol == "https:" ? "https:" : "http:") + "//mc.yandex.ru/metrika/watch.js";

        if (w.opera == "[object Opera]") """),format.raw/*43.42*/("""{"""),format.raw/*43.43*/("""
        """),format.raw/*44.9*/("""d.addEventListener("DOMContentLoaded", f, false);
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""" """),format.raw/*45.11*/("""else """),format.raw/*45.16*/("""{"""),format.raw/*45.17*/(""" """),format.raw/*45.18*/("""f(); """),format.raw/*45.23*/("""}"""),format.raw/*45.24*/("""
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/(""")(document, window, "yandex_metrika_callbacks");
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

        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div class="overlay overlay-contentscale">
            <button type="button" class="overlay-close">Close</button>
            <nav>
                <ul>
                    """),_display_(/*69.22*/blogCategories/*69.36*/.map/*69.40*/{cat=>_display_(Seq[Any](format.raw/*69.46*/("""
                        """),format.raw/*70.25*/("""<li><a href=""""),_display_(/*70.39*/routes/*70.45*/.Application.blogCategory(cat._1)),format.raw/*70.78*/("""" """),_display_(/*70.81*/if(cat._1.contains("kon"))/*70.107*/{_display_(Seq[Any](format.raw/*70.108*/("""class="kon"""")))}),format.raw/*70.120*/(""">"""),_display_(/*70.122*/cat/*70.125*/._2),format.raw/*70.128*/("""</a></li>
                    """)))}),format.raw/*71.22*/("""
                """),format.raw/*72.17*/("""</ul>
            </nav>
        </div>

        <div class="main-transform">

            <header class="dg-header dg-blog-header">
                <div class="container">
                    <div class="dg-header__menubtn">
                        <button class="ir icon-navigation" id="trigger-overlay" type="button"></button>
                    </div>
                    <div class="logo-wrapper">
                        <a href=""""),_display_(/*84.35*/routes/*84.41*/.Application.index()),format.raw/*84.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Молодежный информационно-<br/>аналитический портал</h1>
                        </a>
                    </div>
                </div>
            </header>

            <section class="dg-blog">

                <div class="dg-blog__banner" """),_display_(/*94.47*/post/*94.51*/.getImage("blog.image", "main").map/*94.86*/ {img =>_display_(Seq[Any](format.raw/*94.94*/(""" """),format.raw/*94.95*/("""style="background-image: url("""),_display_(/*94.125*/img/*94.128*/.url),format.raw/*94.132*/(""")""")))}),format.raw/*94.134*/("""">
                    <div class="overlay-dark"></div>
                        <div class="dg-blog__banner__content">
                            <div class="container">
                                <div class="dg-blog__banner__content--center">
                                    <div class="dg-feed__info__header">
                                        <h1>"""),_display_(/*100.46*/post/*100.50*/.getText("blog.title").map/*100.76*/{title =>_display_(Seq[Any](format.raw/*100.85*/(""" """),_display_(/*100.87*/title)))}),format.raw/*100.93*/("""</h1>
                                    </div>
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*103.81*/post/*103.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*103.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*104.79*/post/*104.83*/.getText("blog.body").map/*104.108*/{text =>_display_(Seq[Any](format.raw/*104.116*/(""" """),_display_(/*104.118*/{text.length/900})))}),format.raw/*104.136*/(""" """),format.raw/*104.137*/("""мин</p>
                                    </div>
                                    <div class="dg-blog__banner_2header">
                                        <p>"""),_display_(/*107.45*/post/*107.49*/.getText("blog.shortlede").map/*107.79*/{lede =>_display_(Seq[Any](format.raw/*107.87*/(""" """),_display_(/*107.89*/lede)))}),format.raw/*107.94*/("""</p>
                                    </div>
                                </div>
                            </div>
                      </div>
                </div>

            </section>

        <section class="dg-blog__body">
            <div class="container">

                <div class="db-blog__body__utility">
                    <a href=""""),_display_(/*120.31*/routes/*120.37*/.Application.author(author.id, author.slug)),format.raw/*120.80*/("""" class="dg-blog__body__author">
                        <div class="dg-blog__body__author--wrapper">
                            <img src=""""),_display_(/*122.40*/author/*122.46*/.getImage("author.image", "authorthumb").map/*122.90*/{imgUrl=>_display_(_display_(/*122.100*/imgUrl/*122.106*/.url))}),format.raw/*122.111*/(""""/>
                            <p class="dg-blog__body__author__author-text">"""),_display_(/*123.76*/author/*123.82*/.getText("author.full_name").map/*123.114*/{name=>_display_(_display_(/*123.122*/name))}),format.raw/*123.127*/("""</p>
                        </div>
                    </a>

                    """),format.raw/*127.39*/("""
                    """),format.raw/*128.21*/("""<script type="text/javascript">(function() """),format.raw/*128.64*/("""{"""),format.raw/*128.65*/("""
                    """),format.raw/*129.21*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
                    if (window.ifpluso==undefined) """),format.raw/*130.52*/("""{"""),format.raw/*130.53*/(""" """),format.raw/*130.54*/("""window.ifpluso = 1;
                    var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
                    s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
                    s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
                    var h=d[g]('body')[0];
                    h.appendChild(s);
                    """),format.raw/*136.21*/("""}"""),format.raw/*136.22*/("""}"""),format.raw/*136.23*/(""")();</script>
                    """),format.raw/*137.43*/("""

                    """),format.raw/*139.21*/("""<div class="dg-blog__body__actions">
                        <ul class="dg-feed__info__actions">
                            <li>
                                <div class="pluso" data-background="none;" data-options="medium,square,line,horizontal,counter,sepcounter=1,theme=14" data-services="" data-user="1194849155"></div>
                            </li>
                            <li>
                                    <!-- LikeBtn.com BEGIN -->
                                <span class="likebtn-wrapper" data-lang="ru"></span>
                                <script>(function(d,e,s)"""),format.raw/*147.57*/("""{"""),format.raw/*147.58*/("""a=d.createElement(e);m=d.getElementsByTagName(e)[0];a.async=1;a.src=s;m.parentNode.insertBefore(a, m)"""),format.raw/*147.159*/("""}"""),format.raw/*147.160*/(""")(document,"script","//w.likebtn.com/js/w/widget.js");</script>
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
                    """),_display_(/*158.22*/post/*158.26*/.getHtml("blog.body", ctx.linkResolver).map(Html.apply)),format.raw/*158.81*/("""
                """),format.raw/*159.17*/("""</article>
                
            </div>

        </section>

        <div class="clear"></div>

        """),_display_(/*167.10*/if(!jumbo.isEmpty)/*167.28*/ {_display_(Seq[Any](format.raw/*167.30*/("""
            """),format.raw/*168.13*/("""<div class="jumbo-video" data-vide-bg=""""),_display_(/*168.53*/jumbo/*168.58*/.map/*168.62*/{jmb=>_display_(_display_(/*168.69*/jmb/*168.72*/.getLink("jumbo-video.video-mp4").map/*168.109*/{link=>_display_(_display_(/*168.117*/link/*168.121*/.getUrl(ctx.linkResolver).dropRight(4)))}))}),format.raw/*168.161*/("""" data-vide-options="loop: true, muted: false, position: 50% 50%">

                <div class="jumbo-video__content-wrapper">
                    <div class="container">
                        <div class="jumbo-video__content-layout">
                            <div class="jumbo-video__content">
                                <h3>"""),_display_(/*174.38*/jumbo/*174.43*/.map/*174.47*/{jmb=>_display_(_display_(/*174.54*/jmb/*174.57*/.getText("jumbo-video.title").map/*174.90*/{txt=>_display_(_display_(/*174.97*/txt))}))}),format.raw/*174.102*/("""</h3>
                                <p>"""),_display_(/*175.37*/jumbo/*175.42*/.map/*175.46*/{jmb=>_display_(_display_(/*175.53*/jmb/*175.56*/.getStructuredText("jumbo-video.content").flatMap(_.getFirstParagraph).map/*175.130*/{txt=>_display_(_display_(/*175.137*/txt/*175.140*/.text))}))}),format.raw/*175.147*/("""</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*181.10*/("""

        """),format.raw/*183.9*/("""<div class="clear"></div>
            <div class="dg-blog__body">
                <div class="container">
                    """),format.raw/*186.33*/("""
                    """),format.raw/*187.21*/("""<div id="disqus_thread"></div>
                    <script type="text/javascript">
                    /*   CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE   */
                    var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

                    /*   DON'T EDIT BELOW THIS LINE  */
                    (function() """),format.raw/*193.33*/("""{"""),format.raw/*193.34*/("""
                    """),format.raw/*194.21*/("""var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;
                    dsq.src = '//' + disqus_shortname + '.disqus.com/embed.js';
                    (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
                    """),format.raw/*197.21*/("""}"""),format.raw/*197.22*/(""")();
                    </script>
                    <noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>

                </div>
            </div>
        <div class="clear"></div>

            """),_display_(/*205.14*/footer(blogCategories)),format.raw/*205.36*/("""

        """),format.raw/*207.9*/("""</div>

        <script src="http://yastatic.net/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
        <script src=""""),_display_(/*210.23*/routes/*210.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*210.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*211.23*/routes/*211.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*211.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*212.23*/routes/*212.29*/.Assets.at("javascripts/classie.js")),format.raw/*212.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*213.23*/routes/*213.29*/.Assets.at("javascripts/navigation.js")),format.raw/*213.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*214.23*/routes/*214.29*/.Assets.at("javascripts/jquery.vide.min.js")),format.raw/*214.73*/("""" type="text/javascript"></script>
        """),_display_(/*215.10*/postDetailScripts()),format.raw/*215.29*/("""
        
        """),format.raw/*217.35*/("""
        """),format.raw/*218.9*/("""<script type="text/javascript">
        /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
        var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

        /* * * DON'T EDIT BELOW THIS LINE * * */
        (function () """),format.raw/*223.22*/("""{"""),format.raw/*223.23*/("""
        """),format.raw/*224.9*/("""var s = document.createElement('script'); s.async = true;
        s.type = 'text/javascript';
        s.src = '//' + disqus_shortname + '.disqus.com/count.js';
        (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
        """),format.raw/*228.9*/("""}"""),format.raw/*228.10*/("""());
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
                  DATE: Mon Sep 28 13:56:37 MSK 2015
                  SOURCE: C:/Users/d1sp/Documents/GitHub/DoneDia/app/views/post/postDetail.scala.html
                  HASH: f0ff282d9c2a2f372596a754de7b95e7eda91b4e
                  MATRIX: 662->1|976->226|1004->228|1441->638|1454->642|1493->672|1530->681|1559->687|1588->688|1679->752|1692->756|1737->792|1773->800|1801->805|2098->1075|2113->1081|2166->1113|2235->1155|2250->1161|2305->1195|2373->1236|2388->1242|2446->1279|2498->1304|2513->1310|2589->1365|2761->1509|2790->1510|2826->1519|2890->1555|2919->1556|2955->1565|2987->1569|3016->1570|3052->1579|3117->1616|3146->1617|3290->1733|3319->1734|3357->1745|3386->1746|3415->1747|3452->1756|3481->1757|3510->1758|3539->1759|3575->1768|3604->1769|3752->1889|3781->1890|3810->1891|3871->1924|3900->1925|4140->2137|4169->2138|4205->2147|4290->2205|4319->2206|4348->2207|4381->2212|4410->2213|4439->2214|4472->2219|4501->2220|4537->2229|4566->2230|5742->3379|5765->3393|5778->3397|5822->3403|5875->3428|5916->3442|5931->3448|5985->3481|6015->3484|6051->3510|6091->3511|6135->3523|6165->3525|6178->3528|6203->3531|6265->3562|6310->3579|6775->4017|6790->4023|6831->4043|7231->4416|7244->4420|7288->4455|7334->4463|7363->4464|7421->4494|7434->4497|7460->4501|7494->4503|7889->4870|7903->4874|7939->4900|7987->4909|8017->4911|8048->4917|8275->5116|8289->5120|8356->5164|8467->5247|8481->5251|8517->5276|8565->5284|8596->5286|8640->5304|8671->5305|8868->5474|8882->5478|8922->5508|8969->5516|8999->5518|9029->5523|9416->5882|9432->5888|9497->5931|9666->6072|9682->6078|9736->6122|9776->6132|9793->6138|9823->6143|9930->6222|9946->6228|9989->6260|10027->6268|10057->6273|10168->6373|10218->6394|10290->6437|10320->6438|10370->6459|10520->6580|10550->6581|10580->6582|11034->7007|11064->7008|11094->7009|11157->7065|11208->7087|11835->7685|11865->7686|11996->7787|12027->7788|12553->8286|12567->8290|12644->8345|12690->8362|12830->8474|12858->8492|12899->8494|12941->8507|13009->8547|13024->8552|13038->8556|13074->8563|13087->8566|13135->8603|13173->8611|13188->8615|13255->8655|13620->8992|13635->8997|13649->9001|13685->9008|13698->9011|13741->9044|13777->9051|13809->9056|13879->9098|13894->9103|13908->9107|13944->9114|13957->9117|14042->9191|14079->9198|14093->9201|14127->9208|14308->9357|14346->9367|14501->9505|14551->9526|14964->9910|14994->9911|15044->9932|15390->10249|15420->10250|15727->10529|15771->10551|15809->10561|15969->10693|15985->10699|16047->10739|16132->10796|16148->10802|16216->10848|16301->10905|16317->10911|16375->10947|16460->11004|16476->11010|16537->11049|16622->11106|16638->11112|16704->11156|16776->11200|16817->11219|16864->11263|16901->11272|17225->11567|17255->11568|17292->11577|17599->11856|17629->11857
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|53->32|53->32|54->33|54->33|54->33|54->33|54->33|54->33|54->33|55->34|55->34|59->38|59->38|59->38|59->38|59->38|64->43|64->43|65->44|66->45|66->45|66->45|66->45|66->45|66->45|66->45|66->45|67->46|67->46|90->69|90->69|90->69|90->69|91->70|91->70|91->70|91->70|91->70|91->70|91->70|91->70|91->70|91->70|91->70|92->71|93->72|105->84|105->84|105->84|115->94|115->94|115->94|115->94|115->94|115->94|115->94|115->94|115->94|121->100|121->100|121->100|121->100|121->100|121->100|124->103|124->103|124->103|125->104|125->104|125->104|125->104|125->104|125->104|125->104|128->107|128->107|128->107|128->107|128->107|128->107|141->120|141->120|141->120|143->122|143->122|143->122|143->122|143->122|143->122|144->123|144->123|144->123|144->123|144->123|148->127|149->128|149->128|149->128|150->129|151->130|151->130|151->130|157->136|157->136|157->136|158->137|160->139|168->147|168->147|168->147|168->147|179->158|179->158|179->158|180->159|188->167|188->167|188->167|189->168|189->168|189->168|189->168|189->168|189->168|189->168|189->168|189->168|189->168|195->174|195->174|195->174|195->174|195->174|195->174|195->174|195->174|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|202->181|204->183|207->186|208->187|214->193|214->193|215->194|218->197|218->197|226->205|226->205|228->207|231->210|231->210|231->210|232->211|232->211|232->211|233->212|233->212|233->212|234->213|234->213|234->213|235->214|235->214|235->214|236->215|236->215|238->217|239->218|244->223|244->223|245->224|249->228|249->228
                  -- GENERATED --
              */
          