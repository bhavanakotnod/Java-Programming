package multithreadingpractice;

public class Instagram {
	public static void main(String[] args) {
		Profile p = new Profile();
		Search s=new Search();
		Feed f =new Feed();
		Reels r =new Reels();
		Story st = new Story();
		Thread story = new Thread(st);

		p.start();
		r.start();
		f.start();
		s.start();
		story.start();
		
	}

}
