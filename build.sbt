name := "test-appbundle"

version := "1.0"

organization := "com.franklinchen"

scalaVersion := "2.10.0"

description := "Trivial Swing app to test sbt-appbundle"

seq(appbundle.settings: _*)

appbundle.name := "TestAppbundle"

//appbundle.mainClass := Some("com.franklinchen.Main")
