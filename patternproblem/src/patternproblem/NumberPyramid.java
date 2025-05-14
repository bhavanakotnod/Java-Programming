package patternproblem;

public class NumberPyramid {
	public static void main(String[] args) {
		//number of rows 5
		int n = 5;
		//loop for printing row values
		for (int i = 1; i <= n; i++) {
			// for column
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

}
