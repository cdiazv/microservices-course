package org.deerme.java.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExEurekaServerLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExEurekaServerLabApplication.class, args);
	}
}




