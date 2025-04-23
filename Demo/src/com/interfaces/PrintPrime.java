package interfaces;

public class PrintPrime implements Printable,Showable
{

	@Override
	public void show() {
		System.out.println("Show the number is prime or not ");
		int num = 9;
		int temp = 0;
		for(int i =2;i<=num-1;i++) {
			if(num%i ==0) {
				temp = temp+1;
			}
			
		}
		if(temp>0){
			System.out.println("Not a Prime number");
		}else {
			System.out.println("Prime number");
		}
		
	}

		
	

	@Override
	public void print() {
		System.out.println("print a fibonacii series");
		int a=0;
		int b =1;
		int n = 7;
		for(int i =0;i<=n;i++) {
			b=a+b;    
			a=b-a;
			System.out.println(a);
		}
		
		
		
		
//		
}
}
