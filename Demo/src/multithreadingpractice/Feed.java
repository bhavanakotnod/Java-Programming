package multithreadingpractice;

public class Feed extends Thread {
	public void run() {
		for(int i = 1;i<10;i++) {
		System.out.println("in feed we can explore a variety of content");
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	}
}
