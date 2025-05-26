package array;
import java.util.Arrays;

public class MultiDimension {
	public static void main(String[] args) {
		int num [][] = {{21,23,25},{12,16,17}};
		System.out.println("multi dimensional array "+Arrays.deepToString(num));
		int num1 [][] = Arrays.copyOfRange(num ,1,2);
		System.out.println(Arrays.deepToString(num1));
		
		
		
	}

}
