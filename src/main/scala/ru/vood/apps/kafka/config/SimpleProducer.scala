package ru.vood.apps.kafka.config

import org.apache.kafka.clients.producer.{KafkaProducer, Producer}

import scala.beans.BeanProperty
import scala.sys.props


object SimpleProducer {

  val producer: Producer[String, String] = new KafkaProducer[String, String](SimpleProducerProps.producerProps.kafkaProps)

}
