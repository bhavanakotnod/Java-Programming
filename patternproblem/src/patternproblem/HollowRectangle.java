package patternproblem;

public class HollowRectangle {
	public static void main(String[] args) {
		//number of row
		int m = 5;
		// number of columns
		int n = 5;
		for(int i = 1;i<=m;i++) {
			for(int j = 1;j<=n;j++) {
				// for printing star at ith and jth position
				if(i==1 || i== m || j ==1 || j ==n ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			}
			System.out.println();
		
		}
	}

}
