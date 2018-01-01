name := "pet-store-test"

version := "0.1"

scalaVersion := "2.12.4"

val http4sVersion = "0.17.6"
val circeVersion = "0.8.0"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-circe" % http4sVersion,
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion,
  "org.http4s" %% "http4s-core" % http4sVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-literal" % circeVersion,
  "com.typesafe.slick" %% "slick" % "3.2.1"


)