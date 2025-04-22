package com.Methods;

public class SwapNum {
	public static void swaping(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the Number = "+a);
		System.out.println("After swaping the number = "+b);
	}
	public static void main(String args[]) {
		SwapNum.swaping(6 , 3);
	}

}
