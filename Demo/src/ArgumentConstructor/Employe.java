package ArgumentConstructor;

public class Employe {
	int EmpId;           // global variable / instance variable/ fields
	String EmpName;
	String Experience;

	public Employe(int EmpId ,	String EmpName,String Experience) // local variable
	{
		this.EmpId = EmpId;
		this.EmpName =EmpName;
		this.Experience = Experience;
		
	}

	@Override   // annotation      
	public String toString() {   // toString is method it is representation of object
		return "Employe [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Experience=" + Experience + "]";
	}
	
	 

}
