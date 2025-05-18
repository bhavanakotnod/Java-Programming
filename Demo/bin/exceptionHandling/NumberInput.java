package exceptionHandling;

import java.util.InputMismatchException; //import added
import java.util.Scanner;

// accept integer input from the user
// enter a string instead of number 
public class NumberInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			// will through a exception if input is not a number
			int number = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("incorrect input enter a valid integer");
		}

	}

}
