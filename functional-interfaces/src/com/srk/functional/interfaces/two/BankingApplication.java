package com.srk.functional.interfaces.two;

public class BankingApplication {

	public static void main(String[] args) {

		// Lambda Expression
		BankLoan homeLoan = (long principle, int noOfMonths, double roi) -> {
		
			System.out.println("Calculating Home Loan EMI value");
			return 66666;
		};
		
		BankLoan carLoan = (long principle, int noOfMonths, double roi) -> {
			
			System.out.println("Calculating Car Loan EMI value");
			return 22666;
		};
		
		BankLoan personalLoan = (long principle, int noOfMonths, double roi) -> {
			
			System.out.println("Calculating Personal Loan EMI value");
			return 33666;
		};
		
		double homeLoanEmi = homeLoan.getLoanEmiValue(5000000, 48, 7);
		System.out.println(homeLoanEmi);
		
		double carLoanEmi = carLoan.getLoanEmiValue(600000, 36, 10);
		System.out.println(carLoanEmi);
		
		double personalLoanEmi = personalLoan.getLoanEmiValue(600000, 36, 10);
		System.out.println(personalLoanEmi);

	}

}
