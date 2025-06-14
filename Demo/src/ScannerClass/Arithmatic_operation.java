package ScannerClass;

public class Arithmatic_operation {
	
	
	//parameterised methods
	//for adding two numbers addition method
	public int addition(int a,int b) {
		int c = a + b;
		System.out.println("addition of two number = " + c);
		return c;
	}
        //for substitution
	public int sub(int a,int b) {
		 int c = a - b;
		System.out.println("substraction of two number = " + c);
		return c;
	}
         // for multiplication
	public int mul(int a,int b) {
		int  c = a * b;
		System.out.println("multiplication  of two number = " + c);
		return c;
	}
        //for division
	public int div(int a,int b) {
		 int c = a / b;
		System.out.println("division of two number = " + c);
		return c;
	}

}
