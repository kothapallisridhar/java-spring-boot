package com.srk.overriding;

public class BankApp {

	public static void main(String[] args) {
		
		BankLoanApplication bankLoanApp =  new BankLoanApplication();
		System.out.println(bankLoanApp.calculateEMIValue(10000000, 24, 7));
		
		HomeLoan homeLoan = new HomeLoan();
		System.out.println(homeLoan.calculateEMIValue(10000000, 48, 7));

	}

}
