package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Ld7eMsSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ld7eMsSpringCloudConfigServerApplication.class, args);
	}

}
