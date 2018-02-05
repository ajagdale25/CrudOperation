package HomeWork;

public class Demo3
{
	int id;
	String name;
	
	static
	{
		System.out.println("Static block..");
	}
	{
		System.out.println("instance block");
	}

	public Demo3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Id: "+id+" Name: "+name);
	}
	@Override
	public String toString() {
		return "Demo3 [id=" + id + ", name=" + name + "]";
	}


	public void show()
	{
		System.out.println("Show method");
	}

	public static void main(String[] args)
	{
		Demo3 d= new Demo3(1," Amol Jagdale");
		d.show();
	}
}
