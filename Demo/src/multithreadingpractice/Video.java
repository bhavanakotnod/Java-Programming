package multithreadingpractice;

public class Video extends Thread {
	public void run() {
		for(int i = 1; i<=10;i++) {
			System.out.println("Video: Start/Stop video functionality.");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	

}
