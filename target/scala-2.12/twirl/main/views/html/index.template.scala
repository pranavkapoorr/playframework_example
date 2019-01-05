
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" media="screen" href='"""),_display_(/*8.48*/routes/*8.54*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*8.100*/("""'>
  <link rel="stylesheet" media="screen" href='"""),_display_(/*9.48*/routes/*9.54*/.Assets.versioned("stylesheets/bootswatch.css")),format.raw/*9.101*/("""'>
  <script src='"""),_display_(/*10.17*/routes/*10.23*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*10.69*/("""' type="text/javascript"></script>
  <script src='"""),_display_(/*11.17*/routes/*11.23*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*11.72*/("""' type="text/javascript"></script>
  <title>Home Page</title>
</head>
<body>
    <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
        <!-- Brand -->
        <a class="navbar-brand" href="#">Logo</a>
        <!-- Links -->
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="#">Link 1</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Link 2</a>
          </li>
        </ul>
      </nav>
  <h1>Home Page</h1>
  <img src="/assets/images/play-components.png" alt="">
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 05 13:31:22 EST 2019
                  SOURCE: /Users/pranav/Documents/workspace/play-java-hello-world-tutorial/app/views/index.scala.html
                  HASH: 4ae67ca0a8e0237325c0ec7b2e6155db83907e82
                  MATRIX: 941->1|1037->4|1304->245|1318->251|1385->297|1461->347|1475->353|1543->400|1589->419|1604->425|1671->471|1749->522|1764->528|1834->577
                  LINES: 28->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11
                  -- GENERATED --
              */
          