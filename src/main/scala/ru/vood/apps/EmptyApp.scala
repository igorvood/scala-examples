package ru.vood.apps

object EmptyApp {
  def main(args: Array[String]): Unit = {
    println(greeting())
  }

  def greeting(): String = "Hello, world!"
}
