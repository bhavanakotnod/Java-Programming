package com.whileloop;

public class DoReverse {
	public static void main(String[] args) {
		int rev=0,rem;
		int n=12345;
		do {
			rem = n%10;
			rev =rev*10+rem;
			n=n/10;
			
			
		}while(n!=0);
		System.out.println(rev);
	}

}
