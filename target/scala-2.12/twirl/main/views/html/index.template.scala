
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


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("HOME")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

  """),format.raw/*5.3*/("""<section id="content">
      <div class="wrapper doc">
          <article>
            <h1>Home Page</h1>
            <p>Welcome to my very first practice project with play framework. It is quite interesting and chellenging :).</p>
            <img src="/assets/images/play-components.png" alt="">
            </article>
            </div>
  </section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jan 07 00:00:15 EST 2019
                  SOURCE: /Users/pranav/Documents/workspace/play-java-hello-world-tutorial/app/views/index.scala.html
                  HASH: 96e1602bf3ac5340e4a5f2657defedd5ee0f6bc7
                  MATRIX: 941->1|1037->4|1064->6|1084->18|1123->20|1153->24
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5
                  -- GENERATED --
              */
          