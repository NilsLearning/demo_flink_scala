name := "demo_flink_scala"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.10.3"
libraryDependencies += "org.apache.flink" %% "flink-clients" % "1.10.3"
//libraryDependencies += "org.apache.flink" % "flink-core" % "1.10.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.10"
libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.10.3"


