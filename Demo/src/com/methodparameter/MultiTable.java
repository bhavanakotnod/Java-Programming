package com.methodparameter;

public class MultiTable {
	public static void main(String[] args) {
		multi(6);
	}
	public static int multi(int num) {
		for(int i = 1;i<=10;i++) {
			System.out.println(num*i);  // table of 6th digit 
		}
		
		return num;
		
	}

}
