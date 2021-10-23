
public class Faaculty extends Peerson {
	
	//properties
	
	private String title=null;
	private double salary=0.0;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displayPeerson()
	{
		super.displayPeerson();
		System.out.println(" The title is : "+title);
		System.out.println(" The salary is :"+salary);
			
	}
	
	public double increseSal()
	{
		double sal=0.0;
		sal=salary*1.05;
		System.out.println("the new salary is :"+sal);
		return sal;
	}

}//
