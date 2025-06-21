// take one number 
//check that is divisible by number 5 and 11
public class DivisibleBy {
	public static void main(String args[]) {
		int num = 50;
		//AND operator is used to check the condition
		if(num % 5==0 && num % 11 == 0) {
			System.out.println("Given number is divisible by 5 and 11");
		}
		else {
			System.out.println("number is not divisible by 5 and 11");
		}
	}

}
