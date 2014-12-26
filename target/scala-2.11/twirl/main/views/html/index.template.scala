
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Seq[io.prismic.Document],Seq[io.prismic.Document],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: Seq[io.prismic.Document], authors: Seq[io.prismic.Document])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import Html._

Seq[Any](format.raw/*1.101*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Информационно-аналитический молодежный портал", Option("big"), Option(posts.take(1).head), Option(authors))/*5.115*/{_display_(Seq[Any](format.raw/*5.116*/("""
    """),format.raw/*6.5*/("""<section class="dg-feed">
        <div class="container">
            <div class="dg-feed__filter">
                <p class="dg-feed__filter__choose">Выберите раздел</p>
                <dl class="dg-feed_filter__section dropdown">
                    <dt><a><span class="dg-feed_filter__section__content">ВСЕ РАЗДЕЛЫ</span><span class="icon-arrow-down"></span></a></dt>
                    <dd>
                        <ul>
                            <li><a class="default">Все разделы</a></li>
                            <li><a>Известия</a></li>
                            <li><a>К.О.Н.</a></li>
                            <li><a>Смысловое взаимодействие</a></li>
                            <li><a>Хранилище образов</a></li>
                            <li><a>Домостроительство</a></li>
                            <li><a>Преображение действительности</a></li>
                            <li><a>Сетевое добровольчество</a></li>
                            <li><a>Властеправие</a></li>
                            <li><a>Мировоззрение</a></li>
                        </ul>
                    </dd>
                </dl>
            </div>

            <div class="dg-feed__social">

                <ul>
                    <li>
                        <a href="#" class="dg-feed__social__twitter">
                            <div class="social-peoples social-twitter">1 568</div>
                            <span class="twitter-icon"></span>
                        </a>
                    </li>

                    <li>
                        <a href="#" class="dg-feed__social__facebook">
                            <div class="social-peoples social-facebook">1 568</div>
                            <span class="facebook-icon"></span>
                        </a>
                    </li>

                    <li>
                        <a href="#" class="dg-feed__social__vkontakte">
                            <div class="social-peoples social-vkontakte">10 870</div>
                            <span class="vkontakte-icon"></span>
                        </a>
                    </li>
                </ul>

            </div>
        </div>

        <div class="container-metro dg-feed__content">
                    """),_display_(/*58.22*/for((post, count) <- posts.zipWithIndex) yield /*58.62*/{_display_(Seq[Any](format.raw/*58.63*/("""
                        """),_display_(/*59.26*/if(count == 0)/*59.40*/ {_display_(Seq[Any](format.raw/*59.42*/("""
                            """),format.raw/*60.29*/("""<div class="box-6col">
                                <a href=""""),_display_(/*61.43*/routes/*61.49*/.Application.blogPost(post.id, post.slug)),format.raw/*61.90*/("""" class="dg-feed__image box-6col-imgwrapper" """),_display_(/*61.136*/post/*61.140*/.getImage("blog.image", "postthumb").map/*61.180*/ {img =>_display_(Seq[Any](format.raw/*61.188*/(""" """),format.raw/*61.189*/("""style="background-image: url("""),_display_(/*61.219*/img/*61.222*/.url),format.raw/*61.226*/(""")""")))}),format.raw/*61.228*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                                </a>
                                <div class="clear"></div>
                                <div class="dg-feed__info">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*67.81*/post/*67.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*67.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*68.79*/post/*68.83*/.getText("blog.body").map/*68.108*/{text =>_display_(Seq[Any](format.raw/*68.116*/(""" """),_display_(/*68.118*/{text.length/900})))}),format.raw/*68.136*/(""" """),format.raw/*68.137*/("""мин</p>
                                    </div>
                                    <div class="dg-feed__info__header">
                                        <h2>"""),_display_(/*71.46*/post/*71.50*/.getText("blog.title").map/*71.76*/{title =>_display_(Seq[Any](format.raw/*71.85*/(""" """),_display_(/*71.87*/title)))}),format.raw/*71.93*/("""</h2>
                                    </div>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                        """),_display_(/*75.42*/post/*75.46*/.tags.map/*75.55*/ { tag =>_display_(Seq[Any](format.raw/*75.64*/("""
                                            """),format.raw/*76.45*/("""<li>#"""),_display_(/*76.51*/tag),format.raw/*76.54*/("""</li>
                                        """)))}),format.raw/*77.42*/("""
                                        """),format.raw/*78.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-white">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--repost">15</a>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like">117</a>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--comment">7</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*94.26*/("""
                        """),_display_(/*95.26*/if(count == 1)/*95.40*/ {_display_(Seq[Any](format.raw/*95.42*/("""
                            """),format.raw/*96.29*/("""<div class="box-6col-horizont">
                                <a href=""""),_display_(/*97.43*/routes/*97.49*/.Application.blogPost(post.id, post.slug)),format.raw/*97.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper feed--arrow" """),_display_(/*97.157*/post/*97.161*/.getImage("blog.image", "postthumb").map/*97.201*/ {img =>_display_(Seq[Any](format.raw/*97.209*/(""" """),format.raw/*97.210*/("""style="background-image: url("""),_display_(/*97.240*/img/*97.243*/.url),format.raw/*97.247*/(""")""")))}),format.raw/*97.249*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*103.81*/post/*103.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*103.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*104.79*/post/*104.83*/.getText("blog.body").map/*104.108*/{text =>_display_(Seq[Any](format.raw/*104.116*/(""" """),_display_(/*104.118*/{text.length/900})))}),format.raw/*104.136*/(""" """),format.raw/*104.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*106.47*/routes/*106.53*/.Application.blogPost(post.id, post.slug)),format.raw/*106.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*107.46*/post/*107.50*/.getText("blog.title").map/*107.76*/{title =>_display_(Seq[Any](format.raw/*107.85*/(""" """),_display_(/*107.87*/title)))}),format.raw/*107.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*111.46*/post/*111.50*/.tags.map/*111.59*/ { tag =>_display_(Seq[Any](format.raw/*111.68*/("""
                                                """),format.raw/*112.49*/("""<li>#"""),_display_(/*112.55*/tag),format.raw/*112.58*/("""</li>
                                            """)))}),format.raw/*113.46*/("""
                                        """),format.raw/*114.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--repost">15</a>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like">117</a>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--comment">7</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*130.26*/("""
                        """),_display_(/*131.26*/if(count == 2)/*131.40*/ {_display_(Seq[Any](format.raw/*131.42*/("""
                            """),format.raw/*132.29*/("""<div class="box-6col-horizont">

                                <a href=""""),_display_(/*134.43*/routes/*134.49*/.Application.blogPost(post.id, post.slug)),format.raw/*134.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box--left feed--arrow" """),_display_(/*134.167*/post/*134.171*/.getImage("blog.image", "postthumb").map/*134.211*/ {img =>_display_(Seq[Any](format.raw/*134.219*/(""" """),format.raw/*134.220*/("""style="background-image: url("""),_display_(/*134.250*/img/*134.253*/.url),format.raw/*134.257*/(""")""")))}),format.raw/*134.259*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box--right">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*140.81*/post/*140.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*140.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*141.79*/post/*141.83*/.getText("blog.body").map/*141.108*/{text =>_display_(Seq[Any](format.raw/*141.116*/(""" """),_display_(/*141.118*/{text.length/900})))}),format.raw/*141.136*/(""" """),format.raw/*141.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*143.47*/routes/*143.53*/.Application.blogPost(post.id, post.slug)),format.raw/*143.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*144.46*/post/*144.50*/.getText("blog.title").map/*144.76*/{title =>_display_(Seq[Any](format.raw/*144.85*/(""" """),_display_(/*144.87*/title)))}),format.raw/*144.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*148.46*/post/*148.50*/.tags.map/*148.59*/ { tag =>_display_(Seq[Any](format.raw/*148.68*/("""
                                                """),format.raw/*149.49*/("""<li>#"""),_display_(/*149.55*/tag),format.raw/*149.58*/("""</li>
                                            """)))}),format.raw/*150.46*/("""
                                        """),format.raw/*151.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--repost">15</a>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like">117</a>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--comment">7</a>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        """)))}),format.raw/*168.26*/("""
                        """),_display_(/*169.26*/if(count == 3)/*169.40*/ {_display_(Seq[Any](format.raw/*169.42*/("""
                            """),format.raw/*170.29*/("""<div class="box-12col-horizont">

                                <a href=""""),_display_(/*172.43*/routes/*172.49*/.Application.blogPost(post.id, post.slug)),format.raw/*172.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box-3col-horizont-imgwrapper feed--arrow" """),_display_(/*172.186*/post/*172.190*/.getImage("blog.image", "postthumb").map/*172.230*/ {img =>_display_(Seq[Any](format.raw/*172.238*/(""" """),format.raw/*172.239*/("""style="background-image: url("""),_display_(/*172.269*/img/*172.272*/.url),format.raw/*172.276*/(""")""")))}),format.raw/*172.278*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box-9col-horizont">

                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*179.81*/post/*179.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*179.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*180.79*/post/*180.83*/.getText("blog.body").map/*180.108*/{text =>_display_(Seq[Any](format.raw/*180.116*/(""" """),_display_(/*180.118*/{text.length/900})))}),format.raw/*180.136*/(""" """),format.raw/*180.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*182.47*/routes/*182.53*/.Application.blogPost(post.id, post.slug)),format.raw/*182.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*183.46*/post/*183.50*/.getText("blog.title").map/*183.76*/{title =>_display_(Seq[Any](format.raw/*183.85*/(""" """),_display_(/*183.87*/title)))}),format.raw/*183.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*187.46*/post/*187.50*/.tags.map/*187.59*/ { tag =>_display_(Seq[Any](format.raw/*187.68*/("""
                                                """),format.raw/*188.49*/("""<li>#"""),_display_(/*188.55*/tag),format.raw/*188.58*/("""</li>
                                            """)))}),format.raw/*189.46*/("""
                                        """),format.raw/*190.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">

                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--repost">15</a>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like">117</a>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--comment">7</a>
                                        </li>
                                    </ul>

                                </div>
                            </div>
                        """)))}),format.raw/*208.26*/("""
                    """)))}),format.raw/*209.22*/("""
            """),format.raw/*210.13*/("""</div>

            <div class="clear"></div>

            <div class="dg-feed__btn-wrapper">
                <a class="dg-feed__btn" href="#">
                    <span class="load-icon"></span>
                    <span>ЕЩЕ СТАТЬИ</span>
                </a>
            </div>

        <div class="clear"></div>
    </section>
""")))}),format.raw/*223.2*/("""
"""))}
  }

  def render(posts:Seq[io.prismic.Document],authors:Seq[io.prismic.Document],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,authors)(ctx)

  def f:((Seq[io.prismic.Document],Seq[io.prismic.Document]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,authors) => (ctx) => apply(posts,authors)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Dec 27 02:32:31 MSK 2014
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/Diapost/app/views/index.scala.html
                  HASH: 689feaa4bb3f26f8c595b0014427a606f845437a
                  MATRIX: 564->1|765->100|793->117|820->119|942->232|981->233|1012->238|3287->2486|3343->2526|3382->2527|3435->2553|3458->2567|3498->2569|3555->2598|3647->2663|3662->2669|3724->2710|3798->2756|3812->2760|3862->2800|3909->2808|3939->2809|3997->2839|4010->2842|4036->2846|4070->2848|4482->3233|4495->3237|4561->3281|4671->3364|4684->3368|4719->3393|4766->3401|4796->3403|4839->3421|4869->3422|5064->3590|5077->3594|5112->3620|5159->3629|5188->3631|5218->3637|5450->3842|5463->3846|5481->3855|5528->3864|5601->3909|5634->3915|5658->3918|5736->3965|5805->4006|6741->4911|6794->4937|6817->4951|6857->4953|6914->4982|7015->5056|7030->5062|7092->5103|7187->5170|7201->5174|7251->5214|7298->5222|7328->5223|7386->5253|7399->5256|7425->5260|7459->5262|7829->5604|7843->5608|7910->5652|8021->5735|8035->5739|8071->5764|8119->5772|8150->5774|8194->5792|8225->5793|8350->5890|8366->5896|8429->5937|8535->6015|8549->6019|8585->6045|8633->6054|8663->6056|8694->6062|8929->6269|8943->6273|8962->6282|9010->6291|9088->6340|9122->6346|9147->6349|9230->6400|9300->6441|10236->7345|10290->7371|10314->7385|10355->7387|10413->7416|10516->7491|10532->7497|10595->7538|10701->7615|10716->7619|10767->7659|10815->7667|10846->7668|10905->7698|10919->7701|10946->7705|10981->7707|11362->8060|11376->8064|11443->8108|11554->8191|11568->8195|11604->8220|11652->8228|11683->8230|11727->8248|11758->8249|11883->8346|11899->8352|11962->8393|12068->8471|12082->8475|12118->8501|12166->8510|12196->8512|12227->8518|12462->8725|12476->8729|12495->8738|12543->8747|12621->8796|12655->8802|12680->8805|12763->8856|12833->8897|13770->9802|13824->9828|13848->9842|13889->9844|13947->9873|14051->9949|14067->9955|14130->9996|14255->10092|14270->10096|14321->10136|14369->10144|14400->10145|14459->10175|14473->10178|14500->10182|14535->10184|14924->10545|14938->10549|15005->10593|15116->10676|15130->10680|15166->10705|15214->10713|15245->10715|15289->10733|15320->10734|15445->10831|15461->10837|15524->10878|15630->10956|15644->10960|15680->10986|15728->10995|15758->10997|15789->11003|16024->11210|16038->11214|16057->11223|16105->11232|16183->11281|16217->11287|16242->11290|16325->11341|16395->11382|17333->12288|17387->12310|17429->12323|17791->12654
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|78->58|78->58|78->58|79->59|79->59|79->59|80->60|81->61|81->61|81->61|81->61|81->61|81->61|81->61|81->61|81->61|81->61|81->61|81->61|87->67|87->67|87->67|88->68|88->68|88->68|88->68|88->68|88->68|88->68|91->71|91->71|91->71|91->71|91->71|91->71|95->75|95->75|95->75|95->75|96->76|96->76|96->76|97->77|98->78|114->94|115->95|115->95|115->95|116->96|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|123->103|123->103|123->103|124->104|124->104|124->104|124->104|124->104|124->104|124->104|126->106|126->106|126->106|127->107|127->107|127->107|127->107|127->107|127->107|131->111|131->111|131->111|131->111|132->112|132->112|132->112|133->113|134->114|150->130|151->131|151->131|151->131|152->132|154->134|154->134|154->134|154->134|154->134|154->134|154->134|154->134|154->134|154->134|154->134|154->134|160->140|160->140|160->140|161->141|161->141|161->141|161->141|161->141|161->141|161->141|163->143|163->143|163->143|164->144|164->144|164->144|164->144|164->144|164->144|168->148|168->148|168->148|168->148|169->149|169->149|169->149|170->150|171->151|188->168|189->169|189->169|189->169|190->170|192->172|192->172|192->172|192->172|192->172|192->172|192->172|192->172|192->172|192->172|192->172|192->172|199->179|199->179|199->179|200->180|200->180|200->180|200->180|200->180|200->180|200->180|202->182|202->182|202->182|203->183|203->183|203->183|203->183|203->183|203->183|207->187|207->187|207->187|207->187|208->188|208->188|208->188|209->189|210->190|228->208|229->209|230->210|243->223
                  -- GENERATED --
              */
          