package com.whileloop;

public class GreatestCommonD {
	public static void main(String[] args) {
		int a = 47;
		int b = 65;
		int temp;
		while (b != 0) {
			temp = b;
			b = a%b;
			a = temp;
		}
		System.out.println(a);
	}

}
