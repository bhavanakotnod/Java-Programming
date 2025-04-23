package com.abstractclass;

public class Heater extends Appliance {

	@Override
	public void powerConsumption() {
		System.out.println("heater power consumption is : 1500 watt");
	}
	public static void main(String[] args) {
		Heater h = new Heater();
		h.powerConsumption();
		Fan f= new Fan();
		f.powerConsumption();
	}

}
