
public class Game {
	public static void main(String[] args) {
		 
		String level = "easy";
		
		switch (level) {
		case "easy":
			System.out.println("Game is easy");
			break;
		case "medium":
			System.out.println("Game level is medium");
			break;
		case "hard":
			System.out.println("Game level is hard");
			break;
			default:
				System.out.println("levels are not mentioned...");
			
		}
	}

}
