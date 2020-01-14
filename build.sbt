ThisBuild / scalaVersion := "2.13.1"
ThisBuild / autoStartServer := false

val a =
  project
    .in(file("a"))

val b =
  project
    .in(file("b"))
    .dependsOn(a)
    .settings(libraryDependencies += "com.typesafe" % "config" % "1.4.0")
