package variableDeclaration;

public class VariableDeclaration {
	public static void main(String args[])
	{
		String Name = " Bhavana Kotnod"; //Non primitive
		byte age = 21;                 // primitive size 1 bit
		short batchcode = 1043;  //primitive  2 byte
		int rollno = 1245018;   // 4 byte
		long MObno = 9511644623L;   // 8byte
		float percentage = 80.21F;   //4 byte
		char grade = 'A';            // 2 byte
		String result = "Pass";     
		boolean pass = false;       // 1 byte
		
		System.out.println("Name = " + Name  );
		System.out.println("agr = " + age  );
		System.out.println("batchcode = " + batchcode  );
		System.out.println("rollno = " + rollno  );
		System.out.println("Mobno = " +  MObno );
		System.out.println("grade " + grade);
		System.out.println("result = " + result);
		
	}

}
