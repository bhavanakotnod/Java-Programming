
public class AgeGroup {
	public static void main(String args[])
	{
		int age = 4;
		if(age < 12 && age > 0) {
		System.out.println("Child");
	} else if(age < 19 && age > 13) {
		System.out.println("Teenager");
	}else if(age > 20 && age < 59) {
		System.out.println("Adult");
	}else if(age >= 60) {
		System.out.println("Senior citizen");
	}
	
	
}
}
