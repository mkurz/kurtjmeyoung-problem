name := "kurtjmeyoung-problem"
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.12"

libraryDependencies += guice

libraryDependencies += "org.webjars.npm" % "bootstrap" % "5.3.2"
libraryDependencies += "org.webjars.npm" % "bootstrap-icons" % "1.11.1"


//import com.typesafe.sbt.jse.JsEngineImport.JsEngineKeys._
//npmPreferSystemInstalledNpm := false
