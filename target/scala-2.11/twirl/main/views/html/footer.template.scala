
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
object footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<footer>
    <div class="container">
        <div class="footer-social">
            <h2 class="footer-social__header">Мы в социальных сетях</h2>
            <ul>
                <li><a class="footer-social__vk" href="#"></a></li>
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
                <li><a href="">Известия</a></li>
                <li><a href="">К.О.Н.</a></li>
                <li><a href="">Смысловое взаимодействие</a></li>
                <li><a href="">Хранилище образов</a></li>
                <li><a href="">Домостроительство</a></li>
                <li><a href="">Преображение действительности</a></li>
                <li><a href="">Сетевое добровольчество</a></li>
                <li><a href="">Властеправие</a></li>
                <li><a href="">Мировоззрение</a></li>
            </ul>
        </div>
    </div>
</footer>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 25 08:23:29 MSK 2014
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/Diapost/app/views/footer.scala.html
                  HASH: a35b2f7b180074f2b6548e049493b6ffb8b3260c
                  MATRIX: 581->0
                  LINES: 22->1
                  -- GENERATED --
              */
          