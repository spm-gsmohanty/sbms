package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.domain")
@EnableEurekaClient
public class Ld7fMsProductClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ld7fMsProductClientApplication.class, args);
	}

}
