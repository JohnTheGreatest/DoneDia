
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
"""),_display_(/*5.2*/main("Информационно-аналитический молодежный портал", Option("big"), Option(firstPost.take(1).head), Option(authors), blogCategories = blogCategories)/*5.152*/{_display_(Seq[Any](format.raw/*5.153*/("""
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
                        <div class="fb-like" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
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
                  DATE: Mon Feb 23 16:53:02 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/index.scala.html
                  HASH: e4b3fd5e4bef79c0a7230f8ec234a834383502ca
                  MATRIX: 634->1|933->198|963->218|991->221|1150->371|1189->372|1221->378|1793->923|1816->937|1829->941|1873->947|1935->981|1970->989|2005->1015|2044->1016|2087->1028|2116->1030|2128->1033|2152->1036|2223->1076|2277->1102|2698->1495|2727->1496|2864->1604|2894->1605|3036->1718|3066->1719|3096->1720|3172->2034|3222->2056|3509->2601|3559->2623|3932->2968|3961->2969|4021->3001|4051->3002|4154->3268|4208->3294|4340->3416|4377->3426|4448->3469|4477->3470|4514->3480|4652->3590|4681->3591|4710->3592|5096->3951|5125->3952|5154->3953|5205->3998|5252->4018|5348->4087|5404->4127|5443->4128|5497->4155|5520->4169|5560->4171|5618->4201|5711->4267|5726->4273|5788->4314|5862->4360|5876->4364|5926->4404|5973->4412|6003->4413|6061->4443|6074->4446|6100->4450|6134->4452|6552->4843|6565->4847|6631->4891|6742->4975|6755->4979|6790->5004|6837->5012|6867->5014|6910->5032|6940->5033|7138->5204|7151->5208|7186->5234|7233->5243|7262->5245|7292->5251|7528->5460|7541->5464|7559->5473|7606->5482|7680->5528|7713->5534|7737->5537|7816->5585|7887->5627|8197->6174|8268->6216|8595->6515|8611->6521|8675->6562|8961->6816|9016->6843|9040->6857|9081->6859|9140->6889|9243->6964|9259->6970|9322->7011|9418->7078|9433->7082|9484->7122|9532->7130|9563->7131|9622->7161|9636->7164|9663->7168|9698->7170|10074->7518|10088->7522|10155->7566|10267->7650|10281->7654|10317->7679|10365->7687|10396->7689|10440->7707|10471->7708|10598->7807|10614->7813|10677->7854|10784->7933|10798->7937|10834->7963|10882->7972|10912->7974|10943->7980|11182->8191|11196->8195|11215->8204|11263->8213|11342->8263|11376->8269|11401->8272|11485->8324|11556->8366|11865->8904|11936->8946|12263->9245|12279->9251|12343->9292|12629->9546|12684->9573|12708->9587|12749->9589|12808->9619|12913->9696|12929->9702|12992->9743|13098->9820|13113->9824|13164->9864|13212->9872|13243->9873|13302->9903|13316->9906|13343->9910|13378->9912|13765->10271|13779->10275|13846->10319|13958->10403|13972->10407|14008->10432|14056->10440|14087->10442|14131->10460|14162->10461|14289->10560|14305->10566|14368->10607|14475->10686|14489->10690|14525->10716|14573->10725|14603->10727|14634->10733|14873->10944|14887->10948|14906->10957|14954->10966|15033->11016|15067->11022|15092->11025|15176->11077|15247->11119|15556->11657|15627->11699|15954->11998|15970->12004|16034->12045|16322->12301|16377->12328|16401->12342|16442->12344|16501->12374|16607->12452|16623->12458|16686->12499|16811->12595|16826->12599|16877->12639|16925->12647|16956->12648|17015->12678|17029->12681|17056->12685|17091->12687|17487->13055|17501->13059|17568->13103|17680->13187|17694->13191|17730->13216|17778->13224|17809->13226|17853->13244|17884->13245|18011->13344|18027->13350|18090->13391|18197->13470|18211->13474|18247->13500|18295->13509|18325->13511|18356->13517|18595->13728|18609->13732|18628->13741|18676->13750|18755->13800|18789->13806|18814->13809|18898->13861|18969->13903|19280->14443|19351->14485|19678->14784|19694->14790|19758->14831|20046->15087|20101->15110|20144->15124|20425->15377|20455->15397|20496->15399|20539->15413|20826->15668|20866->15680|20944->15755|20978->15761|21291->16045|21321->16046|21355->16052|21650->16319|21679->16320|21732->16342
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|35->15|35->15|35->15|35->15|36->16|36->16|36->16|36->16|36->16|36->16|36->16|36->16|37->17|38->18|49->29|49->29|49->29|49->29|49->29|49->29|49->29|51->37|52->38|56->47|57->48|63->54|63->54|63->54|63->54|65->59|66->60|73->67|74->68|74->68|74->68|75->69|76->70|76->70|76->70|82->76|82->76|82->76|83->77|85->79|86->80|86->80|86->80|87->81|87->81|87->81|88->82|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|95->89|95->89|95->89|96->90|96->90|96->90|96->90|96->90|96->90|96->90|99->93|99->93|99->93|99->93|99->93|99->93|103->97|103->97|103->97|103->97|104->98|104->98|104->98|105->99|106->100|111->105|112->106|117->111|117->111|117->111|122->116|123->117|123->117|123->117|124->118|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|131->125|131->125|131->125|132->126|132->126|132->126|132->126|132->126|132->126|132->126|134->128|134->128|134->128|135->129|135->129|135->129|135->129|135->129|135->129|139->133|139->133|139->133|139->133|140->134|140->134|140->134|141->135|142->136|147->141|148->142|153->147|153->147|153->147|158->152|159->153|159->153|159->153|160->154|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|168->162|168->162|168->162|169->163|169->163|169->163|169->163|169->163|169->163|169->163|171->165|171->165|171->165|172->166|172->166|172->166|172->166|172->166|172->166|176->170|176->170|176->170|176->170|177->171|177->171|177->171|178->172|179->173|184->178|185->179|190->184|190->184|190->184|196->190|197->191|197->191|197->191|198->192|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|207->201|207->201|207->201|208->202|208->202|208->202|208->202|208->202|208->202|208->202|210->204|210->204|210->204|211->205|211->205|211->205|211->205|211->205|211->205|215->209|215->209|215->209|215->209|216->210|216->210|216->210|217->211|218->212|224->218|225->219|230->224|230->224|230->224|236->230|237->231|238->232|247->241|247->241|247->241|248->242|254->248|256->250|259->253|260->254|265->259|265->259|266->260|270->264|270->264|272->266
                  -- GENERATED --
              */
          