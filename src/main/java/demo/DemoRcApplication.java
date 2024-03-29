package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.clent"})
public class DemoRcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRcApplication.class, args);
	}

}

