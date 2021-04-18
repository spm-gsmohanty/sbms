package com.domain;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service", url = "http://localhost:8071")
public interface ProductServiceProxy {
@GetMapping("/rest/products")
Product[] getAllProducts();
}
