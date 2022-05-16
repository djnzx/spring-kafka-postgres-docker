package service3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Service3 {

  public static void main(String[] args) {
    SpringApplication.run(Service3.class);
  }

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder b) {
    return b.build();
  }

}
