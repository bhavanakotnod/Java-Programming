
public class TicketDetails {
	public static void main(String[] args) {
		
		String coach = "sleeper";
		switch (coach) {
		case "General":
			System.out.println("250 Rs. from Nanded to Pune");
			break;
		case"sleeper":
			System.out.println("370 Rs from Nanded to Pune ");
			break;
		case "sleeper/AC":
			System.out.println("800 Rsmfrom Nanded toPune");
			break;
			default:
				System.out.println("Ticket not available");
				
			
		}
	}

}
