package com.Methods;

public class NumReverse {
	public static void reverse(int num) {
		
		
		int rev=0,rem;
		while(num!=0) {
		rem= num%10;
		rev=rev*10+rem;
		num=num/10;
		
		}
		System.out.println("Reverse number = "+rev);
	}
	public static void main(String[] args) {
		reverse(1234);
	}
	

}
