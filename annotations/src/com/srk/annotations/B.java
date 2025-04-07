package com.srk.annotations;

public class B extends A {
	
	@Override
	public void one() {
		System.out.println("B one method");
	} 
	
	public static void main(String[] args) {
		B b = new B();
		b.one();
	}

}
