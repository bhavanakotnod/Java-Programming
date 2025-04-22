package com.whileloop;

public class PalindromeNum {
	public static void main(String[] args) {
		int rev=0,rem;
		int n =121;
		int original=n;
		do {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}while(n!=0);
		System.out.println(rev);
		if(original == rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome ");
		}
		
	
	
	}
}
