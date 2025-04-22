
public class Rupees {
	public static void main(String[] args) {
		String Currency = "EUR";
		double INR =203;
		double USD = 67;
		double EUR = 0;
		switch(Currency) {
		case"INR":
			USD=(INR*86.95);
			EUR = (INR*94.63);
			System.out.println("Value of the Rupee in EUR is = "+ USD +"Rs.");
			System.out.println("value of the rupee in  USD is = "+EUR + "Rs.");
			break;
		case "USD":
			INR = (INR/86.95);
			EUR = (EUR*1.09);
			System.out.println("value of USD is = "+ INR + "$");
			System.out.println("Value of EurO into USD is ="+EUR +"$");
			break;
		case"EUR":
			INR = (INR/94.63);
			USD = (USD/1.09);
			System.out.println("value of  EUR is = "+ INR +"euro");
			System.out.println("Value of USD into euro is ="+USD +"euro" );
			break;
			default:
				System.out.println("Invalid currencies...");	
			
		}
		
	}

}
