package multithreadingpractice;

public class Reels extends Thread{
	public void run() {
		for(int i =1;i<=10;i++) {
		System.out.println("you can watch a reels on instagram");
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}

}
