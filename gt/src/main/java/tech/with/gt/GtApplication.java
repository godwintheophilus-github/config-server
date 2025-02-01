package tech.with.gt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GtApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtApplication.class, args);
	}

}
