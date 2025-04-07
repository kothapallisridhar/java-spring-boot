package com.srk.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Garage {
	
	// DI: via interface : inject implemented class object
	//@Qualifier("car2")
	//@Qualifier("jeep")
	@Autowired
	private Vehicle vehicle;
	
	public Garage() {
		System.out.println("Garage is created and ready to inject vehicles...");
	}
	
	

	public Garage(Vehicle vehicle) {

		this.vehicle = vehicle;
		
		System.out.println("Garage is created and injected with Vehilce: " + vehicle.getClass());
	}



	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
