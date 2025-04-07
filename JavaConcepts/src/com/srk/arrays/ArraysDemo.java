package com.srk.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double[] prices = {12.12, 150.14, 99.99, 100.99};
		//String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		double[] marksAverages = {99.99, 89.12, 87.98, 98.77, 95.44, 96.66, 95.55, 94.45};
		String[] names = new String[60];
		
		int[] ids = new int[10];
		
		//System.out.println(names.length);
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		int i = 0;
		/*
		do {
			System.out.println(names[i]);
			i++;
		} while (i < names.length);*/
		
		for(double v: marksAverages) {
			System.out.println(v);
		}
		names[46] = "Sridhar";
		for(String name: names) {
			System.out.println(name);
		}
		
		
		
		

	}

}
