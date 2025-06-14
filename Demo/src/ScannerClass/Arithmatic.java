package ScannerClass;
import java.util.Scanner;
public class Arithmatic {
	public static void main(String[] args) {
		//scanner class for taking input from user
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter a first number");
	    int a = sc.nextInt();
	    
	    System.out.println("enter a second number");
	    int b = sc.nextInt();
	    //creation of object
	    Arithmatic_operation add = new Arithmatic_operation();
	    add.addition(a,b);
	     // calling object 
	    add.sub(a,b);
	    add.mul(a,b);
	    add.div(a,b);
	    
	    
	    
	}

}
