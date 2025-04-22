package com.methodparameter;

public class Alphabet {
	
	// ASCII value start from capital A = 65
	
	public static void main(String[] args) {
		alpha('A');  // ASCII value of mall alphabet a is 97
		alpha('a');
		alpha('z');
	}
	public static char alpha(char ch) {
		System.out.println("ASCII value of given character is =  "+(int)ch);
		return ch;
	}

}
