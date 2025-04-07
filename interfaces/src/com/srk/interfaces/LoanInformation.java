package com.srk.interfaces;

public interface LoanInformation extends InterfaceOne, InterfaceTwo {

	// return: String
	// no arguments, method name getLoanType()
	public String getLoanType();
	
	public String getBankName();
	
	public double calculateEmiValue(long amount, int years, double rateOfIntrest);
	
	public static String getLoanEligibility() {
		return "You are eligible";
	}
	
	public default String getLoanEligibilityTwo() {
		return "You are eligible";
	}
}

