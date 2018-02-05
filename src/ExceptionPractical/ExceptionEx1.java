package ExceptionPractical;

/**
 * @author Amol
 *
 */
public class ExceptionEx1 {

	public static void main(String[] args) 
	{
		System.out.println("Dim return: "+m1(0));
		//m1(0);
	}
	static int m1(int i)
	{
		try
		{
			//System.exit(i);
			System.out.println("1");
			return 10;
		}
		catch(Exception e)
		{
			System.out.println("2");
			return 20;
		}
		finally
		{
			System.out.println("hi");
			//return 30;
		}
		//System.out.println("hello");
	}

}
