package com.abstractclass;

import java.util.Scanner;

public class VehicleDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vehicle type :");
		String type = sc.nextLine();
		
		Vehicle vehicle ;

		if (type.equals("bike")) {
			vehicle = new Bike();

		}else if(type.equals("truck")) {
			vehicle = new Truck();
			
		}else {
			System.out.println("unknow vehicle type.");
			return;
		}
		vehicle.move();
	}

}
