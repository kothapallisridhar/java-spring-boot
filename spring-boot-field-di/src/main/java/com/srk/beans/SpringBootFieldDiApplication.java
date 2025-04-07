package com.srk.beans;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.srk.beans.fooddelivery.CartItems;
import com.srk.beans.fooddelivery.OrderDetails;

@SpringBootApplication
public class SpringBootFieldDiApplication {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringBootFieldDiApplication.class, args);
		
		OrderDetails order1 = (OrderDetails)container.getBean("orderDetails");
		
		System.out.println(order1.getCartItems());
		
		System.out.println(order1.getCartItems().getNoOfItems());
		System.out.println(order1.getCartItems().getItemNames());
	}
	
	@Primary
	@Bean
	public CartItems cartItems2() {
		System.out.println("CartItems is created...");
		CartItems items = new CartItems();
		items.setNoOfItems(2);
		
		ArrayList<String> foodItems = new ArrayList<>();
		foodItems.add("Sweets");
		foodItems.add("Biryani");
		
		items.setItemNames(foodItems);
		return items;
	}

}
