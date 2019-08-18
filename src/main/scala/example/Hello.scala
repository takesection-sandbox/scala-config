package example

import com.typesafe.config.{Config, ConfigFactory}

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val config = ConfigFactory.load()

  lazy val greeting: String = config.getString("myapp.example-message")
}
