package com.Methods;

public class PositiveNegative {
	public static void posNeg(int n) {
		if(n >0) {
			System.out.println("Number is Positive");
		}
			else if(n<0) {
				System.out.println("Number is negative");
			}else {
				System.out.println("Number is Zero");
			}
		
	}
	public static void main(String args[]) {
		posNeg(-3);
	}

}
