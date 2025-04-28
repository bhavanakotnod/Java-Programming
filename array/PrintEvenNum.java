package array;
import java.util.Arrays;

public class PrintEvenNum {
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,11};
		System.out.println("even number in the array ");
		
		// for check the number in array list it needs loop
		for(int i = 0;i< num.length;i++)
		if(num [i]% 2 == 0 ) {
			System.out.println( num[i] );
			
		}
	}

}
