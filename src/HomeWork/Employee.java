package HomeWork;

/**
 * @author Amol
 *
 */
public abstract class Employee 
{
	abstract public void m1();
	public  void m2()
	{
		System.out.println("I'm working");
	}
	public void m3()
	{
		
		System.out.println("Employee own method");
	}
	
	
}
class PEmployee extends Employee{

	@Override
	public void m1() 
	{
		System.out.println("PEmployee override method");
	}
	public  void m2()
	{
		System.out.println("fghdhdhgghdgh");
	}
	
	
	
	
	

	
}