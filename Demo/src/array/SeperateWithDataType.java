package array;
// Take a one password from user Bhavana@123
//separately printed on the console like as :
//Bhavana is characters 
//@ is special symbol 
//123 this is an Integer
import java.util.Scanner;
public class SeperateWithDataType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a password");
		String password =  sc.nextLine();
		
		String digit = "";
		String letters = "";
		String specialChar = "";
		
		for(int i =0 ;i< password.length();i++) {
			char ch = password.charAt(i);
			if(Character.isLetter(ch)) {
				 letters += ch;
			}
			else if (Character.isDigit(ch)) {
                digit += ch;
            } else {
                specialChar += ch;
            }
			}
		 System.out.println(letters + " is characters");
	        System.out.println(specialChar + " is special symbol(s)");
	        System.out.println(digit + " is an Integer");
		}
	}




