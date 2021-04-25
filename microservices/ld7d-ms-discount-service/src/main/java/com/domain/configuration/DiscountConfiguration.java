package com.domain.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
//discount-service is the prefix in the application.properties
@ConfigurationProperties("discount-service")
public class DiscountConfiguration {
	@Getter
	@Setter
	private int minimum;
	@Getter
	@Setter
	private int maximum;
	@Getter
	@Setter
	private int flag;
	@Override
	public String toString() {
		return "DiscountConfiguration [minimum=" + minimum + ", maximum=" + maximum + ", flag=" + flag + "]";
	}
	
	
}
