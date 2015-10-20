# Test [sbt-appbundle](http://github.com/sbt/sbt-appbundle)

A pure Java app rather than a Scala app.

Build with

```
$ sbt appbundle
```

## Using Java 1.6 works

Had to put into `build.sbt`:

```
javacOptions ++= Seq("-source", "1.6", "-target", "1.6")
```

## Using Java 8 works
