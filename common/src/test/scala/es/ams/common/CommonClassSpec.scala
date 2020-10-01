package es.ams.common


import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The CommonClass class do something" should "say common" in {
    val test = new CommonClass()
    test.doSomething().name shouldEqual "common"
  }
}
