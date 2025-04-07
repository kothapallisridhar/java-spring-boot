package com.srk.pojo;

public class ProductOperations {
	
	public Product getProductInfo() {
		Product p1 = new Product();
		p1.setId(1000);
		p1.setName("Range Rover");
		p1.setPrice(50000000);
		p1.setEmail("info@rangerover.com");
		
		return p1;
	}
	
	public void sendProductDataToOrders() {
		
		Product productData = getProductInfo();
		
		OrdersManagement orderMgmt = new OrdersManagement();
		orderMgmt.newOrder(productData);
	}
	
	public static void main(String[] args) {
		
		ProductOperations operations = new ProductOperations();
		operations.sendProductDataToOrders();
	}

}
