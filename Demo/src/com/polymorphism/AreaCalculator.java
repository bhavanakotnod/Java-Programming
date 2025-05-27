package com.polymorphism;

 class AreaCalculator {

	public void area(double radius ,double pi) {
		// calculate the area of circle
		double circle = pi*radius*radius;
		System.out.println("Area of circle "+circle);
		
		
	}
	public void area(int length ,double width) {
		// area of rectangle
		double rectangle = length*width;
		System.out.println("area of rectangle "+rectangle);
	}
	public void area(int side) {
		// area of square
		int square  = side*side;
		System.out.println("Area of square "+square); 
		
	}
	public static void main(String args[]) {
		AreaCalculator a = new AreaCalculator();
		a.area(5.5, 3.14);
		a.area(7, 4.2);
		a.area(6);
	}

	
}
