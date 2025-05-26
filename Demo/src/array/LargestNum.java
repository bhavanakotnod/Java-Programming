package array;

import java.util.Arrays;

public class LargestNum {
	public static void main(String[] args) {
		int num[] = { 2, 5, 1, 7, 2, 8, 9 };

		// Assume the first element is the largest initially
		int largest =0;

		// Loop through the array to find the largest number
		for (int i = 0; i < num.length; i++) {

			if (num[i] > largest) {
				largest = num[i];

			}

		}
		System.out.println("The largest number in the array is : " + largest);

		// second method
		int number[] = { 2, 5, 6, 7, 12, 19,8 };
		// sort array in ascending order
		Arrays.sort(number);

		int largest_number = number[number.length - 1];
		System.out.println("The largest number  : " + largest_number);

	}

}
