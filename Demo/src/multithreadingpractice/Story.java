package multithreadingpractice;

public class Story implements Runnable {

	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
		System.out.println("one should upload a story on instagram");
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}

}
