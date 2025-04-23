package interfaces;

public class SBI implements Bank {

	@Override
	public void getRateOfInterest(double amount) {
		double interest = amount*2.5;
		System.out.println("Rate of interest of SBI bank on "+ amount+ " is :"+interest);
		
		
	}

}
