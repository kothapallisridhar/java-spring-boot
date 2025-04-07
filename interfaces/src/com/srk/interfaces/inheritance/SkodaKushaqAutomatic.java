package com.srk.interfaces.inheritance;

public class SkodaKushaqAutomatic implements TopEndModelCar {

	@Override
	public String carTopEndFeatures() {

		return "Ventilated Seats";
	}

	@Override
	public String carExtraFeatures() {

		return "Bose Audio System";
	}

	@Override
	public String carPower() {

		return "140BHP, 300NM Torque";
	}

	@Override
	public String carFeatures() {

		return "Dual Zone Climate Control";
	}
	
	public static void main(String[] args) {
		
		SkodaKushaqAutomatic kushaqAutomatic = new SkodaKushaqAutomatic();
		
		System.out.println(kushaqAutomatic.carPower());
		System.out.println(kushaqAutomatic.carFeatures());
		System.out.println(kushaqAutomatic.carExtraFeatures());
		System.out.println(kushaqAutomatic.carTopEndFeatures());
	}

}
