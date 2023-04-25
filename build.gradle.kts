plugins {
    scala

    application
}

repositories {
    mavenCentral()
}

val kafkaVersion = "3.4.0"
val akkaVersion = "2.4.2"


dependencies {
    implementation("org.apache.kafka:kafka-clients:$kafkaVersion")
//    implementation("com.typesafe.akka:akka-slf4j:$akkaVersion")
    implementation("ch.qos.logback:logback-classic:1.4.6")
    implementation("com.typesafe.play:play-json_2.13:2.9.4")

    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.2")
//    implementation("com.fasterxml.jackson.module:jackson-module-scala:2.8.3")
    implementation("org.apache.commons:commons-exec:1.3")
    implementation("com.google.guava:guava:31.1-jre")
//    implementation("org.apache.avro:avro:1.11.0")
//    implementation("com.twitter:bijection-avro:0.9.2")
    // https://mvnrepository.com/artifact/org.yaml/snakeyaml
    implementation("org.yaml:snakeyaml:2.0")


    implementation("org.scala-lang:scala-library:2.13.10")

    implementation("com.trueaccord.scalapb:scalapb-runtime-grpc_2.12:0.6.7")
    implementation("com.google.guava:guava:31.1-jre")

    testImplementation("junit:junit:4.13.2")
//    testImplementation("org.scalatest:scalatest_2.13:3.2.14")
//    testImplementation("org.scalatestplus:junit-4-13_2.13:3.2.2.0")

//    testRuntimeOnly("org.scala-lang.modules:scala-xml_2.13:1.2.0")
}

application {
    mainClass.set("demo.App")
}