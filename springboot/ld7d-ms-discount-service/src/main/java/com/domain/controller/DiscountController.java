package com.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.configuration.DiscountConfiguration;
import com.domain.model.Discount;

@RestController
public class DiscountController {

	@Autowired
	DiscountConfiguration discountConfiguration;
//http://localhost:8080/discount
	@GetMapping("/discount")
	public Discount getConfiguredDiscount() {
		int minimum = discountConfiguration.getMinimum();
		int maximum = discountConfiguration.getMaximum();
		Discount discount = new Discount(minimum, maximum);
		return discount;
	}
}
