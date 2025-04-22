
public class SignalColor {
	public static void main(String args[]) {
		String color = "Green";
		
		switch(color) {
		
		case "Red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Go slow");
			break;
		case "Green":
			System.out.println("Go");
			break;
			default:
				System.out.println("invalid statement...");
			
		}
	}

}
