package com.srk.bank.loans.imp;

public class LoansApplication extends CarLoanInfo {

	public static void main(String[] args) {
		
		System.out.println(LoansApplication.BANK_NAME);
		
		LoansApplication app = new LoansApplication();
		
		String carLoanInfo = app.getCarLoanInfo(2024, "Hyderabad");
		
		System.out.println(carLoanInfo);
		
		System.out.println(app.getHomeLoanInfo(2025));
		
		System.out.println(app.getPersonalLoanInfo(2024));

	}

}
