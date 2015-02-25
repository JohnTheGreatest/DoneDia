
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
                                <div class="fb-like" data-href="http://www.diapost.ru/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
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
                  DATE: Tue Feb 24 17:37:59 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/post/posts.scala.html
                  HASH: 0b8e970b564b369dd7044de1fd3b4cb8b9271c94
                  MATRIX: 604->1|853->161|883->165|1328->583|1365->599|1394->600|1920->1099|1935->1105|1988->1137|2058->1180|2073->1186|2128->1220|2197->1262|2212->1268|2270->1305|2323->1331|2338->1337|2414->1392|2476->1427|2491->1433|2565->1486|2641->1546|2683->1560|2923->1790|2956->1796|3042->1854|3071->1855|3104->1861|3400->2130|3428->2131|3984->2660|4007->2674|4020->2678|4064->2684|4114->2706|4155->2720|4170->2726|4224->2759|4254->2762|4290->2788|4330->2789|4374->2801|4404->2803|4417->2806|4442->2809|4501->2837|4547->2855|5024->3305|5039->3311|5080->3331|5780->4004|5806->4020|5853->4045|6065->4230|6102->4258|6141->4259|6170->4260|6210->4269|6298->4330|6340->4356|6379->4357|6449->4399|6484->4407|6558->4471|6598->4472|6647->4489|6677->4491|6713->4517|6753->4518|6797->4530|6827->4532|6840->4535|6865->4538|6944->4586|7006->4620|7478->5064|7507->5065|7644->5173|7674->5174|7816->5287|7846->5288|7876->5289|7986->5683|8045->5713|8334->6287|8393->6317|8807->6702|8837->6703|8899->6735|8930->6736|9050->7038|9113->7072|9286->7234|9333->7252|9405->7295|9435->7296|9482->7314|9629->7432|9659->7433|9689->7434|10125->7841|10155->7842|10185->7843|10245->7896|10294->7916|10387->7981|10505->8081|10546->8082|10597->8105|10621->8119|10662->8121|10713->8143|10764->8166|10790->8182|10830->8183|10885->8206|10941->8230|10992->8253|11030->8281|11071->8283|11122->8305|11182->8337|11208->8353|11248->8354|11303->8377|11359->8401|11410->8424|11434->8438|11474->8439|11529->8465|11590->8498|11616->8514|11656->8515|11711->8538|11767->8562|11822->8589|11850->8607|11890->8608|11949->8638|11987->8648|12003->8654|12074->8703|12128->8728|12198->8775|12229->8777|12291->8816|12322->8818|12382->8855|12413->8857|12521->8942|12553->8945|12568->8949|12623->8993|12670->9000|12701->9001|12760->9031|12774->9034|12801->9038|12837->9041|12868->9042|12928->9070|12983->9097|13009->9113|13049->9114|13108->9144|13171->9179|13241->9226|13272->9228|13334->9267|13365->9269|13425->9306|13456->9308|13564->9393|13625->9422|13684->9452|13813->9553|13837->9567|13878->9569|13937->9599|14078->9708|14133->9735|14157->9749|14198->9751|14257->9781|14353->9845|14408->9872|14432->9886|14473->9888|14532->9918|14639->9993|14694->10020|14718->10034|14759->10036|14818->10066|14932->10148|14991->10178|15126->10285|15140->10289|15228->10354|15332->10430|15346->10434|15448->10513|15547->10584|15571->10598|15612->10600|15675->10634|15781->10712|15795->10716|15875->10773|15983->10849|16042->10880|16066->10894|16107->10896|16170->10931|16198->10949|16238->10950|16305->10988|16343->10998|16359->11004|16431->11053|16530->11120|16593->11155|16619->11171|16659->11172|16726->11210|16835->11287|16902->11325|16935->11330|16949->11334|17029->11391|17135->11465|17194->11495|17328->11601|17342->11605|17505->11746|17568->11780|17668->11852|17692->11866|17732->11867|17795->11901|17886->11960|17945->11991|17969->12005|18009->12006|18072->12040|18162->12098|18221->12128|18362->12506|18425->12540|18703->12790|18731->12808|18772->12810|18843->12852|18881->12862|18897->12868|18969->12917|19147->13063|19210->13097|19361->13216|19408->13234|19849->13647|19879->13667|19919->13668|19975->13691|20246->13959|20289->13973|20634->14289|20664->14290|20707->14304|21035->14603|21065->14604|21276->14787|21320->14809|21360->14821|21430->14863|21446->14869|21508->14909|21594->14967|21610->14973|21678->15019|21764->15077|21780->15083|21838->15119|21924->15177|21940->15183|22001->15222|22087->15280|22103->15286|22186->15347|22272->15405|22288->15411|22343->15444|22393->15466|22434->15485|22470->15493
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|44->23|45->24|50->29|51->30|52->31|52->31|53->32|58->37|58->37|70->49|70->49|70->49|70->49|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|72->51|73->52|85->64|85->64|85->64|98->77|98->77|98->77|101->80|101->80|101->80|101->80|101->80|102->81|102->81|102->81|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|104->83|105->84|116->95|116->95|116->95|116->95|116->95|116->95|116->95|118->103|119->104|123->113|124->114|130->120|130->120|130->120|130->120|132->125|133->126|140->133|141->134|141->134|141->134|142->135|143->136|143->136|143->136|149->142|149->142|149->142|150->143|152->145|153->146|153->146|153->146|154->147|154->147|154->147|155->148|155->148|155->148|155->148|155->148|156->149|157->150|157->150|157->150|158->151|158->151|158->151|158->151|158->151|159->152|160->153|160->153|160->153|161->154|161->154|161->154|161->154|161->154|162->155|163->156|163->156|163->156|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|165->158|166->159|166->159|166->159|167->160|167->160|167->160|167->160|167->160|167->160|167->160|167->160|167->160|168->161|169->162|171->164|171->164|171->164|172->165|174->167|175->168|175->168|175->168|176->169|177->170|178->171|178->171|178->171|179->172|180->173|181->174|181->174|181->174|182->175|183->176|184->177|185->178|185->178|185->178|186->179|186->179|186->179|188->181|188->181|188->181|189->182|190->183|190->183|190->183|192->185|193->186|193->186|193->186|194->187|194->187|194->187|195->188|195->188|195->188|195->188|196->189|197->190|197->190|197->190|198->191|199->192|200->193|200->193|200->193|200->193|202->195|203->196|205->198|205->198|207->200|208->201|210->203|210->203|210->203|211->204|212->205|213->206|213->206|213->206|214->207|215->208|216->209|218->211|219->212|224->217|224->217|224->217|225->218|225->218|225->218|225->218|227->220|228->221|232->225|233->226|243->236|243->236|243->236|243->236|252->245|253->246|258->251|258->251|259->252|263->256|263->256|275->268|275->268|277->270|280->273|280->273|280->273|281->274|281->274|281->274|282->275|282->275|282->275|283->276|283->276|283->276|284->277|284->277|284->277|285->278|285->278|285->278|286->279|286->279|288->281
                  -- GENERATED --
              */
          