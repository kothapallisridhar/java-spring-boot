package com.srk;

public class Operators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int value = 999;
		
		String name = "Sri";
		
		Student s = new Student();
		
		System.out.println(++a);
		System.out.println(b++);
		System.out.println(b);
		
		System.out.println(++value);
		System.out.println(--value);
		System.out.println(value);
		System.out.println(++value);
		
		System.out.println("*******");
		value = 999;
		
		System.out.println(++value);
		System.out.println(--value);
		System.out.println(value);
		System.out.println(value++);
		System.out.println(value);
		
		System.out.println(name instanceof String);
		
		System.out.println(s instanceof Student);


	}

}
