
package views.html.post

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
object postDetailScripts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript">
    $(document).ready(function()"""),format.raw/*2.33*/("""{"""),format.raw/*2.34*/("""

        """),format.raw/*4.9*/("""$(".lazy").lazy();

        var number1 = $("#number1");
        var number2 = $("#number2");
        var number3 = $("#number3");
        var number4 = $("#number4");
        var number5 = $("#number5");
        var img1 = $("#img1");
        var img2 = $("#img2");
        var img3 = $("#img3");

        window.onscroll = function(e)"""),format.raw/*15.38*/("""{"""),format.raw/*15.39*/("""
        """),format.raw/*16.9*/("""if(!number1.hasClass("watched")) """),format.raw/*16.42*/("""{"""),format.raw/*16.43*/("""
        """),format.raw/*17.9*/("""if(isInLoadableArea(number1)) """),format.raw/*17.39*/("""{"""),format.raw/*17.40*/("""
        """),format.raw/*18.9*/("""number1.css("""),format.raw/*18.21*/("""{"""),format.raw/*18.22*/("""'opacity': 1"""),format.raw/*18.34*/("""}"""),format.raw/*18.35*/(""");
        number1.addClass("animated slideInLeft watched");
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""

        """),format.raw/*23.9*/("""if(!number2.hasClass("watched")) """),format.raw/*23.42*/("""{"""),format.raw/*23.43*/("""
        """),format.raw/*24.9*/("""if(isInLoadableArea(number2)) """),format.raw/*24.39*/("""{"""),format.raw/*24.40*/("""
        """),format.raw/*25.9*/("""number2.css("""),format.raw/*25.21*/("""{"""),format.raw/*25.22*/("""'opacity': 1"""),format.raw/*25.34*/("""}"""),format.raw/*25.35*/(""");
        number2.addClass("animated slideInRight watched");
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/("""

        """),format.raw/*30.9*/("""if(!number3.hasClass("watched")) """),format.raw/*30.42*/("""{"""),format.raw/*30.43*/("""
        """),format.raw/*31.9*/("""if(isInLoadableArea(number3)) """),format.raw/*31.39*/("""{"""),format.raw/*31.40*/("""
        """),format.raw/*32.9*/("""number3.css("""),format.raw/*32.21*/("""{"""),format.raw/*32.22*/("""'opacity': 1"""),format.raw/*32.34*/("""}"""),format.raw/*32.35*/(""");
        number3.addClass("animated slideInLeft watched");
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""

        """),format.raw/*37.9*/("""if(!img1.hasClass("watched")) """),format.raw/*37.39*/("""{"""),format.raw/*37.40*/("""
        """),format.raw/*38.9*/("""if(isInLoadableArea(img1)) """),format.raw/*38.36*/("""{"""),format.raw/*38.37*/("""
        """),format.raw/*39.9*/("""setTimeout(function() """),format.raw/*39.31*/("""{"""),format.raw/*39.32*/("""
        """),format.raw/*40.9*/("""img1.css("""),format.raw/*40.18*/("""{"""),format.raw/*40.19*/("""'opacity': 1"""),format.raw/*40.31*/("""}"""),format.raw/*40.32*/(""");
        img1.addClass("animated rollIn watched");
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/(""", 500);
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""

        """),format.raw/*46.9*/("""if(!number4.hasClass("watched")) """),format.raw/*46.42*/("""{"""),format.raw/*46.43*/("""
        """),format.raw/*47.9*/("""if(isInLoadableArea(number4)) """),format.raw/*47.39*/("""{"""),format.raw/*47.40*/("""
        """),format.raw/*48.9*/("""number4.css("""),format.raw/*48.21*/("""{"""),format.raw/*48.22*/("""'opacity': 1"""),format.raw/*48.34*/("""}"""),format.raw/*48.35*/(""");
        number4.addClass("animated slideInRight watched");
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/("""
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""

        """),format.raw/*53.9*/("""if(!number5.hasClass("watched")) """),format.raw/*53.42*/("""{"""),format.raw/*53.43*/("""
        """),format.raw/*54.9*/("""if(isInLoadableArea(number5)) """),format.raw/*54.39*/("""{"""),format.raw/*54.40*/("""
        """),format.raw/*55.9*/("""setTimeout(function() """),format.raw/*55.31*/("""{"""),format.raw/*55.32*/("""
        """),format.raw/*56.9*/("""number5.css("""),format.raw/*56.21*/("""{"""),format.raw/*56.22*/("""'opacity': 1"""),format.raw/*56.34*/("""}"""),format.raw/*56.35*/(""");
        number5.addClass("animated slideInLeft watched");
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/(""", 500);
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""

        """),format.raw/*63.9*/("""function isInLoadableArea(elem) """),format.raw/*63.41*/("""{"""),format.raw/*63.42*/("""
        """),format.raw/*64.9*/("""var top = $(window).scrollTop();
        var bot = top + $(window).height();
        var elementTop = $(elem).offset().top;
        var elementBottom = elementTop + $(elem).height();

        return ((elementBottom >= top) && (elementTop <= bot)
        || (elementBottom <= bot) && (elementTop >= top) );
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/("""

    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/(""");
</script>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Sep 28 13:56:37 MSK 2015
                  SOURCE: C:/Users/d1sp/Documents/GitHub/DoneDia/app/views/post/postDetailScripts.scala.html
                  HASH: f1217f50b008794b731e6db448a50237a0855d0b
                  MATRIX: 597->0|688->64|716->65|752->75|1116->411|1145->412|1181->421|1242->454|1271->455|1307->464|1365->494|1394->495|1430->504|1470->516|1499->517|1539->529|1568->530|1664->599|1693->600|1729->609|1758->610|1795->620|1856->653|1885->654|1921->663|1979->693|2008->694|2044->703|2084->715|2113->716|2153->728|2182->729|2279->799|2308->800|2344->809|2373->810|2410->820|2471->853|2500->854|2536->863|2594->893|2623->894|2659->903|2699->915|2728->916|2768->928|2797->929|2893->998|2922->999|2958->1008|2987->1009|3024->1019|3082->1049|3111->1050|3147->1059|3202->1086|3231->1087|3267->1096|3317->1118|3346->1119|3382->1128|3419->1137|3448->1138|3488->1150|3517->1151|3605->1212|3634->1213|3677->1229|3706->1230|3742->1239|3771->1240|3808->1250|3869->1283|3898->1284|3934->1293|3992->1323|4021->1324|4057->1333|4097->1345|4126->1346|4166->1358|4195->1359|4292->1429|4321->1430|4357->1439|4386->1440|4423->1450|4484->1483|4513->1484|4549->1493|4607->1523|4636->1524|4672->1533|4722->1555|4751->1556|4787->1565|4827->1577|4856->1578|4896->1590|4925->1591|5021->1660|5050->1661|5093->1677|5122->1678|5158->1687|5187->1688|5223->1697|5252->1698|5289->1708|5349->1740|5378->1741|5414->1750|5755->2064|5784->2065|5817->2071|5845->2072
                  LINES: 22->1|23->2|23->2|25->4|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|39->18|39->18|41->20|41->20|42->21|42->21|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|46->25|46->25|48->27|48->27|49->28|49->28|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|53->32|53->32|55->34|55->34|56->35|56->35|58->37|58->37|58->37|59->38|59->38|59->38|60->39|60->39|60->39|61->40|61->40|61->40|61->40|61->40|63->42|63->42|64->43|64->43|65->44|65->44|67->46|67->46|67->46|68->47|68->47|68->47|69->48|69->48|69->48|69->48|69->48|71->50|71->50|72->51|72->51|74->53|74->53|74->53|75->54|75->54|75->54|76->55|76->55|76->55|77->56|77->56|77->56|77->56|77->56|79->58|79->58|80->59|80->59|81->60|81->60|82->61|82->61|84->63|84->63|84->63|85->64|92->71|92->71|94->73|94->73
                  -- GENERATED --
              */
          