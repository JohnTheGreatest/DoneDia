
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
        """),format.raw/*29.27*/("""
    """),format.raw/*30.5*/("""<div id="fb-root"></div>
    <script>(function(d, s, id) """),format.raw/*31.33*/("""{"""),format.raw/*31.34*/("""
    """),format.raw/*32.5*/("""var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
    fjs.parentNode.insertBefore(js, fjs);
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""(document, 'script', 'facebook-jssdk'));</script>
        
            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div class="overlay overlay-contentscale">
            <button type="button" class="overlay-close">Close</button>
            <nav>
                <ul>
                """),_display_(/*49.18*/blogCategories/*49.32*/.map/*49.36*/{cat=>_display_(Seq[Any](format.raw/*49.42*/("""
                    """),format.raw/*50.21*/("""<li><a href=""""),_display_(/*50.35*/routes/*50.41*/.Application.blogCategory(cat._1)),format.raw/*50.74*/("""" """),_display_(/*50.77*/if(cat._1.contains("kon"))/*50.103*/{_display_(Seq[Any](format.raw/*50.104*/("""class="kon"""")))}),format.raw/*50.116*/(""">"""),_display_(/*50.118*/cat/*50.121*/._2),format.raw/*50.124*/("""</a></li>
                """)))}),format.raw/*51.18*/("""
                """),format.raw/*52.17*/("""</ul>
            </nav>
        </div>

        <div class="main-transform">

            <header class="dg-header dg-blog-header">
                <div class="container">
                    <div class="dg-header__menubtn">
                        <button class="ir icon-navigation" id="trigger-overlay" type="button"></button>
                    </div>
                    <div class="logo-wrapper">
                        <a href=""""),_display_(/*64.35*/routes/*64.41*/.Application.index()),format.raw/*64.61*/("""" class="logo">
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
                            <dt><a><span class="dg-feed_filter__section__content">"""),_display_(/*77.84*/selectedCategory/*77.100*/.getOrElse("ВСЕ РАЗДЕЛЫ")),format.raw/*77.125*/("""</span><span class="icon-arrow-down"></span></a></dt>
                            <dd>
                                <ul>
                                    <li><a class="default"""),_display_(/*80.59*/if(selectedCategory.isEmpty)/*80.87*/{_display_(Seq[Any](format.raw/*80.88*/(""" """),format.raw/*80.89*/("""selected""")))}),format.raw/*80.98*/("""">Все разделы</a></li>
                                    """),_display_(/*81.38*/for(cat <- blogCategories) yield /*81.64*/{_display_(Seq[Any](format.raw/*81.65*/("""
                                        """),format.raw/*82.41*/("""<li><a """),_display_(/*82.49*/if(selectedCategory.isDefined && cat._2 == selectedCategory.get)/*82.113*/{_display_(Seq[Any](format.raw/*82.114*/("""class="selected"""")))}),format.raw/*82.131*/(""" """),_display_(/*82.133*/if(cat._1.contains("kon"))/*82.159*/{_display_(Seq[Any](format.raw/*82.160*/("""class="kon"""")))}),format.raw/*82.172*/(""">"""),_display_(/*82.174*/cat/*82.177*/._2),format.raw/*82.180*/("""</a></li>
                                    """)))}),format.raw/*83.38*/("""
                                """),format.raw/*84.33*/("""</ul>
                            </dd>
                        </dl>
                    </div>


                    <div class="dg-feed__social">

                        <ul class="clear">
                            <li>
                                <a href="https://twitter.com/share" class="twitter-share-button" data-via="diapost" data-hashtags="diapost">Tweet</a>
                                <script>!function(d,s,id)"""),format.raw/*95.58*/("""{"""),format.raw/*95.59*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*95.167*/("""{"""),format.raw/*95.168*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*95.281*/("""}"""),format.raw/*95.282*/("""}"""),format.raw/*95.283*/("""(document, 'script', 'twitter-wjs');</script>

                                """),format.raw/*103.35*/("""
                            """),format.raw/*104.29*/("""</li>

                            <li>
                                <div class="fb-like" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
                                """),format.raw/*113.35*/("""
                            """),format.raw/*114.29*/("""</li>

                            <li>
                                <a href="#" class="dg-feed__social__vkontakte">
                                        <!-- Put this script tag to the place, where the Share button will be -->
                                    <script type="text/javascript"><!--
                                    document.write(VK.Share.button(false,"""),format.raw/*120.74*/("""{"""),format.raw/*120.75*/("""type: "round", text: "Сохранить""""),format.raw/*120.107*/("""}"""),format.raw/*120.108*/("""));
                                    --></script>
                                    """),format.raw/*125.39*/("""
                                """),format.raw/*126.33*/("""</a>
                            </li>
                        </ul>

                    </div>
                </div>

                """),format.raw/*133.35*/("""
                """),format.raw/*134.17*/("""<script type="text/javascript">(function() """),format.raw/*134.60*/("""{"""),format.raw/*134.61*/("""
                """),format.raw/*135.17*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
                if (window.ifpluso==undefined) """),format.raw/*136.48*/("""{"""),format.raw/*136.49*/(""" """),format.raw/*136.50*/("""window.ifpluso = 1;
                var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
                s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
                s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
                var h=d[g]('body')[0];
                h.appendChild(s);
                """),format.raw/*142.17*/("""}"""),format.raw/*142.18*/("""}"""),format.raw/*142.19*/(""")();</script>
                """),format.raw/*143.39*/("""

                """),format.raw/*145.17*/("""<div class="container-metro dg-feed__content">
                """),_display_(/*146.18*/for((post, count) <- (posts.map(p => Some(p)) ++ List(None, None, None, None)).take(4).zipWithIndex) yield /*146.118*/{_display_(Seq[Any](format.raw/*146.119*/("""
                    """),_display_(/*147.22*/if(count == 0)/*147.36*/ {_display_(Seq[Any](format.raw/*147.38*/("""
                    """),format.raw/*148.21*/("""<div class="box-6col" """),_display_(/*148.44*/if(post.isEmpty)/*148.60*/{_display_(Seq[Any](format.raw/*148.61*/("""style="display: none;"""")))}),format.raw/*148.84*/(""">
                    """)))}),format.raw/*149.22*/("""
                    """),_display_(/*150.22*/if(count == 1 || count == 2)/*150.50*/ {_display_(Seq[Any](format.raw/*150.52*/("""
                    """),format.raw/*151.21*/("""<div class="box-6col-horizont" """),_display_(/*151.53*/if(post.isEmpty)/*151.69*/{_display_(Seq[Any](format.raw/*151.70*/("""style="display: none;"""")))}),format.raw/*151.93*/(""">
                    """)))}),format.raw/*152.22*/("""
                    """),_display_(/*153.22*/if(count == 3)/*153.36*/{_display_(Seq[Any](format.raw/*153.37*/("""
                        """),format.raw/*154.25*/("""<div class="box-12col-horizont" """),_display_(/*154.58*/if(post.isEmpty)/*154.74*/{_display_(Seq[Any](format.raw/*154.75*/("""style="display: none;"""")))}),format.raw/*154.98*/(""">
                    """)))}),format.raw/*155.22*/("""
                        """),_display_(/*156.26*/if(post.isDefined)/*156.44*/{_display_(Seq[Any](format.raw/*156.45*/("""
                            """),format.raw/*157.29*/("""<a href=""""),_display_(/*157.39*/routes/*157.45*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*157.94*/("""" class="dg-feed__image """),_display_(/*157.119*/{if(count != 3) " box-6col-imgwrapper" else ""}),format.raw/*157.166*/(""" """),_display_(/*157.168*/{if(count != 0) " feed--arrow" else ""}),format.raw/*157.207*/(""" """),_display_(/*157.209*/{if(count == 2) " box--left" else ""}),format.raw/*157.246*/(""" """),_display_(/*157.248*/{if(count == 3) " box-3col-horizont-imgwrapper box-6col-horizont-imgwrapper" else ""}),format.raw/*157.333*/("""" """),_display_(/*157.336*/post/*157.340*/.get.getImage("blog.image", "postthumb").map/*157.384*/{img =>_display_(Seq[Any](format.raw/*157.391*/(""" """),format.raw/*157.392*/("""style="background-image: url("""),_display_(/*157.422*/img/*157.425*/.url),format.raw/*157.429*/(""")"""")))}),format.raw/*157.432*/(""" """),format.raw/*157.433*/(""">
                        """)))}),format.raw/*158.26*/("""
                        """),_display_(/*159.26*/if(post.isEmpty)/*159.42*/{_display_(Seq[Any](format.raw/*159.43*/("""
                            """),format.raw/*160.29*/("""<a href="#" class="dg-feed__image """),_display_(/*160.64*/{if(count != 3) " box-6col-imgwrapper" else ""}),format.raw/*160.111*/(""" """),_display_(/*160.113*/{if(count != 0) " feed--arrow" else ""}),format.raw/*160.152*/(""" """),_display_(/*160.154*/{if(count == 2) " box--left" else ""}),format.raw/*160.191*/(""" """),_display_(/*160.193*/{if(count == 3) " box-3col-horizont-imgwrapper box-6col-horizont-imgwrapper" else ""}),format.raw/*160.278*/("""">
                        """)))}),format.raw/*161.26*/("""
                            """),format.raw/*162.29*/("""<span class="read-more button">ЧИТАТЬ</span>
                        </a>
                        """),_display_(/*164.26*/if(count == 0)/*164.40*/ {_display_(Seq[Any](format.raw/*164.42*/("""
                            """),format.raw/*165.29*/("""<div class="clear"></div>
                            <div class="dg-feed__info">
                        """)))}),format.raw/*167.26*/("""
                        """),_display_(/*168.26*/if(count == 1)/*168.40*/ {_display_(Seq[Any](format.raw/*168.42*/("""
                            """),format.raw/*169.29*/("""<div class="dg-feed__info--horizont">
                        """)))}),format.raw/*170.26*/("""
                        """),_display_(/*171.26*/if(count == 2)/*171.40*/ {_display_(Seq[Any](format.raw/*171.42*/("""
                            """),format.raw/*172.29*/("""<div class="dg-feed__info--horizont box--right">
                        """)))}),format.raw/*173.26*/("""
                        """),_display_(/*174.26*/if(count == 3)/*174.40*/ {_display_(Seq[Any](format.raw/*174.42*/("""
                            """),format.raw/*175.29*/("""<div class="dg-feed__info--horizont box-9col-horizont">
                        """)))}),format.raw/*176.26*/("""
                            """),format.raw/*177.29*/("""<div class="dg-feed__info__util">
                                <p class="dg-feed__info__util__sector">"""),_display_(/*178.73*/post/*178.77*/.map(_.getText("blog.category").getOrElse("Общая")).getOrElse("")),format.raw/*178.142*/("""</p>
                                <p class="dg-feed__info__util__time">"""),_display_(/*179.71*/post/*179.75*/.map(_.getText("blog.body").map{text => text.length/900 + "мин"}).getOrElse("")),format.raw/*179.154*/("""</p>
                            </div>
                            """),_display_(/*181.30*/if(count == 0)/*181.44*/ {_display_(Seq[Any](format.raw/*181.46*/("""
                                """),format.raw/*182.33*/("""<div class="dg-feed__info__header">
                                    <h2>"""),_display_(/*183.42*/post/*183.46*/.map(_.getText("blog.title").getOrElse("")).getOrElse("")),format.raw/*183.103*/("""</h2>
                                </div>
                            """)))}),format.raw/*185.30*/("""
                            """),_display_(/*186.30*/if(count != 0)/*186.44*/ {_display_(Seq[Any](format.raw/*186.46*/("""
                                """),_display_(/*187.34*/if(post.isDefined)/*187.52*/{_display_(Seq[Any](format.raw/*187.53*/("""
                                    """),format.raw/*188.37*/("""<a href=""""),_display_(/*188.47*/routes/*188.53*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*188.102*/("""" class="dg-feed__info__header">
                                """)))}),format.raw/*189.34*/("""
                                """),_display_(/*190.34*/if(post.isEmpty)/*190.50*/{_display_(Seq[Any](format.raw/*190.51*/("""
                                    """),format.raw/*191.37*/("""<a href="#" class="dg-feed__info__header">
                                """)))}),format.raw/*192.34*/("""
                                    """),format.raw/*193.37*/("""<h2>"""),_display_(/*193.42*/post/*193.46*/.map(_.getText("blog.title").getOrElse("")).getOrElse("")),format.raw/*193.103*/("""</h2>
                                </a>
                            """)))}),format.raw/*195.30*/("""
                            """),format.raw/*196.29*/("""<div class="dg-feed__info__tags">
                                <ul>
                                """),_display_(/*198.34*/post/*198.38*/.map(_.tags.map { tag =>
                                    Html("<li>#" + tag + "</li>")
                                }).getOrElse("")),format.raw/*200.49*/("""
                                """),format.raw/*201.33*/("""</ul>
                            </div>
                            """),_display_(/*203.30*/if(count == 0)/*203.44*/{_display_(Seq[Any](format.raw/*203.45*/("""
                                """),format.raw/*204.33*/("""<hr class="delimeter-white">
                            """)))}),format.raw/*205.30*/("""
                            """),_display_(/*206.30*/if(count != 0)/*206.44*/{_display_(Seq[Any](format.raw/*206.45*/("""
                                """),format.raw/*207.33*/("""<hr class="delimeter-gray">
                            """)))}),format.raw/*208.30*/("""
                            """),format.raw/*209.29*/("""<ul class="dg-feed__info__actions">
                                <li>
                                    """),format.raw/*211.304*/("""
                                """),format.raw/*212.33*/("""</li>
                                <li>
                                    <a href="#" class="dg-feed__info__actions--like"></a>
                                </li>
                                <li>
                                    """),_display_(/*217.38*/if(post.isDefined)/*217.56*/ {_display_(Seq[Any](format.raw/*217.58*/("""
                                        """),format.raw/*218.41*/("""<a href=""""),_display_(/*218.51*/routes/*218.57*/.Application.blogPost(post.get.id, post.get.slug)),format.raw/*218.106*/("""#disqus_thread" class="dg-feed__info__actions--comment">
                                            0</a>
                                    """)))}),format.raw/*220.38*/("""
                                """),format.raw/*221.33*/("""</li>
                            </ul>
                        </div>
                    </div>
                """)))}),format.raw/*225.18*/("""
                """),format.raw/*226.17*/("""</div>

                <div class="clear"></div>

                <div class="empty-posts">
                    <div class="container">
                        <h2 class="empty-posts-text">В данной категории еще нет статей</h2>
                    </div>
                </div>
                <div class="dg-feed__btn-wrapper">
                    <a class="dg-feed__btn" href="#" data-next-page="2" """),_display_(/*236.74*/if(posts.length < 5)/*236.94*/{_display_(Seq[Any](format.raw/*236.95*/("""style="display: none;"""")))}),format.raw/*236.118*/(""">
                        <span class="load-icon"></span>
                        <span>ЕЩЕ СТАТЬИ</span>
                    </a>
                </div>

                <div class="clear"></div>
            </section>

            """),format.raw/*245.39*/("""
            """),format.raw/*246.13*/("""<script type="text/javascript">
            /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
            var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

            /* * * DON'T EDIT BELOW THIS LINE * * */
            (function () """),format.raw/*251.26*/("""{"""),format.raw/*251.27*/("""
            """),format.raw/*252.13*/("""var s = document.createElement('script'); s.async = true;
            s.type = 'text/javascript';
            s.src = '//' + disqus_shortname + '.disqus.com/count.js';
            (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
            """),format.raw/*256.13*/("""}"""),format.raw/*256.14*/("""());
            </script>
            
            <section class="dg-blog-feed">

                


            </section>

        <div class="clear"></div>

        """),_display_(/*268.10*/footer(blogCategories)),format.raw/*268.32*/("""

        """),format.raw/*270.9*/("""</div>

        
        <script src=""""),_display_(/*273.23*/routes/*273.29*/.Assets.at("javascripts/jquery.lazy.js")),format.raw/*273.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*274.23*/routes/*274.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*274.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*275.23*/routes/*275.29*/.Assets.at("javascripts/classie.js")),format.raw/*275.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*276.23*/routes/*276.29*/.Assets.at("javascripts/navigation.js")),format.raw/*276.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*277.23*/routes/*277.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*277.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*278.23*/routes/*278.29*/.Assets.at("javascripts/main.js")),format.raw/*278.62*/(""""></script>
        """),_display_(/*279.10*/postDetailScripts()),format.raw/*279.29*/("""

    """),format.raw/*281.5*/("""</body>
</html>

"""))}
  }

  def render(posts:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],selectedCategory:Option[String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,blogCategories,selectedCategory)(ctx)

  def f:((Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Option[String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,blogCategories,selectedCategory) => (ctx) => apply(posts,blogCategories,selectedCategory)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 15:06:30 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/post/posts.scala.html
                  HASH: 53c0e2d08fff0cb3f173283d63f74221b8037a3c
                  MATRIX: 604->1|853->161|883->165|1328->583|1365->599|1394->600|1920->1099|1935->1105|1988->1137|2058->1180|2073->1186|2128->1220|2197->1262|2212->1268|2270->1305|2323->1331|2338->1337|2414->1392|2476->1427|2491->1433|2565->1486|2641->1546|2683->1560|2923->1790|2956->1796|3042->1854|3071->1855|3104->1861|3400->2130|3428->2131|3984->2660|4007->2674|4020->2678|4064->2684|4114->2706|4155->2720|4170->2726|4224->2759|4254->2762|4290->2788|4330->2789|4374->2801|4404->2803|4417->2806|4442->2809|4501->2837|4547->2855|5024->3305|5039->3311|5080->3331|5779->4003|5805->4019|5852->4044|6064->4229|6101->4257|6140->4258|6169->4259|6209->4268|6297->4329|6339->4355|6378->4356|6448->4398|6483->4406|6557->4470|6597->4471|6646->4488|6676->4490|6712->4516|6752->4517|6796->4529|6826->4531|6839->4534|6864->4537|6943->4585|7005->4619|7477->5063|7506->5064|7643->5172|7673->5173|7815->5286|7845->5287|7875->5288|7985->5682|8044->5712|8356->6309|8415->6339|8829->6724|8859->6725|8921->6757|8952->6758|9072->7060|9135->7094|9308->7256|9355->7274|9427->7317|9457->7318|9504->7336|9651->7454|9681->7455|9711->7456|10147->7863|10177->7864|10207->7865|10267->7918|10316->7938|10409->8003|10527->8103|10568->8104|10619->8127|10643->8141|10684->8143|10735->8165|10786->8188|10812->8204|10852->8205|10907->8228|10963->8252|11014->8275|11052->8303|11093->8305|11144->8327|11204->8359|11230->8375|11270->8376|11325->8399|11381->8423|11432->8446|11456->8460|11496->8461|11551->8487|11612->8520|11638->8536|11678->8537|11733->8560|11789->8584|11844->8611|11872->8629|11912->8630|11971->8660|12009->8670|12025->8676|12096->8725|12150->8750|12220->8797|12251->8799|12313->8838|12344->8840|12404->8877|12435->8879|12543->8964|12575->8967|12590->8971|12645->9015|12692->9022|12723->9023|12782->9053|12796->9056|12823->9060|12859->9063|12890->9064|12950->9092|13005->9119|13031->9135|13071->9136|13130->9166|13193->9201|13263->9248|13294->9250|13356->9289|13387->9291|13447->9328|13478->9330|13586->9415|13647->9444|13706->9474|13835->9575|13859->9589|13900->9591|13959->9621|14100->9730|14155->9757|14179->9771|14220->9773|14279->9803|14375->9867|14430->9894|14454->9908|14495->9910|14554->9940|14661->10015|14716->10042|14740->10056|14781->10058|14840->10088|14954->10170|15013->10200|15148->10307|15162->10311|15250->10376|15354->10452|15368->10456|15470->10535|15569->10606|15593->10620|15634->10622|15697->10656|15803->10734|15817->10738|15897->10795|16005->10871|16064->10902|16088->10916|16129->10918|16192->10953|16220->10971|16260->10972|16327->11010|16365->11020|16381->11026|16453->11075|16552->11142|16615->11177|16641->11193|16681->11194|16748->11232|16857->11309|16924->11347|16957->11352|16971->11356|17051->11413|17157->11487|17216->11517|17350->11623|17364->11627|17527->11768|17590->11802|17690->11874|17714->11888|17754->11889|17817->11923|17908->11982|17967->12013|17991->12027|18031->12028|18094->12062|18184->12120|18243->12150|18384->12528|18447->12562|18725->12812|18753->12830|18794->12832|18865->12874|18903->12884|18919->12890|18991->12939|19169->13085|19232->13119|19383->13238|19430->13256|19871->13669|19901->13689|19941->13690|19997->13713|20268->13981|20311->13995|20656->14311|20686->14312|20729->14326|21057->14625|21087->14626|21298->14809|21342->14831|21382->14843|21452->14885|21468->14891|21530->14931|21616->14989|21632->14995|21700->15041|21786->15099|21802->15105|21860->15141|21946->15199|21962->15205|22023->15244|22109->15302|22125->15308|22208->15369|22294->15427|22310->15433|22365->15466|22415->15488|22456->15507|22492->15515
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|44->23|45->24|50->29|51->30|52->31|52->31|53->32|58->37|58->37|70->49|70->49|70->49|70->49|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|72->51|73->52|85->64|85->64|85->64|98->77|98->77|98->77|101->80|101->80|101->80|101->80|101->80|102->81|102->81|102->81|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|104->83|105->84|116->95|116->95|116->95|116->95|116->95|116->95|116->95|118->103|119->104|123->113|124->114|130->120|130->120|130->120|130->120|132->125|133->126|140->133|141->134|141->134|141->134|142->135|143->136|143->136|143->136|149->142|149->142|149->142|150->143|152->145|153->146|153->146|153->146|154->147|154->147|154->147|155->148|155->148|155->148|155->148|155->148|156->149|157->150|157->150|157->150|158->151|158->151|158->151|158->151|158->151|159->152|160->153|160->153|160->153|161->154|161->154|161->154|161->154|161->154|162->155|163->156|163->156|163->156|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|165->158|166->159|166->159|166->159|167->160|167->160|167->160|167->160|167->160|167->160|167->160|167->160|167->160|168->161|169->162|171->164|171->164|171->164|172->165|174->167|175->168|175->168|175->168|176->169|177->170|178->171|178->171|178->171|179->172|180->173|181->174|181->174|181->174|182->175|183->176|184->177|185->178|185->178|185->178|186->179|186->179|186->179|188->181|188->181|188->181|189->182|190->183|190->183|190->183|192->185|193->186|193->186|193->186|194->187|194->187|194->187|195->188|195->188|195->188|195->188|196->189|197->190|197->190|197->190|198->191|199->192|200->193|200->193|200->193|200->193|202->195|203->196|205->198|205->198|207->200|208->201|210->203|210->203|210->203|211->204|212->205|213->206|213->206|213->206|214->207|215->208|216->209|218->211|219->212|224->217|224->217|224->217|225->218|225->218|225->218|225->218|227->220|228->221|232->225|233->226|243->236|243->236|243->236|243->236|252->245|253->246|258->251|258->251|259->252|263->256|263->256|275->268|275->268|277->270|280->273|280->273|280->273|281->274|281->274|281->274|282->275|282->275|282->275|283->276|283->276|283->276|284->277|284->277|284->277|285->278|285->278|285->278|286->279|286->279|288->281
                  -- GENERATED --
              */
          