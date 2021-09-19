name := "hw01"

version := "4.0"

scalaVersion := "2.13.6"

libraryDependencies += "org.scalatest" % "scalatest_2.13" % "3.2.9" % "test"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9"

Test / parallelExecution := false
