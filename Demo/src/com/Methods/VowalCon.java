package com.Methods;

public class VowalCon {
	public static void main(String[] args) {
		vowalCon('a');
	}
	public static void vowalCon(char name) {
		if(name == 'a'|| name=='e'||name=='i'||name=='o'||name=='u'||name == 'A'|| name=='E'||name=='I'||name=='O'||name=='U') {
			System.out.println("It is Vowal...");
		}else {
			System.out.println("it is Consonant...");
		}
	}

}
