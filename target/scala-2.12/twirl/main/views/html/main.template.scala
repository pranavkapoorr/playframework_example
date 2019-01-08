
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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" media="screen" href='https://bootswatch.com/4/united/bootstrap.min.css'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("images/favicon.png")),format.raw/*16.100*/("""'>
    
</head>

<body>
    <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
        <!-- Brand -->
        <a class="navbar-brand" href=""""),_display_(/*23.40*/routes/*23.46*/.HomeController.index()),format.raw/*23.69*/("""">Home</a>
        <!-- Links -->
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*27.40*/routes/*27.46*/.HomeController.explore()),format.raw/*27.71*/("""">Explore</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*30.40*/routes/*30.46*/.HomeController.tutorial()),format.raw/*30.72*/("""">Tutorials</a>
          </li>
        </ul>
      </nav>
    """),_display_(/*34.6*/content),format.raw/*34.13*/("""


"""),format.raw/*37.1*/("""<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
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
                  DATE: Mon Jan 07 22:12:46 EST 2019
                  SOURCE: /Users/pranav/Documents/workspace/play-java-hello-world-tutorial/app/views/main.scala.html
                  HASH: 53a1b5a155b5184b9f6c0a076e8b0bfbb8d7c40c
                  MATRIX: 1206->260|1330->291|1357->292|1436->344|1462->349|1943->803|1958->809|2019->848|2197->999|2212->1005|2256->1028|2428->1173|2443->1179|2489->1204|2617->1305|2632->1311|2679->1337|2769->1401|2797->1408|2827->1411
                  LINES: 33->7|38->8|39->9|42->12|42->12|46->16|46->16|46->16|53->23|53->23|53->23|57->27|57->27|57->27|60->30|60->30|60->30|64->34|64->34|67->37
                  -- GENERATED --
              */
          