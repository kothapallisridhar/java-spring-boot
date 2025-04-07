package com.srk.bank;

public class MainApplication {

	public static void main(String[] args) {
		
		ICICIBankApplication icici = new ICICIBankApplication();
		icici.printBankName();
		icici.getLoanIntrestPercentage("HL");
		
		HDFCBankApplication hdfc = new HDFCBankApplication();
		hdfc.printBankName();
		hdfc.getLoanIntrestPercentage("HL");
		
		// printing guidelines for applying loan
		BankApplication.getGuideLines();
		
		// defalut method of BankApplication interface
		// by default we can't call
		// we can call using implemented class object
		double emiValue = hdfc.calculateEMIValue(48, 6000000, 10);
		System.out.println("Emi value from BankApplication: " + emiValue);
		

	}

}
