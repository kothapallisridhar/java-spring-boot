package com.srk.classes;

import com.srk.interfaces.LoanInformation;

public class ICICILoanApp implements LoanInformation {

	public static void main(String[] args) {
		ICICILoanApp app = new ICICILoanApp();
		System.out.println(app.getBankName());
		System.out.println(app.getLoanType());
		System.out.println(LoanInformation.getLoanEligibility());
	}
	
	@Override
	public String getLoanType() {
		return "Personal Loan";
	}

	@Override
	public String getBankName() {
		return "ICICI";
	}

	@Override
	public double calculateEmiValue(long amount, int years, double rateOfIntrest) {
		
		return 0;
	}

	@Override
	public void methodOne() {
		System.out.println("This is methodOne()");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("This is methodTwo()");
		
	}
	
	

}
