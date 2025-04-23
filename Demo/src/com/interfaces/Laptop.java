package interfaces;

public class Laptop implements Chargable{

	@Override
	public void charge() {
		System.out.println("Charging laptop using 70 watt power adapter ");
		
	}

}
