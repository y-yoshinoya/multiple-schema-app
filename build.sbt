import play.Project._

name := "multiple-schema-sample"

organization := "com.github.aselab"

scalaVersion := "2.10.3"

playScalaSettings

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.github.aselab" %% "scala-activerecord" % "0.3.0-SNAPSHOT",
  "com.github.aselab" %% "scala-activerecord-play2" % "0.3.0-SNAPSHOT",
  jdbc,
  "com.h2database" % "h2" % "1.3.174",
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "bootstrap" % "3.0.3"
)

templatesImport += "com.github.aselab.activerecord.views.dsl._"

activerecordPlaySettings
