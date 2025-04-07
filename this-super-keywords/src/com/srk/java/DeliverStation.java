package com.srk.java;

public class DeliverStation {
	
	public void deliverOrder(OrderInfo order) {
		System.out.println("Delivering order to customer from Delivery Station");
		System.out.println(order.orderId + ", " + order.userName + ", " + order.orderAmount );
	}

}
