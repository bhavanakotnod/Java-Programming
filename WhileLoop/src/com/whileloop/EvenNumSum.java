package com.whileloop;

public class EvenNumSum {
	public static void main(String[] args) {
		int digit;
		int n = 26;
		int sum = 0;
		

		do {
			
			if (n % 2 == 0) {
				digit = n % 10;
				
				n = n / 10;
				sum = sum + digit;

			}

		} while (n != 0);

		System.out.println(sum);

	}

}
