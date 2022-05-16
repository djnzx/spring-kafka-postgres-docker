package service2;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@AllArgsConstructor
public class KafkaListener {

  private final KafkaTemplate<String, String> publisher;

  @org.springframework.kafka.annotation.KafkaListener(id = "group1", topics = "topic1")
  public void handleTopic1(ConsumerRecord<String, String> cr) throws InterruptedException {
    String key = cr.key();
    String value = cr.value();
    log.info("Got Kafka Record: key:{}, value:{}", key, value);
    log.info("doing business...");
    Thread.sleep(2000);
    String valueProcessed = value.toUpperCase();
    log.info("... done business");
    publisher.send("topic2", key, valueProcessed);
  }


}
