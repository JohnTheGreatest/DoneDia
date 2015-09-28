
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
                  DATE: Mon Sep 28 13:56:37 MSK 2015
                  SOURCE: C:/Users/d1sp/Documents/GitHub/DoneDia/app/views/post/posts.scala.html
                  HASH: 1ac4ce5e1e9fd14af9d6523fe1db5ff5b93c2da4
                  MATRIX: 604->1|853->161|881->163|1318->573|1355->589|1384->590|1905->1084|1920->1090|1973->1122|2042->1164|2057->1170|2112->1204|2180->1245|2195->1251|2253->1288|2305->1313|2320->1319|2396->1374|2457->1408|2472->1414|2546->1467|2619->1524|2660->1537|2996->1845|3025->1846|3061->1855|3125->1891|3154->1892|3190->1901|3222->1905|3251->1906|3287->1915|3352->1952|3381->1953|3525->2069|3554->2070|3592->2081|3621->2082|3650->2083|3687->2092|3716->2093|3745->2094|3774->2095|3810->2104|3839->2105|3987->2225|4016->2226|4045->2227|4106->2260|4135->2261|4375->2473|4404->2474|4440->2483|4525->2541|4554->2542|4583->2543|4616->2548|4645->2549|4674->2550|4707->2555|4736->2556|4772->2565|4801->2566|5528->3283|5564->3292|5653->3353|5682->3354|5718->3363|6029->3647|6058->3648|6602->4165|6625->4179|6638->4183|6682->4189|6731->4210|6772->4224|6787->4230|6841->4263|6871->4266|6907->4292|6947->4293|6991->4305|7021->4307|7034->4310|7059->4313|7117->4340|7162->4357|7628->4795|7644->4801|7686->4821|8374->5481|8401->5497|8449->5522|8659->5704|8697->5732|8737->5733|8767->5734|8808->5743|8896->5803|8939->5829|8979->5830|9049->5871|9085->5879|9160->5943|9201->5944|9251->5961|9282->5963|9319->5989|9360->5990|9405->6002|9436->6004|9450->6007|9476->6010|9555->6057|9617->6090|10079->6523|10109->6524|10247->6632|10278->6633|10421->6746|10452->6747|10483->6748|10591->7134|10649->7163|10934->7728|10992->7757|11400->8136|11430->8137|11492->8169|11523->8170|11641->8467|11703->8500|11869->8655|11915->8672|11987->8715|12017->8716|12063->8733|12209->8850|12239->8851|12269->8852|12699->9253|12729->9254|12759->9255|12818->9307|12865->9325|12957->9389|13075->9489|13116->9490|13166->9512|13190->9526|13231->9528|13281->9549|13332->9572|13358->9588|13398->9589|13453->9612|13508->9635|13558->9657|13596->9685|13637->9687|13687->9708|13747->9740|13773->9756|13813->9757|13868->9780|13923->9803|13973->9825|13997->9839|14037->9840|14091->9865|14152->9898|14178->9914|14218->9915|14273->9938|14328->9961|14382->9987|14410->10005|14450->10006|14508->10035|14546->10045|14562->10051|14633->10100|14687->10125|14757->10172|14788->10174|14850->10213|14881->10215|14941->10252|14972->10254|15080->10339|15112->10342|15127->10346|15182->10390|15229->10397|15260->10398|15319->10428|15333->10431|15360->10435|15396->10438|15427->10439|15486->10466|15540->10492|15566->10508|15606->10509|15664->10538|15727->10573|15797->10620|15828->10622|15890->10661|15921->10663|15981->10700|16012->10702|16120->10787|16180->10815|16238->10844|16365->10943|16389->10957|16430->10959|16488->10988|16627->11095|16681->11121|16705->11135|16746->11137|16804->11166|16899->11229|16953->11255|16977->11269|17018->11271|17076->11300|17182->11374|17236->11400|17260->11414|17301->11416|17359->11445|17472->11526|17530->11555|17664->11661|17678->11665|17766->11730|17869->11805|17883->11809|17985->11888|18082->11957|18106->11971|18147->11973|18209->12006|18314->12083|18328->12087|18408->12144|18514->12218|18572->12248|18596->12262|18637->12264|18699->12298|18727->12316|18767->12317|18833->12354|18871->12364|18887->12370|18959->12419|19057->12485|19119->12519|19145->12535|19185->12536|19251->12573|19359->12649|19425->12686|19458->12691|19472->12695|19552->12752|19656->12824|19714->12853|19846->12957|19860->12961|20021->13100|20083->13133|20181->13203|20205->13217|20245->13218|20307->13251|20397->13309|20455->13339|20479->13353|20519->13354|20581->13387|20670->13444|20728->13473|20867->13849|20929->13882|21202->14127|21230->14145|21271->14147|21341->14188|21379->14198|21395->14204|21467->14253|21643->14397|21705->14430|21852->14545|21898->14562|22329->14965|22359->14985|22399->14986|22455->15009|22717->15268|22759->15281|23099->15592|23129->15593|23171->15606|23495->15901|23525->15902|23724->16073|23768->16095|23806->16105|23873->16144|23889->16150|23951->16190|24036->16247|24052->16253|24120->16299|24205->16356|24221->16362|24279->16398|24364->16455|24380->16461|24441->16500|24526->16557|24542->16563|24625->16624|24710->16681|24726->16687|24781->16720|24830->16741|24871->16760|24905->16766
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|44->23|45->24|53->32|53->32|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|60->39|60->39|61->40|61->40|61->40|61->40|61->40|61->40|61->40|62->41|62->41|66->45|66->45|66->45|66->45|66->45|71->50|71->50|72->51|73->52|73->52|73->52|73->52|73->52|73->52|73->52|73->52|74->53|74->53|87->66|88->67|89->68|89->68|90->69|95->74|95->74|107->86|107->86|107->86|107->86|108->87|108->87|108->87|108->87|108->87|108->87|108->87|108->87|108->87|108->87|108->87|109->88|110->89|122->101|122->101|122->101|135->114|135->114|135->114|138->117|138->117|138->117|138->117|138->117|139->118|139->118|139->118|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|141->120|142->121|153->132|153->132|153->132|153->132|153->132|153->132|153->132|155->140|156->141|160->150|161->151|167->157|167->157|167->157|167->157|169->162|170->163|177->170|178->171|178->171|178->171|179->172|180->173|180->173|180->173|186->179|186->179|186->179|187->180|189->182|190->183|190->183|190->183|191->184|191->184|191->184|192->185|192->185|192->185|192->185|192->185|193->186|194->187|194->187|194->187|195->188|195->188|195->188|195->188|195->188|196->189|197->190|197->190|197->190|198->191|198->191|198->191|198->191|198->191|199->192|200->193|200->193|200->193|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|201->194|202->195|203->196|203->196|203->196|204->197|204->197|204->197|204->197|204->197|204->197|204->197|204->197|204->197|205->198|206->199|208->201|208->201|208->201|209->202|211->204|212->205|212->205|212->205|213->206|214->207|215->208|215->208|215->208|216->209|217->210|218->211|218->211|218->211|219->212|220->213|221->214|222->215|222->215|222->215|223->216|223->216|223->216|225->218|225->218|225->218|226->219|227->220|227->220|227->220|229->222|230->223|230->223|230->223|231->224|231->224|231->224|232->225|232->225|232->225|232->225|233->226|234->227|234->227|234->227|235->228|236->229|237->230|237->230|237->230|237->230|239->232|240->233|242->235|242->235|244->237|245->238|247->240|247->240|247->240|248->241|249->242|250->243|250->243|250->243|251->244|252->245|253->246|255->248|256->249|261->254|261->254|261->254|262->255|262->255|262->255|262->255|264->257|265->258|269->262|270->263|280->273|280->273|280->273|280->273|289->282|290->283|295->288|295->288|296->289|300->293|300->293|312->305|312->305|314->307|317->310|317->310|317->310|318->311|318->311|318->311|319->312|319->312|319->312|320->313|320->313|320->313|321->314|321->314|321->314|322->315|322->315|322->315|323->316|323->316|325->318
                  -- GENERATED --
              */
          