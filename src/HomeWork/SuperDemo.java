package HomeWork;

/**
 * @author Amol
 *
 */
public class SuperDemo 
{
	public static void main(String[] args) 
	{
		YChild y= new YChild();
		//Child c = new Child();
		y.m1(100);
	}
}
class Parents{
	static
	{
		System.out.println("Static Parent Block");
	}
	{
		System.out.println("Instance Parent Block");
	}
	public Parents() {
		System.out.println("P constructor");
	}
	int m1(int i) {
		System.out.println("P:"+i);
		return i;
		
	}
	
	
	
}
class Child extends Parents{
	static
	{
		System.out.println("Static child Block");
	}
	{
		System.out.println("Instance CHild Block");
	}
	public Child(int i) {
		super();
		System.out.println("C constructor: "+i);
	}
	public Child() {
		//this(10);
		System.out.println("C constructor*************");
	}
	
	int m1(int i) {
		super.m1(i);
		System.out.println("C:"+i);
		return i;
	}
	
}

class YChild extends Child{
	static
	{
		System.out.println("Static YChild Block");
	}
	{
		System.out.println("Instance YChild Block");
	}
	
	public YChild() {
		super();
		System.out.println("YC constructor");

	}
	int m1(int i) {
		super.m1(i);
		System.out.println("Y:"+i);
		return i;
		
	}
	
}