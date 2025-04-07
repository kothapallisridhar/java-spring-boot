package com.srk.interfaces.inheritance;

public class SkodaKushaqManual implements MiddleEndModelCar {

	@Override
	public String carPower() {

		return "120BHP, 250NM Torque";
	}

	@Override
	public String carFeatures() {

		return "Dual Zone Climate control";
	}

	@Override
	public String carExtraFeatures() {

		return "Sun roof, Bose Music System";
	}
	
	public static void main(String[] args) {
		
		SkodaKushaqManual kushaq = new SkodaKushaqManual();
		System.out.println(kushaq.carPower()); 
		System.out.println(kushaq.carFeatures());
		System.out.println(kushaq.carExtraFeatures());
	}

}
