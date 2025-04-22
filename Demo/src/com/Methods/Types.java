package com.Methods;

public class Types {
	public static void main(String[] args) {
		Types.S1();
		
		Types type = new Types();    // static method needs to create an object
		type.S2();             //here for S2 non static method we create a new type object
	}
	public static void S1() {
		System.out.println("This is static method");
	}
	public void S2() {
		System.out.println("This is non static method");
	}
	

}
