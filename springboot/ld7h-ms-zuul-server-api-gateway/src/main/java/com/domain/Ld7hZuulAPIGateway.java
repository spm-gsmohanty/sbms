package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class Ld7hZuulAPIGateway {

	public static void main(String[] args) {
		System.out.println("SPINNING UP THE ZUUL API GATEWAY SERVER!!!");
		SpringApplication.run(Ld7hZuulAPIGateway.class, args);
	}

}
