
public class Fibonacii {
	public static void main(String[] args) {
		int a=0;         // start with 0
		int b=1;
		int n=10;      //loop iterate 10 times
		int c;
		System.out.println("Fibonacii series");
		for(int i=1;i<=n;i++) {
			c=a+b;                // 0+1 =1   1+1=2    2+1=3  3+2=5
			a=b;
			b=c;
			System.out.println(a);
		}
		
			
	}
	

}
