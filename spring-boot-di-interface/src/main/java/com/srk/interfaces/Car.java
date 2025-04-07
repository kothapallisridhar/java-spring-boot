package com.srk.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	public Car() {
		System.out.println("New Car created...");
	}

	@Override
	public String vehicleType() {
		return "This is Coupe SUV";
	}

}
