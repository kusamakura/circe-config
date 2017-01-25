name := "circe-config"
organization := "io.github.jonas.circe.config"
description := "Yet another Typesafe Config decoder"
homepage := Some(url("https://github.com/jonas/circe-config"))
licenses += "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html")

scalaVersion := "2.11.8"
crossScalaVersions := Seq("2.11.8", "2.12.1")

val Versions = new {
  val circe = "0.7.0"
  val discipline = "0.7.2"
  val scalaCheck = "0.13.4"
  val scalaTest = "3.0.1"
  val config = "1.3.1"
}

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % Versions.config,
  "io.circe" %% "circe-core" % Versions.circe,
  "io.circe" %% "circe-parser" % Versions.circe,
  "io.circe" %% "circe-generic" % Versions.circe % Test,
  "io.circe" %% "circe-testing" % Versions.circe % Test,
  "org.typelevel" %% "discipline" % Versions.discipline % Test,
  "org.scalacheck" %% "scalacheck" % Versions.scalaCheck % Test,
  "org.scalatest" %% "scalatest" % Versions.scalaTest % Test
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Xfuture",
  "-Ywarn-unused-import"
)

scalacOptions in (Compile, console) ~= { _.filterNot(Set("-Ywarn-unused-import")) }

scmInfo := Some(
  ScmInfo(
    url("https://github.com/jonas/circe-config"),
    "scm:git:git@github.com:jonas/circe-config.git"
  )
)

developers := List(
  Developer("jonas", "Jonas Fonseca", "jonas.fonseca@gmail.com", url("https://github.com/jonas"))
)