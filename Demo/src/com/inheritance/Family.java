package com.inheritance;

public class Family {
	public static void main(String[] args) {
		Father p = new Father();   //  object of child class 
		int a = p.FProperty(80); 
		System.out.println("father property "+a);
		int b = p.FProperty(90);
		System.out.println("grand father property "+ b);
		int total = a+b;
		System.out.println("Total property is " + total);
	  
		
		
		
		
	}

}
