package com.srk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.srk.interfaces.Car;
import com.srk.interfaces.Garage;
import com.srk.interfaces.Vehicle;

@SpringBootApplication
public class SpringBootDiInterfaceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(SpringBootDiInterfaceApplication.class, args);
		
		Garage garage = (Garage)container.getBean("garage");
		
		System.out.println(garage);
		
		Vehicle vehicle = garage.getVehicle();
		
		System.out.println(vehicle.getClass());
		
		System.out.println(vehicle.vehicleType());
	}
	
	@Bean
	public Car car2() {
		return new Car();
	} 

}
