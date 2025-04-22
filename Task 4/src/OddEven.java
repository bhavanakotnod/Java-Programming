
public class OddEven {
	public static void main(String[] args) {
		int num =0;
		int choice =2;
		
		switch(choice) {
		case 1:
			if(num%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}break;
		case 2:
			if(num==0) {
				System.out.println("Number is Zero"); 
			}
				break;
				default:
					System.out.println("invalid choice...");
					
		}
	}

}
