package StringPractical;

public class StringDemo {

	public static void main(String[] args) 
	{
		String s1= ("amol");
		String s2= ("amol");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		/*
		 * In literal case == operator compare contents of s1 and s2 from SCP
		 * and  equals method of object class also compare content of s1 and s2 from SCP. 
		 */
		String s3= new String("Sagar");
		String s4= new String("Sagar");
		String s5= new String("amol");
		System.out.println("s5 == s1 "+(s1==s5));//false
		s5=s5.intern();
		System.out.println("s5 and s1 with intern() "+(s1==s5));//

		System.out.println("s5 and s1 "+s1.equals(s5));//true

		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		/*
		 * Object creation: when we used 
		 */
	}

}
