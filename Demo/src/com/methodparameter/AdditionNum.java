package com.methodparameter;

public class AdditionNum {
	// addition of two numbers using parameter passing
	public static void main(String[] args) {
		add(10,20);
		add(21,3);
	}
	//return type is integer 
	public static int add(int a, int b) {
		int c= a+b;
		System.out.println("sum = "+c);
		return c;
	}

}
