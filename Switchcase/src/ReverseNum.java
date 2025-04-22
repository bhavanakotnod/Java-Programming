
public class ReverseNum {
	public static void main(String[] args) {
		int num =1234;
		int rem =0;
		int rev=0;
		while(num!=0) {
			rem = num%10;
			rev = rev * 10 + rem;
			num =num /10;
		}
		
		System.out.println(rev);
		if(num%2 ==0) {
			System.out.println("Even number"); 
			
		}else {
			System.out.println("Odd Number");
		}
		
		int temp = rev;
		if(temp%2 ==0) {
			System.out.println(" After reversing the number is Even number"); 
			
		}else {
			System.out.println("After reversing the number is Odd ");
		}
		
	}
}
