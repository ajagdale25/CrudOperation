package DailyPracticals;

/**
 * @author Amol
 *
 */
public class CallByValue {
	
/*
 * in this approach copy of an arguments value pass to the method. 
 * there is the only call by value in java, not call by reference.
 */
	public static void main(String[] args) 
	{
		CallByValue c = new CallByValue();
		c.callByValue(10, 20);//here is the arguments..
	}

	private  void callByValue(int x, int y) // here is the parameter..
	{
		System.out.println(x+y);//addition is happen over there..
	}

}
