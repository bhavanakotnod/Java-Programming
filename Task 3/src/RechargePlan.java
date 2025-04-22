
public class RechargePlan {
	public static void main(String[] args) {
		String plan = "Data plan";
		
		switch(plan) {
		case "Data plan":
			System.out.println(" 2GB Data plan for 399Rs.");
			break;
		case "Talktime plan":
			System.out.println("unlimited talktime plan for 499Rs");
			break;
		case "SMS pack":
			System.out.println("100+ SMS only for 209Rs.");
			break;
			default:
				System.out.println("no echarge plan available");
			
		}
	}

}
