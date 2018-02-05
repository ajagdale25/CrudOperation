package enumPractical;

public class TestEnumWeek {

	public static void main(String[] args) 
	{
		Week w=Week.APRIL;
		Week w1=Week.MARCH;

		
		System.out.println(w1);
		/*
		 * 		1. Week w=Week.APRIL; //We can access enum constant using enam name(Week) because it is static variable.
		 * 		2. System.out.println(w);//if we are try to print any enum type reference constant internally toString() method will be call.
		 * and it will APRIL of the constant of APRIL.
		 * 		
		 */
		
		
		w1.m1();
		System.out.println(w1.getId());
		w.m1();
		System.out.println(w.getId());
		
		
	}

}
