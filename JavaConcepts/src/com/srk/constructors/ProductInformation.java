package com.srk.constructors;

public class ProductInformation {
	
	int productId;
	String productName;
	double productPrice;
	
	ProductInformation(int id, String name, double price) {
		productId = id;
		productName = name;
		productPrice = price;
	}
	
	public static void main(String[] args) {
		
		ProductInformation p = new ProductInformation(10, "iPhone 15 pro", 150000);
		System.out.println("Product details: " + p.toString());
		
	}

	@Override
	public String toString() {
		return "ProductInformation [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
	

}
