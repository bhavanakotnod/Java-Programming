package interfaces;

public class Fan implements RemoteControl {

	@Override
	public void turnOff() {
		System.out.println("if you go outside the room then turn off the fan button.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("if there is hot then turn on the fan.");
	}

}
