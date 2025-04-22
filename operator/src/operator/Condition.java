package operator;

public class Condition {
	public static void main(String args[])
	{
		// Logical operator work on only condition
		// AND operator
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
	
		// Logical OR operator
		
		System.out.println(true || false);
		System.out.println(true || false);
		System.out.println(true || false);
		System.out.println(true || false);
		
		//Logical NOT operator
		System.out.println(!false);
		System.out.println( !false);
		
		//Logical XOR operator
		
		System.out.println(true ^ false);  // false
		System.out.println(true ^ false);   // true
		System.out.println(true ^ false);  // true
		System.out.println(true ^ false);  //false


	}

}
