package superAndThis;

// child class
// display method is override 
// super keyword is used to call parent class method
public class B extends A {
	public void display() {
		super.display();
		System.out.println("This is display method of B Class");
		
	}
	public static void main(String[] args) {
		B b= new B();
		b.display();
	}

}
