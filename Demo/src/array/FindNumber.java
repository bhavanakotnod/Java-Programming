package array;
import java.util.Arrays;
//find second last number from sorted array
public class FindNumber {
	public static void main(String[] args) {
		int arr[] = {5,2,12,17,3};
		//for sorting array list
		Arrays.sort(arr);
		//finding the length of an array
		int length = arr.length;
		System.out.println(length);
		// finding a second last number in sorted array
		int findnumber = arr[length - 2];
		System.out.println("Second last number in sorted array is : "+ findnumber);
		
		
	}

}
