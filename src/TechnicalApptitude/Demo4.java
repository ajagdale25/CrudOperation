package TechnicalApptitude;

public class Demo4 
{
	public static void main(String[] args) 
	{
		String s1= "Sayali";
		String s2= " Jagdale";
		String s3= s2;
		s2=" Amol";      		//it will create new object as per the principle of String (immutable)
		System.out.println(s1+s2+s3);
	}
}
