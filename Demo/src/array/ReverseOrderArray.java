package array;
import java.util.Arrays;

public class ReverseOrderArray {
	public static void main(String[] args) {
		int arr[] = {2,6,3,8,9,1};
		int[]  reverse_arr = new int[arr.length];
		int j= 0;
		for (int i = arr.length-1;i>0;i--) {
			reverse_arr[j] = arr[i];
			j++;
			System.out.println(arr[i]);
			
		}

		System.out.println("array list in reverse order : "+Arrays.toString(reverse_arr));
	}

}
