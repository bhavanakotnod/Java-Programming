package multithreadingpractice;

public class Audio extends Thread {
	public void run() {
	for(int i =1; i<=10;i++) {
		System.out.println("Audio: Mute/Unmute functionality active."); 
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
}
