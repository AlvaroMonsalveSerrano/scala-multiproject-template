package es.ams

import es.ams.common.CommonClass

trait Template {
  lazy val greeting: String = "hello"
}


object Application extends Template with App {
  println(greeting)

  val exampleClass = new CommonClass()
  println(exampleClass.doSomething().name)

}


