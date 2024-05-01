val projectName    = "CVPAdmin"
val projectVersion = "0.1.3"

name         := projectName
version      := projectVersion
scalaVersion := Dependencies.Version.scala

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Dependencies.globalProjectDependencies
  )