name := "TwitterPopularTags"

version := "1.0"

scalaVersion := "2.10.5"


libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.1" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.3.1"  % "provided"

libraryDependencies += "org.apache.spark" % "spark-streaming-kafka_2.10" % "1.3.1"

libraryDependencies += "org.apache.spark" % "spark-streaming-twitter_2.10" % "1.3.1"

libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "3.0.3" 

libraryDependencies += "org.twitter4j" % "twitter4j-core" % "3.0.3"



