package exceptionHandling;

public class DivisibleByZero {
	public static void main(String[] args) {
		// try and catch are block to handle the exception
		try {
			System.out.println(2/0);	
		}catch(ArithmeticException a) {
			System.out.println("Divisible by zero exception");
		}
		
	} 
	

}
