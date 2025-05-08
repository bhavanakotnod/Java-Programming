package superAndThis;
//class product with method returntype()
public class Product {
	// non static method
	{
		System.out.println("product name");
	}
	// variable
	String product_name;
	//constructor
	public Product(String product_name) {
		this.product_name = product_name;
	}
	public void returnType(Product nm) {
		System.out.println("object of current class "+product_name);
	}
	public void display() {
		this.returnType(this);
	}
	public static void main(String[] args) {
		Product p = new Product("Alovera");
		p.display();
	}

}
