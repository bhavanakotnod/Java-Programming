package com.methodparameter;

public class Numreverse {
	public static void main(String[] args) {
		numberPrint(10);
	}
	public static int numberPrint(int n) {
		for(int i = n; i >=1;--i)     //printing the reverse number from 10 to 1
		{
			System.out.println(i);	
		}
		return n;
	}

}
