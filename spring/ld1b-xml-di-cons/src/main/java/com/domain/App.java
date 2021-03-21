package com.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("App with Spring and IOC....");
		useClassPath();
//		useFileSystem();
	}

	private static void useClassPath() {
		// ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();
		// IOC & DI
		// Expecting the Spring Framework to inject the dependency.
		ProductService productService = null;
		// ClassPathXmlApplicationContext classPathXmlApplicationContext = new
		// ClassPathXmlApplicationContext(
		// "applicationContext.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		productService = applicationContext.getBean("productService", ProductServiceImpl.class);
		System.out.println(productService.findAll());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

//	private static void useFileSystem() {
//		// ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();
//		// IOC & DI
//		// Expecting the Spring Framework to inject the dependency.
//		ProductRepository productRepository = null;
//		// ClassPathXmlApplicationContext classPathXmlApplicationContext = new
//		// ClassPathXmlApplicationContext(
//		// "applicationContext.xml");
//		// By default spring looks for the application root folder
//		// ApplicationContext applicationContext = new
//		// FileSystemXmlApplicationContext("applicationContext.xml");
////		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
////				"C:\\Users\\Enzo\\Desktop\\msG2\\sbms\\spring\\applicationContext.xml");
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
//				"C:/Users/Enzo/Desktop/msG2/sbms/spring/applicationContext.xml");
//		productRepository = applicationContext.getBean("productRepositoryImpl", ProductRepositoryImpl.class);
//		System.out.println(productRepository.findAll());
//		((FileSystemXmlApplicationContext) applicationContext).close();
//	}
}
