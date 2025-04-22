package com.whileloop;

public class NumberSum {
	public static void main(String[] args) {

		int i = 1;
		int n = 10;
		int sum = 0;
		sum = ((n * (n + 1)) / 2);
		do {
			i++;

		} while (i <= n);
		System.out.println(sum);
	}
}
