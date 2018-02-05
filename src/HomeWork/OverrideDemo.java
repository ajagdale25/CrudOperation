package HomeWork;

/**
 * @author Amol
 *
 */
public abstract class OverrideDemo 
{
    
	abstract void aMethod();
	public void m1()
	{
		System.out.println("m1 parents");
	}
	
}
class Test extends OverrideDemo
{
	public void m1()
	{
		System.out.println("m1 child");
	}

	@Override
	void aMethod() {
		System.out.println("Hi I'm in child class");		
	}
}