package com.srk.pojo;

public class OrdersManagement {
	
	public void newOrder(Product product) {
		
		int productId = product.getId();
		System.out.println(productId);
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getEmail());
		
	}

}
