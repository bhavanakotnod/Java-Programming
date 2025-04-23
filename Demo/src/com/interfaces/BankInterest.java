package interfaces;

public class BankInterest {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.getRateOfInterest(50000);
		
		SBI s =new SBI();
		s.getRateOfInterest(70000);
		
		ICICI i = new ICICI();
		i.getRateOfInterest(70000);
	}

}
