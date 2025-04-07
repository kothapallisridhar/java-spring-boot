package com.srk.interfaces;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Bike implements Vehicle {
	
	public Bike() {
		System.out.println("New Bike created...");
	}

	@Override
	public String vehicleType() {
		return "This is Bike";
	}

}
