package com.srk.typecasting;

public class TypeCastingNonPrimitives {

	public static void main(String[] args) {
		
		BankApp bankApp = new BankApp();
		
		ICICIApp iciciApp = new ICICIApp();
		
		// smaller to larger
		BankApp icici = new ICICIApp();
		BankApp axis = new AxisApp();
		BankApp hdfc = new HDFCApp();
		
		System.out.println(icici.getClass());
		
		// larger to smaller
		//ICICIApp iciciApp = (ICICIApp)bankApp;  // conversion is not possible
		
		// Down casting
		doBankOperations(axis);

	}
	
	public static void doBankOperations(BankApp app) {
		
		if(app instanceof ICICIApp) {
			ICICIApp icici = (ICICIApp)app;
			System.out.println(icici.getBankName());
			
		} else if(app instanceof AxisApp) {
			AxisApp axis = (AxisApp)app;
			System.out.println(axis.getBankName());
			
		} else if (app instanceof HDFCApp) {
			HDFCApp hdfc = (HDFCApp)app;
			System.out.println(hdfc.getBankName());
			
		} else {
			System.out.println("Out of Choice!");
		}
		

		
	}

}
