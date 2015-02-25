
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
                  DATE: Thu Feb 26 00:49:19 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/post/posts.scala.html
                  HASH: 6c5212d87db7b406f645fb486b04bccf17fde9fc
                  MATRIX: 604->1|853->161|881->163|1318->573|1355->589|1384->590|1905->1084|1920->1090|1973->1122|2042->1164|2057->1170|2112->1204|2180->1245|2195->1251|2253->1288|2305->1313|2320->1319|2396->1374|2457->1408|2472->1414|2546->1467|2619->1524|2660->1537|2895->1762|2927->1767|3012->1824|3041->1825|3073->1830|3364->2094|3392->2095|3936->2612|3959->2626|3972->2630|4016->2636|4065->2657|4106->2671|4121->2677|4175->2710|4205->2713|4241->2739|4281->2740|4325->2752|4355->2754|4368->2757|4393->2760|4451->2787|4496->2804|4961->3242|4976->3248|5017->3268|5704->3928|5730->3944|5777->3969|5986->4151|6023->4179|6062->4180|6091->4181|6131->4190|6218->4250|6260->4276|6299->4277|6368->4318|6403->4326|6477->4390|6517->4391|6566->4408|6596->4410|6632->4436|6672->4437|6716->4449|6746->4451|6759->4454|6784->4457|6862->4504|6923->4537|7384->4970|7413->4971|7550->5079|7580->5080|7722->5193|7752->5194|7782->5195|7890->5581|7948->5610|8233->6175|8291->6204|8699->6583|8729->6584|8791->6616|8822->6617|8940->6914|9002->6947|9168->7102|9214->7119|9286->7162|9316->7163|9362->7180|9508->7297|9538->7298|9568->7299|9998->7700|10028->7701|10058->7702|10117->7754|10164->7772|10256->7836|10374->7936|10415->7937|10465->7959|10489->7973|10530->7975|10580->7996|10631->8019|10657->8035|10697->8036|10752->8059|10807->8082|10857->8104|10895->8132|10936->8134|10986->8155|11046->8187|11072->8203|11112->8204|11167->8227|11222->8250|11272->8272|11296->8286|11336->8287|11390->8312|11451->8345|11477->8361|11517->8362|11572->8385|11627->8408|11681->8434|11709->8452|11749->8453|11807->8482|11845->8492|11861->8498|11932->8547|11986->8572|12056->8619|12087->8621|12149->8660|12180->8662|12240->8699|12271->8701|12379->8786|12411->8789|12426->8793|12481->8837|12528->8844|12559->8845|12618->8875|12632->8878|12659->8882|12695->8885|12726->8886|12785->8913|12839->8939|12865->8955|12905->8956|12963->8985|13026->9020|13096->9067|13127->9069|13189->9108|13220->9110|13280->9147|13311->9149|13419->9234|13479->9262|13537->9291|13664->9390|13688->9404|13729->9406|13787->9435|13926->9542|13980->9568|14004->9582|14045->9584|14103->9613|14198->9676|14252->9702|14276->9716|14317->9718|14375->9747|14481->9821|14535->9847|14559->9861|14600->9863|14658->9892|14771->9973|14829->10002|14963->10108|14977->10112|15065->10177|15168->10252|15182->10256|15284->10335|15381->10404|15405->10418|15446->10420|15508->10453|15613->10530|15627->10534|15707->10591|15813->10665|15871->10695|15895->10709|15936->10711|15998->10745|16026->10763|16066->10764|16132->10801|16170->10811|16186->10817|16258->10866|16356->10932|16418->10966|16444->10982|16484->10983|16550->11020|16658->11096|16724->11133|16757->11138|16771->11142|16851->11199|16955->11271|17013->11300|17145->11404|17159->11408|17320->11547|17382->11580|17480->11650|17504->11664|17544->11665|17606->11698|17696->11756|17754->11786|17778->11800|17818->11801|17880->11834|17969->11891|18027->11920|18166->12296|18228->12329|18501->12574|18529->12592|18570->12594|18640->12635|18678->12645|18694->12651|18766->12700|18942->12844|19004->12877|19151->12992|19197->13009|19628->13412|19658->13432|19698->13433|19754->13456|20016->13715|20058->13728|20398->14039|20428->14040|20470->14053|20794->14348|20824->14349|21023->14520|21067->14542|21105->14552|21172->14591|21188->14597|21250->14637|21335->14694|21351->14700|21419->14746|21504->14803|21520->14809|21578->14845|21663->14902|21679->14908|21740->14947|21825->15004|21841->15010|21924->15071|22009->15128|22025->15134|22080->15167|22129->15188|22170->15207|22204->15213
                  LINES: 19->1|22->1|24->3|32->11|32->11|32->11|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|44->23|45->24|50->29|51->30|52->31|52->31|53->32|58->37|58->37|70->49|70->49|70->49|70->49|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|71->50|72->51|73->52|85->64|85->64|85->64|98->77|98->77|98->77|101->80|101->80|101->80|101->80|101->80|102->81|102->81|102->81|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|103->82|104->83|105->84|116->95|116->95|116->95|116->95|116->95|116->95|116->95|118->103|119->104|123->113|124->114|130->120|130->120|130->120|130->120|132->125|133->126|140->133|141->134|141->134|141->134|142->135|143->136|143->136|143->136|149->142|149->142|149->142|150->143|152->145|153->146|153->146|153->146|154->147|154->147|154->147|155->148|155->148|155->148|155->148|155->148|156->149|157->150|157->150|157->150|158->151|158->151|158->151|158->151|158->151|159->152|160->153|160->153|160->153|161->154|161->154|161->154|161->154|161->154|162->155|163->156|163->156|163->156|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|164->157|165->158|166->159|166->159|166->159|167->160|167->160|167->160|167->160|167->160|167->160|167->160|167->160|167->160|168->161|169->162|171->164|171->164|171->164|172->165|174->167|175->168|175->168|175->168|176->169|177->170|178->171|178->171|178->171|179->172|180->173|181->174|181->174|181->174|182->175|183->176|184->177|185->178|185->178|185->178|186->179|186->179|186->179|188->181|188->181|188->181|189->182|190->183|190->183|190->183|192->185|193->186|193->186|193->186|194->187|194->187|194->187|195->188|195->188|195->188|195->188|196->189|197->190|197->190|197->190|198->191|199->192|200->193|200->193|200->193|200->193|202->195|203->196|205->198|205->198|207->200|208->201|210->203|210->203|210->203|211->204|212->205|213->206|213->206|213->206|214->207|215->208|216->209|218->211|219->212|224->217|224->217|224->217|225->218|225->218|225->218|225->218|227->220|228->221|232->225|233->226|243->236|243->236|243->236|243->236|252->245|253->246|258->251|258->251|259->252|263->256|263->256|275->268|275->268|277->270|280->273|280->273|280->273|281->274|281->274|281->274|282->275|282->275|282->275|283->276|283->276|283->276|284->277|284->277|284->277|285->278|285->278|285->278|286->279|286->279|288->281
                  -- GENERATED --
              */
          