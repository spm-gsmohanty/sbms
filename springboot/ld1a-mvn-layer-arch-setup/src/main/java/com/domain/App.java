package com.domain;

import com.domain.repository.ProductRepositoryImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("Traditional App without Spring ....");
		ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();
		System.out.println(productRepositoryImpl.findAll());
	}
}
