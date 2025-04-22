import java.util.Scanner;
public class UppercaseLower {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch<= 'Z') {
			System.out.println("Upper Case");
		} 
		else if(ch >= 'a' && ch <= 'z'){
			System.out.println("Lower Case");
			
		}
		
		
	}

}
