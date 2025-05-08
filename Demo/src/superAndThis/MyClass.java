package superAndThis;

// create class with method that accepts an object of the same class
// use this to pass the current object as an argument to that method
public class MyClass {
	 String name;
//constructor
	private  MyClass(String name) {
		this.name = name;

	}

	private  void displayobject(MyClass nm) {
		System.out.println("other object " + name);

	}

	private void display() {
		this.displayobject(this);
	}

	public static void main(String[] args) {
		MyClass c = new MyClass("Bhavana");
		c.display();

	}

}
