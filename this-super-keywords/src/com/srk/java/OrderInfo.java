package com.srk.java;

public class OrderInfo extends DeliverStation {

	public int orderId;
	public String userName;
	public double orderAmount;
	
	public OrderInfo(int orderId, String userName, double orderAmount) {
		this.orderId = orderId;
		this.userName = userName;
		this.orderAmount = orderAmount;
	}
	

	
	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", userName=" + userName + ", orderAmount=" + orderAmount + "]";
	}
	
	public void printOderInfo() {
		System.out.println("OrderId: " + orderId);
		System.out.println("OrderId: " + this.orderId);
		System.out.println("User Name: " + userName);
		System.out.println("Order amount: " + orderAmount);
		deliverOrder(this);
		super.deliverOrder(this);
	}
	
	public void deliverOrder(OrderInfo order) {
		System.out.println("Delivering order to customer...");
		System.out.println(order.orderId + ", " + order.userName + ", " + order.orderAmount );
	}



	public static void main(String[] args) {
		
		OrderInfo order1 = new OrderInfo(111, "Sridhar", 9999.99);
		OrderInfo order2 = new OrderInfo(222, "Sri", 888.88);
		OrderInfo order3 = new OrderInfo(666, "SRK", 666.88);
		
		/*System.out.println(order1);
		order1.printOderInfo();
		
		System.out.println(order2);
		order2.printOderInfo();*/
		order2.printOderInfo();
		
	}

}
