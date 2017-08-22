name := """sandwich-shop"""
organization := "HMRC"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.1" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "HMRC.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "HMRC.binders._"
