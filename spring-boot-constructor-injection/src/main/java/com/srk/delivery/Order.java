package com.srk.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int noOfProducts;
	private String emailId;
	private Product product;
	
	// CI : product object : Define constructor with that parameter
	
	@Autowired
	public Order(Product product) {
		System.out.println("Order bean creating... 1 param constructor: " + product);
		this.product = product;
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Product getProduct() {
		return product;
	}

	//@Qualifier("productOne")
	//@Autowired
	public void setProduct(Product product) {
		System.out.println("Setter of Product is called from Order: " + product);
		this.product = product;
	}

	
}
