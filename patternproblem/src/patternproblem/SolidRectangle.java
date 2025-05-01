package patternproblem;

public class SolidRectangle {
	
		public static void main(String[] args) {
			// number of rows
			int n =5;
			// number of columns
			int m =5;
			//outer loop
			for (int i = 1;i<=n;i++) {
				// inner loop
				for(int j =1;j<=m;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}


