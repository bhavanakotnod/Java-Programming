
public class PrimeNum {
	public static void main(String[] args) {
		int n=11;    // Number to check for primality
		int temp =0;
		
		// Loop from 2 to the square root of n
        // If any number divides n evenly, then it's not a prime
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				temp=temp+1;
				
			}
			
		}
		if(temp>0) {
			System.out.println("Not a prime number");
		}else {
			System.out.println("number is prime");
		}
		
	}

}
