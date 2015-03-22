
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
object pageNotFound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[collection.immutable.ListMap[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blogCategories: collection.immutable.ListMap[String,String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.63*/("""

"""),_display_(/*3.2*/main("Страница не найдена - Диапост.Ру", None, None, None, blogCategories = blogCategories)/*3.93*/ {_display_(Seq[Any](format.raw/*3.95*/("""
    """),format.raw/*4.5*/("""<h1>Страница не найдена. Попробуйте позже.</h1>
""")))}))}
  }

  def render(blogCategories:collection.immutable.ListMap[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(blogCategories)

  def f:((collection.immutable.ListMap[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (blogCategories) => apply(blogCategories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Mar 22 12:21:57 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/Girhub/DoneDia/DoneDia/app/views/pageNotFound.scala.html
                  HASH: 3b6ad764616cb1497c2719bb7150ccf3da143d1f
                  MATRIX: 550->1|699->62|729->67|828->158|867->160|899->166
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4
                  -- GENERATED --
              */
          