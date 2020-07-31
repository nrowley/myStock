name := """myStock"""
organization := "com.nrowley"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += javaForms
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "3.3.0"
