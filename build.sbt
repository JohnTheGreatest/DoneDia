name := """Diapost"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers ++= Seq(
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
//  "be.objectify" %% "deadbolt-scala" % "2.3.3-SNAPSHOT",
  cache,
  ws,
  // The Scala kit
  "io.prismic" %% "scala-kit" % "1.2.12"
)

