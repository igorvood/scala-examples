package ru.vood.apps

import ru.vood.apps.kafka.config.SimpleProducerProps.producerProps

object EmptyApp {
  def main(args: Array[String]): Unit = {
    println(producerProps)
    println(greeting())
  }

  def greeting(): String = "Hello, world!"
}
