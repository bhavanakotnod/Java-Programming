
public class Vehicle {
	public static void main(String[] args) {
		
		int wheels = 1;
		
		switch(wheels) {
		

		case 2:
			System.out.println("Bike");
			break;
		case 3:
			System.out.println("Auto");
			break;
		case 4:
			System.out.println("Car");
			break;
		case 6:
			System.out.println("Truck");
			break;
			default:
				System.out.println("Invalid number of wheels...");
		}
	}

}
