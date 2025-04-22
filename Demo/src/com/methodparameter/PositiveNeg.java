package com.methodparameter;

public class PositiveNeg {
	public static void main(String[] args) {
		posNegative(-7);
	}
	public static int posNegative(int n) {
		if(n>0) {
			System.out.println("number is positive");
		}else if(n<0) {
			System.out.println("number is negative");
		}else {
			System.out.println("number is zero");  
		}
		return n;
	}

}
