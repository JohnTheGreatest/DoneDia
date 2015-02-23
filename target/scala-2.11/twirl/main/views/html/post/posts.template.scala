
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
object posts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Option[String],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: Seq[io.prismic.Document], blogCategories: collection.immutable.ListMap[String, String], selectedCategory: Option[String])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.162*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>"""),_display_(/*11.17*/selectedCategory),format.raw/*11.33*/(""" """),format.raw/*11.34*/("""- Диапост.ру</title>
        <meta name="description" content="Диапост - это неожиданный ракурс, когда мы говорим на современном языке о вечных ценностях: вере, любви, семье, Родине, правде, справедливости, братстве.">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <!-- ADD all SEO meta and OpenGraph -->
            <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.at("stylesheets/main.css")),format.raw/*16.79*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.at("stylesheets/animate.css")),format.raw/*17.82*/("""">
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js")),format.raw/*18.84*/(""""></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*19.82*/("""" type="text/javascript"></script>


        """),format.raw/*22.21*/("""
            """),format.raw/*23.13*/("""<!-- Put this script tag to the <head> of your page -->
        <script type="text/javascript" src="http://vk.com/js/api/share.js?90" charset="windows-1251"></script>
        
    </head>
    <body>
        """),format.raw/*28.27*/("""
    """),format.raw/*29.5*/("""<div id="fb-root"></div>
    <script>(function(d, s, id) """),format.raw/*30.33*/("""{"""),format.raw/*30.34*/("""
    """),format.raw/*31.5*/("""var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
    fjs.parentNode.insertBefore(js, fjs);
    """),format.raw/*36.5*/("""}"""),format.raw/*36.6*/("""(document, 'script', 'facebook-jssdk'));</script>
        
            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div class="overlay overlay-contentscale">
            <button type="button" class="overlay-close">Close</button>
            <nav>
                <ul>
                """),_display_(/*48.18*/blogCategories/*48.32*/.map/*48.36*/{cat=>_display_(Seq[Any](format.raw/*48.42*/("""
                    """),format.raw/*49.21*/("""<li><a href=""""),_display_(/*49.35*/routes/*49.41*/.Application.blogCategory(cat._1)),format.raw/*49.74*/("""" """),_display_(/*49.77*/if(cat._1.contains("kon"))/*49.103*/{_display_(Seq[Any](format.raw/*49.104*/("""class="kon"""")))}),format.raw/*49.116*/(""">"""),_display_(/*49.118*/cat/*49.121*/._2),format.raw/*49.124*/("""</a></li>
                """)))}),format.raw/*50.18*/("""
                """),format.raw/*51.17*/("""</ul>
            </nav>
        </div>

        <div class="main-transform">

            <header class="dg-header dg-blog-header">
                <div class="container">
                    <div class="dg-header__menubtn">
                        <button class="ir icon-navigation" id="trigger-overlay" type="button"></button>
                    </div>
                    <div class="logo-wrapper">
                        <a href=""""),_display_(/*63.35*/routes/*63.41*/.Application.index()),format.raw/*63.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Информационно-аналитический<br/>молодежный портал</h1>
                        </a>
                    </div>
                </div>
            </header>
            
            <section class="dg-feed">
                <div class="container">
                    <div class="dg-feed__filter">
                        <p class="dg-feed__filter__choose">Выберите раздел</p>
                        <dl class="dg-feed_filter__section dropdown">
                            <dt><a><span class="dg-feed_filter__section__content">"""),_display_(/*76.84*/selectedCategory/*76.100*/.getOrElse("ВСЕ РАЗДЕЛЫ")),format.raw/*76.125*/("""</span><span class="icon-arrow-down"></span></a></dt>
                            <dd>
                                <ul>
                                    <li><a class="default"""),_display_(/*79.59*/if(selectedCategory.isEmpty)/*79.87*/{_display_(Seq[Any](format.raw/*79.88*/(""" """),format.raw/*79.89*/("""selected""")))}),format.raw/*79.98*/("""">Все разделы</a></li>
                                    """),_display_(/*80.38*/for(cat <- blogCategories) yield /*80.64*/{_display_(Seq[Any](format.raw/*80.65*/("""
                                        """),format.raw/*81.41*/("""<li><a """),_display_(/*81.49*/if(selectedCategory.isDefined && cat._2 == selectedCategory.get)/*81.113*/{_display_(Seq[Any](format.raw/*81.114*/("""class="selected"""")))}),format.raw/*81.131*/(""" """),_display_(/*81.133*/if(cat._1.contains("kon"))/*81.159*/{_display_(Seq[Any](format.raw/*81.160*/("""class="kon"""")))}),format.raw/*81.172*/(""">"""),_display_(/*81.174*/cat/*81.177*/._2),format.raw/*81.180*/("""</a></li>
                                    """)))}),format.raw/*82.38*/("""
                                """),format.raw/*83.33*/("""</ul>
                            </dd>
                        </dl>
                    </div>


                    <div class="dg-feed__social">

                        <ul class="clear">
                            <li>
                                <a href="https://twitter.com/share" class="twitter-share-button" data-via="diapost" data-hashtags="diapost">Tweet</a>
                                <script>!function(d,s,id)"""),format.raw/*94.58*/("""{"""),format.raw/*94.59*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*94.167*/("""{"""),format.raw/*94.168*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*94.281*/("""}"""),format.raw/*94.282*/("""}"""),format.raw/*94.283*/("""(document, 'script', 'twitter-wjs');</script>

                                """),format.raw/*102.35*/("""
                            """),format.raw/*103.29*/("""</li>

                            <li>
                                <div class="fb-like" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
                                """),format.raw/*112.35*/("""
                            """),format.raw/*113.29*/("""</li>

                            <li>
                                <a href="#" class="dg-feed__social__vkontakte">
                                        <!-- Put this script tag to the place, where the Share button will be -->
                                    <script type="text/javascript"><!--
                                    document.write(VK.Share.button(false,"""),format.raw/*119.74*/("""{"""),format.raw/*119.75*/("""type: "round", text: "Сохранить""""),format.raw/*119.107*/("""}"""),format.raw/*119.108*/("""));
                                    --></script>
                                    """),format.raw/*124.39*/("""
                                """),format.raw/*125.33*/("""</a>
                            </li>
                        </ul>

                    </div>
                </div>

                """),format.raw/*132.35*/("""
                """),format.raw/*133.17*/("""<script type="text/javascript">(function() """),format.raw/*133.60*/("""{"""),format.raw/*133.61*/("""
                """),format.raw/*134.17*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
                if (window.ifpluso==undefined) """),format.raw/*135.48*/("""{"""),format.raw/*135.49*/(""" """),format.raw/*135.50*/("""window.ifpluso = 1;
                var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
                s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
                s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
                var h=d[g]('body')[0];
                h.appendChild(s);
                """),format.raw/*141.17*/("""}"""),format.raw/*141.18*/("""}"""),format.raw/*141.19*/(""")();</script>
                """),format.raw/*142.39*/("""

                """),format.raw/*144.17*/("""<div class="container-metro dg-feed__content">
                """),_display_(/*145.18*/for((post, count) <- (posts.map(p => Some(p)) ++ List(None, None, None, None)).take(4).zipWithIndex) yield /*145.118*/{_display_(Seq[Any](format.raw/*145.119*/("""
                    """),_display_(/*146.22*/if(count == 0)/*146.36*/ {_display_(Seq[Any](format.raw/*146.38*/("""
                    """),format.raw/*147.21*/("""<div class="box-6col" """),_display_(/*147.44*/if(post.isEmpty)/*147.60*/{_display_(Seq[Any](format.raw/*147.61*/("""style="display: none;"""")))}),format.raw/*147.84*/(""">
                    """)))}),format.raw/*148.22*/("""
                    """),_display_(/*149.22*/if(count == 1 || count == 2)/*149.50*/ {_display_(Seq[Any](format.raw/*149.52*/("""
                    """),format.raw/*150.21*/("""<div class="box-6col-horizont" """),_display_(/*150.53*/if(post.isEmpty)/*150.69*/{_display_(Seq[Any](format.raw/*150.70*/("""style="display: none;"""")))}),format.raw/*150.93*/(""">
                    """)))}),format.raw/*151.22*/("""
                    """),_display_(/*152.22*/if(count == 3)/*152.36*/{_display_(Seq[Any](format.raw/*152.37*/("""
                        """),format.raw/*153.25*/("""<div class="box-12col-horizont" """),_display_(/*153.58*/if(post.isEmpty)/*153.74*/{_display_(Seq[Any](format.raw/*153.75*/("""style="display: none;"""")))}),format.raw/*153.98*/(""">
                    """)))}),format.raw/*154.22*/("""
                        """),_display_(/*155.26*/if(post.isDefined)/*155.44*/{_display_(Seq[Any](format.raw/*155.45*/("""
                            """),format.raw/*156.29*/("""<a href=""""),_display_(/*156.39*/routes/*156.45*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*156.94*/("""" class="dg-feed__image """),_display_(/*156.119*/{if(count != 3) " box-6col-imgwrapper" else ""}),format.raw/*156.166*/(""" """),_display_(/*156.168*/{if(count != 0) " feed--arrow" else ""}),format.raw/*156.207*/(""" """),_display_(/*156.209*/{if(count == 2) " box--left" else ""}),format.raw/*156.246*/(""" """),_display_(/*156.248*/{if(count == 3) " box-3col-horizont-imgwrapper box-6col-horizont-imgwrapper" else ""}),format.raw/*156.333*/("""" """),_display_(/*156.336*/post/*156.340*/.get.getImage("blog.image", "postthumb").map/*156.384*/{img =>_display_(Seq[Any](format.raw/*156.391*/(""" """),format.raw/*156.392*/("""style="background-image: url("""),_display_(/*156.422*/img/*156.425*/.url),format.raw/*156.429*/(""")"""")))}),format.raw/*156.432*/(""" """),format.raw/*156.433*/(""">
                        """)))}),format.raw/*157.26*/("""
                        """),_display_(/*158.26*/if(post.isEmpty)/*158.42*/{_display_(Seq[Any](format.raw/*158.43*/("""
                            """),format.raw/*159.29*/("""<a href="#" class="dg-feed__image """),_display_(/*159.64*/{if(count != 3) " box-6col-imgwrapper" else ""}),format.raw/*159.111*/(""" """),_display_(/*159.113*/{if(count != 0) " feed--arrow" else ""}),format.raw/*159.152*/(""" """),_display_(/*159.154*/{if(count == 2) " box--left" else ""}),format.raw/*159.191*/(""" """),_display_(/*159.193*/{if(count == 3) " box-3col-horizont-imgwrapper box-6col-horizont-imgwrapper" else ""}),format.raw/*159.278*/("""">
                        """)))}),format.raw/*160.26*/("""
                            """),format.raw/*161.29*/("""<span class="read-more button">ЧИТАТЬ</span>
                        </a>
                        """),_display_(/*163.26*/if(count == 0)/*163.40*/ {_display_(Seq[Any](format.raw/*163.42*/("""
                            """),format.raw/*164.29*/("""<div class="clear"></div>
                            <div class="dg-feed__info">
                        """)))}),format.raw/*166.26*/("""
                        """),_display_(/*167.26*/if(count == 1)/*167.40*/ {_display_(Seq[Any](format.raw/*167.42*/("""
                            """),format.raw/*168.29*/("""<div class="dg-feed__info--horizont">
                        """)))}),format.raw/*169.26*/("""
                        """),_display_(/*170.26*/if(count == 2)/*170.40*/ {_display_(Seq[Any](format.raw/*170.42*/("""
                            """),format.raw/*171.29*/("""<div class="dg-feed__info--horizont box--right">
                        """)))}),format.raw/*172.26*/("""
                        """),_display_(/*173.26*/if(count == 3)/*173.40*/ {_display_(Seq[Any](format.raw/*173.42*/("""
                            """),format.raw/*174.29*/("""<div class="dg-feed__info--horizont box-9col-horizont">
                        """)))}),format.raw/*175.26*/("""
                            """),format.raw/*176.29*/("""<div class="dg-feed__info__util">
                                <p class="dg-feed__info__util__sector">"""),_display_(/*177.73*/post/*177.77*/.map(_.getText("blog.category").getOrElse("Общая")).getOrElse("")),format.raw/*177.142*/("""</p>
                                <p class="dg-feed__info__util__time">"""),_display_(/*178.71*/post/*178.75*/.map(_.getText("blog.body").map{text => text.length/900 + "мин"}).getOrElse("")),format.raw/*178.154*/("""</p>
                            </div>
                            """),_display_(/*180.30*/if(count == 0)/*180.44*/ {_display_(Seq[Any](format.raw/*180.46*/("""
                                """),format.raw/*181.33*/("""<div class="dg-feed__info__header">
                                    <h2>"""),_display_(/*182.42*/post/*182.46*/.map(_.getText("blog.title").getOrElse("")).getOrElse("")),format.raw/*182.103*/("""</h2>
                                </div>
                            """)))}),format.raw/*184.30*/("""
                            """),_display_(/*185.30*/if(count != 0)/*185.44*/ {_display_(Seq[Any](format.raw/*185.46*/("""
                                """),_display_(/*186.34*/if(post.isDefined)/*186.52*/{_display_(Seq[Any](format.raw/*186.53*/("""
                                    """),format.raw/*187.37*/("""<a href=""""),_display_(/*187.47*/routes/*187.53*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*187.102*/("""" class="dg-feed__info__header">
                                """)))}),format.raw/*188.34*/("""
                                """),_display_(/*189.34*/if(post.isEmpty)/*189.50*/{_display_(Seq[Any](format.raw/*189.51*/("""
                                    """),format.raw/*190.37*/("""<a href="#" class="dg-feed__info__header">
                                """)))}),format.raw/*191.34*/("""
                                    """),format.raw/*192.37*/("""<h2>"""),_display_(/*192.42*/post/*192.46*/.map(_.getText("blog.title").getOrElse("")).getOrElse("")),format.raw/*192.103*/("""</h2>
                                </a>
                            """)))}),format.raw/*194.30*/("""
                            """),format.raw/*195.29*/("""<div class="dg-feed__info__tags">
                                <ul>
                                """),_display_(/*197.34*/post/*197.38*/.map(_.tags.map { tag =>
                                    Html("<li>#" + tag + "</li>")
                                }).getOrElse("")),format.raw/*199.49*/("""
                                """),format.raw/*200.33*/("""</ul>
                            </div>
                            """),_display_(/*202.30*/if(count == 0)/*202.44*/{_display_(Seq[Any](format.raw/*202.45*/("""
                                """),format.raw/*203.33*/("""<hr class="delimeter-white">
                            """)))}),format.raw/*204.30*/("""
                            """),_display_(/*205.30*/if(count != 0)/*205.44*/{_display_(Seq[Any](format.raw/*205.45*/("""
                                """),format.raw/*206.33*/("""<hr class="delimeter-gray">
                            """)))}),format.raw/*207.30*/("""
                            """),format.raw/*208.29*/("""<ul class="dg-feed__info__actions">
                                <li>
                                    """),format.raw/*210.304*/("""
                                """),format.raw/*211.33*/("""</li>
                                <li>
                                    <a href="#" class="dg-feed__info__actions--like"></a>
                                </li>
                                <li>
                                    """),_display_(/*216.38*/if(post.isDefined)/*216.56*/ {_display_(Seq[Any](format.raw/*216.58*/("""
                                        """),format.raw/*217.41*/("""<a href=""""),_display_(/*217.51*/routes/*217.57*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*217.106*/("""#disqus_thread" class="dg-feed__info__actions--comment">
                                            0</a>
                                    """)))}),format.raw/*219.38*/("""
                                """),format.raw/*220.33*/("""</li>
                            </ul>
                        </div>
                    </div>
                """)))}),format.raw/*224.18*/("""
                """),format.raw/*225.17*/("""</div>

                <div class="clear"></div>

                <div class="empty-posts">
                    <div class="container">
                        <h2 class="empty-posts-text">В данной категории еще нет статей</h2>
                    </div>
                </div>
                <div class="dg-feed__btn-wrapper">
                    <a class="dg-feed__btn" href="#" data-next-page="2" """),_display_(/*235.74*/if(posts.length < 5)/*235.94*/{_display_(Seq[Any](format.raw/*235.95*/("""style="display: none;"""")))}),format.raw/*235.118*/(""">
                        <span class="load-icon"></span>
                        <span>ЕЩЕ СТАТЬИ</span>
                    </a>
                </div>

                <div class="clear"></div>
            </section>

            """),format.raw/*244.39*/("""
            """),format.raw/*245.13*/("""<script type="text/javascript">
            /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
            var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

            /* * * DON'T EDIT BELOW THIS LINE * * */
            (function () """),format.raw/*250.26*/("""{"""),format.raw/*250.27*/("""
            """),format.raw/*251.13*/("""var s = document.createElement('script'); s.async = true;
            s.type = 'text/javascript';
            s.src = '//' + disqus_shortname + '.disqus.com/count.js';
            (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
            """),format.raw/*255.13*/("""}"""),format.raw/*255.14*/("""());
            </script>
            
            <section class="dg-blog-feed">

                


            </section>

        <div class="clear"></div>

        """),_display_(/*267.10*/footer(blogCategories)),format.raw/*267.32*/("""

        """),format.raw/*269.9*/("""</div>

        
        <script src=""""),_display_(/*272.23*/routes/*272.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*272.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*273.23*/routes/*273.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*273.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*274.23*/routes/*274.29*/.Assets.at("javascripts/classie.js")),format.raw/*274.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*275.23*/routes/*275.29*/.Assets.at("javascripts/navigation.js")),format.raw/*275.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*276.23*/routes/*276.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*276.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*277.23*/routes/*277.29*/.Assets.at("javascripts/main.js")),format.raw/*277.62*/(""""></script>
        """),_display_(/*278.10*/postDetailScripts()),format.raw/*278.29*/("""

    """),format.raw/*280.5*/("""</body>
</html>

"""))}
  }

  def render(posts:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],selectedCategory:Option[String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,blogCategories,selectedCategory)(ctx)

  def f:((Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Option[String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,blogCategories,selectedCategory) => (ctx) => apply(posts,blogCategories,selectedCategory)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:32:58 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/post/posts.scala.html
                  HASH: be06f1045c0927693173148fcfb2a57504cb940e
                  MATRIX: 604->1|853->161|883->165|1328->583|1365->599|1394->600|1900->1079|1915->1085|1970->1119|2039->1161|2054->1167|2112->1204|2165->1230|2180->1236|2256->1291|2318->1326|2333->1332|2407->1385|2483->1445|2525->1459|2765->1689|2798->1695|2884->1753|2913->1754|2946->1760|3242->2029|3270->2030|3826->2559|3849->2573|3862->2577|3906->2583|3956->2605|3997->2619|4012->2625|4066->2658|4096->2661|4132->2687|4172->2688|4216->2700|4246->2702|4259->2705|4284->2708|4343->2736|4389->2754|4866->3204|4881->3210|4922->3230|5621->3902|5647->3918|5694->3943|5906->4128|5943->4156|5982->4157|6011->4158|6051->4167|6139->4228|6181->4254|6220->4255|6290->4297|6325->4305|6399->4369|6439->4370|6488->4387|6518->4389|6554->4415|6594->4416|6638->4428|6668->4430|6681->4433|6706->4436|6785->4484|6847->4518|7319->4962|7348->4963|7485->5071|7515->5072|7657->5185|7687->5186|7717->5187|7827->5581|7886->5611|8198->6208|8257->6238|8671->6623|8701->6624|8763->6656|8794->6657|8914->6959|8977->6993|9150->7155|9197->7173|9269->7216|9299->7217|9346->7235|9493->7353|9523->7354|9553->7355|9989->7762|10019->7763|10049->7764|10109->7817|10158->7837|10251->7902|10369->8002|10410->8003|10461->8026|10485->8040|10526->8042|10577->8064|10628->8087|10654->8103|10694->8104|10749->8127|10805->8151|10856->8174|10894->8202|10935->8204|10986->8226|11046->8258|11072->8274|11112->8275|11167->8298|11223->8322|11274->8345|11298->8359|11338->8360|11393->8386|11454->8419|11480->8435|11520->8436|11575->8459|11631->8483|11686->8510|11714->8528|11754->8529|11813->8559|11851->8569|11867->8575|11938->8624|11992->8649|12062->8696|12093->8698|12155->8737|12186->8739|12246->8776|12277->8778|12385->8863|12417->8866|12432->8870|12487->8914|12534->8921|12565->8922|12624->8952|12638->8955|12665->8959|12701->8962|12732->8963|12792->8991|12847->9018|12873->9034|12913->9035|12972->9065|13035->9100|13105->9147|13136->9149|13198->9188|13229->9190|13289->9227|13320->9229|13428->9314|13489->9343|13548->9373|13677->9474|13701->9488|13742->9490|13801->9520|13942->9629|13997->9656|14021->9670|14062->9672|14121->9702|14217->9766|14272->9793|14296->9807|14337->9809|14396->9839|14503->9914|14558->9941|14582->9955|14623->9957|14682->9987|14796->10069|14855->10099|14990->10206|15004->10210|15092->10275|15196->10351|15210->10355|15312->10434|15411->10505|15435->10519|15476->10521|15539->10555|15645->10633|15659->10637|15739->10694|15847->10770|15906->10801|15930->10815|15971->10817|16034->10852|16062->10870|16102->10871|16169->10909|16207->10919|16223->10925|16295->10974|16394->11041|16457->11076|16483->11092|16523->11093|16590->11131|16699->11208|16766->11246|16799->11251|16813->11255|16893->11312|16999->11386|17058->11416|17192->11522|17206->11526|17369->11667|17432->11701|17532->11773|17556->11787|17596->11788|17659->11822|17750->11881|17809->11912|17833->11926|17873->11927|17936->11961|18026->12019|18085->12049|18226->12427|18289->12461|18567->12711|18595->12729|18636->12731|18707->12773|18745->12783|18761->12789|18833->12838|19011->12984|19074->13018|19225->13137|19272->13155|19713->13568|19743->13588|19783->13589|19839->13612|20110->13880|20153->13894|20498->14210|20528->14211|20571->14225|20899->14524|20929->14525|21140->14708|21184->14730|21224->14742|21294->14784|21310->14790|21372->14830|21458->14888|21474->14894|21542->14940|21628->14998|21644->15004|21702->15040|21788->15098|21804->15104|21865->15143|21951->15201|21967->15207|22050->15268|22136->15326|22152->15332|22207->15365|22257->15387|22298->15406|22334->15414
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|43->22|44->23|49->28|50->29|51->30|51->30|52->31|57->36|57->36|69->48|69->48|69->48|69->48|70->49|70->49|70->49|70->49|70->49|70->49|70->49|70->49|70->49|70->49|70->49|71->50|72->51|84->63|84->63|84->63|97->76|97->76|97->76|100->79|100->79|100->79|100->79|100->79|101->80|101->80|101->80|102->81|102->81|102->81|102->81|102->81|102->81|102->81|102->81|102->81|102->81|102->81|102->81|103->82|104->83|115->94|115->94|115->94|115->94|115->94|115->94|115->94|117->102|118->103|122->112|123->113|129->119|129->119|129->119|129->119|131->124|132->125|139->132|140->133|140->133|140->133|141->134|142->135|142->135|142->135|148->141|148->141|148->141|149->142|151->144|152->145|152->145|152->145|153->146|153->146|153->146|154->147|154->147|154->147|154->147|154->147|155->148|156->149|156->149|156->149|157->150|157->150|157->150|157->150|157->150|158->151|159->152|159->152|159->152|160->153|160->153|160->153|160->153|160->153|161->154|162->155|162->155|162->155|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|164->157|165->158|165->158|165->158|166->159|166->159|166->159|166->159|166->159|166->159|166->159|166->159|166->159|167->160|168->161|170->163|170->163|170->163|171->164|173->166|174->167|174->167|174->167|175->168|176->169|177->170|177->170|177->170|178->171|179->172|180->173|180->173|180->173|181->174|182->175|183->176|184->177|184->177|184->177|185->178|185->178|185->178|187->180|187->180|187->180|188->181|189->182|189->182|189->182|191->184|192->185|192->185|192->185|193->186|193->186|193->186|194->187|194->187|194->187|194->187|195->188|196->189|196->189|196->189|197->190|198->191|199->192|199->192|199->192|199->192|201->194|202->195|204->197|204->197|206->199|207->200|209->202|209->202|209->202|210->203|211->204|212->205|212->205|212->205|213->206|214->207|215->208|217->210|218->211|223->216|223->216|223->216|224->217|224->217|224->217|224->217|226->219|227->220|231->224|232->225|242->235|242->235|242->235|242->235|251->244|252->245|257->250|257->250|258->251|262->255|262->255|274->267|274->267|276->269|279->272|279->272|279->272|280->273|280->273|280->273|281->274|281->274|281->274|282->275|282->275|282->275|283->276|283->276|283->276|284->277|284->277|284->277|285->278|285->278|287->280
                  -- GENERATED --
              */
          