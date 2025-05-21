package multithreadingpractice;

public class ScreenSharing implements Runnable {

	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("ScreenSharing: Sharing screen...");
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

}
