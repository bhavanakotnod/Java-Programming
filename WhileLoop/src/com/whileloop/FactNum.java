package com.whileloop;

public class FactNum {
	public static void main(String[] args) {
		int n =10;
		int fact=1;
		int i=1;
		do {
			fact=fact*i;
			i++;
			
		}while(i<=n);
		System.out.println(fact);
	}

}
