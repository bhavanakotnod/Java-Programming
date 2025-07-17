package array;
import java.util.Arrays;

public class CheckArrayPalindrome {
	public static void main(String[] args) {
		int arr[]= {121, 122,161};
		
		for(int i =0;i<arr.length;i++) {
			int original = arr[i];
			int rev = 0;
			
			while (arr[i]!=0) {
				int digit =rev *10;
				rev =digit + arr[i]%10;
				arr[i] = arr[i]/10;
				
			}
			if(original == rev) {
				System.out.println("array is palindrome :"+ original);
		}
			
		
		}
 	}

}
