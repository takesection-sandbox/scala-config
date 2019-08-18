import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val config =    "com.typesafe" % "config" % "1.3.4"

  lazy val deps = Seq(
    scalaTest % Test,
    config
  )
}
