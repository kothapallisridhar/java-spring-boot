package com.srk.dynamic.polymorphism;

public class NetBankingPaymentApplication extends PaymentApplication {

    // overrding 
    @Override
    public void makePayment(String paymentType, double amount) {
	// logic
	System.out.println("This is makePayment(String, double)#NetBankingPaymentApplication");
    }
    
    // own methods 

}
