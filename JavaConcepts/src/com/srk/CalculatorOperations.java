package com.srk;

import java.util.Scanner;

public class CalculatorOperations {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x value: ");
		x = scanner.nextInt();
		System.out.println("Enter y value: ");
		y = scanner.nextInt();
		
		int result = x + y;
		System.out.println("x + y is: " + result);

	}

}
