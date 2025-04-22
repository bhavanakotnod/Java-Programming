package com.inheritance;

public class Marks extends Student {
	public void subjectTotal() {
		int math = 70;
		int phy = 80;
		int total = math + phy;
		System.out.println("marks in the math subject "+math);
	System.out.println("marks in the physic subject "+phy);
	System.out.println("Total marks of two subject " + total);
	
	}

}
