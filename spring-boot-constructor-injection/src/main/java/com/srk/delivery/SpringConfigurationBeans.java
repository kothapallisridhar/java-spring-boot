package com.srk.delivery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfigurationBeans {

	//@Primary
	@Bean("productTwo")
	public Product getProductTwo() {
		
		System.out.println("productTwo is creating via Bean method");
		return new Product();
		
	}
}
