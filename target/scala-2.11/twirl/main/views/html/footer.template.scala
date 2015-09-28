
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
            <p class="footer-text" style="margin-top: 10px">При реализации проекта используются средства государственной поддержки, выделенные в качестве гранта в соответствии c распоряжением Президента Российской Федерации №243-рп от 25.07.2014 и на основании конкурса, проведенного Общероссийской общественной организацией «Российский Союз Молодежи»<br></p>
            <p class="footer-text" style="margin-top: 10px">Свидетельство о регистрации СМИ № ФС77-61355 от 7 апреля 2015 года</p>
            <p class="footer-text">Диапост &copy; 2015</p>
        </div>

        <div class="footer-menu">
            <h2 class="footer-social__header">Статьи</h2>
            <ul>
                """),_display_(/*41.18*/for(blogCategory <- blogCategories) yield /*41.53*/{_display_(Seq[Any](format.raw/*41.54*/("""
                    """),format.raw/*42.21*/("""<li><a href=""""),_display_(/*42.35*/routes/*42.41*/.Application.blogCategory(blogCategory._1)),format.raw/*42.83*/("""" """),_display_(/*42.86*/if(blogCategory._1.contains("kon-footer"))/*42.128*/{_display_(Seq[Any](format.raw/*42.129*/("""class="kon"""")))}),format.raw/*42.141*/(""">"""),_display_(/*42.143*/blogCategory/*42.155*/._2),format.raw/*42.158*/("""</a></li>
                """)))}),format.raw/*43.18*/("""
            """),format.raw/*44.13*/("""</ul>
        </div>
    </div>
</footer>

<script>
(function(i,s,o,g,r,a,m)"""),format.raw/*50.25*/("""{"""),format.raw/*50.26*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*50.76*/("""{"""),format.raw/*50.77*/("""
"""),format.raw/*51.1*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*51.36*/("""}"""),format.raw/*51.37*/(""",i[r].l=1*new Date();a=s.createElement(o),
m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

ga('create', 'UA-68170534-1', 'auto');
ga('send', 'pageview');

</script>"""))}
  }

  def render(blogCategories:collection.immutable.ListMap[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(blogCategories)

  def f:((collection.immutable.ListMap[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (blogCategories) => apply(blogCategories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Sep 28 13:56:37 MSK 2015
                  SOURCE: C:/Users/d1sp/Documents/GitHub/DoneDia/app/views/footer.scala.html
                  HASH: bafbaf29c8f0f81e130998db6d488750b81b33a2
                  MATRIX: 544->1|693->62|721->64|3112->2428|3163->2463|3202->2464|3251->2485|3292->2499|3307->2505|3370->2547|3400->2550|3452->2592|3492->2593|3536->2605|3566->2607|3588->2619|3613->2622|3671->2649|3712->2662|3816->2738|3845->2739|3923->2789|3952->2790|3980->2791|4043->2826|4072->2827|4222->2950|4250->2951
                  LINES: 19->1|22->1|24->3|62->41|62->41|62->41|63->42|63->42|63->42|63->42|63->42|63->42|63->42|63->42|63->42|63->42|63->42|64->43|65->44|71->50|71->50|71->50|71->50|72->51|72->51|72->51|74->53|74->53
                  -- GENERATED --
              */
          