package com.methodparameter;

public class VowalCon {
	public static char vowalConso(char ch) {
		if(ch == 'a'||ch=='e'||ch == 'i'|| ch == 'o'|| ch == 'u' ||
				ch == 'A'|| ch == 'E'|| ch=='I' || ch == 'O'|| ch == 'U') {
			System.out.println("it is vowal...");
		}
		else {
			System.out.println("it is consonent...");
		}
		return ch;
		
	}
	public static void main(String[] args) {
		vowalConso('c');
	}
		

}
