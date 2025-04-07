package com.srk.functional.interfaces.two;

@FunctionalInterface
public interface BankLoan {
	
	double getLoanEmiValue(long principle, int noOfMonths, double roi);

}
