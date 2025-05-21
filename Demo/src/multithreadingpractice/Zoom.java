package multithreadingpractice;

public class Zoom {
	public static void main(String[] args) {
		ChatBox cb =new ChatBox();
		ScreenSharing ss = new ScreenSharing();
		Audio a =new Audio();
		Video v =new Video();
		Thread tcb =new Thread(cb);
		tcb.start();
		Thread tss = new Thread(ss);
		tss.start();
		a.start();
		v.start();
	}
	

}
