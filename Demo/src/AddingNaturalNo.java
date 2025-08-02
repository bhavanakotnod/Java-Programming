package javaProjects;

import java.util.Scanner;

// Addition of N natural numbers
public class AddingNaturalNo {
	public static void main(String[] args) {
		int n;
		Scanner s =new Scanner(System.in);
		System.out.println("enter natural number you want to addition of that number :");
		n=s.nextInt();  // assign input to 'n'
		
		//using formula
		 
		int sum =(n*(n+1))/2;
		System.out.println("Addition of "+n +" natural numbers is : "+sum);
		
	}

}
