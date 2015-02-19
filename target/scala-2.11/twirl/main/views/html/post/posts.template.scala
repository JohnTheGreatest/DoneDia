
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
                """),_display_(/*145.18*/for((post, count) <- posts.zipWithIndex) yield /*145.58*/{_display_(Seq[Any](format.raw/*145.59*/("""
                    """),_display_(/*146.22*/if(count == 0)/*146.36*/ {_display_(Seq[Any](format.raw/*146.38*/("""
                        """),format.raw/*147.25*/("""<div class="box-6col">
                            <a href=""""),_display_(/*148.39*/routes/*148.45*/.Application.blogPost(post.id, post.slug)),format.raw/*148.86*/("""" class="dg-feed__image box-6col-imgwrapper" """),_display_(/*148.132*/post/*148.136*/.getImage("blog.image", "postthumb").map/*148.176*/ {img =>_display_(Seq[Any](format.raw/*148.184*/(""" """),format.raw/*148.185*/("""style="background-image: url("""),_display_(/*148.215*/img/*148.218*/.url),format.raw/*148.222*/(""")""")))}),format.raw/*148.224*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                            </a>
                            <div class="clear"></div>
                            <div class="dg-feed__info">
                                <div class="dg-feed__info__util">
                                    <p class="dg-feed__info__util__sector">"""),_display_(/*154.77*/post/*154.81*/.getText("blog.category").getOrElse("Общая")),format.raw/*154.125*/("""</p>
                                    <p class="dg-feed__info__util__time">"""),_display_(/*155.75*/post/*155.79*/.getText("blog.body").map/*155.104*/{text =>_display_(Seq[Any](format.raw/*155.112*/(""" """),_display_(/*155.114*/{text.length/900})))}),format.raw/*155.132*/(""" """),format.raw/*155.133*/("""мин</p>
                                </div>
                                <div class="dg-feed__info__header">
                                    <h2>"""),_display_(/*158.42*/post/*158.46*/.getText("blog.title").map/*158.72*/{title =>_display_(Seq[Any](format.raw/*158.81*/(""" """),_display_(/*158.83*/title)))}),format.raw/*158.89*/("""</h2>
                                </div>
                                <div class="dg-feed__info__tags">
                                    <ul>
                                    """),_display_(/*162.38*/post/*162.42*/.tags.map/*162.51*/ { tag =>_display_(Seq[Any](format.raw/*162.60*/("""
                                        """),format.raw/*163.41*/("""<li>#"""),_display_(/*163.47*/tag),format.raw/*163.50*/("""</li>
                                    """)))}),format.raw/*164.38*/("""
                                    """),format.raw/*165.37*/("""</ul>
                                </div>
                                <hr class="delimeter-white">
                                <ul class="dg-feed__info__actions">
                                    <li>
                                        """),format.raw/*170.308*/("""
                                    """),format.raw/*171.37*/("""</li>
                                    <li>
                                        <a href="#" class="dg-feed__info__actions--like"></a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(/*176.51*/routes/*176.57*/.Application.blogPost(post.id, post.slug)),format.raw/*176.98*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    """)))}),format.raw/*181.22*/("""
                    """),_display_(/*182.22*/if(count == 1)/*182.36*/ {_display_(Seq[Any](format.raw/*182.38*/("""
                        """),format.raw/*183.25*/("""<div class="box-6col-horizont">
                            <a href=""""),_display_(/*184.39*/routes/*184.45*/.Application.blogPost(post.id, post.slug)),format.raw/*184.86*/("""" class="dg-feed__image box-6col-horizont-imgwrapper feed--arrow" """),_display_(/*184.153*/post/*184.157*/.getImage("blog.image", "postthumb").map/*184.197*/ {img =>_display_(Seq[Any](format.raw/*184.205*/(""" """),format.raw/*184.206*/("""style="background-image: url("""),_display_(/*184.236*/img/*184.239*/.url),format.raw/*184.243*/(""")""")))}),format.raw/*184.245*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                            </a>

                            <div class="dg-feed__info--horizont">
                                <div class="dg-feed__info__util">
                                    <p class="dg-feed__info__util__sector">"""),_display_(/*190.77*/post/*190.81*/.getText("blog.category").getOrElse("Общая")),format.raw/*190.125*/("""</p>
                                    <p class="dg-feed__info__util__time">"""),_display_(/*191.75*/post/*191.79*/.getText("blog.body").map/*191.104*/{text =>_display_(Seq[Any](format.raw/*191.112*/(""" """),_display_(/*191.114*/{text.length/900})))}),format.raw/*191.132*/(""" """),format.raw/*191.133*/("""мин</p>
                                </div>
                                <a href=""""),_display_(/*193.43*/routes/*193.49*/.Application.blogPost(post.id, post.slug)),format.raw/*193.90*/("""" class="dg-feed__info__header">
                                    <h2>"""),_display_(/*194.42*/post/*194.46*/.getText("blog.title").map/*194.72*/{title =>_display_(Seq[Any](format.raw/*194.81*/(""" """),_display_(/*194.83*/title)))}),format.raw/*194.89*/("""</h2>
                                </a>
                                <div class="dg-feed__info__tags">
                                    <ul>
                                    """),_display_(/*198.38*/post/*198.42*/.tags.map/*198.51*/ { tag =>_display_(Seq[Any](format.raw/*198.60*/("""
                                        """),format.raw/*199.41*/("""<li>#"""),_display_(/*199.47*/tag),format.raw/*199.50*/("""</li>
                                    """)))}),format.raw/*200.38*/("""
                                    """),format.raw/*201.37*/("""</ul>
                                </div>
                                <hr class="delimeter-gray">
                                <ul class="dg-feed__info__actions">
                                    <li>
                                        """),format.raw/*206.300*/("""
                                    """),format.raw/*207.37*/("""</li>
                                    <li>
                                        <a href="#" class="dg-feed__info__actions--like"></a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(/*212.51*/routes/*212.57*/.Application.blogPost(post.id, post.slug)),format.raw/*212.98*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    """)))}),format.raw/*217.22*/("""
                    """),_display_(/*218.22*/if(count == 2)/*218.36*/ {_display_(Seq[Any](format.raw/*218.38*/("""
                        """),format.raw/*219.25*/("""<div class="box-6col-horizont">

                            <a href=""""),_display_(/*221.39*/routes/*221.45*/.Application.blogPost(post.id, post.slug)),format.raw/*221.86*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box--left feed--arrow" """),_display_(/*221.163*/post/*221.167*/.getImage("blog.image", "postthumb").map/*221.207*/ {img =>_display_(Seq[Any](format.raw/*221.215*/(""" """),format.raw/*221.216*/("""style="background-image: url("""),_display_(/*221.246*/img/*221.249*/.url),format.raw/*221.253*/(""")""")))}),format.raw/*221.255*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                            </a>

                            <div class="dg-feed__info--horizont box--right">
                                <div class="dg-feed__info__util">
                                    <p class="dg-feed__info__util__sector">"""),_display_(/*227.77*/post/*227.81*/.getText("blog.category").getOrElse("Общая")),format.raw/*227.125*/("""</p>
                                    <p class="dg-feed__info__util__time">"""),_display_(/*228.75*/post/*228.79*/.getText("blog.body").map/*228.104*/{text =>_display_(Seq[Any](format.raw/*228.112*/(""" """),_display_(/*228.114*/{text.length/900})))}),format.raw/*228.132*/(""" """),format.raw/*228.133*/("""мин</p>
                                </div>
                                <a href=""""),_display_(/*230.43*/routes/*230.49*/.Application.blogPost(post.id, post.slug)),format.raw/*230.90*/("""" class="dg-feed__info__header">
                                    <h2>"""),_display_(/*231.42*/post/*231.46*/.getText("blog.title").map/*231.72*/{title =>_display_(Seq[Any](format.raw/*231.81*/(""" """),_display_(/*231.83*/title)))}),format.raw/*231.89*/("""</h2>
                                </a>
                                <div class="dg-feed__info__tags">
                                    <ul>
                                    """),_display_(/*235.38*/post/*235.42*/.tags.map/*235.51*/ { tag =>_display_(Seq[Any](format.raw/*235.60*/("""
                                        """),format.raw/*236.41*/("""<li>#"""),_display_(/*236.47*/tag),format.raw/*236.50*/("""</li>
                                    """)))}),format.raw/*237.38*/("""
                                    """),format.raw/*238.37*/("""</ul>
                                </div>
                                <hr class="delimeter-gray">
                                <ul class="dg-feed__info__actions">
                                    <li>
                                        """),format.raw/*243.300*/("""
                                    """),format.raw/*244.37*/("""</li>
                                    <li>
                                        <a href="#" class="dg-feed__info__actions--like"></a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(/*249.51*/routes/*249.57*/.Application.blogPost(post.id, post.slug)),format.raw/*249.98*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                    </li>
                                </ul>
                            </div>

                        </div>
                    """)))}),format.raw/*255.22*/("""
                    """),_display_(/*256.22*/if(count == 3)/*256.36*/ {_display_(Seq[Any](format.raw/*256.38*/("""
                        """),format.raw/*257.25*/("""<div class="box-12col-horizont">

                            <a href=""""),_display_(/*259.39*/routes/*259.45*/.Application.blogPost(post.id, post.slug)),format.raw/*259.86*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box-3col-horizont-imgwrapper feed--arrow" """),_display_(/*259.182*/post/*259.186*/.getImage("blog.image", "postthumb").map/*259.226*/ {img =>_display_(Seq[Any](format.raw/*259.234*/(""" """),format.raw/*259.235*/("""style="background-image: url("""),_display_(/*259.265*/img/*259.268*/.url),format.raw/*259.272*/(""")""")))}),format.raw/*259.274*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                            </a>

                            <div class="dg-feed__info--horizont box-9col-horizont">

                                <div class="dg-feed__info__util">
                                    <p class="dg-feed__info__util__sector">"""),_display_(/*266.77*/post/*266.81*/.getText("blog.category").getOrElse("Общая")),format.raw/*266.125*/("""</p>
                                    <p class="dg-feed__info__util__time">"""),_display_(/*267.75*/post/*267.79*/.getText("blog.body").map/*267.104*/{text =>_display_(Seq[Any](format.raw/*267.112*/(""" """),_display_(/*267.114*/{text.length/900})))}),format.raw/*267.132*/(""" """),format.raw/*267.133*/("""мин</p>
                                </div>
                                <a href=""""),_display_(/*269.43*/routes/*269.49*/.Application.blogPost(post.id, post.slug)),format.raw/*269.90*/("""" class="dg-feed__info__header">
                                    <h2>"""),_display_(/*270.42*/post/*270.46*/.getText("blog.title").map/*270.72*/{title =>_display_(Seq[Any](format.raw/*270.81*/(""" """),_display_(/*270.83*/title)))}),format.raw/*270.89*/("""</h2>
                                </a>
                                <div class="dg-feed__info__tags">
                                    <ul>
                                    """),_display_(/*274.38*/post/*274.42*/.tags.map/*274.51*/ { tag =>_display_(Seq[Any](format.raw/*274.60*/("""
                                        """),format.raw/*275.41*/("""<li>#"""),_display_(/*275.47*/tag),format.raw/*275.50*/("""</li>
                                    """)))}),format.raw/*276.38*/("""
                                    """),format.raw/*277.37*/("""</ul>
                                </div>
                                <hr class="delimeter-gray">

                                <ul class="dg-feed__info__actions">
                                    <li>
                                        """),format.raw/*283.300*/("""
                                    """),format.raw/*284.37*/("""</li>
                                    <li>
                                        <a href="#" class="dg-feed__info__actions--like"></a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(/*289.51*/routes/*289.57*/.Application.blogPost(post.id, post.slug)),format.raw/*289.98*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                    </li>
                                </ul>

                            </div>
                        </div>
                    """)))}),format.raw/*295.22*/("""
                """)))}),format.raw/*296.18*/("""
                """),format.raw/*297.17*/("""</div>

                <div class="clear"></div>

                <div class="empty-posts">
                    <div class="container">
                        <h2 class="empty-posts-text">В данной категории еще нет статей</h2>
                    </div>
                </div>
                """),_display_(/*306.18*/if(posts.length > 4)/*306.38*/ {_display_(Seq[Any](format.raw/*306.40*/("""
                    """),format.raw/*307.21*/("""<div class="dg-feed__btn-wrapper">
                        <a class="dg-feed__btn" href="#" data-next-page="2">
                            <span class="load-icon"></span>
                            <span>ЕЩЕ СТАТЬИ</span>
                        </a>
                    </div>
                """)))}),format.raw/*313.18*/("""

                """),format.raw/*315.17*/("""<div class="clear"></div>
            </section>

            """),format.raw/*318.39*/("""
            """),format.raw/*319.13*/("""<script type="text/javascript">
            /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
            var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

            /* * * DON'T EDIT BELOW THIS LINE * * */
            (function () """),format.raw/*324.26*/("""{"""),format.raw/*324.27*/("""
            """),format.raw/*325.13*/("""var s = document.createElement('script'); s.async = true;
            s.type = 'text/javascript';
            s.src = '//' + disqus_shortname + '.disqus.com/count.js';
            (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
            """),format.raw/*329.13*/("""}"""),format.raw/*329.14*/("""());
            </script>
            
            <section class="dg-blog-feed">

                


            </section>

        <div class="clear"></div>

        """),_display_(/*341.10*/footer(blogCategories)),format.raw/*341.32*/("""

        """),format.raw/*343.9*/("""</div>

        
        <script src=""""),_display_(/*346.23*/routes/*346.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*346.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*347.23*/routes/*347.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*347.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*348.23*/routes/*348.29*/.Assets.at("javascripts/classie.js")),format.raw/*348.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*349.23*/routes/*349.29*/.Assets.at("javascripts/navigation.js")),format.raw/*349.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*350.23*/routes/*350.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*350.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*351.23*/routes/*351.29*/.Assets.at("javascripts/main.js")),format.raw/*351.62*/(""""></script>
        """),_display_(/*352.10*/postDetailScripts()),format.raw/*352.29*/("""

    """),format.raw/*354.5*/("""</body>
</html>

"""))}
  }

  def render(posts:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],selectedCategory:Option[String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,blogCategories,selectedCategory)(ctx)

  def f:((Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Option[String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,blogCategories,selectedCategory) => (ctx) => apply(posts,blogCategories,selectedCategory)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 19 18:16:25 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/post/posts.scala.html
                  HASH: 335b3751085bc4f89d2e3cb9fdf3d229dc4d71bd
                  MATRIX: 604->1|853->161|881->163|1639->894|1654->900|1709->934|1777->975|1792->981|1850->1018|1902->1043|1917->1049|1993->1104|2054->1138|2069->1144|2143->1197|2216->1254|2257->1267|2492->1492|2524->1497|2609->1554|2638->1555|2670->1560|2961->1824|2989->1825|3533->2342|3556->2356|3569->2360|3613->2366|3662->2387|3703->2401|3718->2407|3772->2440|3802->2443|3814->2446|3838->2449|3896->2476|3941->2493|4406->2931|4421->2937|4462->2957|5148->3616|5174->3632|5221->3657|5430->3839|5467->3867|5506->3868|5535->3869|5575->3878|5662->3938|5704->3964|5743->3965|5812->4006|5847->4014|5921->4078|5961->4079|6010->4096|6040->4098|6053->4101|6078->4104|6156->4151|6217->4184|6678->4617|6707->4618|6844->4726|6874->4727|7016->4840|7046->4841|7076->4842|7184->5228|7242->5257|7550->5845|7608->5874|8016->6253|8046->6254|8108->6286|8139->6287|8257->6584|8319->6617|8485->6772|8531->6789|8603->6832|8633->6833|8679->6850|8825->6967|8855->6968|8885->6969|9315->7370|9345->7371|9375->7372|9434->7424|9481->7442|9573->7506|9630->7546|9670->7547|9720->7569|9744->7583|9785->7585|9839->7610|9928->7671|9944->7677|10007->7718|10082->7764|10097->7768|10148->7808|10196->7816|10227->7817|10286->7847|10300->7850|10327->7854|10362->7856|10755->8221|10769->8225|10836->8269|10943->8348|10957->8352|10993->8377|11041->8385|11072->8387|11116->8405|11147->8406|11331->8562|11345->8566|11381->8592|11429->8601|11459->8603|11490->8609|11707->8798|11721->8802|11740->8811|11788->8820|11858->8861|11892->8867|11917->8870|11992->8913|12058->8950|12343->9472|12409->9509|12711->9783|12727->9789|12790->9830|13051->10059|13101->10081|13125->10095|13166->10097|13220->10122|13318->10192|13334->10198|13397->10239|13493->10306|13508->10310|13559->10350|13607->10358|13638->10359|13697->10389|13711->10392|13738->10396|13773->10398|14123->10720|14137->10724|14204->10768|14311->10847|14325->10851|14361->10876|14409->10884|14440->10886|14484->10904|14515->10905|14632->10994|14648->11000|14711->11041|14813->11115|14827->11119|14863->11145|14911->11154|14941->11156|14972->11162|15187->11349|15201->11353|15220->11362|15268->11371|15338->11412|15372->11418|15397->11421|15472->11464|15538->11501|15822->12014|15888->12051|16190->12325|16206->12331|16269->12372|16530->12601|16580->12623|16604->12637|16645->12639|16699->12664|16798->12735|16814->12741|16877->12782|16983->12859|16998->12863|17049->12903|17097->12911|17128->12912|17187->12942|17201->12945|17228->12949|17263->12951|17624->13284|17638->13288|17705->13332|17812->13411|17826->13415|17862->13440|17910->13448|17941->13450|17985->13468|18016->13469|18133->13558|18149->13564|18212->13605|18314->13679|18328->13683|18364->13709|18412->13718|18442->13720|18473->13726|18688->13913|18702->13917|18721->13926|18769->13935|18839->13976|18873->13982|18898->13985|18973->14028|19039->14065|19323->14578|19389->14615|19691->14889|19707->14895|19770->14936|20032->15166|20082->15188|20106->15202|20147->15204|20201->15229|20301->15301|20317->15307|20380->15348|20505->15444|20520->15448|20571->15488|20619->15496|20650->15497|20709->15527|20723->15530|20750->15534|20785->15536|21154->15877|21168->15881|21235->15925|21342->16004|21356->16008|21392->16033|21440->16041|21471->16043|21515->16061|21546->16062|21663->16151|21679->16157|21742->16198|21844->16272|21858->16276|21894->16302|21942->16311|21972->16313|22003->16319|22218->16506|22232->16510|22251->16519|22299->16528|22369->16569|22403->16575|22428->16578|22503->16621|22569->16658|22854->17172|22920->17209|23222->17483|23238->17489|23301->17530|23563->17760|23613->17778|23659->17795|23983->18091|24013->18111|24054->18113|24104->18134|24433->18431|24480->18449|24571->18537|24613->18550|24953->18861|24983->18862|25025->18875|25349->19170|25379->19171|25578->19342|25622->19364|25660->19374|25727->19413|25743->19419|25805->19459|25890->19516|25906->19522|25974->19568|26059->19625|26075->19631|26133->19667|26218->19724|26234->19730|26295->19769|26380->19826|26396->19832|26479->19893|26564->19950|26580->19956|26635->19989|26684->20010|26725->20029|26759->20035
                  LINES: 19->1|22->1|24->3|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|43->22|44->23|49->28|50->29|51->30|51->30|52->31|57->36|57->36|69->48|69->48|69->48|69->48|70->49|70->49|70->49|70->49|70->49|70->49|70->49|71->50|72->51|84->63|84->63|84->63|97->76|97->76|97->76|100->79|100->79|100->79|100->79|100->79|101->80|101->80|101->80|102->81|102->81|102->81|102->81|102->81|102->81|102->81|102->81|103->82|104->83|115->94|115->94|115->94|115->94|115->94|115->94|115->94|117->102|118->103|122->112|123->113|129->119|129->119|129->119|129->119|131->124|132->125|139->132|140->133|140->133|140->133|141->134|142->135|142->135|142->135|148->141|148->141|148->141|149->142|151->144|152->145|152->145|152->145|153->146|153->146|153->146|154->147|155->148|155->148|155->148|155->148|155->148|155->148|155->148|155->148|155->148|155->148|155->148|155->148|161->154|161->154|161->154|162->155|162->155|162->155|162->155|162->155|162->155|162->155|165->158|165->158|165->158|165->158|165->158|165->158|169->162|169->162|169->162|169->162|170->163|170->163|170->163|171->164|172->165|177->170|178->171|183->176|183->176|183->176|188->181|189->182|189->182|189->182|190->183|191->184|191->184|191->184|191->184|191->184|191->184|191->184|191->184|191->184|191->184|191->184|191->184|197->190|197->190|197->190|198->191|198->191|198->191|198->191|198->191|198->191|198->191|200->193|200->193|200->193|201->194|201->194|201->194|201->194|201->194|201->194|205->198|205->198|205->198|205->198|206->199|206->199|206->199|207->200|208->201|213->206|214->207|219->212|219->212|219->212|224->217|225->218|225->218|225->218|226->219|228->221|228->221|228->221|228->221|228->221|228->221|228->221|228->221|228->221|228->221|228->221|228->221|234->227|234->227|234->227|235->228|235->228|235->228|235->228|235->228|235->228|235->228|237->230|237->230|237->230|238->231|238->231|238->231|238->231|238->231|238->231|242->235|242->235|242->235|242->235|243->236|243->236|243->236|244->237|245->238|250->243|251->244|256->249|256->249|256->249|262->255|263->256|263->256|263->256|264->257|266->259|266->259|266->259|266->259|266->259|266->259|266->259|266->259|266->259|266->259|266->259|266->259|273->266|273->266|273->266|274->267|274->267|274->267|274->267|274->267|274->267|274->267|276->269|276->269|276->269|277->270|277->270|277->270|277->270|277->270|277->270|281->274|281->274|281->274|281->274|282->275|282->275|282->275|283->276|284->277|290->283|291->284|296->289|296->289|296->289|302->295|303->296|304->297|313->306|313->306|313->306|314->307|320->313|322->315|325->318|326->319|331->324|331->324|332->325|336->329|336->329|348->341|348->341|350->343|353->346|353->346|353->346|354->347|354->347|354->347|355->348|355->348|355->348|356->349|356->349|356->349|357->350|357->350|357->350|358->351|358->351|358->351|359->352|359->352|361->354
                  -- GENERATED --
              */
          