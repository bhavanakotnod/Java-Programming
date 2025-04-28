package array;
import java.util.Arrays;
// importing of arrays with the help of java.util package

public class printNum {
	public static void main(String[] args) {
		int num [] = {10,20,30,40,50};         // Initialization of array
		System.out.println(Arrays.toString(num));  // toString method is use to print array
	
		// print array with its index value
	for (int list = 0; list < num.length; list++) {
		System.out.println(list + ":" + num[list]);
	}
	
	}
	
	

}
