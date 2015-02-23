
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
object authors extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Seq[io.prismic.Document],collection.immutable.ListMap[String, String],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authors: Seq[io.prismic.Document], blogCategories: collection.immutable.ListMap[String,String])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import Html._

Seq[Any](format.raw/*1.129*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/mainContent("Авторы", "Авторы", blogCategories)/*5.49*/ {_display_(Seq[Any](format.raw/*5.51*/("""
    """),format.raw/*6.5*/("""<section class="dg-feed">
        <div class="container">

            <div class="dg-feed__social">

                <ul class="clear">
                    <li>
                        <a href="https://twitter.com/share" class="twitter-share-button" data-via="diapost" data-hashtags="diapost">Tweet</a>
                        <script>!function(d,s,id)"""),format.raw/*14.50*/("""{"""),format.raw/*14.51*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*14.159*/("""{"""),format.raw/*14.160*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*14.273*/("""}"""),format.raw/*14.274*/("""}"""),format.raw/*14.275*/("""(document, 'script', 'twitter-wjs');</script>

                        """),format.raw/*22.27*/("""
                    """),format.raw/*23.21*/("""</li>

                    <li>
                        <div class="fb-like" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="false"></div>
                        """),format.raw/*32.27*/("""
                    """),format.raw/*33.21*/("""</li>

                    <li>
                        <a href="#" class="dg-feed__social__vkontakte">
                                <!-- Put this script tag to the place, where the Share button will be -->
                            <script type="text/javascript"><!--
                            document.write(VK.Share.button(false,"""),format.raw/*39.66*/("""{"""),format.raw/*39.67*/("""type: "round", text: "Сохранить""""),format.raw/*39.99*/("""}"""),format.raw/*39.100*/("""));
                            --></script>
                            """),format.raw/*44.31*/("""
                        """),format.raw/*45.25*/("""</a>
                    </li>
                </ul>

            </div>
        </div>


        <section class="dg-team dg-authors">
            <div class="container">
                <ul class="dg-team__content">
                """),_display_(/*56.18*/authors/*56.25*/.map/*56.29*/{ author =>_display_(Seq[Any](format.raw/*56.40*/("""
                    """),format.raw/*57.21*/("""<li>
                        <a href=""""),_display_(/*58.35*/routes/*58.41*/.Application.author(author.id, author.slug)),format.raw/*58.84*/("""" class="dg-team__person box-6col-horizont-imgwrapper" style="background-image: url("""),_display_(/*58.169*/author/*58.175*/.getImage("author.image", "main").map/*58.212*/{imgUrl=>_display_(_display_(/*58.222*/imgUrl/*58.228*/.url))}),format.raw/*58.233*/(""")">
                            <div class="dg-team__person__hover flag">
                                <span class="flag__body">"""),_display_(/*60.59*/author/*60.65*/.getText("author.full_name").map/*60.97*/{name=>_display_(_display_(/*60.105*/name))}),format.raw/*60.110*/("""</span>
                            </div>
                        </a>
                    </li>
                """)))}),format.raw/*64.18*/("""
                """),format.raw/*65.17*/("""</ul>
            </div>
        </section>

        """),format.raw/*69.27*/("""
        """),format.raw/*70.9*/("""<script type="text/javascript">(function() """),format.raw/*70.52*/("""{"""),format.raw/*70.53*/("""
        """),format.raw/*71.9*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
        if (window.ifpluso==undefined) """),format.raw/*72.40*/("""{"""),format.raw/*72.41*/(""" """),format.raw/*72.42*/("""window.ifpluso = 1;
        var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
        s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
        s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
        var h=d[g]('body')[0];
        h.appendChild(s);
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""}"""),format.raw/*78.11*/(""")();</script>
        """),format.raw/*79.31*/("""

        """),format.raw/*81.9*/("""<div class="clear"></div>

    </section>

    """),format.raw/*85.31*/("""
    """),format.raw/*86.5*/("""<script type="text/javascript">
    /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
    var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

    /* * * DON'T EDIT BELOW THIS LINE * * */
    (function () """),format.raw/*91.18*/("""{"""),format.raw/*91.19*/("""
    """),format.raw/*92.5*/("""var s = document.createElement('script'); s.async = true;
    s.type = 'text/javascript';
    s.src = '//' + disqus_shortname + '.disqus.com/count.js';
    (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""());
    </script>
""")))}),format.raw/*98.2*/("""
"""))}
  }

  def render(authors:Seq[io.prismic.Document],blogCategories:collection.immutable.ListMap[String, String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(authors,blogCategories)(ctx)

  def f:((Seq[io.prismic.Document],collection.immutable.ListMap[String, String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (authors,blogCategories) => (ctx) => apply(authors,blogCategories)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 16:13:42 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/authors/authors.scala.html
                  HASH: 04f1576640ae2e22aef40198799f76c50e282ae9
                  MATRIX: 594->1|823->128|851->145|878->147|933->194|972->196|1003->201|1384->554|1413->555|1550->663|1580->664|1722->777|1752->778|1782->779|1881->1117|1930->1138|2213->1662|2262->1683|2629->2022|2658->2023|2718->2055|2748->2056|2849->2313|2902->2338|3163->2572|3179->2579|3192->2583|3241->2594|3290->2615|3356->2654|3371->2660|3435->2703|3548->2788|3564->2794|3611->2831|3650->2841|3666->2847|3695->2852|3854->2984|3869->2990|3910->3022|3947->3030|3976->3035|4122->3150|4167->3167|4248->3238|4284->3247|4355->3290|4384->3291|4420->3300|4557->3409|4586->3410|4615->3411|4995->3764|5024->3765|5053->3766|5103->3810|5140->3820|5215->3893|5247->3898|5554->4177|5583->4178|5615->4183|5905->4446|5933->4447|5983->4467
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|34->14|34->14|34->14|34->14|34->14|34->14|34->14|36->22|37->23|41->32|42->33|48->39|48->39|48->39|48->39|50->44|51->45|62->56|62->56|62->56|62->56|63->57|64->58|64->58|64->58|64->58|64->58|64->58|64->58|64->58|64->58|66->60|66->60|66->60|66->60|66->60|70->64|71->65|75->69|76->70|76->70|76->70|77->71|78->72|78->72|78->72|84->78|84->78|84->78|85->79|87->81|91->85|92->86|97->91|97->91|98->92|102->96|102->96|104->98
                  -- GENERATED --
              */
          