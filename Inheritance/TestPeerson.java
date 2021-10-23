
public class TestPeerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stuudent s1=new Stuudent();
		
		s1.setfName("Nora");
		s1.setlName("Mehenni");
		s1.setGender('F');
		s1.setDegree("Law");
		s1.setGPA(4);
		s1.displayStuudent();
		s1.deanList();
		
		System.out.println("********************************************");
		System.out.println("********************************************");
		
		Faaculty f1=new Faaculty();
		f1.setfName("Yanis");
		f1.setlName("Mehenni");
		f1.setTitle("Researcher");
		f1.setSalary(2000000);
		f1.displayPeerson();
		f1.increseSal();
		
		
		
	}//end main

}//end class
