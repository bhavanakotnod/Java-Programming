package interfaces;

public class TV implements RemoteControl {

	@Override
	public void turnOff() {
		System.out.println("TV is turned Off to save electricity.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV is now on! Enjoy the Show...");
		
	}

}
