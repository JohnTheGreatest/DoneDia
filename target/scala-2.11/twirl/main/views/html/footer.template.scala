
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

"""),format.raw/*3.1*/("""<footer>
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
                """),_display_(/*38.18*/for(blogCategory <- blogCategories) yield /*38.53*/{_display_(Seq[Any](format.raw/*38.54*/("""
                    """),format.raw/*39.21*/("""<li><a href=""""),_display_(/*39.35*/routes/*39.41*/.Application.blogCategory(blogCategory._1)),format.raw/*39.83*/("""" """),_display_(/*39.86*/if(blogCategory._1.contains("kon-footer"))/*39.128*/{_display_(Seq[Any](format.raw/*39.129*/("""class="kon"""")))}),format.raw/*39.141*/(""">"""),_display_(/*39.143*/blogCategory/*39.155*/._2),format.raw/*39.158*/("""</a></li>
                """)))}),format.raw/*40.18*/("""
            """),format.raw/*41.13*/("""</ul>
        </div>
    </div>
</footer>

<!-- Yandex.Metrika counter -->
    <script type="text/javascript">
    (function (d, w, c) """),format.raw/*48.25*/("""{"""),format.raw/*48.26*/("""
    """),format.raw/*49.5*/("""(w[c] = w[c] || []).push(function() """),format.raw/*49.41*/("""{"""),format.raw/*49.42*/("""
    """),format.raw/*50.5*/("""try """),format.raw/*50.9*/("""{"""),format.raw/*50.10*/("""
    """),format.raw/*51.5*/("""w.yaCounter28644136 = new Ya.Metrika("""),format.raw/*51.42*/("""{"""),format.raw/*51.43*/("""id:28644136,
    webvisor:true,
    clickmap:true,
    trackLinks:true,
    accurateTrackBounce:true"""),format.raw/*55.29*/("""}"""),format.raw/*55.30*/(""");
    """),format.raw/*56.5*/("""}"""),format.raw/*56.6*/(""" """),format.raw/*56.7*/("""catch(e) """),format.raw/*56.16*/("""{"""),format.raw/*56.17*/(""" """),format.raw/*56.18*/("""}"""),format.raw/*56.19*/("""
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""");

    var n = d.getElementsByTagName("script")[0],
    s = d.createElement("script"),
    f = function () """),format.raw/*61.21*/("""{"""),format.raw/*61.22*/(""" """),format.raw/*61.23*/("""n.parentNode.insertBefore(s, n); """),format.raw/*61.56*/("""}"""),format.raw/*61.57*/(""";
    s.type = "text/javascript";
    s.async = true;
    s.src = (d.location.protocol == "https:" ? "https:" : "http:") + "//mc.yandex.ru/metrika/watch.js";

    if (w.opera == "[object Opera]") """),format.raw/*66.38*/("""{"""),format.raw/*66.39*/("""
    """),format.raw/*67.5*/("""d.addEventListener("DOMContentLoaded", f, false);
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/(""" """),format.raw/*68.7*/("""else """),format.raw/*68.12*/("""{"""),format.raw/*68.13*/(""" """),format.raw/*68.14*/("""f(); """),format.raw/*68.19*/("""}"""),format.raw/*68.20*/("""
    """),format.raw/*69.5*/("""}"""),format.raw/*69.6*/(""")(document, window, "yandex_metrika_callbacks");
    </script>
    <noscript><div><img src="//mc.yandex.ru/watch/28644136" style="position:absolute; left:-9999px;" alt="" /></div></noscript>
<!-- /Yandex.Metrika counter -->"""))}
  }

  def render(blogCategories:collection.immutable.ListMap[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(blogCategories)

  def f:((collection.immutable.ListMap[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (blogCategories) => apply(blogCategories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 18:12:53 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/footer.scala.html
                  HASH: a2d30c28368df92be1618813914c78c94c42b79e
                  MATRIX: 544->1|693->62|723->66|2599->1915|2650->1950|2689->1951|2739->1973|2780->1987|2795->1993|2858->2035|2888->2038|2940->2080|2980->2081|3024->2093|3054->2095|3076->2107|3101->2110|3160->2138|3202->2152|3372->2294|3401->2295|3434->2301|3498->2337|3527->2338|3560->2344|3591->2348|3620->2349|3653->2355|3718->2392|3747->2393|3879->2497|3908->2498|3943->2506|3971->2507|3999->2508|4036->2517|4065->2518|4094->2519|4123->2520|4156->2526|4184->2527|4324->2639|4353->2640|4382->2641|4443->2674|4472->2675|4701->2876|4730->2877|4763->2883|4845->2938|4873->2939|4901->2940|4934->2945|4963->2946|4992->2947|5025->2952|5054->2953|5087->2959|5115->2960
                  LINES: 19->1|22->1|24->3|59->38|59->38|59->38|60->39|60->39|60->39|60->39|60->39|60->39|60->39|60->39|60->39|60->39|60->39|61->40|62->41|69->48|69->48|70->49|70->49|70->49|71->50|71->50|71->50|72->51|72->51|72->51|76->55|76->55|77->56|77->56|77->56|77->56|77->56|77->56|77->56|78->57|78->57|82->61|82->61|82->61|82->61|82->61|87->66|87->66|88->67|89->68|89->68|89->68|89->68|89->68|89->68|89->68|89->68|90->69|90->69
                  -- GENERATED --
              */
          