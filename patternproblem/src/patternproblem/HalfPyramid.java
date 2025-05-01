package patternproblem;

public class HalfPyramid {
	public static void main(String[] args) {
		int n= 5;
		for(int i = 1;i<=n;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		// inverted of above pyramid
		for(int i =n;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		// Inverted half pyramid rotated by 180 degree
		
		for(int i = 1;i<=n;i++) {
			// inner loop space print
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			// inner loop star print
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			
			}
			System.out.println();
			
		}
	}

}
