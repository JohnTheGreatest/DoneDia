
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

  def render(posts:Seq[io.prismic.Document],authors:Seq[io.prismic.Document],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,authors)(ctx)

  def f:((Seq[io.prismic.Document],Seq[io.prismic.Document]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,authors) => (ctx) => apply(posts,authors)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 12:18:38 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/index.scala.html
                  HASH: 27e93f36ad5694cc78afbec372598bce942b4299
                  MATRIX: 564->1|765->100|793->117|820->119|942->232|981->233|1012->238|2507->1705|2536->1706|2673->1814|2703->1815|2845->1928|2875->1929|2905->1930|2979->2236|3028->2257|3311->2793|3360->2814|3727->3153|3756->3154|3816->3186|3846->3187|3947->3448|4000->3473|4125->3588|4161->3597|4232->3640|4261->3641|4297->3650|4434->3759|4463->3760|4492->3761|4872->4114|4901->4115|4930->4116|4980->4160|5025->4178|5120->4246|5176->4286|5215->4287|5268->4313|5291->4327|5331->4329|5388->4358|5480->4423|5495->4429|5557->4470|5631->4516|5645->4520|5695->4560|5742->4568|5772->4569|5830->4599|5843->4602|5869->4606|5903->4608|6315->4993|6328->4997|6394->5041|6504->5124|6517->5128|6552->5153|6599->5161|6629->5163|6672->5181|6702->5182|6897->5350|6910->5354|6945->5380|6992->5389|7021->5391|7051->5397|7284->5602|7298->5606|7317->5615|7365->5624|7439->5669|7473->5675|7498->5678|7577->5725|7647->5766|7945->6301|8015->6342|8337->6636|8353->6642|8417->6683|8698->6932|8752->6958|8776->6972|8817->6974|8875->7003|8977->7077|8993->7083|9056->7124|9152->7191|9167->7195|9218->7235|9266->7243|9297->7244|9356->7274|9370->7277|9397->7281|9432->7283|9802->7625|9816->7629|9883->7673|9994->7756|10008->7760|10044->7785|10092->7793|10123->7795|10167->7813|10198->7814|10323->7911|10339->7917|10402->7958|10508->8036|10522->8040|10558->8066|10606->8075|10636->8077|10667->8083|10902->8290|10916->8294|10935->8303|10983->8312|11061->8361|11095->8367|11120->8370|11203->8421|11273->8462|11577->8995|11647->9036|11969->9330|11985->9336|12049->9377|12330->9626|12384->9652|12408->9666|12449->9668|12507->9697|12610->9772|12626->9778|12689->9819|12795->9896|12810->9900|12861->9940|12909->9948|12940->9949|12999->9979|13013->9982|13040->9986|13075->9988|13456->10341|13470->10345|13537->10389|13648->10472|13662->10476|13698->10501|13746->10509|13777->10511|13821->10529|13852->10530|13977->10627|13993->10633|14056->10674|14162->10752|14176->10756|14212->10782|14260->10791|14290->10793|14321->10799|14556->11006|14570->11010|14589->11019|14637->11028|14715->11077|14749->11083|14774->11086|14857->11137|14927->11178|15231->11711|15301->11752|15623->12046|15639->12052|15703->12093|15985->12343|16039->12369|16063->12383|16104->12385|16162->12414|16266->12490|16282->12496|16345->12537|16470->12633|16485->12637|16536->12677|16584->12685|16615->12686|16674->12716|16688->12719|16715->12723|16750->12725|17139->13086|17153->13090|17220->13134|17331->13217|17345->13221|17381->13246|17429->13254|17460->13256|17504->13274|17535->13275|17660->13372|17676->13378|17739->13419|17845->13497|17859->13501|17895->13527|17943->13536|17973->13538|18004->13544|18239->13751|18253->13755|18272->13764|18320->13773|18398->13822|18432->13828|18457->13831|18540->13882|18610->13923|18915->14457|18985->14498|19307->14792|19323->14798|19387->14839|19669->15089|19723->15111|19765->15124|20037->15368|20067->15388|20108->15390|20150->15403|20431->15652|20469->15662|20544->15734|20577->15739|20885->16018|20915->16019|20948->16024|21239->16287|21268->16288|21319->16308
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|55->35|55->35|55->35|55->35|55->35|55->35|55->35|57->43|58->44|62->53|63->54|69->60|69->60|69->60|69->60|71->65|72->66|79->73|80->74|80->74|80->74|81->75|82->76|82->76|82->76|88->82|88->82|88->82|89->83|91->85|92->86|92->86|92->86|93->87|93->87|93->87|94->88|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|95->89|101->95|101->95|101->95|102->96|102->96|102->96|102->96|102->96|102->96|102->96|105->99|105->99|105->99|105->99|105->99|105->99|109->103|109->103|109->103|109->103|110->104|110->104|110->104|111->105|112->106|117->111|118->112|123->117|123->117|123->117|128->122|129->123|129->123|129->123|130->124|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|131->125|137->131|137->131|137->131|138->132|138->132|138->132|138->132|138->132|138->132|138->132|140->134|140->134|140->134|141->135|141->135|141->135|141->135|141->135|141->135|145->139|145->139|145->139|145->139|146->140|146->140|146->140|147->141|148->142|153->147|154->148|159->153|159->153|159->153|164->158|165->159|165->159|165->159|166->160|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|168->162|174->168|174->168|174->168|175->169|175->169|175->169|175->169|175->169|175->169|175->169|177->171|177->171|177->171|178->172|178->172|178->172|178->172|178->172|178->172|182->176|182->176|182->176|182->176|183->177|183->177|183->177|184->178|185->179|190->184|191->185|196->190|196->190|196->190|202->196|203->197|203->197|203->197|204->198|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|206->200|213->207|213->207|213->207|214->208|214->208|214->208|214->208|214->208|214->208|214->208|216->210|216->210|216->210|217->211|217->211|217->211|217->211|217->211|217->211|221->215|221->215|221->215|221->215|222->216|222->216|222->216|223->217|224->218|230->224|231->225|236->230|236->230|236->230|242->236|243->237|244->238|253->247|253->247|253->247|254->248|260->254|262->256|265->259|266->260|271->265|271->265|272->266|276->270|276->270|278->272
                  -- GENERATED --
              */
          