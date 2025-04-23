package interfaces;

public class HDFC implements Bank{

	@Override
	public void getRateOfInterest(double amount) {
		double interest = amount*0.05;
		System.out.println("Rate of interest of HDFC bank on "+ amount+ " is :"+interest);
		
	}

}
