package patternproblem;

public class OneZeroTriangle {
	public static void main(String[] args) {
		//outer loop
		for(int i = 1;i<=5;i++) {
			// inner loop
			for(int j =1;j<=i;j++) {
				// adding position of 1 and 0
				int sum = i+j;
				
				// if position is even then print 1 otherwise 0
				if(sum % 2==0) {
					System.out.print(" 1 ");
					
				}else {
					System.out.print(" 0 ");
				}
				
			}
			// printing new line
			System.out.println();
		}
	}

}
