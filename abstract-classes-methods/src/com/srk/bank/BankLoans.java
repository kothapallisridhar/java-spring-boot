package com.srk.bank;

public interface BankLoans {
	
	public static final String BANK_NAME = "ICICI Bank";
	
	String getHomeLoanInfo(int year);
	
	String getCarLoanInfo(int year, String city);
	
	String getPersonalLoanInfo(int year);

}
