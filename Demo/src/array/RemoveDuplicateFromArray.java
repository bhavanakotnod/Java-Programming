package array;
import java.util.Arrays;
// remove duplicates from array
public class RemoveDuplicateFromArray {
public static void main(String[] args) {
	//array initialization
	int arr[]= {1,2,5,9,7,8,6,2};
	System.out.println("Without duplicates");
	// for sorting the array list
	Arrays.sort(arr);
	System.out.println(arr[0]);
	for(int i =1;i< arr.length;i++) {
		// comparing one number with another number
		if(arr[i] != arr[i-1]) {
			System.out.println(arr[i]);
		}
	}
	
}
}
