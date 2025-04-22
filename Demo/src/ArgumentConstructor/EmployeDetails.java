package ArgumentConstructor;

public class EmployeDetails {
	public static void main(String[] args) {
		Employe e = new Employe(21,"Bhavana","5yr");
		Employe e1 = new Employe(22,"Shruti","6yr");
		System.out.println(e);
		System.out.println(e1);
		
		System.out.println(e.equals(e1));
	}

}
