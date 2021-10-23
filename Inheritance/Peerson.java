
public class Peerson {

	//properties
	
	private String fName=null;
	private String lName=null;
	private char gender='m';
	
	Peerson()

	{
		
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void displayPeerson()
	{
		System.out.println(" First_Name: "+fName);
		System.out.println(" Last_Name: "+lName);
		System.out.println(" Gender "+gender);
	}
	
	
	
}//
