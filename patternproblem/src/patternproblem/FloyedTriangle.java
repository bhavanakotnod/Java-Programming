package patternproblem;

public class FloyedTriangle {
	public static void main(String[] args) {
		//row number
		int n =5;
		//number start from 1
		int num= 1;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		
	}
}


