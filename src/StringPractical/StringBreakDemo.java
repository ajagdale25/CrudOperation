package StringPractical;

/**
 * @author Amol
 *
 */
public class StringBreakDemo {

	public static void main(String[] args)
	{
	
		String str3="ajagale25@gmail.com";
		
		System.out.println("User Name: ");
		for(int i=0; i<str3.length(); i++)
		{
			if(str3.charAt(i)=='@')
			{
				break;
			}
			else
			{
				System.out.print(str3.charAt(i));
			}
		}
	}

}
