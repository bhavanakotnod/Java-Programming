package multithreadingpractice;
// create two class and implement a multi threading concept
// Songplay class extends to Thread class
// Download class implements a Runnable interface 
public class PlayList {
	public static void main(String[] args) {
		Songplay sp = new Songplay();
		Download d = new Download();
		sp.start();
		// Runnable Interface does not consist start method so we use a Thread here
		Thread t = new Thread(d);
		t.start();
	}

}
