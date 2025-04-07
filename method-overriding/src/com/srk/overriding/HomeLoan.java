package com.srk.overriding;

public class HomeLoan extends BankLoanApplication {
	
	public double calculateEMIValue(long principleAmoutn, int months, double roi) {
		
		double emiValue = 0;
		
		System.out.println("Calculating EMI value...from calculateEMIValue() # HomeLoan");
		
		return 55666.00;
		
	}

}
