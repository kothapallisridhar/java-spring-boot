package com.srk.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Jeep implements Vehicle {
	
	public Jeep() {
		System.out.println("New Jeep created...");
	}

	@Override
	public String vehicleType() {
		return "This is Jeep";
	}

}
