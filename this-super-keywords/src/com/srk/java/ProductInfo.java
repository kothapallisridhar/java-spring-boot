package com.srk.java;

public class ProductInfo {

	public int productId;
	public String productName;
	public double productPrice;
	
	public ProductInfo() {
		
		// calling 1 param constructor
		this(1000);
		System.out.println("This is default constructor");		
	}

	public ProductInfo(int productId) {
		this(666, "iPhone", 150000.99);
		System.out.println("This is 1 param constructor. Product ID: " + productId);
		this.productId = productId;
	}

	
	public ProductInfo(int productId, String productName, double productPrice) {
		System.out.println("This is 3 param constructor. Product ID: " + productId + "Product Name: " + productName + "Prodict Price: " + productPrice);
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public static void main(String[] args) {
		ProductInfo p1 = new ProductInfo();
	}
	
	
}
