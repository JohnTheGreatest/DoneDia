
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
        <title> - Диапост.ру</title>
        <meta name="description" content="">
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
                    """),format.raw/*49.21*/("""<li><a href=""""),_display_(/*49.35*/routes/*49.41*/.Application.blogCategory(cat._1)),format.raw/*49.74*/("""">"""),_display_(/*49.77*/cat/*49.80*/._2),format.raw/*49.83*/("""</a></li>
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
                                        """),format.raw/*81.41*/("""<li><a """),_display_(/*81.49*/if(selectedCategory.isDefined && cat._2 == selectedCategory.get)/*81.113*/{_display_(Seq[Any](format.raw/*81.114*/("""class="selected"""")))}),format.raw/*81.131*/(""">"""),_display_(/*81.133*/cat/*81.136*/._2),format.raw/*81.139*/("""</a></li>
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
                  DATE: Fri Feb 20 03:57:11 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/post/posts.scala.html
                  HASH: d9f471d6ce56764d5ab23ce2f5c221d89e5a6e9b
                  MATRIX: 604->1|853->161|881->163|1639->894|1654->900|1709->934|1777->975|1792->981|1850->1018|1902->1043|1917->1049|1993->1104|2054->1138|2069->1144|2143->1197|2216->1254|2257->1267|2492->1492|2524->1497|2609->1554|2638->1555|2670->1560|2961->1824|2989->1825|3533->2342|3556->2356|3569->2360|3613->2366|3662->2387|3703->2401|3718->2407|3772->2440|3802->2443|3814->2446|3838->2449|3896->2476|3941->2493|4406->2931|4421->2937|4462->2957|5148->3616|5174->3632|5221->3657|5430->3839|5467->3867|5506->3868|5535->3869|5575->3878|5662->3938|5704->3964|5743->3965|5812->4006|5847->4014|5921->4078|5961->4079|6010->4096|6040->4098|6053->4101|6078->4104|6156->4151|6217->4184|6678->4617|6707->4618|6844->4726|6874->4727|7016->4840|7046->4841|7076->4842|7184->5228|7242->5257|7550->5845|7608->5874|8016->6253|8046->6254|8108->6286|8139->6287|8257->6584|8319->6617|8485->6772|8531->6789|8603->6832|8633->6833|8679->6850|8825->6967|8855->6968|8885->6969|9315->7370|9345->7371|9375->7372|9434->7424|9481->7442|9573->7506|9691->7606|9732->7607|9782->7629|9806->7643|9847->7645|9897->7666|9948->7689|9974->7705|10014->7706|10069->7729|10124->7752|10174->7774|10212->7802|10253->7804|10303->7825|10363->7857|10389->7873|10429->7874|10484->7897|10539->7920|10589->7942|10613->7956|10653->7957|10707->7982|10768->8015|10794->8031|10834->8032|10889->8055|10944->8078|10998->8104|11026->8122|11066->8123|11124->8152|11162->8162|11178->8168|11249->8217|11303->8242|11373->8289|11404->8291|11466->8330|11497->8332|11557->8369|11588->8371|11696->8456|11728->8459|11743->8463|11798->8507|11845->8514|11876->8515|11935->8545|11949->8548|11976->8552|12012->8555|12043->8556|12102->8583|12156->8609|12182->8625|12222->8626|12280->8655|12343->8690|12413->8737|12444->8739|12506->8778|12537->8780|12597->8817|12628->8819|12736->8904|12796->8932|12854->8961|12981->9060|13005->9074|13046->9076|13104->9105|13243->9212|13297->9238|13321->9252|13362->9254|13420->9283|13515->9346|13569->9372|13593->9386|13634->9388|13692->9417|13798->9491|13852->9517|13876->9531|13917->9533|13975->9562|14088->9643|14146->9672|14280->9778|14294->9782|14382->9847|14485->9922|14499->9926|14601->10005|14698->10074|14722->10088|14763->10090|14825->10123|14930->10200|14944->10204|15024->10261|15130->10335|15188->10365|15212->10379|15253->10381|15315->10415|15343->10433|15383->10434|15449->10471|15487->10481|15503->10487|15575->10536|15673->10602|15735->10636|15761->10652|15801->10653|15867->10690|15975->10766|16041->10803|16074->10808|16088->10812|16168->10869|16272->10941|16330->10970|16462->11074|16476->11078|16637->11217|16699->11250|16797->11320|16821->11334|16861->11335|16923->11368|17013->11426|17071->11456|17095->11470|17135->11471|17197->11504|17286->11561|17344->11590|17483->11966|17545->11999|17818->12244|17846->12262|17887->12264|17957->12305|17995->12315|18011->12321|18083->12370|18259->12514|18321->12547|18468->12662|18514->12679|18945->13082|18975->13102|19015->13103|19071->13126|19333->13385|19375->13398|19715->13709|19745->13710|19787->13723|20111->14018|20141->14019|20340->14190|20384->14212|20422->14222|20489->14261|20505->14267|20567->14307|20652->14364|20668->14370|20736->14416|20821->14473|20837->14479|20895->14515|20980->14572|20996->14578|21057->14617|21142->14674|21158->14680|21241->14741|21326->14798|21342->14804|21397->14837|21446->14858|21487->14877|21521->14883
                  LINES: 19->1|22->1|24->3|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|43->22|44->23|49->28|50->29|51->30|51->30|52->31|57->36|57->36|69->48|69->48|69->48|69->48|70->49|70->49|70->49|70->49|70->49|70->49|70->49|71->50|72->51|84->63|84->63|84->63|97->76|97->76|97->76|100->79|100->79|100->79|100->79|100->79|101->80|101->80|101->80|102->81|102->81|102->81|102->81|102->81|102->81|102->81|102->81|103->82|104->83|115->94|115->94|115->94|115->94|115->94|115->94|115->94|117->102|118->103|122->112|123->113|129->119|129->119|129->119|129->119|131->124|132->125|139->132|140->133|140->133|140->133|141->134|142->135|142->135|142->135|148->141|148->141|148->141|149->142|151->144|152->145|152->145|152->145|153->146|153->146|153->146|154->147|154->147|154->147|154->147|154->147|155->148|156->149|156->149|156->149|157->150|157->150|157->150|157->150|157->150|158->151|159->152|159->152|159->152|160->153|160->153|160->153|160->153|160->153|161->154|162->155|162->155|162->155|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|163->156|164->157|165->158|165->158|165->158|166->159|166->159|166->159|166->159|166->159|166->159|166->159|166->159|166->159|167->160|168->161|170->163|170->163|170->163|171->164|173->166|174->167|174->167|174->167|175->168|176->169|177->170|177->170|177->170|178->171|179->172|180->173|180->173|180->173|181->174|182->175|183->176|184->177|184->177|184->177|185->178|185->178|185->178|187->180|187->180|187->180|188->181|189->182|189->182|189->182|191->184|192->185|192->185|192->185|193->186|193->186|193->186|194->187|194->187|194->187|194->187|195->188|196->189|196->189|196->189|197->190|198->191|199->192|199->192|199->192|199->192|201->194|202->195|204->197|204->197|206->199|207->200|209->202|209->202|209->202|210->203|211->204|212->205|212->205|212->205|213->206|214->207|215->208|217->210|218->211|223->216|223->216|223->216|224->217|224->217|224->217|224->217|226->219|227->220|231->224|232->225|242->235|242->235|242->235|242->235|251->244|252->245|257->250|257->250|258->251|262->255|262->255|274->267|274->267|276->269|279->272|279->272|279->272|280->273|280->273|280->273|281->274|281->274|281->274|282->275|282->275|282->275|283->276|283->276|283->276|284->277|284->277|284->277|285->278|285->278|287->280
                  -- GENERATED --
              */
          