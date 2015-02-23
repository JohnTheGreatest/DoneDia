
package views.html.about

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
object about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[collection.immutable.ListMap[String, String],Prismic.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blogCategories: collection.immutable.ListMap[String,String])(implicit ctx: Prismic.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import Html._

Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/mainContent("О проекте", "О проекте", blogCategories)/*5.55*/ {_display_(Seq[Any](format.raw/*5.57*/("""
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

        <div class="container">
            <div class="dg-blog__body">
                <article>
                    <p><strong>«Диапост»</strong> – это информационно-аналитический портал для тех, кому интересно открыть для себя новые грани осмысления мира и того, что происходит сегодня в российском обществе.</p>
                    <p><strong>«Диапост»</strong> – это неожиданный ракурс, когда мы говорим на современном языке о вечных ценностях: вере, любви, семье, Родине, правде, справедливости, братстве.</p>
                    <p><strong>«Диапост»</strong> – это призыв к неравнодушным вливаться в общее дело и проявлять свои писательские и аналитические таланты через создание актуальных материалов на портале.</p>
                    <p>Мы не боимся серьёзных вопросов и хотим помочь себе и нашим читателям разобраться в том, зачем человеку нужна жизнь и как провести её не напрасно, как изменить окружающий мир к лучшему.</p>
                    <p>Преображение действительности — задача молодых. Задача начинается с постановки вопроса. Наш мир — сложная информационная система, требующая внимательного изучения. Нельзя двигаться вслепую, необходима система навигации, ведущая к цели.</p>
                    <p>Мы должны вместе учиться формулировать вопросы, создавать модели преобразования реальности, отличать добро от зла.</p>
                    <p>Мы должны учитывать опыт поколений, изучать мотивы, мировоззрения, ценности — смысловую базу волевых решений и последующих действий.</p>
                    <p>Этот портал призван стать инструментом рефлексии и интеллектуальной самореализации.</p>
                    <div class="eugene-author">
                        <img src=""""),_display_(/*64.36*/routes/*64.42*/.Assets.at("images/eugene-photo.jpg")),format.raw/*64.79*/("""" class="eugene-author__photo"/>
                        <p>Главный редактор - Евгений Иванов</p>
                    </div>
                    <div class="eugene-btn-wrapper">
                        <a class="button button-flat-primary eugene-btn" href=""""),_display_(/*68.81*/routes/*68.87*/.Application.blogCategory("")),format.raw/*68.116*/("""">ЧИТАТЬ СТАТЬИ</a>
                    </div>

                </article>
            </div>
        </div>

        """),format.raw/*75.27*/("""
        """),format.raw/*76.9*/("""<script type="text/javascript">(function() """),format.raw/*76.52*/("""{"""),format.raw/*76.53*/("""
        """),format.raw/*77.9*/("""if (window.pluso)if (typeof window.pluso.start == "function") return;
        if (window.ifpluso==undefined) """),format.raw/*78.40*/("""{"""),format.raw/*78.41*/(""" """),format.raw/*78.42*/("""window.ifpluso = 1;
        var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
        s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
        s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
        var h=d[g]('body')[0];
        h.appendChild(s);
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""}"""),format.raw/*84.11*/(""")();</script>
        """),format.raw/*85.31*/("""

        """),format.raw/*87.9*/("""<div class="clear"></div>

    </section>

    """),format.raw/*91.31*/("""
    """),format.raw/*92.5*/("""<script type="text/javascript">
        /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
        var disqus_shortname = 'diapost-community'; // required: replace example with your forum shortname

        /* * * DON'T EDIT BELOW THIS LINE * * */
        (function () """),format.raw/*97.22*/("""{"""),format.raw/*97.23*/("""
        """),format.raw/*98.9*/("""var s = document.createElement('script'); s.async = true;
        s.type = 'text/javascript';
        s.src = '//' + disqus_shortname + '.disqus.com/count.js';
        (document.getElementsByTagName('HEAD')[0] || document.getElementsByTagName('BODY')[0]).appendChild(s);
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/("""());
    </script>
""")))}),format.raw/*104.2*/("""
"""))}
  }

  def render(blogCategories:collection.immutable.ListMap[String, String],ctx:Prismic.Context): play.twirl.api.HtmlFormat.Appendable = apply(blogCategories)(ctx)

  def f:((collection.immutable.ListMap[String, String]) => (Prismic.Context) => play.twirl.api.HtmlFormat.Appendable) = (blogCategories) => (ctx) => apply(blogCategories)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 16:13:30 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/about/about.scala.html
                  HASH: c39a6219b0d5408ceaf78a719c77333f71fd4ddd
                  MATRIX: 565->1|758->93|786->110|813->112|874->165|913->167|944->172|1325->525|1354->526|1491->634|1521->635|1663->748|1693->749|1723->750|1822->1088|1871->1109|2154->1633|2203->1654|2570->1993|2599->1994|2659->2026|2689->2027|2790->2284|2843->2309|4656->4095|4671->4101|4729->4138|5014->4396|5029->4402|5080->4431|5226->4567|5262->4576|5333->4619|5362->4620|5398->4629|5535->4738|5564->4739|5593->4740|5973->5093|6002->5094|6031->5095|6081->5139|6118->5149|6193->5222|6225->5227|6548->5522|6577->5523|6613->5532|6920->5811|6950->5812|7001->5832
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|34->14|34->14|34->14|34->14|34->14|34->14|34->14|36->22|37->23|41->32|42->33|48->39|48->39|48->39|48->39|50->44|51->45|70->64|70->64|70->64|74->68|74->68|74->68|81->75|82->76|82->76|82->76|83->77|84->78|84->78|84->78|90->84|90->84|90->84|91->85|93->87|97->91|98->92|103->97|103->97|104->98|108->102|108->102|110->104
                  -- GENERATED --
              */
          