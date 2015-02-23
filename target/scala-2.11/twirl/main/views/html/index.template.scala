
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
                                """),format.raw/*16.33*/("""<li><a href=""""),_display_(/*16.47*/routes/*16.53*/.Application.blogCategory(cat._1)),format.raw/*16.86*/("""" """),_display_(/*16.89*/if(cat._1.contains("kon"))/*16.115*/{_display_(Seq[Any](format.raw/*16.116*/("""class="kon"""")))}),format.raw/*16.128*/(""">"""),_display_(/*16.130*/cat/*16.133*/._2),format.raw/*16.136*/("""</a></li>
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



                    """),_display_(/*83.22*/for((post, count) <- posts.zipWithIndex) yield /*83.62*/{_display_(Seq[Any](format.raw/*83.63*/("""
                        """),_display_(/*84.26*/if(count == 0)/*84.40*/ {_display_(Seq[Any](format.raw/*84.42*/("""
                            """),format.raw/*85.29*/("""<div class="box-6col">
                                <a href=""""),_display_(/*86.43*/routes/*86.49*/.Application.blogPost(post.id, post.slug)),format.raw/*86.90*/("""" class="dg-feed__image box-6col-imgwrapper" """),_display_(/*86.136*/post/*86.140*/.getImage("blog.image", "postthumb").map/*86.180*/ {img =>_display_(Seq[Any](format.raw/*86.188*/(""" """),format.raw/*86.189*/("""style="background-image: url("""),_display_(/*86.219*/img/*86.222*/.url),format.raw/*86.226*/(""")""")))}),format.raw/*86.228*/("""">
                                <span class="read-more button">ЧИТАТЬ</span>
                                </a>
                                <div class="clear"></div>
                                <div class="dg-feed__info">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*92.81*/post/*92.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*92.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*93.79*/post/*93.83*/.getText("blog.body").map/*93.108*/{text =>_display_(Seq[Any](format.raw/*93.116*/(""" """),_display_(/*93.118*/{text.length/900})))}),format.raw/*93.136*/(""" """),format.raw/*93.137*/("""мин</p>
                                    </div>
                                    <div class="dg-feed__info__header">
                                        <h2>"""),_display_(/*96.46*/post/*96.50*/.getText("blog.title").map/*96.76*/{title =>_display_(Seq[Any](format.raw/*96.85*/(""" """),_display_(/*96.87*/title)))}),format.raw/*96.93*/("""</h2>
                                    </div>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                        """),_display_(/*100.42*/post/*100.46*/.tags.map/*100.55*/ { tag =>_display_(Seq[Any](format.raw/*100.64*/("""
                                            """),format.raw/*101.45*/("""<li>#"""),_display_(/*101.51*/tag),format.raw/*101.54*/("""</li>
                                        """)))}),format.raw/*102.42*/("""
                                        """),format.raw/*103.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-white">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*108.312*/("""
                                        """),format.raw/*109.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*114.55*/routes/*114.61*/.Application.blogPost(post.id, post.slug)),format.raw/*114.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*119.26*/("""
                        """),_display_(/*120.26*/if(count == 1)/*120.40*/ {_display_(Seq[Any](format.raw/*120.42*/("""
                            """),format.raw/*121.29*/("""<div class="box-6col-horizont">
                                <a href=""""),_display_(/*122.43*/routes/*122.49*/.Application.blogPost(post.id, post.slug)),format.raw/*122.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper feed--arrow" """),_display_(/*122.157*/post/*122.161*/.getImage("blog.image", "postthumb").map/*122.201*/ {img =>_display_(Seq[Any](format.raw/*122.209*/(""" """),format.raw/*122.210*/("""style="background-image: url("""),_display_(/*122.240*/img/*122.243*/.url),format.raw/*122.247*/(""")""")))}),format.raw/*122.249*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*128.81*/post/*128.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*128.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*129.79*/post/*129.83*/.getText("blog.body").map/*129.108*/{text =>_display_(Seq[Any](format.raw/*129.116*/(""" """),_display_(/*129.118*/{text.length/900})))}),format.raw/*129.136*/(""" """),format.raw/*129.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*131.47*/routes/*131.53*/.Application.blogPost(post.id, post.slug)),format.raw/*131.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*132.46*/post/*132.50*/.getText("blog.title").map/*132.76*/{title =>_display_(Seq[Any](format.raw/*132.85*/(""" """),_display_(/*132.87*/title)))}),format.raw/*132.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*136.46*/post/*136.50*/.tags.map/*136.59*/ { tag =>_display_(Seq[Any](format.raw/*136.68*/("""
                                                """),format.raw/*137.49*/("""<li>#"""),_display_(/*137.55*/tag),format.raw/*137.58*/("""</li>
                                            """)))}),format.raw/*138.46*/("""
                                        """),format.raw/*139.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*144.304*/("""
                                        """),format.raw/*145.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*150.55*/routes/*150.61*/.Application.blogPost(post.id, post.slug)),format.raw/*150.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        """)))}),format.raw/*155.26*/("""
                        """),_display_(/*156.26*/if(count == 2)/*156.40*/ {_display_(Seq[Any](format.raw/*156.42*/("""
                            """),format.raw/*157.29*/("""<div class="box-6col-horizont">

                                <a href=""""),_display_(/*159.43*/routes/*159.49*/.Application.blogPost(post.id, post.slug)),format.raw/*159.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box--left feed--arrow" """),_display_(/*159.167*/post/*159.171*/.getImage("blog.image", "postthumb").map/*159.211*/ {img =>_display_(Seq[Any](format.raw/*159.219*/(""" """),format.raw/*159.220*/("""style="background-image: url("""),_display_(/*159.250*/img/*159.253*/.url),format.raw/*159.257*/(""")""")))}),format.raw/*159.259*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box--right">
                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*165.81*/post/*165.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*165.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*166.79*/post/*166.83*/.getText("blog.body").map/*166.108*/{text =>_display_(Seq[Any](format.raw/*166.116*/(""" """),_display_(/*166.118*/{text.length/900})))}),format.raw/*166.136*/(""" """),format.raw/*166.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*168.47*/routes/*168.53*/.Application.blogPost(post.id, post.slug)),format.raw/*168.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*169.46*/post/*169.50*/.getText("blog.title").map/*169.76*/{title =>_display_(Seq[Any](format.raw/*169.85*/(""" """),_display_(/*169.87*/title)))}),format.raw/*169.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*173.46*/post/*173.50*/.tags.map/*173.59*/ { tag =>_display_(Seq[Any](format.raw/*173.68*/("""
                                                """),format.raw/*174.49*/("""<li>#"""),_display_(/*174.55*/tag),format.raw/*174.58*/("""</li>
                                            """)))}),format.raw/*175.46*/("""
                                        """),format.raw/*176.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">
                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*181.304*/("""
                                        """),format.raw/*182.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*187.55*/routes/*187.61*/.Application.blogPost(post.id, post.slug)),format.raw/*187.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        """)))}),format.raw/*193.26*/("""
                        """),_display_(/*194.26*/if(count == 3)/*194.40*/ {_display_(Seq[Any](format.raw/*194.42*/("""
                            """),format.raw/*195.29*/("""<div class="box-12col-horizont">

                                <a href=""""),_display_(/*197.43*/routes/*197.49*/.Application.blogPost(post.id, post.slug)),format.raw/*197.90*/("""" class="dg-feed__image box-6col-horizont-imgwrapper box-3col-horizont-imgwrapper feed--arrow" """),_display_(/*197.186*/post/*197.190*/.getImage("blog.image", "postthumb").map/*197.230*/ {img =>_display_(Seq[Any](format.raw/*197.238*/(""" """),format.raw/*197.239*/("""style="background-image: url("""),_display_(/*197.269*/img/*197.272*/.url),format.raw/*197.276*/(""")""")))}),format.raw/*197.278*/("""">
                                    <span class="read-more button">ЧИТАТЬ</span>
                                </a>

                                <div class="dg-feed__info--horizont box-9col-horizont">

                                    <div class="dg-feed__info__util">
                                        <p class="dg-feed__info__util__sector">"""),_display_(/*204.81*/post/*204.85*/.getText("blog.category").getOrElse("Общая")),format.raw/*204.129*/("""</p>
                                        <p class="dg-feed__info__util__time">"""),_display_(/*205.79*/post/*205.83*/.getText("blog.body").map/*205.108*/{text =>_display_(Seq[Any](format.raw/*205.116*/(""" """),_display_(/*205.118*/{text.length/900})))}),format.raw/*205.136*/(""" """),format.raw/*205.137*/("""мин</p>
                                    </div>
                                    <a href=""""),_display_(/*207.47*/routes/*207.53*/.Application.blogPost(post.id, post.slug)),format.raw/*207.94*/("""" class="dg-feed__info__header">
                                        <h2>"""),_display_(/*208.46*/post/*208.50*/.getText("blog.title").map/*208.76*/{title =>_display_(Seq[Any](format.raw/*208.85*/(""" """),_display_(/*208.87*/title)))}),format.raw/*208.93*/("""</h2>
                                    </a>
                                    <div class="dg-feed__info__tags">
                                        <ul>
                                            """),_display_(/*212.46*/post/*212.50*/.tags.map/*212.59*/ { tag =>_display_(Seq[Any](format.raw/*212.68*/("""
                                                """),format.raw/*213.49*/("""<li>#"""),_display_(/*213.55*/tag),format.raw/*213.58*/("""</li>
                                            """)))}),format.raw/*214.46*/("""
                                        """),format.raw/*215.41*/("""</ul>
                                    </div>
                                    <hr class="delimeter-gray">

                                    <ul class="dg-feed__info__actions">
                                        <li>
                                            """),format.raw/*221.304*/("""
                                        """),format.raw/*222.41*/("""</li>
                                        <li>
                                            <a href="#" class="dg-feed__info__actions--like"></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*227.55*/routes/*227.61*/.Application.blogPost(post.id, post.slug)),format.raw/*227.102*/("""#disqus_thread" class="dg-feed__info__actions--comment">0</a>
                                        </li>
                                    </ul>

                                </div>
                            </div>
                        """)))}),format.raw/*233.26*/("""
                    """)))}),format.raw/*234.22*/("""
            """),format.raw/*235.13*/("""</div>

        <div class="clear"></div>
    
        <div class="empty-posts">
            <div class="container">
                <h2 class="empty-posts-text">В данной категории еще нет статей</h2>
            </div>
        </div>
        """),_display_(/*244.10*/if(posts.length > 4)/*244.30*/ {_display_(Seq[Any](format.raw/*244.32*/("""
            """),format.raw/*245.13*/("""<div class="dg-feed__btn-wrapper">
                <a class="dg-feed__btn" href="#" data-next-page="2">
                    <span class="load-icon"></span>
                    <span>ЕЩЕ СТАТЬИ</span>
                </a>
            </div>
        """)))}),format.raw/*251.10*/("""

        """),format.raw/*253.9*/("""<div class="clear"></div>
    </section>

    """),format.raw/*256.31*/("""
    """),format.raw/*257.5*/("""<script type="text/javascript">
    /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
    var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

    /* * * DON'T EDIT BELOW THIS LINE * * */
    (function () """),format.raw/*262.18*/("""{"""),format.raw/*262.19*/("""
    """),format.raw/*263.5*/("""var s = document.createElement('script'); s.async = true;
    s.type = 'text/javascript';
    s.src = '//' + disqus_shortname + '.disqus.com/count.js';
    (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
    """),format.raw/*267.5*/("""}"""),format.raw/*267.6*/("""());
    </script>
""")))}),format.raw/*269.2*/("""
"""))}
  }

  def render(posts:Seq[io.prismic.Document],firstPost:Seq[io.prismic.Document],authors:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(posts,firstPost,authors,blogCategories)(ctx)

  def f:((Seq[io.prismic.Document],Seq[io.prismic.Document],Seq[io.prismic.Document],collection.immutable.ListMap[String, String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (posts,firstPost,authors,blogCategories) => (ctx) => apply(posts,firstPost,authors,blogCategories)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 03:45:43 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/index.scala.html
                  HASH: 1441a56f1d9e073274d12b3b41991c9a43b0ac84
                  MATRIX: 634->1|933->198|963->218|991->221|1150->371|1189->372|1221->378|1793->923|1816->937|1829->941|1873->947|1935->981|1976->995|1991->1001|2045->1034|2075->1037|2111->1063|2151->1064|2195->1076|2225->1078|2238->1081|2263->1084|2334->1124|2388->1150|2809->1543|2838->1544|2975->1652|3005->1653|3147->1766|3177->1767|3207->1768|3283->2082|3333->2104|3620->2649|3670->2671|4043->3016|4072->3017|4132->3049|4162->3050|4265->3316|4319->3342|4451->3464|4488->3474|4559->3517|4588->3518|4625->3528|4763->3638|4792->3639|4821->3640|5207->3999|5236->4000|5265->4001|5316->4046|5363->4066|5465->4141|5521->4181|5560->4182|5614->4209|5637->4223|5677->4225|5735->4255|5828->4321|5843->4327|5905->4368|5979->4414|5993->4418|6043->4458|6090->4466|6120->4467|6178->4497|6191->4500|6217->4504|6251->4506|6669->4897|6682->4901|6748->4945|6859->5029|6872->5033|6907->5058|6954->5066|6984->5068|7027->5086|7057->5087|7255->5258|7268->5262|7303->5288|7350->5297|7379->5299|7409->5305|7646->5514|7660->5518|7679->5527|7727->5536|7802->5582|7836->5588|7861->5591|7941->5639|8012->5681|8322->6228|8393->6270|8720->6569|8736->6575|8800->6616|9086->6870|9141->6897|9165->6911|9206->6913|9265->6943|9368->7018|9384->7024|9447->7065|9543->7132|9558->7136|9609->7176|9657->7184|9688->7185|9747->7215|9761->7218|9788->7222|9823->7224|10199->7572|10213->7576|10280->7620|10392->7704|10406->7708|10442->7733|10490->7741|10521->7743|10565->7761|10596->7762|10723->7861|10739->7867|10802->7908|10909->7987|10923->7991|10959->8017|11007->8026|11037->8028|11068->8034|11307->8245|11321->8249|11340->8258|11388->8267|11467->8317|11501->8323|11526->8326|11610->8378|11681->8420|11990->8958|12061->9000|12388->9299|12404->9305|12468->9346|12754->9600|12809->9627|12833->9641|12874->9643|12933->9673|13038->9750|13054->9756|13117->9797|13223->9874|13238->9878|13289->9918|13337->9926|13368->9927|13427->9957|13441->9960|13468->9964|13503->9966|13890->10325|13904->10329|13971->10373|14083->10457|14097->10461|14133->10486|14181->10494|14212->10496|14256->10514|14287->10515|14414->10614|14430->10620|14493->10661|14600->10740|14614->10744|14650->10770|14698->10779|14728->10781|14759->10787|14998->10998|15012->11002|15031->11011|15079->11020|15158->11070|15192->11076|15217->11079|15301->11131|15372->11173|15681->11711|15752->11753|16079->12052|16095->12058|16159->12099|16447->12355|16502->12382|16526->12396|16567->12398|16626->12428|16732->12506|16748->12512|16811->12553|16936->12649|16951->12653|17002->12693|17050->12701|17081->12702|17140->12732|17154->12735|17181->12739|17216->12741|17612->13109|17626->13113|17693->13157|17805->13241|17819->13245|17855->13270|17903->13278|17934->13280|17978->13298|18009->13299|18136->13398|18152->13404|18215->13445|18322->13524|18336->13528|18372->13554|18420->13563|18450->13565|18481->13571|18720->13782|18734->13786|18753->13795|18801->13804|18880->13854|18914->13860|18939->13863|19023->13915|19094->13957|19405->14497|19476->14539|19803->14838|19819->14844|19883->14885|20171->15141|20226->15164|20269->15178|20550->15431|20580->15451|20621->15453|20664->15467|20951->15722|20991->15734|21069->15809|21103->15815|21416->16099|21446->16100|21480->16106|21775->16373|21804->16374|21857->16396
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|35->15|35->15|35->15|35->15|36->16|36->16|36->16|36->16|36->16|36->16|36->16|36->16|36->16|36->16|36->16|37->17|38->18|49->29|49->29|49->29|49->29|49->29|49->29|49->29|51->37|52->38|56->47|57->48|63->54|63->54|63->54|63->54|65->59|66->60|73->67|74->68|74->68|74->68|75->69|76->70|76->70|76->70|82->76|82->76|82->76|83->77|85->79|89->83|89->83|89->83|90->84|90->84|90->84|91->85|92->86|92->86|92->86|92->86|92->86|92->86|92->86|92->86|92->86|92->86|92->86|92->86|98->92|98->92|98->92|99->93|99->93|99->93|99->93|99->93|99->93|99->93|102->96|102->96|102->96|102->96|102->96|102->96|106->100|106->100|106->100|106->100|107->101|107->101|107->101|108->102|109->103|114->108|115->109|120->114|120->114|120->114|125->119|126->120|126->120|126->120|127->121|128->122|128->122|128->122|128->122|128->122|128->122|128->122|128->122|128->122|128->122|128->122|128->122|134->128|134->128|134->128|135->129|135->129|135->129|135->129|135->129|135->129|135->129|137->131|137->131|137->131|138->132|138->132|138->132|138->132|138->132|138->132|142->136|142->136|142->136|142->136|143->137|143->137|143->137|144->138|145->139|150->144|151->145|156->150|156->150|156->150|161->155|162->156|162->156|162->156|163->157|165->159|165->159|165->159|165->159|165->159|165->159|165->159|165->159|165->159|165->159|165->159|165->159|171->165|171->165|171->165|172->166|172->166|172->166|172->166|172->166|172->166|172->166|174->168|174->168|174->168|175->169|175->169|175->169|175->169|175->169|175->169|179->173|179->173|179->173|179->173|180->174|180->174|180->174|181->175|182->176|187->181|188->182|193->187|193->187|193->187|199->193|200->194|200->194|200->194|201->195|203->197|203->197|203->197|203->197|203->197|203->197|203->197|203->197|203->197|203->197|203->197|203->197|210->204|210->204|210->204|211->205|211->205|211->205|211->205|211->205|211->205|211->205|213->207|213->207|213->207|214->208|214->208|214->208|214->208|214->208|214->208|218->212|218->212|218->212|218->212|219->213|219->213|219->213|220->214|221->215|227->221|228->222|233->227|233->227|233->227|239->233|240->234|241->235|250->244|250->244|250->244|251->245|257->251|259->253|262->256|263->257|268->262|268->262|269->263|273->267|273->267|275->269
                  -- GENERATED --
              */
          