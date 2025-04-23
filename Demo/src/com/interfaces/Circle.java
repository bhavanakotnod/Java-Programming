package interfaces;

public class Circle implements Drawable{

	@Override
	public void draw() {
		System.out.println("Draw the circle with radius "+ 5 + " cm "+ 5*3.14);
		
	}

}
