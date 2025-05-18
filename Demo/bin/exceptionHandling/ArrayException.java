package exceptionHandling;

import java.util.Arrays;
// Creates an array of 5 elements 
// try to access the 10th element 
// use try catch finally to handle any exception
public class ArrayException {
	public static void main(String[] args) {
		int arr[]  = new int[5];
		try {
			// trying to accept the 10th element (index 9)
		 arr[9] = 8;
		System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception : " +e.getMessage());
		}finally {
			System.out.println("This block always execute");
		}
		
	}

}
