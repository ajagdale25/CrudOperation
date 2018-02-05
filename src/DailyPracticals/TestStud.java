package DailyPracticals;

public class TestStud {
	
	/**
	 * @author Amol
	 */
	static
	{
		System.out.println("Static Test Block");
	}
	{
		System.out.println("Instance Test Block");
	}

	public static void main(String[] args)
	{
		//Student s = new Student(1, "Amol Jagdale");
		//Student s1 = new Student(2, "Amit Jagdale");
	    //s.showMethod();
		//s1.showMethod();

		child c = new child();
		
	//	Student.DisplayMethod(s);
	//	Student.DisplayMethod(s1);

	
	}

}
class Student
{
	public int studId;
	public String studName;
	static public String collegeNam= "YTIET";
	/*public Student(int id, String name)
	{
		this.studId= id;
		this.studName= name;
	}*/
	static
	{
		System.out.println("Static Student Block");
	}
	{
		System.out.println("Instance Student Block");
	}
	public void showMethod()
	{
		System.out.println(studId);
		System.out.println(studName);
		System.out.println(collegeNam);
	}
	public static void DisplayMethod(Student st)
	{
		System.out.println(st.studId);
		System.out.println(st.studName);
	    System.out.println(collegeNam);
	}
	
	
}


class child extends Student{
	static {
		System.out.println("inside child static");
	}
	
	{
		System.out.println("inside child instance block");
	}
}