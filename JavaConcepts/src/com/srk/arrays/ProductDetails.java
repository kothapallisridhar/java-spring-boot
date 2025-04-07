package com.srk.arrays;

public class ProductDetails {
	
	public int id;
	public String name;
	public double price;

	public static void main(String[] args) {
		
		ProductDetails p = new ProductDetails();
		p.id = 100;
		p.name = "IPhone";
		p.price = 150000;
		
		p.printProductInfo(p);
		

	}
	
	public void printProductInfo(ProductDetails product) {
		System.out.println("Product Information");
		System.out.println(product.id);
		System.out.println(product.name);
		System.out.println(product.price);	
	}

}
