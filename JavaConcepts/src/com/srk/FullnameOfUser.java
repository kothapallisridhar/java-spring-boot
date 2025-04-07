package com.srk;

import java.util.Scanner;

public class FullnameOfUser {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name: ");
		firstName = scanner.nextLine();
		System.out.println("Enter last name: ");
		lastName = scanner.nextLine();
		
		System.out.println("Full name: " + firstName + " " + lastName);
		

	}

}
