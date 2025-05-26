package array;
import java.util.Scanner;
import java.util.Arrays;

public class IndexNumber {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of an array....");
		int size =sc.nextInt();
		System.out.println("enter numbers");
		int numbers[] = new int[size];
		//System.out.println(number[]);
		for(int i =0;i<size;i++) {
			numbers[i]=sc.nextInt();
			}
		boolean found = false;
		System.out.println("enter the x ");
		int x = sc.nextInt(); 
				for(int i=0;i<numbers.length;i++) {
					//System.out.println("enter a x value"+x);

			if(numbers[i] == x) {
				System.out.println("x found at index :"+i);
				found  = true;
				break;
			}
			
		}if(!found ) {
			System.out.println("x is not present in the list");
		}
				
	}

}
