
public class B extends A
{
	static {
		System.out.println("static block B");
	}
	{
		System.out.println("instance block B");
	}
	B()
	{
		System.out.println("Constructor B");
	}
}
