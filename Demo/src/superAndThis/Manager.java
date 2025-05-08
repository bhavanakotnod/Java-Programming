package superAndThis;
//subclass manager
// inherited by Employee class
public class Manager extends Employee {
	@Override
	public void show() {
		super.show();
		System.out.println("Manager is a employee of MNC");
		
	}
public static void main(String[] args) {
	Manager m =new Manager() ;
	m.show();
	
}
}
