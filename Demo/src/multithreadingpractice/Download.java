package multithreadingpractice;

public class Download  implements Runnable{
//Runnable interface consist of run () method
 	@Override
	public void run() {
		 for(int i =1;i<=10;i++) {
			 System.out.println("Download......");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			 
		 }
		
	}

}
