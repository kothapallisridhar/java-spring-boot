package com.srk.bank;

public interface BankApplication {
	
	// abstract methods
	public void printBankName();
	public void getLoanIntrestPercentage(String loanType);
	
	// static method
	public static void getGuideLines() {
		System.out.println("1. Person should belongs to India");
		System.out.println("2. Person should have valid Aadhar");
		System.out.println("3. Person should have valid PAN Card");
	}
	
	public default double calculateEMIValue(int noOfMonths, double loanAmount, double roi) {
		
		System.out.println("Calculating EMI vlaue...");
		double emiValue = noOfMonths * loanAmount * roi / 100;
		
		return emiValue;
	}
	
	
	

}
