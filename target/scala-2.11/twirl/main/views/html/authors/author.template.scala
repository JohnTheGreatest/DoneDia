
package views.html.authors

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
object author extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[io.prismic.Document,collection.immutable.ListMap[String, String],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(author: io.prismic.Document, blogCategories: collection.immutable.ListMap[String,String])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import Html._
def /*5.2*/title/*5.7*/ = {{author.getText("author.full_name").map{name=>name}}};
Seq[Any](format.raw/*1.123*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.63*/("""

"""),_display_(/*7.2*/mainContent("Авторы", title.get, blogCategories)/*7.50*/ {_display_(Seq[Any](format.raw/*7.52*/("""
    """),format.raw/*8.5*/("""<section class="dg-feed">
        <div class="container">

            <div class="dg-feed__social">

                <ul class="clear">
                    <li>
                        <a href="https://twitter.com/share" class="twitter-share-button" data-via="diapost" data-hashtags="diapost">Tweet</a>
                        <script>!function(d,s,id)"""),format.raw/*16.50*/("""{"""),format.raw/*16.51*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*16.159*/("""{"""),format.raw/*16.160*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*16.273*/("""}"""),format.raw/*16.274*/("""}"""),format.raw/*16.275*/("""(document, 'script', 'twitter-wjs');</script>

                        """),format.raw/*24.27*/("""
                    """),format.raw/*25.21*/("""</li>

                    <li>
                        <div class="fb-like" data-href="http://www.diapost.ru/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
                        """),format.raw/*34.27*/("""
                    """),format.raw/*35.21*/("""</li>

                    <li>
                        <a href="#" class="dg-feed__social__vkontakte">
                                <!-- Put this script tag to the place, where the Share button will be -->
                            <script type="text/javascript"><!--
                            document.write(VK.Share.button(false,"""),format.raw/*41.66*/("""{"""),format.raw/*41.67*/("""type: "round", text: "Сохранить""""),format.raw/*41.99*/("""}"""),format.raw/*41.100*/("""));
                            --></script>
                            """),format.raw/*46.31*/("""
                        """),format.raw/*47.25*/("""</a>
                    </li>
                </ul>

            </div>
        </div>

        <div class="container">
            <div class="dg-blog__body">
                <article>
                    <div class="eugene-author">
                        <img src=""""),_display_(/*58.36*/author/*58.42*/.getImage("author.image", "authorthumbbig").map/*58.89*/{imgUrl=>_display_(_display_(/*58.99*/imgUrl/*58.105*/.url))}),format.raw/*58.110*/("""" class="eugene-author__photo"/>
                        <p>"""),_display_(/*59.29*/author/*59.35*/.getText("author.full_name").map/*59.67*/{name=>_display_(_display_(/*59.75*/name))}),format.raw/*59.80*/("""</p>
                    </div>
                    """),_display_(/*61.22*/author/*61.28*/.getHtml("author.about", ctx.linkResolver).map(Html.apply)),format.raw/*61.86*/("""
                """),format.raw/*62.17*/("""</article>
            </div>
        </div>

        """),format.raw/*66.27*/("""
        """),format.raw/*67.9*/("""<script type="text/javascript">(function() """),format.raw/*67.52*/("""{"""),format.raw/*67.53*/("""
        """),format.raw/*68.9*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
        if (window.ifpluso==undefined) """),format.raw/*69.40*/("""{"""),format.raw/*69.41*/(""" """),format.raw/*69.42*/("""window.ifpluso = 1;
        var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
        s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
        s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
        var h=d[g]('body')[0];
        h.appendChild(s);
        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/("""}"""),format.raw/*75.11*/(""")();</script>
        """),format.raw/*76.31*/("""

        """),format.raw/*78.9*/("""<div class="clear"></div>

    </section>

    """),format.raw/*82.31*/("""
    """),format.raw/*83.5*/("""<script type="text/javascript">
    /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
    var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

    /* * * DON'T EDIT BELOW THIS LINE * * */
    (function () """),format.raw/*88.18*/("""{"""),format.raw/*88.19*/("""
    """),format.raw/*89.5*/("""var s = document.createElement('script'); s.async = true;
    s.type = 'text/javascript';
    s.src = '//' + disqus_shortname + '.disqus.com/count.js';
    (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""());
    </script>
""")))}),format.raw/*95.2*/("""
"""))}
  }

  def render(author:io.prismic.Document,blogCategories:collection.immutable.ListMap[String, String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(author,blogCategories)(ctx)

  def f:((io.prismic.Document,collection.immutable.ListMap[String, String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (author,blogCategories) => (ctx) => apply(author,blogCategories)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 00:49:19 MSK 2015
                  SOURCE: /home/n0tel/projects/DoneDia/app/views/authors/author.scala.html
                  HASH: c75d6b32c0e62c5c1b739369b4888a471030892d
                  MATRIX: 588->1|793->141|805->146|892->122|920->139|948->202|976->205|1032->253|1071->255|1102->260|1483->613|1512->614|1649->722|1679->723|1821->836|1851->837|1881->838|1980->1176|2029->1197|2289->1698|2338->1719|2705->2058|2734->2059|2794->2091|2824->2092|2925->2349|2978->2374|3275->2644|3290->2650|3346->2697|3384->2707|3400->2713|3429->2718|3517->2779|3532->2785|3573->2817|3609->2825|3637->2830|3717->2883|3732->2889|3811->2947|3856->2964|3938->3036|3974->3045|4045->3088|4074->3089|4110->3098|4247->3207|4276->3208|4305->3209|4685->3562|4714->3563|4743->3564|4793->3608|4830->3618|4905->3691|4937->3696|5244->3975|5273->3976|5305->3981|5595->4244|5623->4245|5673->4265
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|28->8|36->16|36->16|36->16|36->16|36->16|36->16|36->16|38->24|39->25|43->34|44->35|50->41|50->41|50->41|50->41|52->46|53->47|64->58|64->58|64->58|64->58|64->58|64->58|65->59|65->59|65->59|65->59|65->59|67->61|67->61|67->61|68->62|72->66|73->67|73->67|73->67|74->68|75->69|75->69|75->69|81->75|81->75|81->75|82->76|84->78|88->82|89->83|94->88|94->88|95->89|99->93|99->93|101->95
                  -- GENERATED --
              */
          