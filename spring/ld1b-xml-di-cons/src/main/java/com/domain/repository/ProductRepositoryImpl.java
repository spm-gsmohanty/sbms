package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class ProductRepositoryImpl implements ProductRepository {
	public List<Product> findAll() {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product("P01", "Man's Search For Meaning", 300));
		productsList.add(new Product("P02", "Awaken the Giant Withing", 500));
		return productsList;
	}
}
