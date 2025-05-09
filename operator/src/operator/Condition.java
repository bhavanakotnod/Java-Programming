package operator;
// conditional operator used to check the condition 
public class Condition {
	public static void main(String args[])
	{
		// Logical operator work on only condition
		// AND operator
		System.out.println(true && true);    // true
		System.out.println(true && false);   // flase
		System.out.println(false && true);    //false
		System.out.println(false && false);   //false
	
		// Logical OR operator
		
		System.out.println(true || false);   // true
		System.out.println(false || true);   // true
		System.out.println(true || true);    //true
		System.out.println(false || false);   // false
		
		//Logical NOT operator
		System.out.println(!false);    // true
		System.out.println( !true);   // false
		
		//Logical XOR operator
		
		System.out.println(true ^ false);  // false
		System.out.println(false ^ true);   // true
		System.out.println(true ^ true);  // true
		System.out.println(false ^ false);  //false


	}

}
