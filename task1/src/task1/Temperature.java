package task1;

import java.util.Scanner;
public class Temperature {
	public static void main(String args[]) {
		
		int Celsius , fahrenheit;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a temperature in celsius = ");
		Celsius = scanner.nextInt();
		
		fahrenheit = (Celsius * (9/5) + 32);
		
		System.out.println(fahrenheit);
		
			
		
	}

}
