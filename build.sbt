lazy val spark = (project in file("spark"))
  .settings(
    name := "spark",
    scalaVersion := "2.12.13",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.0.0",
      "org.apache.spark" %% "spark-sql" % "3.0.0" % "provided",
      "org.apache.spark" %% "spark-mllib" % "3.0.0" % "provided"
    )
  )

lazy val scio = (project in file("scio"))
  .settings(
    name := "scio",
    scalaVersion := "2.12.15",
    libraryDependencies ++= Seq(
    "com.spotify" %% "scio-core" % "0.11.4",
    "org.apache.beam" % "beam-runners-direct-java" % "2.20.0",
    "org.apache.beam" % "beam-runners-google-cloud-dataflow-java" % "2.20.0")
  )

lazy val scala3 = (project in file("scala3"))
            .settings(
                name := "scala3",
                scalaVersion := "3.1.0"
            )

ThisBuild / exportJars := true
