
public class Test {
	static {
		System.out.println("static block Test");
	}
	{
		System.out.println("instance block Test");
	}

	public static void main(String[] args)
	{
		B c = new B();
		A a = new A();
		C b = new C();
	}

}
