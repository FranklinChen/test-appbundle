name := "test-appbundle"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/test-appbundle"))

startYear := Some(2013)

description := "Trivial Swing app to test sbt-appbundle"

version := "1.0"

scalaVersion := "2.10.3"

seq(appbundle.settings: _*)

appbundle.name := "TestAppbundle"

appbundle.mainClass := Some("com.franklinchen.Main")

// 1.7
javacOptions ++= Seq("-source", "1.7", "-target", "1.7")
