
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Seq[io.prismic.Document],Seq[io.prismic.Document],Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: Seq[io.prismic.Document], firstPost: Seq[io.prismic.Document], authors: Seq[io.prismic.Document], blogCategories: collection.immutable.ListMap[String,String])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import Html._

Seq[Any](format.raw/*1.199*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Молодёжный информационно-аналитический портал", Option("big"), Option(firstPost.take(1).head), Option(authors), blogCategories = blogCategories)/*5.152*/{_display_(Seq[Any](format.raw/*5.153*/("""
    """),format.raw/*6.5*/("""<section class="dg-feed">
        <div class="container">
            <div class="dg-feed__filter">
                <p class="dg-feed__filter__choose">Выберите раздел</p>
                <dl class="dg-feed_filter__section dropdown">
                    <dt><a><span class="dg-feed_filter__section__content">ВСЕ РАЗДЕЛЫ</span><span class="icon-arrow-down"></span></a></dt>
                    <dd>
                        <ul>
                            <li><a class="default selected">Все разделы</a></li>
                            """),_display_(/*15.30*/blogCategories/*15.44*/.map/*15.48*/{cat=>_display_(Seq[Any](format.raw/*15.54*/("""
                                """),format.raw/*16.33*/("""<li><a """),_display_(/*16.41*/if(cat._1.contains("kon"))/*16.67*/{_display_(Seq[Any](format.raw/*16.68*/("""class="kon"""")))}),format.raw/*16.80*/(""">"""),_display_(/*16.82*/cat/*16.85*/._2),format.raw/*16.88*/("""</a></li>
                            """)))}),format.raw/*17.30*/("""
                        """),format.raw/*18.25*/("""</ul>
                    </dd>
                </dl>
            </div>

             
            <div class="dg-feed__social">

                <ul class="clear">
                    <li>
                        <a href="https://twitter.com/share" class="twitter-share-button" data-via="diapost" data-hashtags="diapost">Tweet</a>
                        <script>!function(d,s,id)"""),format.raw/*29.50*/("""{"""),format.raw/*29.51*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*29.159*/("""{"""),format.raw/*29.160*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*29.273*/("""}"""),format.raw/*29.274*/("""}"""),format.raw/*29.275*/("""(document, 'script', 'twitter-wjs');</script>

"""),format.raw/*37.7*/("""
                    """),format.raw/*38.21*/("""</li>

                    <li>
                        <div class="fb-like" data-href="http://www.diapost.ru/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
                        """),format.raw/*47.31*/("""
                    """),format.raw/*48.21*/("""</li>

                    <li>
                        <a href="#" class="dg-feed__social__vkontakte">
                                <!-- Put this script tag to the place, where the Share button will be -->
                            <script type="text/javascript"><!--
                            document.write(VK.Share.button(false,"""),format.raw/*54.66*/("""{"""),format.raw/*54.67*/("""type: "round", text: "Сохранить""""),format.raw/*54.99*/("""}"""),format.raw/*54.100*/("""));
                            --></script>
                            """),format.raw/*59.35*/("""
                        """),format.raw/*60.25*/("""</a>
                    </li>
                </ul>

            </div>
        </div>

        """),format.raw/*67.27*/("""
        """),format.raw/*68.9*/("""<script type="text/javascript">(function() """),format.raw/*68.52*/("""{"""),format.raw/*68.53*/("""
        """),format.raw/*69.9*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
        if (window.ifpluso==undefined) """),format.raw/*70.40*/("""{"""),format.raw/*70.41*/(""" """),format.raw/*70.42*/("""window.ifpluso = 1;
        var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
        s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
        s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
        var h=d[g]('body')[0];
        h.appendChild(s);
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""}"""),format.raw/*76.11*/(""")();</script>
        """),format.raw/*77.31*/("""
        
        """),format.raw/*79.9*/("""<div class="container-metro dg-feed__content">
                    """),_display_(/*80.22*/for((post, count) <- posts.zipWithIndex) yield /*80.62*/{_display_(Seq[Any](format.raw/*80.63*/("""
                        """),_display_(/*81.26*/if(count == 0)/*81.40*/ {_display_(Seq[Any](format.raw/*81.42*/("""
                            """),format.raw/*82.29*/("""<div class="box-6col">
                                <a href=""""),_display_(/*83.43*/routes/*83.49*/.Application.blogPost(post.id, post.slug)),format.raw/*83.90*/("""" class="dg-feed__image box-6col-imgwrapper" """),_display_(/*83.136*/post/*83.140*/.getImage("blog.image", "postthumb").map/*83.180*/ {img =>_display_(Seq[Any](format.raw/*83.188*/(""" """),format.raw/*83.189*/("""style="background-image: url("""),_display_(/*83.219*/img/*83.222*/.url),format.raw/*83.226*/(""")""")))}),format.raw/*83.228*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                                </a>
                                <div class="clear"></div>
                                <div class="dg-feed__info">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*89.81*/post/*89.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*89.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*90.79*/post/*90.83*/.getText("blog.body").map/*90.108*/{text =>_display_(Seq[Any](format.raw/*90.116*/(""" """),_display_(/*90.118*/{text.length/900})))}),format.raw/*90.136*/(""" """),format.raw/*90.137*/("""мин</p>
                                    </div>
                                    <div class="dg-feed__info__header">
                                        <h2>"""),_display_(/*93.46*/post/*93.50*/.getText("blog.title").map/*93.76*/{title =>_display_(Seq[Any](format.raw/*93.85*/(""" """),_display_(/*93.87*/title)))}),format.raw/*93.93*/("""</h2>
                                    </div>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                        """),_display_(/*97.42*/post/*97.46*/.tags.map/*97.55*/ { tag =>_display_(Seq[Any](format.raw/*97.64*/("""
                                            """),format.raw/*98.45*/("""<li>#"""),_display_(/*98.51*/tag),format.raw/*98.54*/("""</li>
                                        """)))}),format.raw/*99.42*/("""
                                        """),format.raw/*100.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-white">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*105.312*/("""
                                        """),format.raw/*106.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*111.55*/routes/*111.61*/.Application.blogPost(post.id, post.slug)),format.raw/*111.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*116.26*/("""
                        """),_display_(/*117.26*/if(count == 1)/*117.40*/ {_display_(Seq[Any](format.raw/*117.42*/("""
                            """),format.raw/*118.29*/("""<div class="box-6col-horizont">
                                <a href=""""),_display_(/*119.43*/routes/*119.49*/.Application.blogPost(post.id, post.slug)),format.raw/*119.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper feed--arrow" """),_display_(/*119.157*/post/*119.161*/.getImage("blog.image", "postthumb").map/*119.201*/ {img =>_display_(Seq[Any](format.raw/*119.209*/(""" """),format.raw/*119.210*/("""style="background-image: url("""),_display_(/*119.240*/img/*119.243*/.url),format.raw/*119.247*/(""")""")))}),format.raw/*119.249*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*125.81*/post/*125.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*125.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*126.79*/post/*126.83*/.getText("blog.body").map/*126.108*/{text =>_display_(Seq[Any](format.raw/*126.116*/(""" """),_display_(/*126.118*/{text.length/900})))}),format.raw/*126.136*/(""" """),format.raw/*126.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*128.47*/routes/*128.53*/.Application.blogPost(post.id, post.slug)),format.raw/*128.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*129.46*/post/*129.50*/.getText("blog.title").map/*129.76*/{title =>_display_(Seq[Any](format.raw/*129.85*/(""" """),_display_(/*129.87*/title)))}),format.raw/*129.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*133.46*/post/*133.50*/.tags.map/*133.59*/ { tag =>_display_(Seq[Any](format.raw/*133.68*/("""
                                                """),format.raw/*134.49*/("""<li>#"""),_display_(/*134.55*/tag),format.raw/*134.58*/("""</li>
                                            """)))}),format.raw/*135.46*/("""
                                        """),format.raw/*136.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*141.304*/("""
                                        """),format.raw/*142.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*147.55*/routes/*147.61*/.Application.blogPost(post.id, post.slug)),format.raw/*147.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*152.26*/("""
                        """),_display_(/*153.26*/if(count == 2)/*153.40*/ {_display_(Seq[Any](format.raw/*153.42*/("""
                            """),format.raw/*154.29*/("""<div class="box-6col-horizont">

                                <a href=""""),_display_(/*156.43*/routes/*156.49*/.Application.blogPost(post.id, post.slug)),format.raw/*156.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box--left feed--arrow" """),_display_(/*156.167*/post/*156.171*/.getImage("blog.image", "postthumb").map/*156.211*/ {img =>_display_(Seq[Any](format.raw/*156.219*/(""" """),format.raw/*156.220*/("""style="background-image: url("""),_display_(/*156.250*/img/*156.253*/.url),format.raw/*156.257*/(""")""")))}),format.raw/*156.259*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box--right">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*162.81*/post/*162.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*162.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*163.79*/post/*163.83*/.getText("blog.body").map/*163.108*/{text =>_display_(Seq[Any](format.raw/*163.116*/(""" """),_display_(/*163.118*/{text.length/900})))}),format.raw/*163.136*/(""" """),format.raw/*163.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*165.47*/routes/*165.53*/.Application.blogPost(post.id, post.slug)),format.raw/*165.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*166.46*/post/*166.50*/.getText("blog.title").map/*166.76*/{title =>_display_(Seq[Any](format.raw/*166.85*/(""" """),_display_(/*166.87*/title)))}),format.raw/*166.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*170.46*/post/*170.50*/.tags.map/*170.59*/ { tag =>_display_(Seq[Any](format.raw/*170.68*/("""
                                                """),format.raw/*171.49*/("""<li>#"""),_display_(/*171.55*/tag),format.raw/*171.58*/("""</li>
                                            """)))}),format.raw/*172.46*/("""
                                        """),format.raw/*173.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*178.304*/("""
                                        """),format.raw/*179.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*184.55*/routes/*184.61*/.Application.blogPost(post.id, post.slug)),format.raw/*184.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        """)))}),format.raw/*190.26*/("""
                        """),_display_(/*191.26*/if(count == 3)/*191.40*/ {_display_(Seq[Any](format.raw/*191.42*/("""
                            """),format.raw/*192.29*/("""<div class="box-12col-horizont">

                                <a href=""""),_display_(/*194.43*/routes/*194.49*/.Application.blogPost(post.id, post.slug)),format.raw/*194.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box-3col-horizont-imgwrapper feed--arrow" """),_display_(/*194.186*/post/*194.190*/.getImage("blog.image", "postthumb").map/*194.230*/ {img =>_display_(Seq[Any](format.raw/*194.238*/(""" """),format.raw/*194.239*/("""style="background-image: url("""),_display_(/*194.269*/img/*194.272*/.url),format.raw/*194.276*/(""")""")))}),format.raw/*194.278*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box-9col-horizont">

                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*201.81*/post/*201.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*201.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*202.79*/post/*202.83*/.getText("blog.body").map/*202.108*/{text =>_display_(Seq[Any](format.raw/*202.116*/(""" """),_display_(/*202.118*/{text.length/900})))}),format.raw/*202.136*/(""" """),format.raw/*202.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*204.47*/routes/*204.53*/.Application.blogPost(post.id, post.slug)),format.raw/*204.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*205.46*/post/*205.50*/.getText("blog.title").map/*205.76*/{title =>_display_(Seq[Any](format.raw/*205.85*/(""" """),_display_(/*205.87*/title)))}),format.raw/*205.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*209.46*/post/*209.50*/.tags.map/*209.59*/ { tag =>_display_(Seq[Any](format.raw/*209.68*/("""
                                                """),format.raw/*210.49*/("""<li>#"""),_display_(/*210.55*/tag),format.raw/*210.58*/("""</li>
                                            """)))}),format.raw/*211.46*/("""
                                        """),format.raw/*212.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">

                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*218.304*/("""
                                        """),format.raw/*219.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*224.55*/routes/*224.61*/.Application.blogPost(post.id, post.slug)),format.raw/*224.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>

                                </div>
                            </div>
                        """)))}),format.raw/*230.26*/("""
                    """)))}),format.raw/*231.22*/("""
            """),format.raw/*232.13*/("""</div>

        <div class="clear"></div>
    
        <div class="empty-posts">
            <div class="container">
                <h2 class="empty-posts-text">В данной категории еще нет статей</h2>
            </div>
        </div>
        """),_display_(/*241.10*/if(posts.length > 4)/*241.30*/ {_display_(Seq[Any](format.raw/*241.32*/("""
            """),format.raw/*242.13*/("""<div class="dg-feed__btn-wrapper">
                <a class="dg-feed__btn" href="#" data-next-page="2">
                    <span class="load-icon"></span>
                    <span>ЕЩЕ СТАТЬИ</span>
                </a>
            </div>
        """)))}),format.raw/*248.10*/("""

        """),format.raw/*250.9*/("""<div class="clear"></div>
    </section>

    """),format.raw/*253.31*/("""
    """),format.raw/*254.5*/("""<script type="text/javascript">
    /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
    var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

    /* * * DON'T EDIT BELOW THIS LINE * * */
    (function () """),format.raw/*259.18*/("""{"""),format.raw/*259.19*/("""
    """),format.raw/*260.5*/("""var s = document.createElement('script'); s.async = true;
    s.type = 'text/javascript';
    s.src = '//' + disqus_shortname + '.disqus.com/count.js';
    (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
    """),format.raw/*264.5*/("""}"""),format.raw/*264.6*/("""());
    </script>
""")))}),format.raw/*266.2*/("""
"""))}
  }

  def render(posts:Seq[io.prismic.Document],firstPost:Seq[io.prismic.Document],authors:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,firstPost,authors,blogCategories)(ctx)

  def f:((Seq[io.prismic.Document],Seq[io.prismic.Document],Seq[io.prismic.Document],collection.immutable.ListMap[String, String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,firstPost,authors,blogCategories) => (ctx) => apply(posts,firstPost,authors,blogCategories)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 24 17:47:41 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/index.scala.html
                  HASH: dd4ecf7bd845ae726f525c0a46023572885f7e8b
                  MATRIX: 634->1|933->198|963->218|991->221|1150->371|1189->372|1221->378|1793->923|1816->937|1829->941|1873->947|1935->981|1970->989|2005->1015|2044->1016|2087->1028|2116->1030|2128->1033|2152->1036|2223->1076|2277->1102|2698->1495|2727->1496|2864->1604|2894->1605|3036->1718|3066->1719|3096->1720|3172->2034|3222->2056|3486->2578|3536->2600|3909->2945|3938->2946|3998->2978|4028->2979|4131->3245|4185->3271|4317->3393|4354->3403|4425->3446|4454->3447|4491->3457|4629->3567|4658->3568|4687->3569|5073->3928|5102->3929|5131->3930|5182->3975|5229->3995|5325->4064|5381->4104|5420->4105|5474->4132|5497->4146|5537->4148|5595->4178|5688->4244|5703->4250|5765->4291|5839->4337|5853->4341|5903->4381|5950->4389|5980->4390|6038->4420|6051->4423|6077->4427|6111->4429|6529->4820|6542->4824|6608->4868|6719->4952|6732->4956|6767->4981|6814->4989|6844->4991|6887->5009|6917->5010|7115->5181|7128->5185|7163->5211|7210->5220|7239->5222|7269->5228|7505->5437|7518->5441|7536->5450|7583->5459|7657->5505|7690->5511|7714->5514|7793->5562|7864->5604|8174->6151|8245->6193|8572->6492|8588->6498|8652->6539|8938->6793|8993->6820|9017->6834|9058->6836|9117->6866|9220->6941|9236->6947|9299->6988|9395->7055|9410->7059|9461->7099|9509->7107|9540->7108|9599->7138|9613->7141|9640->7145|9675->7147|10051->7495|10065->7499|10132->7543|10244->7627|10258->7631|10294->7656|10342->7664|10373->7666|10417->7684|10448->7685|10575->7784|10591->7790|10654->7831|10761->7910|10775->7914|10811->7940|10859->7949|10889->7951|10920->7957|11159->8168|11173->8172|11192->8181|11240->8190|11319->8240|11353->8246|11378->8249|11462->8301|11533->8343|11842->8881|11913->8923|12240->9222|12256->9228|12320->9269|12606->9523|12661->9550|12685->9564|12726->9566|12785->9596|12890->9673|12906->9679|12969->9720|13075->9797|13090->9801|13141->9841|13189->9849|13220->9850|13279->9880|13293->9883|13320->9887|13355->9889|13742->10248|13756->10252|13823->10296|13935->10380|13949->10384|13985->10409|14033->10417|14064->10419|14108->10437|14139->10438|14266->10537|14282->10543|14345->10584|14452->10663|14466->10667|14502->10693|14550->10702|14580->10704|14611->10710|14850->10921|14864->10925|14883->10934|14931->10943|15010->10993|15044->10999|15069->11002|15153->11054|15224->11096|15533->11634|15604->11676|15931->11975|15947->11981|16011->12022|16299->12278|16354->12305|16378->12319|16419->12321|16478->12351|16584->12429|16600->12435|16663->12476|16788->12572|16803->12576|16854->12616|16902->12624|16933->12625|16992->12655|17006->12658|17033->12662|17068->12664|17464->13032|17478->13036|17545->13080|17657->13164|17671->13168|17707->13193|17755->13201|17786->13203|17830->13221|17861->13222|17988->13321|18004->13327|18067->13368|18174->13447|18188->13451|18224->13477|18272->13486|18302->13488|18333->13494|18572->13705|18586->13709|18605->13718|18653->13727|18732->13777|18766->13783|18791->13786|18875->13838|18946->13880|19257->14420|19328->14462|19655->14761|19671->14767|19735->14808|20023->15064|20078->15087|20121->15101|20402->15354|20432->15374|20473->15376|20516->15390|20803->15645|20843->15657|20921->15732|20955->15738|21268->16022|21298->16023|21332->16029|21627->16296|21656->16297|21709->16319
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|35->15|35->15|35->15|35->15|36->16|36->16|36->16|36->16|36->16|36->16|36->16|36->16|37->17|38->18|49->29|49->29|49->29|49->29|49->29|49->29|49->29|51->37|52->38|56->47|57->48|63->54|63->54|63->54|63->54|65->59|66->60|73->67|74->68|74->68|74->68|75->69|76->70|76->70|76->70|82->76|82->76|82->76|83->77|85->79|86->80|86->80|86->80|87->81|87->81|87->81|88->82|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|95->89|95->89|95->89|96->90|96->90|96->90|96->90|96->90|96->90|96->90|99->93|99->93|99->93|99->93|99->93|99->93|103->97|103->97|103->97|103->97|104->98|104->98|104->98|105->99|106->100|111->105|112->106|117->111|117->111|117->111|122->116|123->117|123->117|123->117|124->118|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|131->125|131->125|131->125|132->126|132->126|132->126|132->126|132->126|132->126|132->126|134->128|134->128|134->128|135->129|135->129|135->129|135->129|135->129|135->129|139->133|139->133|139->133|139->133|140->134|140->134|140->134|141->135|142->136|147->141|148->142|153->147|153->147|153->147|158->152|159->153|159->153|159->153|160->154|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|168->162|168->162|168->162|169->163|169->163|169->163|169->163|169->163|169->163|169->163|171->165|171->165|171->165|172->166|172->166|172->166|172->166|172->166|172->166|176->170|176->170|176->170|176->170|177->171|177->171|177->171|178->172|179->173|184->178|185->179|190->184|190->184|190->184|196->190|197->191|197->191|197->191|198->192|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|207->201|207->201|207->201|208->202|208->202|208->202|208->202|208->202|208->202|208->202|210->204|210->204|210->204|211->205|211->205|211->205|211->205|211->205|211->205|215->209|215->209|215->209|215->209|216->210|216->210|216->210|217->211|218->212|224->218|225->219|230->224|230->224|230->224|236->230|237->231|238->232|247->241|247->241|247->241|248->242|254->248|256->250|259->253|260->254|265->259|265->259|266->260|270->264|270->264|272->266
                  -- GENERATED --
              */
          