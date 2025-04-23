package com.abstractclass;

public class Rectangle extends Shape {

	@Override
	public void calculateArea() {
		double length = 4.6;
		double width = 2.4;
		double rectangleArea = length*width;
		System.out.println("Area of rectangle "+ rectangleArea);
		
	}
	public static void main(String[] args) {
		Circle c =new Circle();
		c.calculateArea();
		
		Rectangle r = new Rectangle();
		r.calculateArea();
	}

}
