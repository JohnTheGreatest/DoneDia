
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
</footer>"""))}
  }

  def render(blogCategories:collection.immutable.ListMap[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(blogCategories)

  def f:((collection.immutable.ListMap[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (blogCategories) => apply(blogCategories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 04:24:26 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/footer.scala.html
                  HASH: 43d2c510a3fe30e619efb11e2fa39e10dea46a21
                  MATRIX: 544->1|693->62|723->66|2599->1915|2650->1950|2689->1951|2739->1973|2780->1987|2795->1993|2858->2035|2888->2038|2940->2080|2980->2081|3024->2093|3054->2095|3076->2107|3101->2110|3160->2138|3202->2152
                  LINES: 19->1|22->1|24->3|59->38|59->38|59->38|60->39|60->39|60->39|60->39|60->39|60->39|60->39|60->39|60->39|60->39|60->39|61->40|62->41
                  -- GENERATED --
              */
          