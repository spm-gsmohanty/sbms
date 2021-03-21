package com.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.repository.ProductRepositoryImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("Traditional App with Spring and IOC....");
//		ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();
		// IOC & DI
		// Expecting the Spring Framework to inject the dependency.
		ProductRepositoryImpl productRepositoryImpl = null;
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
//				"applicationContext.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		productRepositoryImpl = applicationContext.getBean("productRepositoryImpl", ProductRepositoryImpl.class);
		System.out.println(productRepositoryImpl.findAll());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
