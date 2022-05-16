package service1;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class HttpController {

  private final KafkaTemplate<String, String> kafka;

  @GetMapping("/")
  public void handle(@RequestParam(name = "name") String name) {
    String key = Double.toString(Math.random() * 1000);
    String value = name;
    kafka.send(
        "topic1",
        key,
        value
    );
  }

}
