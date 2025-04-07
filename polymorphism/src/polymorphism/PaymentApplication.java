package polymorphism;

public class PaymentApplication {

    public void makePayment() {
	// logic
	System.out.println("This is makePayment()#PaymentApplication");
    }

    public void makePayment(String paymentType) {
	// logic
	System.out.println("This is makePayment(String)#PaymentApplication");
    }

    public void makePayment(String paymentType, double amount) {
	// logic
	System.out.println("This is makePayment(String, double)#PaymentApplication");
    }

    public void makePayment(String cc, int amount) {
	// logic
	System.out.println("This is makePayment(String, int)#PaymentApplication");
    }

    public static void main(String[] args) {
	PaymentApplication payment = new PaymentApplication();
	payment.makePayment();
	payment.makePayment("UPI");
	payment.makePayment("UPI", 8888); // 20 executed
	payment.makePayment("UPI", 8888.00); // 15 executed
    }

}
