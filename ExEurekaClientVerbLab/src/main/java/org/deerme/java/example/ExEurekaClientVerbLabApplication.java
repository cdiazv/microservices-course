package org.deerme.java.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExEurekaClientVerbLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExEurekaClientVerbLabApplication.class, args);
	}
}
