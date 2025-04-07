package com.srk;

public class PancardInfo {
	
	public static void main(String[] args) {
		
		String panCardNo = "aoicc2446k";
		String name = "jOhN";
		String firstName = "Saisuhas";
		String lastName = "Kothapalli";
		
		String result = " Result is: ";
		int a = 20;
		int b = 60;
		
		System.out.println(panCardNo.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		System.out.println();
		System.out.println("Full Name: " + firstName.concat(' ' + lastName));
		System.out.println(firstName + ' ' + lastName);
		
		System.out.println(result + a + b);
		System.out.println(a + b + result);
		
		System.out.println(lastName.contains("Kotha"));
		
	}

}
