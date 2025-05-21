package multithreadingpractice;

public class Search extends Thread implements Runnable {
	public void run() {
		for(int i =1;i<=10;i++) {
		System.out.println("We can search here instagram id of differnt peoples to follow them");
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}

}
