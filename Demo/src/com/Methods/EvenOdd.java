package com.Methods;

public class EvenOdd {
	public static void evenOdd(int n) {
		System.out.println(n);
		if(n%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
	}
	public static void main(String[] args) {
		EvenOdd.evenOdd(56);
	}

}
