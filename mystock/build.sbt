name := """myStock"""
organization := "com.nrowley"

version := "1.0-SNAPSHOT"


lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += javaForms
libraryDependencies += "com.datastax.oss" % "java-driver-core" % "4.0.0"
enablePlugins(JettyPlugin)
