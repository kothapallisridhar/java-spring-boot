package com.srk.constructors;

public class BankApp {
	
	BankApp() {
		System.out.println("Default Constructor of BankApp");
	}
	
	BankApp(int id) {
		System.out.println("1 param constructor called, id: " + id);
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method of BankApp");
		BankApp bankApp = new BankApp();
		BankApp bankApp1 = new BankApp(10);
	}

}
