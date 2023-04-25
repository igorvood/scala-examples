package ru.vood.apps.kafka

import org.apache.kafka.clients.producer.ProducerRecord
import ru.vood.apps.EmptyApp.greeting
import ru.vood.apps.kafka.config.SimpleProducer.producer
import ru.vood.apps.kafka.config.SimpleProducerProps.producerProps

object ProducerStart   {


  def main(args: Array[String]): Unit = {

    (1 to 3).foreach(i => {
      val key = i.toString
      val payload = i.toString
      val message = new ProducerRecord[String, String]("profile_tx_out", key, payload)
      producer.send(message)
      producer.flush()

    })
    Thread.sleep(100000)
    producer.close()
  }


}
