package interfaces;

public class ICICI implements Bank {

	@Override
	public void getRateOfInterest(double amount) {
		double interest = amount*6.2;
		System.out.println("Rate of interest of ICICI bank on "+ amount+ " is :"+interest);
		
		
	}

}
