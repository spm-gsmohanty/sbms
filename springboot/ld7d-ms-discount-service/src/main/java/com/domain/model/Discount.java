package com.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Discount {
	@Getter
	@Setter
	private int minimum;
	@Getter
	@Setter
	private int maximum;
}
