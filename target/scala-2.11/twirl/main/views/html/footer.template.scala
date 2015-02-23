
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
object footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[collection.immutable.ListMap[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blogCategories: collection.immutable.ListMap[String,String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*3.1*/("""<!-- Yandex.Metrika counter -->
    <script type="text/javascript">
    (function (d, w, c) """),format.raw/*5.25*/("""{"""),format.raw/*5.26*/("""
    """),format.raw/*6.5*/("""(w[c] = w[c] || []).push(function() """),format.raw/*6.41*/("""{"""),format.raw/*6.42*/("""
    """),format.raw/*7.5*/("""try """),format.raw/*7.9*/("""{"""),format.raw/*7.10*/("""
    """),format.raw/*8.5*/("""w.yaCounter28644136 = new Ya.Metrika("""),format.raw/*8.42*/("""{"""),format.raw/*8.43*/("""id:28644136,
    webvisor:true,
    clickmap:true,
    trackLinks:true,
    accurateTrackBounce:true"""),format.raw/*12.29*/("""}"""),format.raw/*12.30*/(""");
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/(""" """),format.raw/*13.7*/("""catch(e) """),format.raw/*13.16*/("""{"""),format.raw/*13.17*/(""" """),format.raw/*13.18*/("""}"""),format.raw/*13.19*/("""
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/(""");

    var n = d.getElementsByTagName("script")[0],
    s = d.createElement("script"),
    f = function () """),format.raw/*18.21*/("""{"""),format.raw/*18.22*/(""" """),format.raw/*18.23*/("""n.parentNode.insertBefore(s, n); """),format.raw/*18.56*/("""}"""),format.raw/*18.57*/(""";
    s.type = "text/javascript";
    s.async = true;
    s.src = (d.location.protocol == "https:" ? "https:" : "http:") + "//mc.yandex.ru/metrika/watch.js";

    if (w.opera == "[object Opera]") """),format.raw/*23.38*/("""{"""),format.raw/*23.39*/("""
    """),format.raw/*24.5*/("""d.addEventListener("DOMContentLoaded", f, false);
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/(""" """),format.raw/*25.7*/("""else """),format.raw/*25.12*/("""{"""),format.raw/*25.13*/(""" """),format.raw/*25.14*/("""f(); """),format.raw/*25.19*/("""}"""),format.raw/*25.20*/("""
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/(""")(document, window, "yandex_metrika_callbacks");
    </script>
    <noscript><div><img src="//mc.yandex.ru/watch/28644136" style="position:absolute; left:-9999px;" alt="" /></div></noscript>
<!-- /Yandex.Metrika counter -->

<footer>
    <div class="container">
        <div class="footer-social">
            <h2 class="footer-social__header">Мы в социальных сетях</h2>
            <ul>
                <li><a class="footer-social__vk" href="http://vk.com/diapost" target="_blank"></a></li>
                <li><a class="footer-social__fb" href="#"></a></li>
                <li><a class="footer-social__tw" href="#"></a></li>
            </ul>
        </div>

        <div class="footer-subscribe">
            <h2 class="footer-social__header">Получайте последние статьи на почту</h2>
            <form action="//cmpp.us9.list-manage.com/subscribe/post?u=65b08f10302ef7ca981e20fe4&amp;id=a136aef67f" method="post" id="mc-embedded-subscribe-form" name="mc-embedded-subscribe-form" class="validate center-block clearfix" target="_blank" novalidate>
                <div class="footer-subscribe__wrap">
                    <div class="mc-field-group">
                        <input type="email" class="email" required="" value="" name="EMAIL" id="mce-EMAIL" placeholder="Введите Ваш email">
                    </div>
                    <div style="position: absolute; left: -5000px;"><input type="text" name="b_65b08f10302ef7ca981e20fe4_a136aef67f" tabindex="-1" value=""></div>
                    <button id="mc-embedded-subscribe" class="dg-feed__btn footer-subscribe__btn" type="submit" value="Subscribe" name="subscribe">
                        <span>Подписаться</span>
                    </button>
                </div>
            </form>
        </div>
    </div>

    <div class="container">
        <div class="footer-logo">
            <a class="footer-logo__content">Диапост</a>
        </div>

        <div class="footer-menu">
            <h2 class="footer-social__header">Статьи</h2>
            <ul>
                """),_display_(/*66.18*/for(blogCategory <- blogCategories) yield /*66.53*/{_display_(Seq[Any](format.raw/*66.54*/("""
                    """),format.raw/*67.21*/("""<li><a href=""""),_display_(/*67.35*/routes/*67.41*/.Application.blogCategory(blogCategory._1)),format.raw/*67.83*/("""" """),_display_(/*67.86*/if(blogCategory._1.contains("kon-footer"))/*67.128*/{_display_(Seq[Any](format.raw/*67.129*/("""class="kon"""")))}),format.raw/*67.141*/(""">"""),_display_(/*67.143*/blogCategory/*67.155*/._2),format.raw/*67.158*/("""</a></li>
                """)))}),format.raw/*68.18*/("""
            """),format.raw/*69.13*/("""</ul>
        </div>
    </div>
</footer>"""))}
  }

  def render(blogCategories:collection.immutable.ListMap[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(blogCategories)

  def f:((collection.immutable.ListMap[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (blogCategories) => apply(blogCategories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 15:06:30 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/footer.scala.html
                  HASH: f7e4e8d481149fc9a66bb55139324068738fad7b
                  MATRIX: 544->1|693->62|723->66|844->160|872->161|904->167|967->203|995->204|1027->210|1057->214|1085->215|1117->221|1181->258|1209->259|1341->363|1370->364|1405->372|1433->373|1461->374|1498->383|1527->384|1556->385|1585->386|1618->392|1646->393|1786->505|1815->506|1844->507|1905->540|1934->541|2163->742|2192->743|2225->749|2307->804|2335->805|2363->806|2396->811|2425->812|2454->813|2487->818|2516->819|2549->825|2577->826|4683->2905|4734->2940|4773->2941|4823->2963|4864->2977|4879->2983|4942->3025|4972->3028|5024->3070|5064->3071|5108->3083|5138->3085|5160->3097|5185->3100|5244->3128|5286->3142
                  LINES: 19->1|22->1|24->3|26->5|26->5|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|33->12|33->12|34->13|34->13|34->13|34->13|34->13|34->13|34->13|35->14|35->14|39->18|39->18|39->18|39->18|39->18|44->23|44->23|45->24|46->25|46->25|46->25|46->25|46->25|46->25|46->25|46->25|47->26|47->26|87->66|87->66|87->66|88->67|88->67|88->67|88->67|88->67|88->67|88->67|88->67|88->67|88->67|88->67|89->68|90->69
                  -- GENERATED --
              */
          