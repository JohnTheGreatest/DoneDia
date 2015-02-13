
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
                            <li><a class="default selected">Все разделы</a></li>
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

        """),format.raw/*57.27*/("""
        """),format.raw/*58.9*/("""<script type="text/javascript">(function() """),format.raw/*58.52*/("""{"""),format.raw/*58.53*/("""
        """),format.raw/*59.9*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
        if (window.ifpluso==undefined) """),format.raw/*60.40*/("""{"""),format.raw/*60.41*/(""" """),format.raw/*60.42*/("""window.ifpluso = 1;
        var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
        s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
        s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
        var h=d[g]('body')[0];
        h.appendChild(s);
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/("""}"""),format.raw/*66.11*/(""")();</script>
        """),format.raw/*67.31*/("""
        
        """),format.raw/*69.9*/("""<div class="container-metro dg-feed__content">
                    """),_display_(/*70.22*/for((post, count) <- posts.zipWithIndex) yield /*70.62*/{_display_(Seq[Any](format.raw/*70.63*/("""
                        """),_display_(/*71.26*/if(count == 0)/*71.40*/ {_display_(Seq[Any](format.raw/*71.42*/("""
                            """),format.raw/*72.29*/("""<div class="box-6col">
                                <a href=""""),_display_(/*73.43*/routes/*73.49*/.Application.blogPost(post.id, post.slug)),format.raw/*73.90*/("""" class="dg-feed__image box-6col-imgwrapper" """),_display_(/*73.136*/post/*73.140*/.getImage("blog.image", "postthumb").map/*73.180*/ {img =>_display_(Seq[Any](format.raw/*73.188*/(""" """),format.raw/*73.189*/("""style="background-image: url("""),_display_(/*73.219*/img/*73.222*/.url),format.raw/*73.226*/(""")""")))}),format.raw/*73.228*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                                </a>
                                <div class="clear"></div>
                                <div class="dg-feed__info">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*79.81*/post/*79.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*79.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*80.79*/post/*80.83*/.getText("blog.body").map/*80.108*/{text =>_display_(Seq[Any](format.raw/*80.116*/(""" """),_display_(/*80.118*/{text.length/900})))}),format.raw/*80.136*/(""" """),format.raw/*80.137*/("""мин</p>
                                    </div>
                                    <div class="dg-feed__info__header">
                                        <h2>"""),_display_(/*83.46*/post/*83.50*/.getText("blog.title").map/*83.76*/{title =>_display_(Seq[Any](format.raw/*83.85*/(""" """),_display_(/*83.87*/title)))}),format.raw/*83.93*/("""</h2>
                                    </div>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                        """),_display_(/*87.42*/post/*87.46*/.tags.map/*87.55*/ { tag =>_display_(Seq[Any](format.raw/*87.64*/("""
                                            """),format.raw/*88.45*/("""<li>#"""),_display_(/*88.51*/tag),format.raw/*88.54*/("""</li>
                                        """)))}),format.raw/*89.42*/("""
                                        """),format.raw/*90.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-white">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            <div class="pluso dg-feed__info__actions--repost" data-background="none;" data-options="medium,square,line,horizontal,counter,sepcounter=1,theme=14" data-services="" data-url=""""),_display_(/*95.222*/routes/*95.228*/.Application.blogPost(post.id, post.slug)),format.raw/*95.269*/("""" data-user="1194849155"></div>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*101.55*/routes/*101.61*/.Application.blogPost(post.id, post.slug)),format.raw/*101.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*106.26*/("""
                        """),_display_(/*107.26*/if(count == 1)/*107.40*/ {_display_(Seq[Any](format.raw/*107.42*/("""
                            """),format.raw/*108.29*/("""<div class="box-6col-horizont">
                                <a href=""""),_display_(/*109.43*/routes/*109.49*/.Application.blogPost(post.id, post.slug)),format.raw/*109.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper feed--arrow" """),_display_(/*109.157*/post/*109.161*/.getImage("blog.image", "postthumb").map/*109.201*/ {img =>_display_(Seq[Any](format.raw/*109.209*/(""" """),format.raw/*109.210*/("""style="background-image: url("""),_display_(/*109.240*/img/*109.243*/.url),format.raw/*109.247*/(""")""")))}),format.raw/*109.249*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*115.81*/post/*115.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*115.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*116.79*/post/*116.83*/.getText("blog.body").map/*116.108*/{text =>_display_(Seq[Any](format.raw/*116.116*/(""" """),_display_(/*116.118*/{text.length/900})))}),format.raw/*116.136*/(""" """),format.raw/*116.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*118.47*/routes/*118.53*/.Application.blogPost(post.id, post.slug)),format.raw/*118.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*119.46*/post/*119.50*/.getText("blog.title").map/*119.76*/{title =>_display_(Seq[Any](format.raw/*119.85*/(""" """),_display_(/*119.87*/title)))}),format.raw/*119.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*123.46*/post/*123.50*/.tags.map/*123.59*/ { tag =>_display_(Seq[Any](format.raw/*123.68*/("""
                                                """),format.raw/*124.49*/("""<li>#"""),_display_(/*124.55*/tag),format.raw/*124.58*/("""</li>
                                            """)))}),format.raw/*125.46*/("""
                                        """),format.raw/*126.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            <div class="pluso dg-feed__info__actions--repost" data-background="none;" data-options="medium,square,line,horizontal,counter,sepcounter=1,theme=14" data-services="" data-url=""""),_display_(/*131.222*/routes/*131.228*/.Application.blogPost(post.id, post.slug)),format.raw/*131.269*/("""" data-user="1194849155"></div>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*137.55*/routes/*137.61*/.Application.blogPost(post.id, post.slug)),format.raw/*137.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*142.26*/("""
                        """),_display_(/*143.26*/if(count == 2)/*143.40*/ {_display_(Seq[Any](format.raw/*143.42*/("""
                            """),format.raw/*144.29*/("""<div class="box-6col-horizont">

                                <a href=""""),_display_(/*146.43*/routes/*146.49*/.Application.blogPost(post.id, post.slug)),format.raw/*146.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box--left feed--arrow" """),_display_(/*146.167*/post/*146.171*/.getImage("blog.image", "postthumb").map/*146.211*/ {img =>_display_(Seq[Any](format.raw/*146.219*/(""" """),format.raw/*146.220*/("""style="background-image: url("""),_display_(/*146.250*/img/*146.253*/.url),format.raw/*146.257*/(""")""")))}),format.raw/*146.259*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box--right">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*152.81*/post/*152.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*152.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*153.79*/post/*153.83*/.getText("blog.body").map/*153.108*/{text =>_display_(Seq[Any](format.raw/*153.116*/(""" """),_display_(/*153.118*/{text.length/900})))}),format.raw/*153.136*/(""" """),format.raw/*153.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*155.47*/routes/*155.53*/.Application.blogPost(post.id, post.slug)),format.raw/*155.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*156.46*/post/*156.50*/.getText("blog.title").map/*156.76*/{title =>_display_(Seq[Any](format.raw/*156.85*/(""" """),_display_(/*156.87*/title)))}),format.raw/*156.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*160.46*/post/*160.50*/.tags.map/*160.59*/ { tag =>_display_(Seq[Any](format.raw/*160.68*/("""
                                                """),format.raw/*161.49*/("""<li>#"""),_display_(/*161.55*/tag),format.raw/*161.58*/("""</li>
                                            """)))}),format.raw/*162.46*/("""
                                        """),format.raw/*163.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            <div class="pluso dg-feed__info__actions--repost" data-background="none;" data-options="medium,square,line,horizontal,counter,sepcounter=1,theme=14" data-services="" data-url=""""),_display_(/*168.222*/routes/*168.228*/.Application.blogPost(post.id, post.slug)),format.raw/*168.269*/("""" data-user="1194849155"></div>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*174.55*/routes/*174.61*/.Application.blogPost(post.id, post.slug)),format.raw/*174.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        """)))}),format.raw/*180.26*/("""
                        """),_display_(/*181.26*/if(count == 3)/*181.40*/ {_display_(Seq[Any](format.raw/*181.42*/("""
                            """),format.raw/*182.29*/("""<div class="box-12col-horizont">

                                <a href=""""),_display_(/*184.43*/routes/*184.49*/.Application.blogPost(post.id, post.slug)),format.raw/*184.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box-3col-horizont-imgwrapper feed--arrow" """),_display_(/*184.186*/post/*184.190*/.getImage("blog.image", "postthumb").map/*184.230*/ {img =>_display_(Seq[Any](format.raw/*184.238*/(""" """),format.raw/*184.239*/("""style="background-image: url("""),_display_(/*184.269*/img/*184.272*/.url),format.raw/*184.276*/(""")""")))}),format.raw/*184.278*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box-9col-horizont">

                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*191.81*/post/*191.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*191.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*192.79*/post/*192.83*/.getText("blog.body").map/*192.108*/{text =>_display_(Seq[Any](format.raw/*192.116*/(""" """),_display_(/*192.118*/{text.length/900})))}),format.raw/*192.136*/(""" """),format.raw/*192.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*194.47*/routes/*194.53*/.Application.blogPost(post.id, post.slug)),format.raw/*194.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*195.46*/post/*195.50*/.getText("blog.title").map/*195.76*/{title =>_display_(Seq[Any](format.raw/*195.85*/(""" """),_display_(/*195.87*/title)))}),format.raw/*195.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*199.46*/post/*199.50*/.tags.map/*199.59*/ { tag =>_display_(Seq[Any](format.raw/*199.68*/("""
                                                """),format.raw/*200.49*/("""<li>#"""),_display_(/*200.55*/tag),format.raw/*200.58*/("""</li>
                                            """)))}),format.raw/*201.46*/("""
                                        """),format.raw/*202.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">

                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            <div class="pluso dg-feed__info__actions--repost" data-background="none;" data-options="medium,square,line,horizontal,counter,sepcounter=1,theme=14" data-services="" data-url=""""),_display_(/*208.222*/routes/*208.228*/.Application.blogPost(post.id, post.slug)),format.raw/*208.269*/("""" data-user="1194849155"></div>
                                        </li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*214.55*/routes/*214.61*/.Application.blogPost(post.id, post.slug)),format.raw/*214.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>

                                </div>
                            </div>
                        """)))}),format.raw/*220.26*/("""
                    """)))}),format.raw/*221.22*/("""
            """),format.raw/*222.13*/("""</div>

            <div class="clear"></div>

            <div class="dg-feed__btn-wrapper">
                <a class="dg-feed__btn" href="#">
                    <span class="load-icon"></span>
                    <span>ЕЩЕ СТАТЬИ</span>
                </a>
            </div>

        <div class="clear"></div>
    </section>

    """),format.raw/*236.31*/("""
    """),format.raw/*237.5*/("""<script type="text/javascript">
    /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
    var disqus_shortname = 'diapost-portal'; // required: replace example with your forum shortname

    /* * * DON'T EDIT BELOW THIS LINE * * */
    (function () """),format.raw/*242.18*/("""{"""),format.raw/*242.19*/("""
    """),format.raw/*243.5*/("""var s = document.createElement('script'); s.async = true;
    s.type = 'text/javascript';
    s.src = '//' + disqus_shortname + '.disqus.com/count.js';
    (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
    """),format.raw/*247.5*/("""}"""),format.raw/*247.6*/("""());
    </script>
""")))}),format.raw/*249.2*/("""
"""))}
  }

  def render(posts:Seq[io.prismic.Document],authors:Seq[io.prismic.Document],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,authors)(ctx)

  def f:((Seq[io.prismic.Document],Seq[io.prismic.Document]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,authors) => (ctx) => apply(posts,authors)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 13 14:25:38 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/index.scala.html
                  HASH: 13c6f8099b7c6b9b24d4e931c5242c57954ca54e
                  MATRIX: 564->1|765->100|793->117|820->119|942->232|981->233|1012->238|3229->2445|3265->2454|3336->2497|3365->2498|3401->2507|3538->2616|3567->2617|3596->2618|3976->2971|4005->2972|4034->2973|4084->3017|4129->3035|4224->3103|4280->3143|4319->3144|4372->3170|4395->3184|4435->3186|4492->3215|4584->3280|4599->3286|4661->3327|4735->3373|4749->3377|4799->3417|4846->3425|4876->3426|4934->3456|4947->3459|4973->3463|5007->3465|5419->3850|5432->3854|5498->3898|5608->3981|5621->3985|5656->4010|5703->4018|5733->4020|5776->4038|5806->4039|6001->4207|6014->4211|6049->4237|6096->4246|6125->4248|6155->4254|6387->4459|6400->4463|6418->4472|6465->4481|6538->4526|6571->4532|6595->4535|6673->4582|6742->4623|7222->5075|7238->5081|7301->5122|7695->5488|7711->5494|7775->5535|8056->5784|8110->5810|8134->5824|8175->5826|8233->5855|8335->5929|8351->5935|8414->5976|8510->6043|8525->6047|8576->6087|8624->6095|8655->6096|8714->6126|8728->6129|8755->6133|8790->6135|9160->6477|9174->6481|9241->6525|9352->6608|9366->6612|9402->6637|9450->6645|9481->6647|9525->6665|9556->6666|9681->6763|9697->6769|9760->6810|9866->6888|9880->6892|9916->6918|9964->6927|9994->6929|10025->6935|10260->7142|10274->7146|10293->7155|10341->7164|10419->7213|10453->7219|10478->7222|10561->7273|10631->7314|11111->7765|11128->7771|11192->7812|11586->8178|11602->8184|11666->8225|11947->8474|12001->8500|12025->8514|12066->8516|12124->8545|12227->8620|12243->8626|12306->8667|12412->8744|12427->8748|12478->8788|12526->8796|12557->8797|12616->8827|12630->8830|12657->8834|12692->8836|13073->9189|13087->9193|13154->9237|13265->9320|13279->9324|13315->9349|13363->9357|13394->9359|13438->9377|13469->9378|13594->9475|13610->9481|13673->9522|13779->9600|13793->9604|13829->9630|13877->9639|13907->9641|13938->9647|14173->9854|14187->9858|14206->9867|14254->9876|14332->9925|14366->9931|14391->9934|14474->9985|14544->10026|15024->10477|15041->10483|15105->10524|15499->10890|15515->10896|15579->10937|15861->11187|15915->11213|15939->11227|15980->11229|16038->11258|16142->11334|16158->11340|16221->11381|16346->11477|16361->11481|16412->11521|16460->11529|16491->11530|16550->11560|16564->11563|16591->11567|16626->11569|17015->11930|17029->11934|17096->11978|17207->12061|17221->12065|17257->12090|17305->12098|17336->12100|17380->12118|17411->12119|17536->12216|17552->12222|17615->12263|17721->12341|17735->12345|17771->12371|17819->12380|17849->12382|17880->12388|18115->12595|18129->12599|18148->12608|18196->12617|18274->12666|18308->12672|18333->12675|18416->12726|18486->12767|18967->13219|18984->13225|19048->13266|19442->13632|19458->13638|19522->13679|19804->13929|19858->13951|19900->13964|20264->14325|20297->14330|20602->14606|20632->14607|20665->14612|20956->14875|20985->14876|21036->14896
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|77->57|78->58|78->58|78->58|79->59|80->60|80->60|80->60|86->66|86->66|86->66|87->67|89->69|90->70|90->70|90->70|91->71|91->71|91->71|92->72|93->73|93->73|93->73|93->73|93->73|93->73|93->73|93->73|93->73|93->73|93->73|93->73|99->79|99->79|99->79|100->80|100->80|100->80|100->80|100->80|100->80|100->80|103->83|103->83|103->83|103->83|103->83|103->83|107->87|107->87|107->87|107->87|108->88|108->88|108->88|109->89|110->90|115->95|115->95|115->95|121->101|121->101|121->101|126->106|127->107|127->107|127->107|128->108|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|135->115|135->115|135->115|136->116|136->116|136->116|136->116|136->116|136->116|136->116|138->118|138->118|138->118|139->119|139->119|139->119|139->119|139->119|139->119|143->123|143->123|143->123|143->123|144->124|144->124|144->124|145->125|146->126|151->131|151->131|151->131|157->137|157->137|157->137|162->142|163->143|163->143|163->143|164->144|166->146|166->146|166->146|166->146|166->146|166->146|166->146|166->146|166->146|166->146|166->146|166->146|172->152|172->152|172->152|173->153|173->153|173->153|173->153|173->153|173->153|173->153|175->155|175->155|175->155|176->156|176->156|176->156|176->156|176->156|176->156|180->160|180->160|180->160|180->160|181->161|181->161|181->161|182->162|183->163|188->168|188->168|188->168|194->174|194->174|194->174|200->180|201->181|201->181|201->181|202->182|204->184|204->184|204->184|204->184|204->184|204->184|204->184|204->184|204->184|204->184|204->184|204->184|211->191|211->191|211->191|212->192|212->192|212->192|212->192|212->192|212->192|212->192|214->194|214->194|214->194|215->195|215->195|215->195|215->195|215->195|215->195|219->199|219->199|219->199|219->199|220->200|220->200|220->200|221->201|222->202|228->208|228->208|228->208|234->214|234->214|234->214|240->220|241->221|242->222|256->236|257->237|262->242|262->242|263->243|267->247|267->247|269->249
                  -- GENERATED --
              */
          