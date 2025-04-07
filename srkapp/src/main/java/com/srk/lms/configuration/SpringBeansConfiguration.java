package com.srk.lms.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.srk.lms.app.Product;

@Configuration
public class SpringBeansConfiguration {

	@Bean
	public Product product2() {
		System.out.println("Product2 bean creating");
		return new Product();
	}
}
