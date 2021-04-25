package com.domain;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "product-service", url = "http://localhost:7070")
// Feign client is invoking the product-service directly
//@FeignClient(name = "product-service")
// The Feign client should use the API gateway to reach the product-service
@FeignClient(name="zuul")
@RibbonClient(name ="product-service")
public interface ProductServiceProxy {
//@GetMapping("/rest/products")
// Passes through the zuul gateway {application-name}/uri
@GetMapping("/product-service/rest/products")
Product[] getAllProducts();
}
