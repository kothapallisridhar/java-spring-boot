package com.srk.typecasting;

public class TypeCastingPrimitives {
	

	
	public static void main(String[] args) {
		int a = 10;
		long b = a;
		double e = 100.2345;
		
		// implicit casting / widening: byte -> short -> int -> long -> float -> double
		
		System.out.println(b);
		System.out.println((int)e);
		
		// explicit casting / narrow casting: double -> float -> long -> int -> short -> byte
		
		double dollarPrice = 88.99;
		int rupee = (int)dollarPrice;
		
		System.out.println(rupee);
	}

}
