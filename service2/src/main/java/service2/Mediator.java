package service2;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@AllArgsConstructor
public class Mediator {

  private final KafkaTemplate<String, String> publisher;

//  @KafkaListener(
//      topicPartitions = @TopicPartition(topic = "topic1", partitions = "0"),
//      containerFactory = "kafkaListenerContainerFactory123"
//  )
  @KafkaListener(id = "group1", topics = "topic1",containerFactory = "kafkaListenerContainerFactory123")
  public void handleTopic1p0(ConsumerRecord<String, String> cr) throws InterruptedException {
    String key = cr.key();
    String value = cr.value();
    log.info("Got Kafka Record: key:{}, value:{}", key, value);
    log.info("doing business...");

    Thread.sleep(2000);

    String valueProcessed = value.toUpperCase();

    log.info("... done business");
    publisher.send("topic2", key, valueProcessed);
  }

//  @KafkaListener(
//      topicPartitions = @TopicPartition(topic = "topic1", partitions = "1"),
//      containerFactory = "kafkaListenerContainerFactory123"
//  )
//  public void handleTopic1p1(ConsumerRecord<String, String> cr) throws InterruptedException {
//    String key = cr.key();
//    String value = cr.value();
//    log.info("Got Kafka Record: key:{}, value:{}", key, value);
//    log.info("doing business...");
//
//    Thread.sleep(2000);
//
//    String valueProcessed = value.toUpperCase();
//
//    log.info("... done business");
//    publisher.send("topic2", key, valueProcessed);
//  }


}
