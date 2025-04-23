package interfaces;

public class TVFanRemote {
	public static void main(String[] args) {
		TV v = new TV();
		v.turnOff();
		v.turnOn();
		
		Fan f = new Fan();
		f.turnOff();
		f.turnOn();
	}

}
