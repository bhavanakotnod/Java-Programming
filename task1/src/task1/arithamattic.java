package task1;


	import java.util.Scanner;
	public class arithamattic {
	
	public static void main(String args[])
	{
		int a, b, add, sub, mul, div;
	         Scanner scanner = new Scanner(System.in) ;
	    
	System.out.println("enter two numbers");
	a = scanner.nextInt();
	b = scanner.nextInt();


	add = a+b;
	sub = a - b;
	mul = a*b;
	div = a/b;

	System.out.println(add);
	System.out.println(sub);
	System.out.println(mul);
	System.out.println(div);
	}
	
}
