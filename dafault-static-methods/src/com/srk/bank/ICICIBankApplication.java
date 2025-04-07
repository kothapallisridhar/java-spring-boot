package com.srk.bank;

public class ICICIBankApplication implements BankApplication {

	public void printBankName() {
		
		System.out.println("This is ICICI Bank.");

	}

	public void getLoanIntrestPercentage(String loanType) {
		
		if(loanType == "CL") {
			System.out.println("Car loan intreset rate is: 8.75%");
			
			// calling emi logic
			double emiValue = calculateEMIValue(12, 5000000, 8.75);
			System.out.println("ICCI Car loan emi value: " + emiValue);
			
		} else if (loanType == "PL") {
			System.out.println("Personal loan intreset rate is: 10.75%");
			
			// calling emi logic
			double emiValue = calculateEMIValue(12, 500000, 10.75);
			System.out.println("ICCI Personal loan emi value: " + emiValue);
			
		} else if(loanType == "HL") {
			System.out.println("Home loan intreset rate is: 7.75%");
			
			// calling emi logic
			double emiValue = calculateEMIValue(12, 50000000, 7.75);
			System.out.println("ICCI Home loan emi value: " + emiValue);
		}

	}

}
