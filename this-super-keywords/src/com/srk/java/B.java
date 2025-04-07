package com.srk.java;

public class B extends A {
	
	String name = "B class";
	static String name2 = "B class static";
	
	public void m1() {
		System.out.println("This is m1() of B class");
	}
	
	public void m3() {
		System.out.println("This is m3() of B class");
		super.m1();
		m1();
		m2();
		
		System.out.println(super.name);
		System.out.println(name);
		
		System.out.println(super.name2);
		System.out.println(name2);
		
	}


}
