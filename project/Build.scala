import sbt._
import Keys._

object EditorBuild extends Build {

  lazy val root = Project(
    id = "offedit",
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq (
      organization := "baskingcat",
      version      := "0.1-SNAPSHOT",
      scalaVersion := "2.9.1",
      libraryDependencies += "com.oracle" % "javafx-runtime" % "2.2-beta"
    )
  ) dependsOn (uri("git://github.com/halcat0x15a/onedit.git"), uri("git://github.com/halcat0x15a/onedit.py.git"))

}
