package array;
import java.util.Arrays;

public class SwapAdjecentNumber {
	public static void main(String args[]) {
		int arr[] = {1,2,4,5,3,6,7,8,9,12};
		for(int i = 0; i < arr.length - 1; i +=2) {
			int temp = arr[i];
			 arr[i] = arr[i + 1];
	            arr[i + 1] = temp;
	            
		}
		System.out.println("output : " + Arrays.toString(arr));
	}
	

}
