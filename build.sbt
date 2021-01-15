val scala3Version = "3.0.0-M3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "cyclic-reference",
    version := "0.1.0",
    scalaVersion := scala3Version
  )
