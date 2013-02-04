name := "test-appbundle"

version := "1.0"

organization := "com.franklinchen"

scalaVersion := "2.10.0"

description := "Trivial Swing app to test sbt-appbundle"

seq(appbundle.settings: _*)

appbundle.name := "TestAppbundle"

appbundle.mainClass := Some("com.franklinchen.Main")

// Use 1.6
// TODO For some reason, appbundle-built app fails when building with 1.7
// LSOpenURLsWithRole() failed with error -10810
javaHome := Some(file("/System/Library/Frameworks/JavaVM.framework/Versions/1.6/Home"))
