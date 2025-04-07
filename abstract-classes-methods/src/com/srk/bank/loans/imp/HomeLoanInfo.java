package com.srk.bank.loans.imp;

import com.srk.bank.BankLoans;

public abstract class HomeLoanInfo extends PersonalLoanInfo {

	@Override
	public String getHomeLoanInfo(int year) {
		String info = null;
		info = "Home loan ROI : 7.65%, 12 months pay slips, IT returns, Form 16";
		return info;
	}

}
