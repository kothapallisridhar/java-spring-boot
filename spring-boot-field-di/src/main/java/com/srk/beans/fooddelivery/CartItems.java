package com.srk.beans.fooddelivery;

import java.util.ArrayList;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("cartItems1")
public class CartItems {
	
	private int noOfItems;
	private ArrayList<String> itemNames;
	
	public CartItems() {
		System.out.println("Creating Cart items: default constructor");
	}
	
	
	
	public CartItems(int noOfItems, ArrayList<String> itemNames) {
		super();
		System.out.println("Creating Cart items");
		this.noOfItems = noOfItems;
		this.itemNames = itemNames;
	}



	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public ArrayList<String> getItemNames() {
		return itemNames;
	}
	public void setItemNames(ArrayList<String> itemNames) {
		this.itemNames = itemNames;
	}

	
}
