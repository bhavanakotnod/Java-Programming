package array;
import java.util.Arrays;

public class ArrayName {
	public static void main(String[] args) {
		// print array horizontally
		String []name  = new String[5];
		 name[0] = "Bhavana";
		 name[1] = "Shruti";
		 name[2] = "Rupali";
		 name[3] = "Oma";
		 name[4] = "Baswa";
		 System.out.println(Arrays.toString(name));
		 
		 //for printing array one by one 
		 String names[] = {"Bahvana" , "Shruti", "Rupali","Pallavi", "Rani"};
		 System.out.println("name 1 : "+ names[0]);
		 System.out.println("name 2 : " +names[1]);
		 System.out.println("name 3 : " +names[2]);
		 System.out.println("name 4 : " +names[3]);
		 System.out.println("name 5 : " + names[4]);
	}

}
