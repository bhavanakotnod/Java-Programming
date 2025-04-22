
public class Arithmetic {
	public static void main(String[] args) {
		int a =4;
		int b = 5;
		char sign ='+';
		switch (sign) {
		
		case'+':
			System.out.println("Addition = "+ a+b);
			break;

		case '-':
			System.out.println( a-b);
			break;
	
		case '*':
			System.out.println("Multiplication = "+ a*b);
			break;

		case '/':
	         System.out.println("Division = "+ a/b);break;
		
		
			default:
				System.out.println("invalid input...");
	}
	}
	

}
