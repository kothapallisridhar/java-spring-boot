package com.srk.functional.interfaces;

public class Calculator {

	public static void main(String[] args) {
		
		// lambda expression
		CalcOperation add = (int val1, int val2) -> {
			
			System.out.println("Addition operation");
			int result = val1 + val2;

			return result;
		};
		
		// how to execute / call lambda expression
		int result = add.operation(60, 66);
		System.out.println(result);
		
		// 2nd solution
		
		CalcOperation sub = (int val1, int val2) -> {
			
			System.out.println("Subtraction operation ");
			return val1 +- val2;
		};
		
		int result2 = sub.operation(126, 60);
		System.out.println(result2);
		

	}

}
