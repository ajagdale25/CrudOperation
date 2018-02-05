package DailyPracticals;

public class CallByValue2 {

	public static void main(String[] args) 
	{
		int x= 110;
		CallByValue2 c= new CallByValue2();
		c.callByValue2(x);
		System.out.println(x);
	}

	private static void callByValue2(int x)
	{
		x=50;
		System.out.println(x);
	}

}
