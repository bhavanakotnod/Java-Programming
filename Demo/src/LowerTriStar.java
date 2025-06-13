
public class LowerTriStar {
	public static void main(String[] args) {
		// outer loop for rows
		for(int i = 1;i<=5;i++) {
			//inner loop for column
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			//new line
			System.out.println();
		}
	}

}
