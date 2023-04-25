package ru.vood.apps.kafka.config

import org.yaml.snakeyaml.{LoaderOptions, Yaml}
import org.yaml.snakeyaml.constructor.Constructor

import java.io.{File, FileInputStream}
import scala.beans.BeanProperty

case class SimpleProducerProps1 (
  kafkaProps: java.util.Map[String, Any]
  //  @BeanProperty var username = ""
  //  @BeanProperty var password = ""
  //  @BeanProperty var mailbox = ""
  //  @BeanProperty var imapServerUrl = ""
  //  @BeanProperty var protocol = ""
  //  @BeanProperty var minutesBetweenChecks = 0
  //  @BeanProperty var usersOfInterest = new java.util.ArrayList[String]()
  //  override def toString: String = s"acct: $accountName, user: $username, url: $imapServerUrl"
)

object SimpleProducerProps {

  def getProps() : SimpleProducerProps1 = {
    val filename = "src/main/resources/kafkaProducer.yaml"
    val file = new File(filename)
    val input = new FileInputStream(file)
    val constructor = new Constructor(classOf[java.util.Map[String, Any]], new LoaderOptions)
    val yaml = new Yaml(constructor)
    val e1 = yaml.load(input).asInstanceOf[java.util.Map[String, Any]]

//    val e = yaml.load(input).asInstanceOf[SimpleProducerProps1]
//    println(e)
    return SimpleProducerProps1(e1)
  }


  implicit val producerProps : SimpleProducerProps1 = getProps()



}
