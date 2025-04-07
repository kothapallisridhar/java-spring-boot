package com.srk.payment;

public class CardPaymentApp extends PaymentApplication {

	public String paymentType = "Card payment";
	
	public CardPaymentApp() {
		super("card");
		System.out.println("Card Payment Application is created");
	}
	
	public String makePayment(String paymentType, int amount) {
		System.out.println("Making payment by Card Payment Application");
		System.out.println("Payment to " + paymentType + " of Amount: " + amount);
		
		return "Payment Success";
	}
	
	public void paymentStatus() {
		//String result = makePayment("Credit Card", 29999);
		String result = super.makePayment("UPI Card", 29999);
		System.out.println(result);
	}
	
	public void paymentType() {
		//System.out.println("Payment Type is: " + paymentType);
		
		System.out.println("Payment Type is: " + super.paymentType);
	}
	
	public void contactInfo() {
		System.out.println("If any issues in payment, contact: 9998886666");
	}

}
