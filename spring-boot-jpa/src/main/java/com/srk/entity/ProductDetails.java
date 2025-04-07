package com.srk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product") // database table name
public class ProductDetails {
	
	// defining properties
	@Id
	@Column(name="pid")
	private int productId;
	
	@Column(name="pname")
	private String productName;
	
	@Column(name="price")
	private double productPrice;
	
	
	
	public ProductDetails() {
		super();
	}
	
	public ProductDetails(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	

}
