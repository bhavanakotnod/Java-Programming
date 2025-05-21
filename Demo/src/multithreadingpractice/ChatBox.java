package multithreadingpractice;

public class ChatBox implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Chat box  ready for any question");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	

}
