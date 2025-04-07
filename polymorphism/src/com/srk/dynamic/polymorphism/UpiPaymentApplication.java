package com.srk.dynamic.polymorphism;

public class UpiPaymentApplication extends PaymentApplication {

    // overrding 
    @Override
    public void makePayment(String paymentType, double amount) {
	// logic
	System.out.println("This is makePayment(String, double)#UpiPaymentApplication");
    }
    
    // own methods 

}
