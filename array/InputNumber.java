package array;
import java.util.Scanner;
import java.util.Arrays;

public class InputNumber {
	public static void main(String[] args) {
		// taking number from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a five numbers in array list");
		int num[] = new int[5];
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();
		
		System.out.println("number 1 : " + num[0]);
		System.out.println("number 2 : " + num[1]);
		System.out.println("number 3 : " + num[2]);
		System.out.println("number 4 : " + num[3]);
		System.out.println("number 5 : " + num[4]);
		
		
		
	}

}
