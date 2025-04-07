package com.srk.dynamic.polymorphism;

public class CreditCardPaymentApplication extends PaymentApplication {

    // overrding 
    @Override
    public void makePayment(String paymentType, double amount) {
	// logic
	System.out.println("This is makePayment(String, double)#CreditCardPaymentApplication");
    }

    //not a overridden 
    public String creditCardPayment() {
	
	return "Credit Card Payment Selected";
    }
    
    //getPaymentType : Parent 
}
