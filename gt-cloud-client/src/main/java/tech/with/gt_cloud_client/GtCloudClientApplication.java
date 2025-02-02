package tech.with.gt_cloud_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableAutoConfiguration
public class GtCloudClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(GtCloudClientApplication.class, args);
	}

}
