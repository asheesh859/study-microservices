package com.eureka_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProjectApplication.class, args);
	}

}
