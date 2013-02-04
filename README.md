# Test [sbt-appbundle](http://github.com/sbt/sbt-appbundle)

A pure Java app rather than a Scala app.

Build with

```
$ sbt appbundle
```

## Java 1.7 issue

For some reason, the resulting Mac app does not work for me:

```
$ open target/TestAppbundle.app 
LSOpenURLsWithRole() failed with error -10810 for the file .../test-appbundle/target/TestAppbundle.app.
```

## Using Java 1.6 works

Had to put into `build.sbt`:

```
javaHome := Some(file("/System/Library/Frameworks/JavaVM.framework/Versions/1.6/Home"))
```

The resulting Mac app works.
