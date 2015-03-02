name := "ratemyskill"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.5"

val mainLibraryDependencies = Seq(
  "com.github.nscala-time" %% "nscala-time" % "1.8.0",
  "org.slf4j" % "slf4j-api" % "1.7.10",
  "ch.qos.logback" % "logback-classic" % "1.1.2"
)

val testLibraryDependencies = Seq(
  "org.pegdown" % "pegdown" % "1.5.0" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

libraryDependencies ++= (mainLibraryDependencies ++ testLibraryDependencies)

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings")

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")

// SBT Coveralls plugin related settings. Instructions at : https://github.com/scoverage/sbt-coveralls
import CoverallsPlugin.CoverallsKeys._

// Create env var 'COVERALLS_REPO_TOKEN' on ~/.profile locally.
coverallsToken := sys.env.get("COVERALLS_REPO_TOKEN")

ScoverageSbtPlugin.ScoverageKeys.coverageMinimum := 80

ScoverageSbtPlugin.ScoverageKeys.coverageFailOnMinimum := true