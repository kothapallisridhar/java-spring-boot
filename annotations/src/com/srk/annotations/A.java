package com.srk.annotations;

public class A implements Bank {

	public void one() {
		System.out.println("A one method");
	}

	@Override
	public void openAccount() {
		
		System.out.println("Account created...");
		
	}
	
}
