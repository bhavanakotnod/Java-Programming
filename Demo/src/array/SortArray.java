package array;

import java.util.Arrays;

// sort the array without using sorted method
public class SortArray {
	public static void main(String[] args) {

		int[] num = { 1, 6, 2, 5, 8, 3 };
		// It is the current element that you want to compare with all other elements
		// ahead of it.
		for (int i = 0; i <= num.length; i++) {
			// Inner loop: compares the element at index i with the rest of the elements
			// (from i+1 to end)
			// This avoids unnecessary comparisons with previous elements
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {
					// swapping num[i] and num[j]
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		System.out.println("Sorted list");
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.print(num[i] + " ");
		}
		//for next line
		System.out.println();
		// print the largest number
		
		int largest = num[num.length-1];
		System.out.println("largest number "+ largest);
		
		// print the second largest number
		int sec_large = num[num.length-2];
		System.out.println("second largest array in list "+sec_large);
		
	}

}
