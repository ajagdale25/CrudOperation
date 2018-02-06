
public class C extends B{
	static {
		System.out.println("static block C");
	}
	{
		System.out.println("instance block C");
	}
	public C()
	{
		System.out.println("Const C");
	}

}
