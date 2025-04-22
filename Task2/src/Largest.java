
public class Largest {
	public static void main(String args[]) {
		int num1 =12;
		int num2 = 49;
		int num3 = 3;
		if (num1 > num2 && num1 > num3) {
			System.out.println("Num1 is largest of three number");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("Num2 is largest number");
		}
		else {
			System.out.println("num3 is largest number among all numbers");
		}
	}

}
