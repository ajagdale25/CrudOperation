package TechnicalApptitude;

public class Demo1 
{
	public static void main(String[] args) 
	{
		try 
		{
		m1();
		System.out.println("A");
		}
		catch(Exception e)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("D");
		
	}
	public static void m1()
	{
		throw new Error();//error is not but recognized because the only catch attempt to catch an exception
		// but exception is not a superclass of Error. therefore the only finally statement can be run before 
		//printing exiting runtime run error(exception in thread "main" java.lang.Error)	
	}
}
/*
 *  C
    Exception in thread "main" java.lang.Error
	at TechnicalApptitude.Demo1.m1(Demo1.java:25)
	at TechnicalApptitude.Demo1.main(Demo1.java:9)
 * 
 * 
 * 
 */
 
 
 
 