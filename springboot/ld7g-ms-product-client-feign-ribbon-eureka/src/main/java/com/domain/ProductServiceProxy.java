package com.domain;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "product-service", url = "http://localhost:7070")
@FeignClient(name = "product-service")
@RibbonClient(name ="product-service")
public interface ProductServiceProxy {
@GetMapping("/rest/products")
Product[] getAllProducts();
}
