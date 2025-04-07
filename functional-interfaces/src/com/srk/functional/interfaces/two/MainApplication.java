package com.srk.functional.interfaces.two;

public class MainApplication {

	public static void main(String[] args) {

		MainApplication mainApp = new MainApplication();
		mainApp.checkAllBankLoans();

	}
	
	public void checkAllBankLoans() {
		
		BankLoan iciciLoan = (long principle, int noOfMonths, double roi) -> {
			
			return 5555;
		};
		
		double iciciEmiAmount = iciciLoan.getLoanEmiValue(100000, 12, 12);
		System.out.println(iciciEmiAmount);
		
		// 1. Eliminate method argument data types, argument names are mandatory
		BankLoan hdfcLoan = (principle, noOfMonths, roi) -> {
			System.out.println("HDFC loan amount: " + principle);
			System.out.println("HDFC loan tenure: " + noOfMonths);
			System.out.println("HDFC loan intrest: " + roi);
			return 6666;
		};
		double hdfcEmiAmount = hdfcLoan.getLoanEmiValue(600000, 24, 7);
		System.out.println("HDFC EMI amount: " + hdfcEmiAmount);
		
		BankLoan axisLoan = (principle, noOfMonths, roi) -> principle*noOfMonths*roi/100;
		double axisLoanEmi = axisLoan.getLoanEmiValue(30000, 12, 8);
		System.out.println("Axis EMI amount: " + axisLoanEmi);
		
		Testing test1 = () -> System.out.println("Test case: 1");
		Testing test2 = () -> {
			System.out.println("Checking User...");
			System.out.println("Test case: 2");
		};
		test1.accept();
		test2.accept();
		
		PrintInfo print1 = (String info) -> System.out.println(info);
		print1.print("Print Info version 1 ");

		PrintInfo print2 = (String info) -> { System.out.println(info); };
		print2.print("Print Info version 2 ");
		
		PrintInfo print3 = info -> System.out.println(info);
		print3.print("Print Info version 3 ");
	
	}

}
