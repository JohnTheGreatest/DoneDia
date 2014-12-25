
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
object pageNotFound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Страница не найдена - Диапост.Ру", None, None, None)/*1.60*/ {_display_(Seq[Any](format.raw/*1.62*/("""
    """),format.raw/*2.5*/("""<h1>Страница не найдена. Попробуйте позже.</h1>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 25 07:39:54 MSK 2014
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/Diapost/app/views/pageNotFound.scala.html
                  HASH: db545d9d07ac660678a944364c570d0c49a46755
                  MATRIX: 587->1|653->59|692->61|723->66
                  LINES: 22->1|22->1|22->1|23->2
                  -- GENERATED --
              */
          