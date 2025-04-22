package com.Methods;

public class Tree {
// access specifier , keywords,return type,method name(){
	public static void Addition() {
		int a =2, b=5;
		System.out.println("Addition = "+ a+b);
	}
	public static void Sub() {
		int a =4, b=1;
		System.out.println( a-b + " = substration");
	}
	public static void main(String[] args) {
		Tree.Addition();
		Tree.Sub();
	} 

}
