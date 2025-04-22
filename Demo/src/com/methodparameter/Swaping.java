package com.methodparameter;

public class Swaping {
	public static void main(String[] args) {
		swapNum(6,2);
	}
	public static int swapNum(int a, int b) {
		a=a+b;           // a = 6+2 = 8
		b =a-b;          // b = 8-2 = 6
		a=a-b;            // a = 8-6 = 2
		System.out.println("after  swaping " + a);
		System.out.println("after  swaping " + b);
		return a;
		
	}

}
