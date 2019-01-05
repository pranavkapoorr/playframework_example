// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/pranav/Documents/workspace/play-java-hello-world-tutorial/conf/routes
// @DATE:Thu Jan 03 12:20:14 EST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
