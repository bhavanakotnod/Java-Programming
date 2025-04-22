
public class GenderAge {
	public static void main(String args[]) {
		char gender = 'M';
		int age = 22;
		if(gender == 'M' && age > 21) {
			System.out.println("Eligible for marriage");
		}else if(gender == 'F' && age > 18) {
			System.out.println("Eligible for marriage");
		}else {
			System.out.println("Not eligible");
		}
	}

}
