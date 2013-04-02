name := "test-appbundle"

version := "1.0"

organization := "com.franklinchen"

scalaVersion := "2.10.1"

description := "Trivial Swing app to test sbt-appbundle"

seq(appbundle.settings: _*)

appbundle.name := "TestAppbundle"

appbundle.mainClass := Some("com.franklinchen.Main")

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")
