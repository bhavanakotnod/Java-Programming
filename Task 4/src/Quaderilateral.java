
public class Quaderilateral {
	public static void main(String[] args) {
		String choice = "square";
		switch(choice) {
		
		case "suuare":
			System.out.println("You chose a Square. All sides are equal and angles are 90");
			break;
		case "rectangle":
			System.out.println("You chose a Rectangle. Opposite sides are equal, and angles are 90");
			break;
		case "parallelogram":
			System.out.println("You chose a Parallelogram. Opposite sides are equal and opposite angles are equal");
			break;
			
			default:
				System.out.println("This is another  type of quadrilateral");
		}
	}

}
