
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
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.at("images/favicon.ico")),format.raw/*16.97*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.at("stylesheets/main.css")),format.raw/*17.79*/("""">
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.at("stylesheets/animate.css")),format.raw/*18.82*/("""">
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js")),format.raw/*19.84*/(""""></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*20.82*/("""" type="text/javascript"></script>


        """),format.raw/*23.21*/("""
            """),format.raw/*24.13*/("""<!-- Put this script tag to the <head> of your page -->
        <script type="text/javascript" src="http://vk.com/js/api/share.js?90" charset="windows-1251"></script>
        
    </head>
    <body>

        <!-- Yandex.Metrika counter -->
        <script type="text/javascript">
        (function (d, w, c) """),format.raw/*32.29*/("""{"""),format.raw/*32.30*/("""
        """),format.raw/*33.9*/("""(w[c] = w[c] || []).push(function() """),format.raw/*33.45*/("""{"""),format.raw/*33.46*/("""
        """),format.raw/*34.9*/("""try """),format.raw/*34.13*/("""{"""),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""w.yaCounter28644136 = new Ya.Metrika("""),format.raw/*35.46*/("""{"""),format.raw/*35.47*/("""id:28644136,
        webvisor:true,
        clickmap:true,
        trackLinks:true,
        accurateTrackBounce:true"""),format.raw/*39.33*/("""}"""),format.raw/*39.34*/(""");
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/(""" """),format.raw/*40.11*/("""catch(e) """),format.raw/*40.20*/("""{"""),format.raw/*40.21*/(""" """),format.raw/*40.22*/("""}"""),format.raw/*40.23*/("""
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""");

        var n = d.getElementsByTagName("script")[0],
        s = d.createElement("script"),
        f = function () """),format.raw/*45.25*/("""{"""),format.raw/*45.26*/(""" """),format.raw/*45.27*/("""n.parentNode.insertBefore(s, n); """),format.raw/*45.60*/("""}"""),format.raw/*45.61*/(""";
        s.type = "text/javascript";
        s.async = true;
        s.src = (d.location.protocol == "https:" ? "https:" : "http:") + "//mc.yandex.ru/metrika/watch.js";

        if (w.opera == "[object Opera]") """),format.raw/*50.42*/("""{"""),format.raw/*50.43*/("""
        """),format.raw/*51.9*/("""d.addEventListener("DOMContentLoaded", f, false);
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/(""" """),format.raw/*52.11*/("""else """),format.raw/*52.16*/("""{"""),format.raw/*52.17*/(""" """),format.raw/*52.18*/("""f(); """),format.raw/*52.23*/("""}"""),format.raw/*52.24*/("""
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/(""")(document, window, "yandex_metrika_callbacks");
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

        """),format.raw/*66.27*/("""
        """),format.raw/*67.9*/("""<div id="fb-root"></div>
        <script>(function(d, s, id) """),format.raw/*68.37*/("""{"""),format.raw/*68.38*/("""
        """),format.raw/*69.9*/("""var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
        fjs.parentNode.insertBefore(js, fjs);
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""(document, 'script', 'facebook-jssdk'));</script>
        
            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div class="overlay overlay-contentscale">
            <button type="button" class="overlay-close">Close</button>
            <nav>
                <ul>
                """),_display_(/*86.18*/blogCategories/*86.32*/.map/*86.36*/{cat=>_display_(Seq[Any](format.raw/*86.42*/("""
                    """),format.raw/*87.21*/("""<li><a href=""""),_display_(/*87.35*/routes/*87.41*/.Application.blogCategory(cat._1)),format.raw/*87.74*/("""" """),_display_(/*87.77*/if(cat._1.contains("kon"))/*87.103*/{_display_(Seq[Any](format.raw/*87.104*/("""class="kon"""")))}),format.raw/*87.116*/(""">"""),_display_(/*87.118*/cat/*87.121*/._2),format.raw/*87.124*/("""</a></li>
                """)))}),format.raw/*88.18*/("""
                """),format.raw/*89.17*/("""</ul>
            </nav>
        </div>

        <div class="main-transform">

            <header class="dg-header dg-blog-header">
                <div class="container">
                    <div class="dg-header__menubtn">
                        <button class="ir icon-navigation" id="trigger-overlay" type="button"></button>
                    </div>
                    <div class="logo-wrapper">
                        <a href=""""),_display_(/*101.35*/routes/*101.41*/.Application.index()),format.raw/*101.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Молодежный информационно-<br/>аналитический портал</h1>
                        </a>
                    </div>
                </div>
            </header>
            
            <section class="dg-feed">
                <div class="container">
                    <div class="dg-feed__filter">
                        <p class="dg-feed__filter__choose">Выберите раздел</p>
                        <dl class="dg-feed_filter__section dropdown">
                            <dt><a><span class="dg-feed_filter__section__content">"""),_display_(/*114.84*/selectedCategory/*114.100*/.getOrElse("ВСЕ РАЗДЕЛЫ")),format.raw/*114.125*/("""</span><span class="icon-arrow-down"></span></a></dt>
                            <dd>
                                <ul>
                                    <li><a class="default"""),_display_(/*117.59*/if(selectedCategory.isEmpty)/*117.87*/{_display_(Seq[Any](format.raw/*117.88*/(""" """),format.raw/*117.89*/("""selected""")))}),format.raw/*117.98*/("""">Все разделы</a></li>
                                    """),_display_(/*118.38*/for(cat <- blogCategories) yield /*118.64*/{_display_(Seq[Any](format.raw/*118.65*/("""
                                        """),format.raw/*119.41*/("""<li><a """),_display_(/*119.49*/if(selectedCategory.isDefined && cat._2 == selectedCategory.get)/*119.113*/{_display_(Seq[Any](format.raw/*119.114*/("""class="selected"""")))}),format.raw/*119.131*/(""" """),_display_(/*119.133*/if(cat._1.contains("kon"))/*119.159*/{_display_(Seq[Any](format.raw/*119.160*/("""class="kon"""")))}),format.raw/*119.172*/(""">"""),_display_(/*119.174*/cat/*119.177*/._2),format.raw/*119.180*/("""</a></li>
                                    """)))}),format.raw/*120.38*/("""
                                """),format.raw/*121.33*/("""</ul>
                            </dd>
                        </dl>
                    </div>


                    <div class="dg-feed__social">

                        <ul class="clear">
                            <li>
                                <a href="https://twitter.com/share" class="twitter-share-button" data-via="diapost" data-hashtags="diapost">Tweet</a>
                                <script>!function(d,s,id)"""),format.raw/*132.58*/("""{"""),format.raw/*132.59*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*132.167*/("""{"""),format.raw/*132.168*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*132.281*/("""}"""),format.raw/*132.282*/("""}"""),format.raw/*132.283*/("""(document, 'script', 'twitter-wjs');</script>

                                """),format.raw/*140.35*/("""
                            """),format.raw/*141.29*/("""</li>

                            <li>
                                <div class="fb-like" data-href="http://www.diapost.ru/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
                                """),format.raw/*150.35*/("""
                            """),format.raw/*151.29*/("""</li>

                            <li>
                                <a href="#" class="dg-feed__social__vkontakte">
                                        <!-- Put this script tag to the place, where the Share button will be -->
                                    <script type="text/javascript"><!--
                                    document.write(VK.Share.button(false,"""),format.raw/*157.74*/("""{"""),format.raw/*157.75*/("""type: "round", text: "Сохранить""""),format.raw/*157.107*/("""}"""),format.raw/*157.108*/("""));
                                    --></script>
                                    """),format.raw/*162.39*/("""
                                """),format.raw/*163.33*/("""</a>
                            </li>
                        </ul>

                    </div>
                </div>

                """),format.raw/*170.35*/("""
                """),format.raw/*171.17*/("""<script type="text/javascript">(function() """),format.raw/*171.60*/("""{"""),format.raw/*171.61*/("""
                """),format.raw/*172.17*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
                if (window.ifpluso==undefined) """),format.raw/*173.48*/("""{"""),format.raw/*173.49*/(""" """),format.raw/*173.50*/("""window.ifpluso = 1;
                var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
                s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
                s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
                var h=d[g]('body')[0];
                h.appendChild(s);
                """),format.raw/*179.17*/("""}"""),format.raw/*179.18*/("""}"""),format.raw/*179.19*/(""")();</script>
                """),format.raw/*180.39*/("""

                """),format.raw/*182.17*/("""<div class="container-metro dg-feed__content">
                """),_display_(/*183.18*/for((post, count) <- (posts.map(p => Some(p)) ++ List(None, None, None, None)).take(4).zipWithIndex) yield /*183.118*/{_display_(Seq[Any](format.raw/*183.119*/("""
                    """),_display_(/*184.22*/if(count == 0)/*184.36*/ {_display_(Seq[Any](format.raw/*184.38*/("""
                    """),format.raw/*185.21*/("""<div class="box-6col" """),_display_(/*185.44*/if(post.isEmpty)/*185.60*/{_display_(Seq[Any](format.raw/*185.61*/("""style="display: none;"""")))}),format.raw/*185.84*/(""">
                    """)))}),format.raw/*186.22*/("""
                    """),_display_(/*187.22*/if(count == 1 || count == 2)/*187.50*/ {_display_(Seq[Any](format.raw/*187.52*/("""
                    """),format.raw/*188.21*/("""<div class="box-6col-horizont" """),_display_(/*188.53*/if(post.isEmpty)/*188.69*/{_display_(Seq[Any](format.raw/*188.70*/("""style="display: none;"""")))}),format.raw/*188.93*/(""">
                    """)))}),format.raw/*189.22*/("""
                    """),_display_(/*190.22*/if(count == 3)/*190.36*/{_display_(Seq[Any](format.raw/*190.37*/("""
                        """),format.raw/*191.25*/("""<div class="box-12col-horizont" """),_display_(/*191.58*/if(post.isEmpty)/*191.74*/{_display_(Seq[Any](format.raw/*191.75*/("""style="display: none;"""")))}),format.raw/*191.98*/(""">
                    """)))}),format.raw/*192.22*/("""
                        """),_display_(/*193.26*/if(post.isDefined)/*193.44*/{_display_(Seq[Any](format.raw/*193.45*/("""
                            """),format.raw/*194.29*/("""<a href=""""),_display_(/*194.39*/routes/*194.45*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*194.94*/("""" class="dg-feed__image """),_display_(/*194.119*/{if(count != 3) " box-6col-imgwrapper" else ""}),format.raw/*194.166*/(""" """),_display_(/*194.168*/{if(count != 0) " feed--arrow" else ""}),format.raw/*194.207*/(""" """),_display_(/*194.209*/{if(count == 2) " box--left" else ""}),format.raw/*194.246*/(""" """),_display_(/*194.248*/{if(count == 3) " box-3col-horizont-imgwrapper box-6col-horizont-imgwrapper" else ""}),format.raw/*194.333*/("""" """),_display_(/*194.336*/post/*194.340*/.get.getImage("blog.image", "postthumb").map/*194.384*/{img =>_display_(Seq[Any](format.raw/*194.391*/(""" """),format.raw/*194.392*/("""style="background-image: url("""),_display_(/*194.422*/img/*194.425*/.url),format.raw/*194.429*/(""")"""")))}),format.raw/*194.432*/(""" """),format.raw/*194.433*/(""">
                        """)))}),format.raw/*195.26*/("""
                        """),_display_(/*196.26*/if(post.isEmpty)/*196.42*/{_display_(Seq[Any](format.raw/*196.43*/("""
                            """),format.raw/*197.29*/("""<a href="#" class="dg-feed__image """),_display_(/*197.64*/{if(count != 3) " box-6col-imgwrapper" else ""}),format.raw/*197.111*/(""" """),_display_(/*197.113*/{if(count != 0) " feed--arrow" else ""}),format.raw/*197.152*/(""" """),_display_(/*197.154*/{if(count == 2) " box--left" else ""}),format.raw/*197.191*/(""" """),_display_(/*197.193*/{if(count == 3) " box-3col-horizont-imgwrapper box-6col-horizont-imgwrapper" else ""}),format.raw/*197.278*/("""">
                        """)))}),format.raw/*198.26*/("""
                            """),format.raw/*199.29*/("""<span class="read-more button">ЧИТАТЬ</span>
                        </a>
                        """),_display_(/*201.26*/if(count == 0)/*201.40*/ {_display_(Seq[Any](format.raw/*201.42*/("""
                            """),format.raw/*202.29*/("""<div class="clear"></div>
                            <div class="dg-feed__info">
                        """)))}),format.raw/*204.26*/("""
                        """),_display_(/*205.26*/if(count == 1)/*205.40*/ {_display_(Seq[Any](format.raw/*205.42*/("""
                            """),format.raw/*206.29*/("""<div class="dg-feed__info--horizont">
                        """)))}),format.raw/*207.26*/("""
                        """),_display_(/*208.26*/if(count == 2)/*208.40*/ {_display_(Seq[Any](format.raw/*208.42*/("""
                            """),format.raw/*209.29*/("""<div class="dg-feed__info--horizont box--right">
                        """)))}),format.raw/*210.26*/("""
                        """),_display_(/*211.26*/if(count == 3)/*211.40*/ {_display_(Seq[Any](format.raw/*211.42*/("""
                            """),format.raw/*212.29*/("""<div class="dg-feed__info--horizont box-9col-horizont">
                        """)))}),format.raw/*213.26*/("""
                            """),format.raw/*214.29*/("""<div class="dg-feed__info__util">
                                <p class="dg-feed__info__util__sector">"""),_display_(/*215.73*/post/*215.77*/.map(_.getText("blog.category").getOrElse("Общая")).getOrElse("")),format.raw/*215.142*/("""</p>
                                <p class="dg-feed__info__util__time">"""),_display_(/*216.71*/post/*216.75*/.map(_.getText("blog.body").map{text => text.length/900 + "мин"}).getOrElse("")),format.raw/*216.154*/("""</p>
                            </div>
                            """),_display_(/*218.30*/if(count == 0)/*218.44*/ {_display_(Seq[Any](format.raw/*218.46*/("""
                                """),format.raw/*219.33*/("""<div class="dg-feed__info__header">
                                    <h2>"""),_display_(/*220.42*/post/*220.46*/.map(_.getText("blog.title").getOrElse("")).getOrElse("")),format.raw/*220.103*/("""</h2>
                                </div>
                            """)))}),format.raw/*222.30*/("""
                            """),_display_(/*223.30*/if(count != 0)/*223.44*/ {_display_(Seq[Any](format.raw/*223.46*/("""
                                """),_display_(/*224.34*/if(post.isDefined)/*224.52*/{_display_(Seq[Any](format.raw/*224.53*/("""
                                    """),format.raw/*225.37*/("""<a href=""""),_display_(/*225.47*/routes/*225.53*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*225.102*/("""" class="dg-feed__info__header">
                                """)))}),format.raw/*226.34*/("""
                                """),_display_(/*227.34*/if(post.isEmpty)/*227.50*/{_display_(Seq[Any](format.raw/*227.51*/("""
                                    """),format.raw/*228.37*/("""<a href="#" class="dg-feed__info__header">
                                """)))}),format.raw/*229.34*/("""
                                    """),format.raw/*230.37*/("""<h2>"""),_display_(/*230.42*/post/*230.46*/.map(_.getText("blog.title").getOrElse("")).getOrElse("")),format.raw/*230.103*/("""</h2>
                                </a>
                            """)))}),format.raw/*232.30*/("""
                            """),format.raw/*233.29*/("""<div class="dg-feed__info__tags">
                                <ul>
                                """),_display_(/*235.34*/post/*235.38*/.map(_.tags.map { tag =>
                                    Html("<li>#" + tag + "</li>")
                                }).getOrElse("")),format.raw/*237.49*/("""
                                """),format.raw/*238.33*/("""</ul>
                            </div>
                            """),_display_(/*240.30*/if(count == 0)/*240.44*/{_display_(Seq[Any](format.raw/*240.45*/("""
                                """),format.raw/*241.33*/("""<hr class="delimeter-white">
                            """)))}),format.raw/*242.30*/("""
                            """),_display_(/*243.30*/if(count != 0)/*243.44*/{_display_(Seq[Any](format.raw/*243.45*/("""
                                """),format.raw/*244.33*/("""<hr class="delimeter-gray">
                            """)))}),format.raw/*245.30*/("""
                            """),format.raw/*246.29*/("""<ul class="dg-feed__info__actions">
                                <li>
                                    """),format.raw/*248.304*/("""
                                """),format.raw/*249.33*/("""</li>
                                <li>
                                    <a href="#" class="dg-feed__info__actions--like"></a>
                                </li>
                                <li>
                                    """),_display_(/*254.38*/if(post.isDefined)/*254.56*/ {_display_(Seq[Any](format.raw/*254.58*/("""
                                        """),format.raw/*255.41*/("""<a href=""""),_display_(/*255.51*/routes/*255.57*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*255.106*/("""#disqus_thread" class="dg-feed__info__actions--comment">
                                            0</a>
                                    """)))}),format.raw/*257.38*/("""
                                """),format.raw/*258.33*/("""</li>
                            </ul>
                        </div>
                    </div>
                """)))}),format.raw/*262.18*/("""
                """),format.raw/*263.17*/("""</div>

                <div class="clear"></div>

                <div class="empty-posts">
                    <div class="container">
                        <h2 class="empty-posts-text">В данной категории еще нет статей</h2>
                    </div>
                </div>
                <div class="dg-feed__btn-wrapper">
                    <a class="dg-feed__btn" href="#" data-next-page="2" """),_display_(/*273.74*/if(posts.length < 5)/*273.94*/{_display_(Seq[Any](format.raw/*273.95*/("""style="display: none;"""")))}),format.raw/*273.118*/(""">
                        <span class="load-icon"></span>
                        <span>ЕЩЕ СТАТЬИ</span>
                    </a>
                </div>

                <div class="clear"></div>
            </section>

            """),format.raw/*282.39*/("""
            """),format.raw/*283.13*/("""<script type="text/javascript">
            /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
            var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

            /* * * DON'T EDIT BELOW THIS LINE * * */
            (function () """),format.raw/*288.26*/("""{"""),format.raw/*288.27*/("""
            """),format.raw/*289.13*/("""var s = document.createElement('script'); s.async = true;
            s.type = 'text/javascript';
            s.src = '//' + disqus_shortname + '.disqus.com/count.js';
            (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
            """),format.raw/*293.13*/("""}"""),format.raw/*293.14*/("""());
            </script>
            
            <section class="dg-blog-feed">

                


            </section>

        <div class="clear"></div>

        """),_display_(/*305.10*/footer(blogCategories)),format.raw/*305.32*/("""

        """),format.raw/*307.9*/("""</div>

        
        <script src=""""),_display_(/*310.23*/routes/*310.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*310.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*311.23*/routes/*311.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*311.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*312.23*/routes/*312.29*/.Assets.at("javascripts/classie.js")),format.raw/*312.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*313.23*/routes/*313.29*/.Assets.at("javascripts/navigation.js")),format.raw/*313.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*314.23*/routes/*314.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*314.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*315.23*/routes/*315.29*/.Assets.at("javascripts/main.js")),format.raw/*315.62*/(""""></script>
        """),_display_(/*316.10*/postDetailScripts()),format.raw/*316.29*/("""

    """),format.raw/*318.5*/("""</body>
</html>

"""))}
  }

  def render(posts:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],selectedCategory:Option[String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,blogCategories,selectedCategory)(ctx)

  def f:((Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Option[String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,blogCategories,selectedCategory) => (ctx) => apply(posts,blogCategories,selectedCategory)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Mar 22 12:29:55 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/Girhub/DoneDia/DoneDia/app/views/post/posts.scala.html
                  HASH: c4b7b557bceedee3547f5053ba0bc7c2754c135b
                  MATRIX: 604->1|853->161|883->165|1328->583|1365->599|1394->600|1920->1099|1935->1105|1988->1137|2058->1180|2073->1186|2128->1220|2197->1262|2212->1268|2270->1305|2323->1331|2338->1337|2414->1392|2476->1427|2491->1433|2565->1486|2641->1546|2683->1560|3027->1876|3056->1877|3093->1887|3157->1923|3186->1924|3223->1934|3255->1938|3284->1939|3321->1949|3386->1986|3415->1987|3563->2107|3592->2108|3631->2120|3660->2121|3689->2122|3726->2131|3755->2132|3784->2133|3813->2134|3850->2144|3879->2145|4031->2269|4060->2270|4089->2271|4150->2304|4179->2305|4424->2522|4453->2523|4490->2533|4576->2592|4605->2593|4634->2594|4667->2599|4696->2600|4725->2601|4758->2606|4787->2607|4824->2617|4853->2618|5593->3348|5630->3358|5720->3420|5749->3421|5786->3431|6102->3720|6131->3721|6687->4250|6710->4264|6723->4268|6767->4274|6817->4296|6858->4310|6873->4316|6927->4349|6957->4352|6993->4378|7033->4379|7077->4391|7107->4393|7120->4396|7145->4399|7204->4427|7250->4445|7728->4895|7744->4901|7786->4921|8487->5594|8514->5610|8562->5635|8775->5820|8813->5848|8853->5849|8883->5850|8924->5859|9013->5920|9056->5946|9096->5947|9167->5989|9203->5997|9278->6061|9319->6062|9369->6079|9400->6081|9437->6107|9478->6108|9523->6120|9554->6122|9568->6125|9594->6128|9674->6176|9737->6210|10210->6654|10240->6655|10378->6763|10409->6764|10552->6877|10583->6878|10614->6879|10724->7273|10783->7303|11072->7877|11131->7907|11545->8292|11575->8293|11637->8325|11668->8326|11788->8628|11851->8662|12024->8824|12071->8842|12143->8885|12173->8886|12220->8904|12367->9022|12397->9023|12427->9024|12863->9431|12893->9432|12923->9433|12983->9486|13032->9506|13125->9571|13243->9671|13284->9672|13335->9695|13359->9709|13400->9711|13451->9733|13502->9756|13528->9772|13568->9773|13623->9796|13679->9820|13730->9843|13768->9871|13809->9873|13860->9895|13920->9927|13946->9943|13986->9944|14041->9967|14097->9991|14148->10014|14172->10028|14212->10029|14267->10055|14328->10088|14354->10104|14394->10105|14449->10128|14505->10152|14560->10179|14588->10197|14628->10198|14687->10228|14725->10238|14741->10244|14812->10293|14866->10318|14936->10365|14967->10367|15029->10406|15060->10408|15120->10445|15151->10447|15259->10532|15291->10535|15306->10539|15361->10583|15408->10590|15439->10591|15498->10621|15512->10624|15539->10628|15575->10631|15606->10632|15666->10660|15721->10687|15747->10703|15787->10704|15846->10734|15909->10769|15979->10816|16010->10818|16072->10857|16103->10859|16163->10896|16194->10898|16302->10983|16363->11012|16422->11042|16551->11143|16575->11157|16616->11159|16675->11189|16816->11298|16871->11325|16895->11339|16936->11341|16995->11371|17091->11435|17146->11462|17170->11476|17211->11478|17270->11508|17377->11583|17432->11610|17456->11624|17497->11626|17556->11656|17670->11738|17729->11768|17864->11875|17878->11879|17966->11944|18070->12020|18084->12024|18186->12103|18285->12174|18309->12188|18350->12190|18413->12224|18519->12302|18533->12306|18613->12363|18721->12439|18780->12470|18804->12484|18845->12486|18908->12521|18936->12539|18976->12540|19043->12578|19081->12588|19097->12594|19169->12643|19268->12710|19331->12745|19357->12761|19397->12762|19464->12800|19573->12877|19640->12915|19673->12920|19687->12924|19767->12981|19873->13055|19932->13085|20066->13191|20080->13195|20243->13336|20306->13370|20406->13442|20430->13456|20470->13457|20533->13491|20624->13550|20683->13581|20707->13595|20747->13596|20810->13630|20900->13688|20959->13718|21100->14096|21163->14130|21441->14380|21469->14398|21510->14400|21581->14442|21619->14452|21635->14458|21707->14507|21885->14653|21948->14687|22099->14806|22146->14824|22587->15237|22617->15257|22657->15258|22713->15281|22984->15549|23027->15563|23372->15879|23402->15880|23445->15894|23773->16193|23803->16194|24014->16377|24058->16399|24098->16411|24168->16453|24184->16459|24246->16499|24332->16557|24348->16563|24416->16609|24502->16667|24518->16673|24576->16709|24662->16767|24678->16773|24739->16812|24825->16870|24841->16876|24924->16937|25010->16995|25026->17001|25081->17034|25131->17056|25172->17075|25208->17083
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|44->23|45->24|53->32|53->32|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|60->39|60->39|61->40|61->40|61->40|61->40|61->40|61->40|61->40|62->41|62->41|66->45|66->45|66->45|66->45|66->45|71->50|71->50|72->51|73->52|73->52|73->52|73->52|73->52|73->52|73->52|73->52|74->53|74->53|87->66|88->67|89->68|89->68|90->69|95->74|95->74|107->86|107->86|107->86|107->86|108->87|108->87|108->87|108->87|108->87|108->87|108->87|108->87|108->87|108->87|108->87|109->88|110->89|122->101|122->101|122->101|135->114|135->114|135->114|138->117|138->117|138->117|138->117|138->117|139->118|139->118|139->118|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|141->120|142->121|153->132|153->132|153->132|153->132|153->132|153->132|153->132|155->140|156->141|160->150|161->151|167->157|167->157|167->157|167->157|169->162|170->163|177->170|178->171|178->171|178->171|179->172|180->173|180->173|180->173|186->179|186->179|186->179|187->180|189->182|190->183|190->183|190->183|191->184|191->184|191->184|192->185|192->185|192->185|192->185|192->185|193->186|194->187|194->187|194->187|195->188|195->188|195->188|195->188|195->188|196->189|197->190|197->190|197->190|198->191|198->191|198->191|198->191|198->191|199->192|200->193|200->193|200->193|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|202->195|203->196|203->196|203->196|204->197|204->197|204->197|204->197|204->197|204->197|204->197|204->197|204->197|205->198|206->199|208->201|208->201|208->201|209->202|211->204|212->205|212->205|212->205|213->206|214->207|215->208|215->208|215->208|216->209|217->210|218->211|218->211|218->211|219->212|220->213|221->214|222->215|222->215|222->215|223->216|223->216|223->216|225->218|225->218|225->218|226->219|227->220|227->220|227->220|229->222|230->223|230->223|230->223|231->224|231->224|231->224|232->225|232->225|232->225|232->225|233->226|234->227|234->227|234->227|235->228|236->229|237->230|237->230|237->230|237->230|239->232|240->233|242->235|242->235|244->237|245->238|247->240|247->240|247->240|248->241|249->242|250->243|250->243|250->243|251->244|252->245|253->246|255->248|256->249|261->254|261->254|261->254|262->255|262->255|262->255|262->255|264->257|265->258|269->262|270->263|280->273|280->273|280->273|280->273|289->282|290->283|295->288|295->288|296->289|300->293|300->293|312->305|312->305|314->307|317->310|317->310|317->310|318->311|318->311|318->311|319->312|319->312|319->312|320->313|320->313|320->313|321->314|321->314|321->314|322->315|322->315|322->315|323->316|323->316|325->318
                  -- GENERATED --
              */
          