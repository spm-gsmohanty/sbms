package com.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.entity.Product;
import com.domain.repository.ProductRepository;
//annotations provide metadata
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> productsList = productRepository.findAll();
		System.out.println("Products : " + productsList);
		return productsList;
	}

	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable(value = "id") Long productId) {
		Product product = null;
		product = productRepository.findById(productId).get();
		System.out.println("Fetched Product : " + product);
		return product;
	}

//	@RequestMapping(value = "/products", method = RequestMethod.POST)
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		Product product2 = productRepository.save(product);
		System.out.println("Saved : " + product2);
		return product2;
	}

	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable(value="id") Long productId,
			@RequestBody Product product) {
//		getting the product to be updated from the repository
		Product product1 = productRepository.findById(productId).get();
//		updating the changes received from the front end.
		product1.setProductName(product.getProductName());
		product1.setDescription(product.getDescription());
		product1.setPrice(product.getPrice());
//		save the product to the database
		Product product2 = productRepository.save(product1);
		System.out.println("Updated : " + product);
		return product2;
	}
	
}
