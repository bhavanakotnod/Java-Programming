package superAndThis;
// child class circle
//inherited with Shape class
//override the calculateArea method
//used a super keyword for calling method from parent class Circle
public class Circle extends Shape {
	double radius ;
	
	public Circle(double radius) {
		this.radius =radius;
		
	}
	// @override
	public void calculateArea() {
		super.calculateArea();
		System.out.println("area of circle is  "+ 3.14*radius*radius);
		
		
		
	}
	public static void main(String[] args) {
		Circle c= new Circle(3.3);
		c.calculateArea();
	}

}
