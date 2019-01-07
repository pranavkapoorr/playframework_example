
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>"""),_display_(/*12.13*/title),format.raw/*12.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*14.50*/routes/*14.56*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*14.102*/("""'>
  <link rel="stylesheet" media="screen" href='"""),_display_(/*15.48*/routes/*15.54*/.Assets.versioned("stylesheets/bootswatch.css")),format.raw/*15.101*/("""'>
  <link rel="stylesheet" media="screen" href='"""),_display_(/*16.48*/routes/*16.54*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.95*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*17.55*/routes/*17.61*/.Assets.versioned("images/favicon.png")),format.raw/*17.100*/("""'>
    
</head>

<body>
    <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
        <!-- Brand -->
        <a class="navbar-brand" href=""""),_display_(/*24.40*/routes/*24.46*/.HomeController.index()),format.raw/*24.69*/("""">Home</a>
        <!-- Links -->
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*28.40*/routes/*28.46*/.HomeController.explore()),format.raw/*28.71*/("""">Explore</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*31.40*/routes/*31.46*/.HomeController.tutorial()),format.raw/*31.72*/("""">Tutorials</a>
          </li>
        </ul>
      </nav>
    """),_display_(/*35.6*/content),format.raw/*35.13*/("""


    """),format.raw/*38.5*/("""<script src='"""),_display_(/*38.19*/routes/*38.25*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*38.71*/("""' type="text/javascript"></script>
  <script src='"""),_display_(/*39.17*/routes/*39.23*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*39.72*/("""' type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jan 06 23:56:49 EST 2019
                  SOURCE: /Users/pranav/Documents/workspace/play-java-hello-world-tutorial/app/views/main.scala.html
                  HASH: 0a7356f66b53dc8c1bb6da1a1350f3f3a87dca47
                  MATRIX: 1206->260|1330->291|1357->292|1436->344|1462->349|1622->482|1637->488|1705->534|1782->584|1797->590|1866->637|1943->687|1958->693|2020->734|2104->791|2119->797|2180->836|2358->987|2373->993|2417->1016|2589->1161|2604->1167|2650->1192|2778->1293|2793->1299|2840->1325|2930->1389|2958->1396|2992->1403|3033->1417|3048->1423|3115->1469|3193->1520|3208->1526|3278->1575
                  LINES: 33->7|38->8|39->9|42->12|42->12|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|54->24|54->24|54->24|58->28|58->28|58->28|61->31|61->31|61->31|65->35|65->35|68->38|68->38|68->38|68->38|69->39|69->39|69->39
                  -- GENERATED --
              */
          