
package views.html

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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,Option[String],Option[io.prismic.Document],Option[Seq[io.prismic.Document]],collection.immutable.ListMap[String, String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, typeOfHeader: Option[String], post: Option[io.prismic.Document], authors: Option[Seq[io.prismic.Document]],  blogCategories: collection.immutable.ListMap[String,String])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.202*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>"""),_display_(/*10.17*/title),format.raw/*10.22*/(""" """),format.raw/*10.23*/("""- Диапост.ру</title>
        <meta name="description" content="Диапост - это неожиданный ракурс, когда мы говорим на современном языке о вечных ценностях: вере, любви, семье, Родине, правде, справедливости, братстве.">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- ADD all SEO meta and OpenGraph -->
        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.at("stylesheets/main.css")),format.raw/*15.79*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.at("stylesheets/animate.css")),format.raw/*16.82*/("""">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js")),format.raw/*17.84*/(""""></script>
        
        """),format.raw/*19.21*/("""
            """),format.raw/*20.13*/("""<!-- Put this script tag to the <head> of your page -->
        <script type="text/javascript" src="http://vk.com/js/api/share.js?90" charset="windows-1251"></script>
        
    </head>
    <body>
        
        """),format.raw/*26.27*/("""
    """),format.raw/*27.5*/("""<div id="fb-root"></div>
    <script>(function(d, s, id) """),format.raw/*28.33*/("""{"""),format.raw/*28.34*/("""
    """),format.raw/*29.5*/("""var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=796700970371157&version=v2.0";
    fjs.parentNode.insertBefore(js, fjs);
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/("""(document, 'script', 'facebook-jssdk'));</script>
        
        
            <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <div class="delimeter-rus"></div>

        <div id="content-layer">

            <nav class="mobile-nav">
                <ul>
                    <li><a href=""""),_display_(/*47.35*/routes/*47.41*/.Application.about()),format.raw/*47.61*/("""">О проекте</a></li>
                    <li><a href=""""),_display_(/*48.35*/routes/*48.41*/.Application.blogCategory("")),format.raw/*48.70*/("""">Статьи</a></li>
                    <!--<li><a href="#">Авторы</a></li>-->
                </ul>
            </nav>

        </div>

        <div class="main">

            <div class="hamburger-wrapper">
                <div id="hamburger">
                    <div></div>
                    <div></div>
                    <div></div>
                </div>
            </div>

            <header class="dg-header">
                <div class="container">
                    <div class="logo-wrapper">
                        <a href=""""),_display_(/*68.35*/routes/*68.41*/.Application.index()),format.raw/*68.61*/("""" class="logo">
                            <p class="logo__name">ДИАПОСТ</p>
                            <h1 class="logo__descr">Информационно-аналитический<br/>молодежный портал</h1>
                        </a>
                    </div>

                    <nav class="topmenu">
                        <ul>
                            <li><a href=""""),_display_(/*76.43*/routes/*76.49*/.Application.about()),format.raw/*76.69*/("""">О ПРОЕКТЕ</a></li>
                            <li><a href=""""),_display_(/*77.43*/routes/*77.49*/.Application.blogCategory("")),format.raw/*77.78*/("""">СТАТЬИ</a></li>
                            <!--<li><a href="#">АВТОРЫ</a></li>
                            <li><a href="#">ПОИСК</a><span class="search-icon"></span></li>-->
                            <!--<li><a href="#">ВОЙТИ</a><span class="person-icon"></span></li>-->
                        </ul>
                    </nav>

                    <!--<a class="button button-flat-primary dg-header__btn" href="#">ИЩЕМ АВТОРОВ</a>-->
                    <div class="dg-header__btn social-btns">
                        <ul>
                            <li>
                                <a href="http://vk.com/diapost" target="_blank" class="vkontakte-icon"></a>
                            </li>
                            <li>
                                <a href="#" class="facebook-icon"></a>
                            </li>
                            <li>
                                <a href="#" class="twitter-icon"></a>
                            </li>
                        </ul>
                    </div>

                </div>

            </header>

            """),_display_(/*103.14*/if(typeOfHeader.getOrElse("big").equals("big"))/*103.61*/ {_display_(Seq[Any](format.raw/*103.63*/("""
                """),_display_(/*104.18*/post/*104.22*/.map/*104.26*/{post =>_display_(Seq[Any](format.raw/*104.34*/("""
                    """),format.raw/*105.21*/("""<section  class="dg-banner">
                        <div id="layerslider" style="width: 100%; height: 500px;">
                            <div class="ls-layer" rel="slidedelay: 3000; slidedirection: right;" """),_display_(/*107.99*/post/*107.103*/.getImage("blog.image", "main").map/*107.138*/{img =>_display_(Seq[Any](format.raw/*107.145*/(""" """),format.raw/*107.146*/("""style="background-image: url("""),_display_(/*107.176*/img/*107.179*/.url),format.raw/*107.183*/(""")""")))}),format.raw/*107.185*/("""; background-position: top center">
                                <div class="container">
                                    <div class="dg-banner__info">
                                        <h2 class="dg-banner__info__header">"""),_display_(/*110.78*/post/*110.82*/.getText("blog.title").map/*110.108*/{title =>_display_(Seq[Any](format.raw/*110.117*/(""" """),_display_(/*110.119*/title)))}),format.raw/*110.125*/("""</h2>
                                        <div class="dg-banner__info__util">
                                            <p class="dg-banner__info__util__section">"""),_display_(/*112.88*/post/*112.92*/.getText("blog.category").getOrElse("Общая")),format.raw/*112.136*/("""</p>
                                            <div class="dg-banner__info__time">
                                                <p class="dg-banner__info__time__content">"""),_display_(/*114.92*/post/*114.96*/.getText("blog.body").map/*114.121*/{text =>_display_(Seq[Any](format.raw/*114.129*/(""" """),_display_(/*114.131*/{text.length/900})))}),format.raw/*114.149*/(""" """),format.raw/*114.150*/("""МИН</p>
                                            </div>
                                        </div>
                                        <p class="dg-banner__info__description">"""),_display_(/*117.82*/post/*117.86*/.getText("blog.shortlede").map/*117.116*/{lede =>_display_(Seq[Any](format.raw/*117.124*/(""" """),_display_(/*117.126*/lede)))}),format.raw/*117.131*/("""</p>
                                        <a class="dg-banner__info__btn" href=""""),_display_(/*118.80*/routes/*118.86*/.Application.blogPost(post.id, post.slug)),format.raw/*118.127*/("""">
                                            <span>ЧИТАТЬ</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="dg-banner__bgshadow"></div>
                            </div>
                        </div>
                    </section>
                """)))}),format.raw/*127.18*/("""
            """)))}),format.raw/*128.14*/("""

            """),_display_(/*130.14*/content),format.raw/*130.21*/("""

            """),format.raw/*132.13*/("""<section class="dg-team">
                <div class="container">
                    <ul class="dg-team__content">
                        """),_display_(/*135.26*/authors/*135.33*/.map/*135.37*/{authors =>_display_(Seq[Any](format.raw/*135.48*/("""
                                """),_display_(/*136.34*/authors/*136.41*/.map/*136.45*/{ author =>_display_(Seq[Any](format.raw/*136.56*/("""
                                    """),format.raw/*137.37*/("""<li>
                                        <a class="dg-team__person box-6col-horizont-imgwrapper" style="background-image: url("""),_display_(/*138.127*/author/*138.133*/.getImage("author.image", "main").map/*138.170*/{imgUrl=>_display_(_display_(/*138.180*/imgUrl/*138.186*/.url))}),format.raw/*138.191*/(""")">
                                            <div class="dg-team__person__hover flag">
                                                <span class="flag__body">"""),_display_(/*140.75*/author/*140.81*/.getText("author.full_name").map/*140.113*/{name=>_display_(_display_(/*140.121*/name))}),format.raw/*140.126*/("""</span>
                                            </div>
                                        </a>
                                    </li>
                                """)))}),format.raw/*144.34*/("""
                        """)))}),format.raw/*145.26*/("""
                    """),format.raw/*146.21*/("""</ul>
                </div>
            </section>

            """),_display_(/*150.14*/footer(blogCategories)),format.raw/*150.36*/("""

        """),format.raw/*152.9*/("""</div>

        <script src=""""),_display_(/*154.23*/routes/*154.29*/.Assets.at("javascripts/vendor/jquery-1.10.2.min.js")),format.raw/*154.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*155.23*/routes/*155.29*/.Assets.at("javascripts/jquery.easing.min.js")),format.raw/*155.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*156.23*/routes/*156.29*/.Assets.at("javascripts/hamburger.js")),format.raw/*156.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*157.23*/routes/*157.29*/.Assets.at("javascripts/layerslider.kreaturamedia.jquery.js")),format.raw/*157.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*158.23*/routes/*158.29*/.Assets.at("javascripts/dropkick.min.js")),format.raw/*158.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*159.23*/routes/*159.29*/.Assets.at("javascripts/main.js")),format.raw/*159.62*/(""""></script>

    </body>
</html>
"""))}
  }

  def render(title:String,typeOfHeader:Option[String],post:Option[io.prismic.Document],authors:Option[Seq[io.prismic.Document]],blogCategories:collection.immutable.ListMap[String, String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,typeOfHeader,post,authors,blogCategories)(content)

  def f:((String,Option[String],Option[io.prismic.Document],Option[Seq[io.prismic.Document]],collection.immutable.ListMap[String, String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,typeOfHeader,post,authors,blogCategories) => (content) => apply(title,typeOfHeader,post,authors,blogCategories)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 04:23:40 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/main.scala.html
                  HASH: b380dd46a6554fe2cd0565c0f5e989a198cdf8f5
                  MATRIX: 630->1|919->201|947->203|1392->621|1418->626|1447->627|1945->1098|1960->1104|2015->1138|2084->1180|2099->1186|2157->1223|2210->1249|2225->1255|2301->1310|2360->1353|2402->1367|2652->1607|2685->1613|2771->1671|2800->1672|2833->1678|3129->1947|3157->1948|3671->2435|3686->2441|3727->2461|3810->2517|3825->2523|3875->2552|4465->3115|4480->3121|4521->3141|4911->3504|4926->3510|4967->3530|5058->3594|5073->3600|5123->3629|6275->4753|6332->4800|6373->4802|6420->4821|6434->4825|6448->4829|6495->4837|6546->4859|6786->5071|6801->5075|6847->5110|6894->5117|6925->5118|6984->5148|6998->5151|7025->5155|7060->5157|7326->5395|7340->5399|7377->5425|7426->5434|7457->5436|7489->5442|7688->5613|7702->5617|7769->5661|7975->5839|7989->5843|8025->5868|8073->5876|8104->5878|8148->5896|8179->5897|8397->6087|8411->6091|8452->6121|8500->6129|8531->6131|8562->6136|8675->6221|8691->6227|8755->6268|9176->6657|9223->6672|9268->6689|9297->6696|9342->6712|9514->6856|9531->6863|9545->6867|9595->6878|9658->6913|9675->6920|9689->6924|9739->6935|9806->6973|9967->7105|9984->7111|10032->7148|10072->7158|10089->7164|10119->7169|10313->7335|10329->7341|10372->7373|10410->7381|10440->7386|10655->7569|10714->7596|10765->7618|10863->7688|10907->7710|10947->7722|11007->7754|11023->7760|11098->7813|11184->7871|11200->7877|11268->7923|11354->7981|11370->7987|11430->8025|11516->8083|11532->8089|11615->8150|11701->8208|11717->8214|11780->8255|11866->8313|11882->8319|11937->8352
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|40->19|41->20|47->26|48->27|49->28|49->28|50->29|55->34|55->34|68->47|68->47|68->47|69->48|69->48|69->48|89->68|89->68|89->68|97->76|97->76|97->76|98->77|98->77|98->77|124->103|124->103|124->103|125->104|125->104|125->104|125->104|126->105|128->107|128->107|128->107|128->107|128->107|128->107|128->107|128->107|128->107|131->110|131->110|131->110|131->110|131->110|131->110|133->112|133->112|133->112|135->114|135->114|135->114|135->114|135->114|135->114|135->114|138->117|138->117|138->117|138->117|138->117|138->117|139->118|139->118|139->118|148->127|149->128|151->130|151->130|153->132|156->135|156->135|156->135|156->135|157->136|157->136|157->136|157->136|158->137|159->138|159->138|159->138|159->138|159->138|159->138|161->140|161->140|161->140|161->140|161->140|165->144|166->145|167->146|171->150|171->150|173->152|175->154|175->154|175->154|176->155|176->155|176->155|177->156|177->156|177->156|178->157|178->157|178->157|179->158|179->158|179->158|180->159|180->159|180->159
                  -- GENERATED --
              */
          