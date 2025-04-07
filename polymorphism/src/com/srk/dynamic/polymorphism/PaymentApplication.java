package com.srk.dynamic.polymorphism;

public class PaymentApplication implements Payments{

    //Overriding : impl of Interface abstract method. 
    public void makePayment(String paymentType, double amount) {
	// logic
	System.out.println("This is makePayment(String, double)#PaymentApplication");
    }
    
    //Not Overridden 
    public String getPaymentType() {
	return "No Payment Selected.";
    }

}
