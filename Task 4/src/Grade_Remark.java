
public class Grade_Remark {
	public static void main(String[] args) {
		char grade = 'J';
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		case 'F':
			System.out.println("Fail");
			break;
			default:
				System.out.println("grade not exist...");
		}
	}
	

}
