plugins {
    scala

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.12.8")

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