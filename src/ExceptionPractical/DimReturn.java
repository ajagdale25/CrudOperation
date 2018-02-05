package ExceptionPractical;

public class DimReturn {

	public static void main(String[] args) {
		dinReturn();
		//System.out.println(dinReturn());
	}

	private static void dinReturn() 
	{
		System.out.println("hi....");
		try
		{
			System.out.println("Try");
			return;
		}
		catch(Exception e)
		{
			System.out.println("Catch");
			//return;
		}
		finally 
		{
			System.out.println("Finally");
			//return;
		}
		System.out.println("bye");
	//return 40;
	}

}
