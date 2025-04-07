package com.srk.arrays;

public class ArraysWithMethods {

	public static void main(String[] args) {
		ArraysWithMethods am = new ArraysWithMethods();
		
		for(String name: am.getNames()) {
			System.out.println(name);
		}

	}
	
	public String[] getNames() {
		String[] names = {"Sridhar", "Saisuhas", "Lohit", "Charan", "Samyak", "Madhav"};
		return names;
	}

}
