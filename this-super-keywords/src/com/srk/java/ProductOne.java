package com.srk.java;

public class ProductOne {
	
	public ProductOne() {
		System.out.println("This is ProductOne constructor");
		ProductTwo pTwo = new ProductTwo(this);
		System.out.println(pTwo);
	}
	
	public static void main(String[] args) {
		ProductOne pOne = new ProductOne();
		System.out.println(pOne);
	}

}
