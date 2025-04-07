package com.srk.overloading;

public class Calculator {
	
	public int add(int a, int b) {
		
		System.out.println("Called: int, int");
		return a + b;
	}

	public double add(int a, double b) {
		
		System.out.println("Called: int, double");
		return a + b;
	}
	
	public double add(double a, int b) {
		
		System.out.println("Called: double, int");
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(2.2, 6));
		System.out.println(calc.add(6, 6.6));

	}

}
