package ru.vood.apps.kafka.config

import java.io.FileInputStream
import org.yaml.snakeyaml.{LoaderOptions, Yaml}
import org.yaml.snakeyaml.constructor.Constructor

import scala.collection.mutable.ListBuffer
import java.io.{File, FileInputStream}


object YamlBean {

  def main(args: Array[String]) {
    val filename = "src/main/resources/yamlBean.yaml"
    val file = new File(filename)
    val path = file.getAbsolutePath
    println(path)
    val input = new FileInputStream(file)
    val constructor = new Constructor(classOf[EmailAccount], new LoaderOptions)
    val yaml = new Yaml(constructor)
    val e = yaml.load(input).asInstanceOf[EmailAccount]
    println(e)
  }

}
