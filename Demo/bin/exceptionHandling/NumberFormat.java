package exceptionHandling;
// write a program that convert the string abc123 into integer
//use Integer.ParseInt()

public class NumberFormat {
	public static void main(String[] args) {
		String s = "abc123";
		try {
		int output = Integer.parseInt(s);
		System.out.println(output);
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid number Format");
		}
	}

}
