val scala3Version = "3.2.0"

//resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

Test / logBuffered := false

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-interview",
    version := "0.0.1-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.15",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )
