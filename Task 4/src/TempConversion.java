
public class TempConversion {
	public static void main(String[] args) {
		
		String temp = "celcius";
		double celcius = 45.8;
		double fahernheit = 0;
		switch(temp) {
		
		case"celcius":
			if(temp == "celcius"){
				fahernheit =  ((celcius * 1.8 )+ 32);
				System.out.println("fahernheit =" + fahernheit);
			}
				else {
					System.out.println("somthing wrong");
				}
				break;
				
				case"fahernheit":
					if(temp=="fahernheit") {
						celcius =((fahernheit - 32)*5/9);
						System.out.println("celcius = " + celcius);
						
					}
					else {
						System.out.println("something wrong");
					}
			
			
		}
				
	}

}
