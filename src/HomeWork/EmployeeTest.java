package HomeWork;

/**
 * @author Amol
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		/*Employee e = new Employee() {
			public void m1()
			{
				
			}
		};
		e.m2();//I'm working
		e.m3();//Employee own method
		e.m1();//(blank)
*/		
		Employee p= new PEmployee();
		p.m1();//PEmployee override method
		//p.m2();//I'm working
	
		p.m3();//Employee own method
		/*
		 *  if we want to print parents own method with object reference of child then we have go this scenario
		 *  1.just replace normal method of both class and replace with static method then it possible
		 *  2.super keyword
		 *  3.
		 *  
		 */
	}

}
