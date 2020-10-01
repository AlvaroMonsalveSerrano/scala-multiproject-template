package es.ams.base

import org.scalatest._

class BaseClassSpec extends FlatSpec with Matchers {
  "The BaseClass" should "say test" in {
    val test: BaseClass = BaseClass("test")
    test.name shouldEqual "test"
  }
}
