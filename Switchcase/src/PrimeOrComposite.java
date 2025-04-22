import java.util.Scanner;
public class PrimeOrComposite {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Take input from the user
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        // Check if the number is less than or equal to 1
	        if (num <= 1) {
	            System.out.println("Neither Prime nor Composite");
	        } else {
	            boolean isPrime = true;

	            // Check for factors other than 1 and num itself
	            for (int i = 2; i < num; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            // Output result based on whether a factor was found
	            if (isPrime) {
	                System.out.println(num + " is Prime");
	            } else {
	                System.out.println(num + " is Composite");
	            }
	        }
	    }
	}


