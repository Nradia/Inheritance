
public class Stuudent extends  Peerson{
	
	//properties
	
	private String degree=null;
	private int GPA=0;
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getGPA() {
		return GPA;
	}
	public void setGPA(int gPA) {
		GPA = gPA;
	}
	
	
	public void displayStuudent()
	{
		
		super.displayPeerson();
		System.out.println("Degree :"+degree);
		System.out.println("GPA is "+GPA);
		
	}
	
	public boolean deanList()
	{
		if(GPA >3)
			{System.out.println(" Is in the dean`s` list");
		
		return true;}
		else 
			{return false;}
	}

}//
