package chunbao.nl.event.readonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("chunbao.nl.event.module") // scan h2 entity
@ComponentScan(basePackages = {"chunbao.nl.event.dao"}) // external beans
public class ReadonlyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReadonlyApplication.class, args);
  }
}
