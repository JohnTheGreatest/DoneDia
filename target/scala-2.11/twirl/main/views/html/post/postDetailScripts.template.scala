
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
                  DATE: Mon Feb 23 00:01:48 MSK 2015
                  SOURCE: C:/Users/d1sp/Desktop/NewDropbox/Dropbox/PlayDev/DoneDia/app/views/post/postDetailScripts.scala.html
                  HASH: 3405ebd9671c0553e6d809c992c7eb8d9278fc97
                  MATRIX: 597->0|689->65|717->66|755->78|1130->425|1159->426|1196->436|1257->469|1286->470|1323->480|1381->510|1410->511|1447->521|1487->533|1516->534|1556->546|1585->547|1683->618|1712->619|1749->629|1778->630|1817->642|1878->675|1907->676|1944->686|2002->716|2031->717|2068->727|2108->739|2137->740|2177->752|2206->753|2305->825|2334->826|2371->836|2400->837|2439->849|2500->882|2529->883|2566->893|2624->923|2653->924|2690->934|2730->946|2759->947|2799->959|2828->960|2926->1031|2955->1032|2992->1042|3021->1043|3060->1055|3118->1085|3147->1086|3184->1096|3239->1123|3268->1124|3305->1134|3355->1156|3384->1157|3421->1167|3458->1176|3487->1177|3527->1189|3556->1190|3646->1253|3675->1254|3719->1271|3748->1272|3785->1282|3814->1283|3853->1295|3914->1328|3943->1329|3980->1339|4038->1369|4067->1370|4104->1380|4144->1392|4173->1393|4213->1405|4242->1406|4341->1478|4370->1479|4407->1489|4436->1490|4475->1502|4536->1535|4565->1536|4602->1546|4660->1576|4689->1577|4726->1587|4776->1609|4805->1610|4842->1620|4882->1632|4911->1633|4951->1645|4980->1646|5078->1717|5107->1718|5151->1735|5180->1736|5217->1746|5246->1747|5283->1757|5312->1758|5351->1770|5411->1802|5440->1803|5477->1813|5825->2134|5854->2135|5889->2143|5917->2144
                  LINES: 22->1|23->2|23->2|25->4|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|39->18|39->18|41->20|41->20|42->21|42->21|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|46->25|46->25|48->27|48->27|49->28|49->28|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|53->32|53->32|55->34|55->34|56->35|56->35|58->37|58->37|58->37|59->38|59->38|59->38|60->39|60->39|60->39|61->40|61->40|61->40|61->40|61->40|63->42|63->42|64->43|64->43|65->44|65->44|67->46|67->46|67->46|68->47|68->47|68->47|69->48|69->48|69->48|69->48|69->48|71->50|71->50|72->51|72->51|74->53|74->53|74->53|75->54|75->54|75->54|76->55|76->55|76->55|77->56|77->56|77->56|77->56|77->56|79->58|79->58|80->59|80->59|81->60|81->60|82->61|82->61|84->63|84->63|84->63|85->64|92->71|92->71|94->73|94->73
                  -- GENERATED --
              */
          