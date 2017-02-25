// this needs modification!!!
name := "File Stats"

version := "1.0"

scalaVersion := "2.11.8"

// https://mvnrepository.com/artifact/org.scala-lang/scala-library
// https://mvnrepository.com/artifact/com.github.scala-incubator.io/scala-io-file_2.10.0-M6
libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % "1.6.1",
	"org.apache.spark" %% "spark-sql" % "1.6.1",
	"org.scala-lang" % "scala-library" % "2.11.8",
	"com.databricks" % "spark-csv_2.10" % "1.4.0",
	"com.github.scala-incubator.io" % "scala-io-file_2.10.0-M6" % "0.4.0",
        "javax.transaction" % "jta" % "1.1"
)

