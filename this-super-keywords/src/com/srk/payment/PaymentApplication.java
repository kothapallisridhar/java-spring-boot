package com.srk.payment;

public class PaymentApplication {
	
	public String paymentType = "UPI payment";
	
	public PaymentApplication() {
		System.out.println("Payment Application is created");
	}
	
	public PaymentApplication(String paymentType) {
		System.out.println("Payment Application is created with: " + paymentType);
	}
	
	public String makePayment(String paymentType, int amount) {
		System.out.println("Making payment by UPI from Payment Application");
		System.out.println("Payment to " + paymentType + " of Amount: " + amount);
		
		return "paymentSuccess";
	}

}
