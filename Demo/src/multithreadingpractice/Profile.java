package multithreadingpractice;

public class Profile extends Thread implements Runnable{
	public void run() {
		for(int i =1;i<=10;i++) {
		System.out.println("Profile consist of instagram id and photo");
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}

}
