package com.srk.bank.loans.imp;

import com.srk.bank.BankLoans;

public abstract class CarLoanInfo extends HomeLoanInfo {

	public String getCarLoanInfo(int year, String city) {
		
		String info = null;
		
		if(year == 2024 && city == "Hyderabad") {
			info = "Car Loan ROI: 8%, 3 months pay slips";
		} else {
			info = "Car Loan ROI: 9%, 3 months pay slips";
		}
		
 		return info;
		
	}
}
