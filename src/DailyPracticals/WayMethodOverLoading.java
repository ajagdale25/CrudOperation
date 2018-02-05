package DailyPracticals;

/**
 * @author Amol
 *
 */
public class WayMethodOverLoading 
{	
	/*
	 * There are two way to the achieved method overloading...
	 * 1. method overloading by changing data type of argument.
	 * 2. method overloading by changing no. of arguments.
	 * 
	 *  method overloading: same method name but different parameter. 
	 */
	
	//1.method overloading by changing data type of argument.
	public void m1(int x, int y)
	{
		System.out.println("Sum of x and y: "+(x+y));
	}
	public void m1(float x, float y)
	{
		System.out.println("Sum of x and y: "+(x+y));
	}
	
	//2. method overloading by changing no. of arguments. 
	
	public static void m2(int y)
	{
		System.out.println("Num of Students : "+y);
	}
	public static void m2(int x, String a)
	{
		System.out.println("Age: "+x+ " Name: "+a);
	}

	public static void main(String[] args)
	{
		WayMethodOverLoading cal = new WayMethodOverLoading();
		cal.m1(1.8f, 2.2f);
		cal.m1(100, 150);
		WayMethodOverLoading.m2(50);
		WayMethodOverLoading.m2(22, "Amol Jagdale");
		
	}

}
