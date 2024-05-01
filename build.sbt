val projectName    = "CVPAdmin"
val projectVersion = "0.1.0"

name         := projectName
version      := projectVersion
scalaVersion := Dependencies.Version.scala

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Dependencies.globalProjectDependencies
  )