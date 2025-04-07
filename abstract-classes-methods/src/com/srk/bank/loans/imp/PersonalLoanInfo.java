package com.srk.bank.loans.imp;

import com.srk.bank.BankLoans;

public abstract class PersonalLoanInfo implements BankLoans {
	
	@Override
	public String getPersonalLoanInfo(int year) {
		
		String info = null;
		
		if(year == 2024) {
			info = "Personal loan ROI : 10.65, 3 months pay slips";
			
		} else if(year == 2025) {
			info = "Personal loan ROI : 11.50, 3 months pay slips";
		}
		
		return info;
	}

}
