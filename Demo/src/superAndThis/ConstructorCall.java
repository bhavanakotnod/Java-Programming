package superAndThis;

public class ConstructorCall {
	public ConstructorCall() {
		System.out.println("non parameterized constructor");
	}
	public ConstructorCall(int a) {
		this();
		System.out.println("parameterized constructor...");
	}
	public ConstructorCall(int a, int b) {
		this(1);
		System.out.println("two parameter used in constructor...");
	}
	
	public static void main(String[] args) {
		ConstructorCall c =new ConstructorCall(23,25);
		
		
	}

}
