package com.methodparameter;

public class ReverseNum {
	public static void main(String[] args) {
		reverseOrder(12345);
	}
	public static int  reverseOrder(int n) {
		int rev =0 ;
		int rem;
		while(n!=0) {
			rem = n%10;
			rev = rev*10+rem;
			n= n/10;
			
		}
		System.out.println("reverse order of given number is = " +rev);
		return n;
	}

}
