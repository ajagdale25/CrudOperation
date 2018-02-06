public class A
{
	static {
		System.out.println("static block A");
	}
	{
		System.out.println("instance block A");
	}
	A()
	{
		System.out.println("Const A");
	}
}