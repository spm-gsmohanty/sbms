package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ld7cMsProductClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ld7cMsProductClientApplication.class, args);
	}

}
