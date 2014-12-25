name := """Diapost"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  // The Scala kit
  "io.prismic" %% "scala-kit" % "1.2.12"
)

