name := "ratemyskill"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.5"

val mainLibraryDependencies = Seq(
  "com.github.nscala-time" %% "nscala-time" % "1.4.0",
  "org.slf4j" % "slf4j-api" % "1.7.7",
  "ch.qos.logback" % "logback-classic" % "1.1.2"
)

val testLibraryDependencies = Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test,it"
)

libraryDependencies ++= (mainLibraryDependencies ++ testLibraryDependencies)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")