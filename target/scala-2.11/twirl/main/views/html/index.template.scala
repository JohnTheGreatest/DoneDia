
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Seq[io.prismic.Document],Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: Seq[io.prismic.Document], authors: Seq[io.prismic.Document], blogCategories: collection.immutable.ListMap[String,String])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import Html._

Seq[Any](format.raw/*1.162*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Информационно-аналитический молодежный портал", Option("big"), Option(posts.take(1).head), Option(authors), blogCategories = blogCategories)/*5.148*/{_display_(Seq[Any](format.raw/*5.149*/("""
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

                <ul class="clear">
                    <li>
                        <a href="https://twitter.com/share" class="twitter-share-button" data-via="diapost" data-hashtags="diapost">Tweet</a>
                        <script>!function(d,s,id)"""),format.raw/*35.50*/("""{"""),format.raw/*35.51*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*35.159*/("""{"""),format.raw/*35.160*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*35.273*/("""}"""),format.raw/*35.274*/("""}"""),format.raw/*35.275*/("""(document, 'script', 'twitter-wjs');</script>

"""),format.raw/*43.7*/("""
                    """),format.raw/*44.21*/("""</li>

                    <li>
                        <div class="fb-like" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
                        """),format.raw/*53.31*/("""
                    """),format.raw/*54.21*/("""</li>

                    <li>
                        <a href="#" class="dg-feed__social__vkontakte">
                                <!-- Put this script tag to the place, where the Share button will be -->
                            <script type="text/javascript"><!--
                            document.write(VK.Share.button(false,"""),format.raw/*60.66*/("""{"""),format.raw/*60.67*/("""type: "round", text: "Сохранить""""),format.raw/*60.99*/("""}"""),format.raw/*60.100*/("""));
                            --></script>
                            """),format.raw/*65.35*/("""
                        """),format.raw/*66.25*/("""</a>
                    </li>
                </ul>

            </div>
        </div>

        """),format.raw/*73.27*/("""
        """),format.raw/*74.9*/("""<script type="text/javascript">(function() """),format.raw/*74.52*/("""{"""),format.raw/*74.53*/("""
        """),format.raw/*75.9*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
        if (window.ifpluso==undefined) """),format.raw/*76.40*/("""{"""),format.raw/*76.41*/(""" """),format.raw/*76.42*/("""window.ifpluso = 1;
        var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
        s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
        s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
        var h=d[g]('body')[0];
        h.appendChild(s);
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""}"""),format.raw/*82.11*/(""")();</script>
        """),format.raw/*83.31*/("""
        
        """),format.raw/*85.9*/("""<div class="container-metro dg-feed__content">
                    """),_display_(/*86.22*/for((post, count) <- posts.zipWithIndex) yield /*86.62*/{_display_(Seq[Any](format.raw/*86.63*/("""
                        """),_display_(/*87.26*/if(count == 0)/*87.40*/ {_display_(Seq[Any](format.raw/*87.42*/("""
                            """),format.raw/*88.29*/("""<div class="box-6col">
                                <a href=""""),_display_(/*89.43*/routes/*89.49*/.Application.blogPost(post.id, post.slug)),format.raw/*89.90*/("""" class="dg-feed__image box-6col-imgwrapper" """),_display_(/*89.136*/post/*89.140*/.getImage("blog.image", "postthumb").map/*89.180*/ {img =>_display_(Seq[Any](format.raw/*89.188*/(""" """),format.raw/*89.189*/("""style="background-image: url("""),_display_(/*89.219*/img/*89.222*/.url),format.raw/*89.226*/(""")""")))}),format.raw/*89.228*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                                </a>
                                <div class="clear"></div>
                                <div class="dg-feed__info">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*95.81*/post/*95.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*95.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*96.79*/post/*96.83*/.getText("blog.body").map/*96.108*/{text =>_display_(Seq[Any](format.raw/*96.116*/(""" """),_display_(/*96.118*/{text.length/900})))}),format.raw/*96.136*/(""" """),format.raw/*96.137*/("""мин</p>
                                    </div>
                                    <div class="dg-feed__info__header">
                                        <h2>"""),_display_(/*99.46*/post/*99.50*/.getText("blog.title").map/*99.76*/{title =>_display_(Seq[Any](format.raw/*99.85*/(""" """),_display_(/*99.87*/title)))}),format.raw/*99.93*/("""</h2>
                                    </div>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                        """),_display_(/*103.42*/post/*103.46*/.tags.map/*103.55*/ { tag =>_display_(Seq[Any](format.raw/*103.64*/("""
                                            """),format.raw/*104.45*/("""<li>#"""),_display_(/*104.51*/tag),format.raw/*104.54*/("""</li>
                                        """)))}),format.raw/*105.42*/("""
                                        """),format.raw/*106.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-white">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                     """),format.raw/*111.305*/("""
                                        """),format.raw/*112.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*117.55*/routes/*117.61*/.Application.blogPost(post.id, post.slug)),format.raw/*117.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*122.26*/("""
                        """),_display_(/*123.26*/if(count == 1)/*123.40*/ {_display_(Seq[Any](format.raw/*123.42*/("""
                            """),format.raw/*124.29*/("""<div class="box-6col-horizont">
                                <a href=""""),_display_(/*125.43*/routes/*125.49*/.Application.blogPost(post.id, post.slug)),format.raw/*125.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper feed--arrow" """),_display_(/*125.157*/post/*125.161*/.getImage("blog.image", "postthumb").map/*125.201*/ {img =>_display_(Seq[Any](format.raw/*125.209*/(""" """),format.raw/*125.210*/("""style="background-image: url("""),_display_(/*125.240*/img/*125.243*/.url),format.raw/*125.247*/(""")""")))}),format.raw/*125.249*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*131.81*/post/*131.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*131.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*132.79*/post/*132.83*/.getText("blog.body").map/*132.108*/{text =>_display_(Seq[Any](format.raw/*132.116*/(""" """),_display_(/*132.118*/{text.length/900})))}),format.raw/*132.136*/(""" """),format.raw/*132.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*134.47*/routes/*134.53*/.Application.blogPost(post.id, post.slug)),format.raw/*134.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*135.46*/post/*135.50*/.getText("blog.title").map/*135.76*/{title =>_display_(Seq[Any](format.raw/*135.85*/(""" """),_display_(/*135.87*/title)))}),format.raw/*135.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*139.46*/post/*139.50*/.tags.map/*139.59*/ { tag =>_display_(Seq[Any](format.raw/*139.68*/("""
                                                """),format.raw/*140.49*/("""<li>#"""),_display_(/*140.55*/tag),format.raw/*140.58*/("""</li>
                                            """)))}),format.raw/*141.46*/("""
                                        """),format.raw/*142.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*147.304*/("""
                                        """),format.raw/*148.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*153.55*/routes/*153.61*/.Application.blogPost(post.id, post.slug)),format.raw/*153.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*158.26*/("""
                        """),_display_(/*159.26*/if(count == 2)/*159.40*/ {_display_(Seq[Any](format.raw/*159.42*/("""
                            """),format.raw/*160.29*/("""<div class="box-6col-horizont">

                                <a href=""""),_display_(/*162.43*/routes/*162.49*/.Application.blogPost(post.id, post.slug)),format.raw/*162.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box--left feed--arrow" """),_display_(/*162.167*/post/*162.171*/.getImage("blog.image", "postthumb").map/*162.211*/ {img =>_display_(Seq[Any](format.raw/*162.219*/(""" """),format.raw/*162.220*/("""style="background-image: url("""),_display_(/*162.250*/img/*162.253*/.url),format.raw/*162.257*/(""")""")))}),format.raw/*162.259*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box--right">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*168.81*/post/*168.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*168.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*169.79*/post/*169.83*/.getText("blog.body").map/*169.108*/{text =>_display_(Seq[Any](format.raw/*169.116*/(""" """),_display_(/*169.118*/{text.length/900})))}),format.raw/*169.136*/(""" """),format.raw/*169.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*171.47*/routes/*171.53*/.Application.blogPost(post.id, post.slug)),format.raw/*171.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*172.46*/post/*172.50*/.getText("blog.title").map/*172.76*/{title =>_display_(Seq[Any](format.raw/*172.85*/(""" """),_display_(/*172.87*/title)))}),format.raw/*172.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*176.46*/post/*176.50*/.tags.map/*176.59*/ { tag =>_display_(Seq[Any](format.raw/*176.68*/("""
                                                """),format.raw/*177.49*/("""<li>#"""),_display_(/*177.55*/tag),format.raw/*177.58*/("""</li>
                                            """)))}),format.raw/*178.46*/("""
                                        """),format.raw/*179.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*184.304*/("""
                                        """),format.raw/*185.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*190.55*/routes/*190.61*/.Application.blogPost(post.id, post.slug)),format.raw/*190.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        """)))}),format.raw/*196.26*/("""
                        """),_display_(/*197.26*/if(count == 3)/*197.40*/ {_display_(Seq[Any](format.raw/*197.42*/("""
                            """),format.raw/*198.29*/("""<div class="box-12col-horizont">

                                <a href=""""),_display_(/*200.43*/routes/*200.49*/.Application.blogPost(post.id, post.slug)),format.raw/*200.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box-3col-horizont-imgwrapper feed--arrow" """),_display_(/*200.186*/post/*200.190*/.getImage("blog.image", "postthumb").map/*200.230*/ {img =>_display_(Seq[Any](format.raw/*200.238*/(""" """),format.raw/*200.239*/("""style="background-image: url("""),_display_(/*200.269*/img/*200.272*/.url),format.raw/*200.276*/(""")""")))}),format.raw/*200.278*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box-9col-horizont">

                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*207.81*/post/*207.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*207.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*208.79*/post/*208.83*/.getText("blog.body").map/*208.108*/{text =>_display_(Seq[Any](format.raw/*208.116*/(""" """),_display_(/*208.118*/{text.length/900})))}),format.raw/*208.136*/(""" """),format.raw/*208.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*210.47*/routes/*210.53*/.Application.blogPost(post.id, post.slug)),format.raw/*210.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*211.46*/post/*211.50*/.getText("blog.title").map/*211.76*/{title =>_display_(Seq[Any](format.raw/*211.85*/(""" """),_display_(/*211.87*/title)))}),format.raw/*211.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*215.46*/post/*215.50*/.tags.map/*215.59*/ { tag =>_display_(Seq[Any](format.raw/*215.68*/("""
                                                """),format.raw/*216.49*/("""<li>#"""),_display_(/*216.55*/tag),format.raw/*216.58*/("""</li>
                                            """)))}),format.raw/*217.46*/("""
                                        """),format.raw/*218.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">

                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*224.304*/("""
                                        """),format.raw/*225.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*230.55*/routes/*230.61*/.Application.blogPost(post.id, post.slug)),format.raw/*230.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>

                                </div>
                            </div>
                        """)))}),format.raw/*236.26*/("""
                    """)))}),format.raw/*237.22*/("""
            """),format.raw/*238.13*/("""</div>

        <div class="clear"></div>
    
        <div class="empty-posts">
            <div class="container">
                <h2 class="empty-posts-text">В данной категории еще нет статей</h2>
            </div>
        </div>
        """),_display_(/*247.10*/if(posts.length > 4)/*247.30*/ {_display_(Seq[Any](format.raw/*247.32*/("""
            """),format.raw/*248.13*/("""<div class="dg-feed__btn-wrapper">
                <a class="dg-feed__btn" href="#" data-next-page="2">
                    <span class="load-icon"></span>
                    <span>ЕЩЕ СТАТЬИ</span>
                </a>
            </div>
        """)))}),format.raw/*254.10*/("""

        """),format.raw/*256.9*/("""<div class="clear"></div>
    </section>

    """),format.raw/*259.31*/("""
    """),format.raw/*260.5*/("""<script type="text/javascript">
    /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
    var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

    /* * * DON'T EDIT BELOW THIS LINE * * */
    (function () """),format.raw/*265.18*/("""{"""),format.raw/*265.19*/("""
    """),format.raw/*266.5*/("""var s = document.createElement('script'); s.async = true;
    s.type = 'text/javascript';
    s.src = '//' + disqus_shortname + '.disqus.com/count.js';
    (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
    """),format.raw/*270.5*/("""}"""),format.raw/*270.6*/("""());
    </script>
""")))}),format.raw/*272.2*/("""
"""))}
  }

  def render(posts:Seq[io.prismic.Document],authors:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,authors,blogCategories)(ctx)

  def f:((Seq[io.prismic.Document],Seq[io.prismic.Document],collection.immutable.ListMap[String, String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,authors,blogCategories) => (ctx) => apply(posts,authors,blogCategories)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 19 17:59:03 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/index.scala.html
                  HASH: e93ec0de76d5f90a57d890aff685dee7ed5550ac
                  MATRIX: 609->1|871->161|899->178|926->180|1081->326|1120->327|1151->332|2646->1799|2675->1800|2812->1908|2842->1909|2984->2022|3014->2023|3044->2024|3118->2330|3167->2351|3450->2887|3499->2908|3866->3247|3895->3248|3955->3280|3985->3281|4086->3542|4139->3567|4264->3682|4300->3691|4371->3734|4400->3735|4436->3744|4573->3853|4602->3854|4631->3855|5011->4208|5040->4209|5069->4210|5119->4254|5164->4272|5259->4340|5315->4380|5354->4381|5407->4407|5430->4421|5470->4423|5527->4452|5619->4517|5634->4523|5696->4564|5770->4610|5784->4614|5834->4654|5881->4662|5911->4663|5969->4693|5982->4696|6008->4700|6042->4702|6454->5087|6467->5091|6533->5135|6643->5218|6656->5222|6691->5247|6738->5255|6768->5257|6811->5275|6841->5276|7036->5444|7049->5448|7084->5474|7131->5483|7160->5485|7190->5491|7423->5696|7437->5700|7456->5709|7504->5718|7578->5763|7612->5769|7637->5772|7716->5819|7786->5860|8084->6395|8154->6436|8476->6730|8492->6736|8556->6777|8837->7026|8891->7052|8915->7066|8956->7068|9014->7097|9116->7171|9132->7177|9195->7218|9291->7285|9306->7289|9357->7329|9405->7337|9436->7338|9495->7368|9509->7371|9536->7375|9571->7377|9941->7719|9955->7723|10022->7767|10133->7850|10147->7854|10183->7879|10231->7887|10262->7889|10306->7907|10337->7908|10462->8005|10478->8011|10541->8052|10647->8130|10661->8134|10697->8160|10745->8169|10775->8171|10806->8177|11041->8384|11055->8388|11074->8397|11122->8406|11200->8455|11234->8461|11259->8464|11342->8515|11412->8556|11716->9089|11786->9130|12108->9424|12124->9430|12188->9471|12469->9720|12523->9746|12547->9760|12588->9762|12646->9791|12749->9866|12765->9872|12828->9913|12934->9990|12949->9994|13000->10034|13048->10042|13079->10043|13138->10073|13152->10076|13179->10080|13214->10082|13595->10435|13609->10439|13676->10483|13787->10566|13801->10570|13837->10595|13885->10603|13916->10605|13960->10623|13991->10624|14116->10721|14132->10727|14195->10768|14301->10846|14315->10850|14351->10876|14399->10885|14429->10887|14460->10893|14695->11100|14709->11104|14728->11113|14776->11122|14854->11171|14888->11177|14913->11180|14996->11231|15066->11272|15370->11805|15440->11846|15762->12140|15778->12146|15842->12187|16124->12437|16178->12463|16202->12477|16243->12479|16301->12508|16405->12584|16421->12590|16484->12631|16609->12727|16624->12731|16675->12771|16723->12779|16754->12780|16813->12810|16827->12813|16854->12817|16889->12819|17278->13180|17292->13184|17359->13228|17470->13311|17484->13315|17520->13340|17568->13348|17599->13350|17643->13368|17674->13369|17799->13466|17815->13472|17878->13513|17984->13591|17998->13595|18034->13621|18082->13630|18112->13632|18143->13638|18378->13845|18392->13849|18411->13858|18459->13867|18537->13916|18571->13922|18596->13925|18679->13976|18749->14017|19054->14551|19124->14592|19446->14886|19462->14892|19526->14933|19808->15183|19862->15205|19904->15218|20176->15462|20206->15482|20247->15484|20289->15497|20570->15746|20608->15756|20683->15828|20716->15833|21024->16112|21054->16113|21087->16118|21378->16381|21407->16382|21458->16402
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|55->35|55->35|55->35|55->35|55->35|55->35|55->35|57->43|58->44|62->53|63->54|69->60|69->60|69->60|69->60|71->65|72->66|79->73|80->74|80->74|80->74|81->75|82->76|82->76|82->76|88->82|88->82|88->82|89->83|91->85|92->86|92->86|92->86|93->87|93->87|93->87|94->88|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|101->95|101->95|101->95|102->96|102->96|102->96|102->96|102->96|102->96|102->96|105->99|105->99|105->99|105->99|105->99|105->99|109->103|109->103|109->103|109->103|110->104|110->104|110->104|111->105|112->106|117->111|118->112|123->117|123->117|123->117|128->122|129->123|129->123|129->123|130->124|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|137->131|137->131|137->131|138->132|138->132|138->132|138->132|138->132|138->132|138->132|140->134|140->134|140->134|141->135|141->135|141->135|141->135|141->135|141->135|145->139|145->139|145->139|145->139|146->140|146->140|146->140|147->141|148->142|153->147|154->148|159->153|159->153|159->153|164->158|165->159|165->159|165->159|166->160|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|174->168|174->168|174->168|175->169|175->169|175->169|175->169|175->169|175->169|175->169|177->171|177->171|177->171|178->172|178->172|178->172|178->172|178->172|178->172|182->176|182->176|182->176|182->176|183->177|183->177|183->177|184->178|185->179|190->184|191->185|196->190|196->190|196->190|202->196|203->197|203->197|203->197|204->198|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|213->207|213->207|213->207|214->208|214->208|214->208|214->208|214->208|214->208|214->208|216->210|216->210|216->210|217->211|217->211|217->211|217->211|217->211|217->211|221->215|221->215|221->215|221->215|222->216|222->216|222->216|223->217|224->218|230->224|231->225|236->230|236->230|236->230|242->236|243->237|244->238|253->247|253->247|253->247|254->248|260->254|262->256|265->259|266->260|271->265|271->265|272->266|276->270|276->270|278->272
                  -- GENERATED --
              */
          