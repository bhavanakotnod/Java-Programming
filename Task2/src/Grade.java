
public class Grade {
	public static void main(String args[])
	{
		int marks = 67;
		if(marks >=90) {
			System.out.println("Grade A");
		}
		else if(marks >=80) {
			System.out.println(" Grade B");
		}
		else if(marks >=70) {
			System.out.println("Grade C");
		}else if(marks >= 60-69) {
			System.out.println("Grade D");
		}else if(marks < 60) {
			System.out.println(" result Fail");
		}
	}

}
