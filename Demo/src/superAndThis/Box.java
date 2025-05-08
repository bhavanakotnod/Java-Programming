package superAndThis;

public class Box {
	int length;
	int height;
	int width;
	int volume;
	public void calculate(int length,int width,int height) {
		this.length =length;
		this.height =height;
		this.width =width;
		volume = length*width*height;
		System.out.println("length of box "+ length);
		System.out.println("width of box "+ width);
		System.out.println("height of box "+ height);
		System.out.println("volume of box "+ volume);

	}
	public static void main(String[] args) {
		
		Box c =new Box();
		c.calculate(4, 5, 7);
		
	}

}
