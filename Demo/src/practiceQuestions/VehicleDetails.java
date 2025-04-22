package practiceQuestions;

public class VehicleDetails {
	public static void main(String[] args) {
		System.out.println("car details...............");
		Car c = new Car();
		c.showCarType("BMW", "110Km/hrs");
	
		c.showCarType("Maruti Suzuki", "80km/hrs");
		
		System.out.println("bike details......");
		Bike b = new Bike();
		b.showBikeType  ("fashion", "60km/hrs");
		b.showBikeType("HeroHonda", "70km/hrs");
		
		
	} 
	

}
