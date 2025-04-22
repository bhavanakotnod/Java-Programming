package com.methodparameter;

public class CubeNum {
	public static void main(String[] args) {
		cube(3);
		cube(5);
		cube(45);
	}
	public static int cube(int n) {
		System.out.println("cube of given number = " +n*n*n);
		return n;
	}

}
