
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
                  DATE: Thu Feb 26 00:49:19 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/index.scala.html
                  HASH: 15e8ae475692b344c1f19f530d247a36f824609c
                  MATRIX: 634->1|933->198|961->215|988->217|1147->367|1186->368|1217->373|1780->909|1803->923|1816->927|1860->933|1921->966|1956->974|1991->1000|2030->1001|2073->1013|2102->1015|2114->1018|2138->1021|2208->1060|2261->1085|2671->1467|2700->1468|2837->1576|2867->1577|3009->1690|3039->1691|3069->1692|3143->1998|3192->2019|3452->2532|3501->2553|3868->2892|3897->2893|3957->2925|3987->2926|4088->3187|4141->3212|4266->3327|4302->3336|4373->3379|4402->3380|4438->3389|4575->3498|4604->3499|4633->3500|5013->3853|5042->3854|5071->3855|5121->3899|5166->3917|5261->3985|5317->4025|5356->4026|5409->4052|5432->4066|5472->4068|5529->4097|5621->4162|5636->4168|5698->4209|5772->4255|5786->4259|5836->4299|5883->4307|5913->4308|5971->4338|5984->4341|6010->4345|6044->4347|6456->4732|6469->4736|6535->4780|6645->4863|6658->4867|6693->4892|6740->4900|6770->4902|6813->4920|6843->4921|7038->5089|7051->5093|7086->5119|7133->5128|7162->5130|7192->5136|7424->5341|7437->5345|7455->5354|7502->5363|7575->5408|7608->5414|7632->5417|7710->5464|7780->5505|8085->6047|8155->6088|8477->6382|8493->6388|8557->6429|8838->6678|8892->6704|8916->6718|8957->6720|9015->6749|9117->6823|9133->6829|9196->6870|9292->6937|9307->6941|9358->6981|9406->6989|9437->6990|9496->7020|9510->7023|9537->7027|9572->7029|9942->7371|9956->7375|10023->7419|10134->7502|10148->7506|10184->7531|10232->7539|10263->7541|10307->7559|10338->7560|10463->7657|10479->7663|10542->7704|10648->7782|10662->7786|10698->7812|10746->7821|10776->7823|10807->7829|11042->8036|11056->8040|11075->8049|11123->8058|11201->8107|11235->8113|11260->8116|11343->8167|11413->8208|11717->8741|11787->8782|12109->9076|12125->9082|12189->9123|12470->9372|12524->9398|12548->9412|12589->9414|12647->9443|12750->9518|12766->9524|12829->9565|12935->9642|12950->9646|13001->9686|13049->9694|13080->9695|13139->9725|13153->9728|13180->9732|13215->9734|13596->10087|13610->10091|13677->10135|13788->10218|13802->10222|13838->10247|13886->10255|13917->10257|13961->10275|13992->10276|14117->10373|14133->10379|14196->10420|14302->10498|14316->10502|14352->10528|14400->10537|14430->10539|14461->10545|14696->10752|14710->10756|14729->10765|14777->10774|14855->10823|14889->10829|14914->10832|14997->10883|15067->10924|15371->11457|15441->11498|15763->11792|15779->11798|15843->11839|16125->12089|16179->12115|16203->12129|16244->12131|16302->12160|16406->12236|16422->12242|16485->12283|16610->12379|16625->12383|16676->12423|16724->12431|16755->12432|16814->12462|16828->12465|16855->12469|16890->12471|17279->12832|17293->12836|17360->12880|17471->12963|17485->12967|17521->12992|17569->13000|17600->13002|17644->13020|17675->13021|17800->13118|17816->13124|17879->13165|17985->13243|17999->13247|18035->13273|18083->13282|18113->13284|18144->13290|18379->13497|18393->13501|18412->13510|18460->13519|18538->13568|18572->13574|18597->13577|18680->13628|18750->13669|19055->14203|19125->14244|19447->14538|19463->14544|19527->14585|19809->14835|19863->14857|19905->14870|20177->15114|20207->15134|20248->15136|20290->15149|20571->15398|20609->15408|20684->15480|20717->15485|21025->15764|21055->15765|21088->15770|21379->16033|21408->16034|21459->16054
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|35->15|35->15|35->15|35->15|36->16|36->16|36->16|36->16|36->16|36->16|36->16|36->16|37->17|38->18|49->29|49->29|49->29|49->29|49->29|49->29|49->29|51->37|52->38|56->47|57->48|63->54|63->54|63->54|63->54|65->59|66->60|73->67|74->68|74->68|74->68|75->69|76->70|76->70|76->70|82->76|82->76|82->76|83->77|85->79|86->80|86->80|86->80|87->81|87->81|87->81|88->82|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|89->83|95->89|95->89|95->89|96->90|96->90|96->90|96->90|96->90|96->90|96->90|99->93|99->93|99->93|99->93|99->93|99->93|103->97|103->97|103->97|103->97|104->98|104->98|104->98|105->99|106->100|111->105|112->106|117->111|117->111|117->111|122->116|123->117|123->117|123->117|124->118|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|125->119|131->125|131->125|131->125|132->126|132->126|132->126|132->126|132->126|132->126|132->126|134->128|134->128|134->128|135->129|135->129|135->129|135->129|135->129|135->129|139->133|139->133|139->133|139->133|140->134|140->134|140->134|141->135|142->136|147->141|148->142|153->147|153->147|153->147|158->152|159->153|159->153|159->153|160->154|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|162->156|168->162|168->162|168->162|169->163|169->163|169->163|169->163|169->163|169->163|169->163|171->165|171->165|171->165|172->166|172->166|172->166|172->166|172->166|172->166|176->170|176->170|176->170|176->170|177->171|177->171|177->171|178->172|179->173|184->178|185->179|190->184|190->184|190->184|196->190|197->191|197->191|197->191|198->192|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|200->194|207->201|207->201|207->201|208->202|208->202|208->202|208->202|208->202|208->202|208->202|210->204|210->204|210->204|211->205|211->205|211->205|211->205|211->205|211->205|215->209|215->209|215->209|215->209|216->210|216->210|216->210|217->211|218->212|224->218|225->219|230->224|230->224|230->224|236->230|237->231|238->232|247->241|247->241|247->241|248->242|254->248|256->250|259->253|260->254|265->259|265->259|266->260|270->264|270->264|272->266
                  -- GENERATED --
              */
          