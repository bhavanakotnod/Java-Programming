package com.methodparameter;

public class EvenOdd {
	public static void main(String[] args) {
		evenOdd(23);
	}
	public static int evenOdd(int num) {
		if(num%2==0)    // check the num is even or not
		{
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
			
		}
		return num;
	}

}
