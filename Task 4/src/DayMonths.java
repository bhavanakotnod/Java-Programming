
public class DayMonths {
	public static void main(String[] args) {
		String month = "march";
		int year = 2024;
		System.out.println(month+" "+year);
		switch(month){
		case"january":
			System.out.println("31 days");
			break;
		case"february":
			if(year % 4==0) {
			System.out.println(" Leap year 29 days");
			}
			else {
				System.out.println("nota leap year 28 days");
			}
			break;
		case"march":
			System.out.println("31 days");
			break;
		case"april":
			System.out.println("31 days");
			break;
		case"may":
			System.out.println("31 days");
			break;
		case"june":
			System.out.println("31 days");
			break;
		case"july":
			System.out.println("31 days");
			break;
		case"august":
			System.out.println("31 days");
			break;
		case"september":
			System.out.println("30 days");
			break;
		case"octomber":
			System.out.println("31 days");
			break;
		case"november":
			System.out.println("30 days");
			break;
		case"december":
			System.out.println("31 days");
			break;
			
		}
		
	}
}
