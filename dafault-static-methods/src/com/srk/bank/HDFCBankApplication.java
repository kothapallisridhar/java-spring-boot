package com.srk.bank;

public class HDFCBankApplication implements BankApplication {

	public void printBankName() {
		
		System.out.println("This is HDFC Bank.");

	}
	
	public double calculateEMIValue(int noOfMonths, double loanAmount, double roi) {
		
		System.out.println("Calculating HDFC EMI vlaue...");
		double emiValue = noOfMonths * loanAmount * roi / 100;
		
		// adding processing fee 
		emiValue += 5000;
		
		return emiValue;
	}
	
	public void getLoanIntrestPercentage(String loanType) {
		
		if(loanType == "CL") {
			System.out.println("Car loan intreset rate is: 8.70%");
			
			// calling emi logic
			double emiValue = calculateEMIValue(12, 5000000, 8.70);
			System.out.println("HDFC Car loan emi value: " + emiValue);
			
		} else if (loanType == "PL") {
			System.out.println("Personal loan intreset rate is: 10.70%");
			
			// calling emi logic
			double emiValue = calculateEMIValue(12, 500000, 10.70);
			System.out.println("HDFC Personal loan emi value: " + emiValue);

		} else if(loanType == "HL") {
			System.out.println("Home loan intreset rate is: 7.65%");
			
			// calling emi logic
			double emiValue = calculateEMIValue(12, 70000000, 7.65);
			System.out.println("HDFC Home loan emi value: " + emiValue);

		}
		
		// printing guidelines for applying loan
		BankApplication.getGuideLines();

	}

}
