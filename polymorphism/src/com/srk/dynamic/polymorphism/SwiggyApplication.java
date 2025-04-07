package com.srk.dynamic.polymorphism;

public class SwiggyApplication {

    public static void main(String[] args) {

	// a Super class reference can hold/refer it's sub class instances/Object.

	PaymentApplication payment = new CreditCardPaymentApplication();

	// calling method : Which method is executed is it from : Parent or child class?
	// Child class.
	payment.makePayment("Payment", 5555.00); // #CreditCardPaymentApplication

	payment = new UpiPaymentApplication();
	payment.makePayment("Payment", 5555.00); // #UpiPaymentApplication

	payment = new NetBankingPaymentApplication();
	payment.makePayment("Payment", 5555.00); // #NetBankingPaymentApplication

	payment = new CreditCardPaymentApplication();

	payment.makePayment("Payment", 44444.00); // Overridden method
	// payment.creditCardPayment(); // Compile Time Error : Method Of Child CLass
	String response = payment.getPaymentType(); // ABle to call. Method Of Parent CLass
	System.out.println(response);
	
	
	CreditCardPaymentApplication cc = new CreditCardPaymentApplication();
	cc.creditCardPayment();   //CreditCardPaymentApplication
	cc.getPaymentType();		// PaymentApplication
	
	
	System.out.println("**********INterface as A Parent *************");
	
	// interface : Payments -> PaymentApplication -> CreditCardPaymentApplication, UpiPaymentApplication, NetBankingPaymentApplication

	Payments paymentOption = new PaymentApplication();
	paymentOption.makePayment("Payment", 55555);
	
	paymentOption = new CreditCardPaymentApplication(); 
	paymentOption.makePayment("Payment", 55555);		// child available or not : No : Parent level
	
	paymentOption = new UpiPaymentApplication();
	paymentOption.makePayment("Payment", 55555);
	
	paymentOption = new NetBankingPaymentApplication();
	paymentOption.makePayment("Payment", 55555);
	
	
	

    }

}
