package LoopingProblem;
import java.util.Scanner;


public class FloydsTriangle {
	public static void main(String[] args) {
		int n,num =1;
		Scanner s= new Scanner(System.in);
		//taking numbers of rows from input side
		System.out.println("Enter the number of rows in floyds triangle you want : ");
		n = s.nextInt();
		System.out.println("Floyd's Triangle");
		//outer loop for rows
		for(int i= 1;i<=n;i++) {
			//inner loop for columns
			for(int j =1;j<=i;j++) {
				System.out.print(num+ " ");
				//numbers are incremented by one
				num++;
				
			}
			//for next line
			System.out.println();
		}
		
	}

}
