# Test [sbt-appbundle](http://github.com/sbt/sbt-appbundle)

A pure Java app rather than a Scala app.

Build with

```
$ sbt appbundle
```

For some reason, the resulting Mac app does not work for me:

```
$ open target/TestAppbundle.app 
LSOpenURLsWithRole() failed with error -10810 for the file .../test-appbundle/target/TestAppbundle.app.
```
