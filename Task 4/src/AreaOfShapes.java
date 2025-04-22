
public class AreaOfShapes {
	public static void main(String[] args) {
		String shape = "triangle";
		int length = 12;
		int bredth = 5;
		float pi = 3.14f;
		float radius = 3;
		int side = 5;
		
		switch(shape) {
		case "circle":
			
			System.out.println("Area of circle = "+(pi*radius*radius));
			break;
		case"rectangle":
			System.out.println("Area of Reactangle = "+ (length*bredth));
			break;
		case"triangle":
			System.out.println("Area of triangle = "+ (3* side));
			break;
			default:
				System.out.println("invalid statement...");
		}
		
	}

}
