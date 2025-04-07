package com.srk;

public class JavaConcepts {
	
	public static void main(String[] args) {
		
		JavaConcepts jc = new JavaConcepts();
		int res = jc.add(2, 3);
		System.out.println(res);
	}
	
	public static int multiplicate(int a, int b) {
		return a * b;
	}
	
	public int add(int a, int b) {
		System.out.println("Multiplication result: " + multiplicate(3, 5));
		return a + b;
	}

}
