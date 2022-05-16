package service3;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@AllArgsConstructor
public class KafkaListenerAndWriter {

  private final KafkaTemplate<String, String> publisher;
  private final MessageRepository repo;

  @KafkaListener(id = "consume-write", topics = "topic2")
  public void handleTopic1(ConsumerRecord<String, String> cr) {
    String key = cr.key();
    String value = cr.value();
    log.info("Got Kafka Record: key:{}, value:{}", key, value);
    Integer id = (int)Double.parseDouble(key);
    Message message = new Message(null, value);
    repo.save(message);
    log.info("writing to postgres...");
    log.info("... done");
  }


}
