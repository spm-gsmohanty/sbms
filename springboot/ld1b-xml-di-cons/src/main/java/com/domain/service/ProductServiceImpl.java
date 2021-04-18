package com.domain.service;

import java.util.List;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	// Traditional way
//	private ProductRepository productRepository = new ProductRepositoryImpl();
	// Why don't we ask spring to provide the repository?
//	The Service is dependent on the repository
//  Spring can inject the dependency automatically.
//  Using the constructor to inject the dependency.
	private ProductRepository productRepository = null;

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public List<Product> findAll() {
		return this.productRepository.findAll();
	}

}
