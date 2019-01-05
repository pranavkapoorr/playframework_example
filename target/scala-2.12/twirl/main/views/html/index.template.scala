
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
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>HomePage</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" media="screen" href='"""),_display_(/*8.48*/routes/*8.54*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*8.100*/("""'>
  <link rel="stylesheet" media="screen" href='"""),_display_(/*9.48*/routes/*9.54*/.Assets.versioned("stylesheets/bootswatch.css")),format.raw/*9.101*/("""'>
  <script src='"""),_display_(/*10.17*/routes/*10.23*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*10.69*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*11.74*/("""' type="text/javascript"></script>
</head>
<body>
    <nav class="navbar navbar-expand-sm bg-primary navbar-light">
        <a class="navbar-brand" href="#">Logo</a>
      <!-- Links -->
  <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="#">Link 1</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link 2</a>
      </li>
    </ul>
  
    <!-- Navbar text-->
    <span class="navbar-text">
      Navbar text
    </span>
      </nav>
  <div>
    <h1>Home Page</h1>
    <img src="/assets/images/play-components.png" >
  </div>
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
                  DATE: Fri Jan 04 22:22:03 EST 2019
                  SOURCE: /Users/pranav/Documents/workspace/play-java-hello-world-tutorial/app/views/index.scala.html
                  HASH: c5206004c2344a99f28573fd9a8a3bd094353960
                  MATRIX: 1030->0|1313->257|1327->263|1394->309|1470->359|1484->365|1552->412|1598->431|1613->437|1680->483|1760->536|1775->542|1845->591
                  LINES: 33->1|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11
                  -- GENERATED --
              */
          