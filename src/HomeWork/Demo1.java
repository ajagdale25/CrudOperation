package HomeWork;

public class Demo1 
{
	String name;
	int id;
	static String collegeName="YTIET";
	Demo1(int id, String name)
	{
		collegeName="D. Y. Patil";
		//if you want to change the value static variable then it possible with
		//constructor, method, main method, Static block, and instance block.  
		this.id=id;
		this.name=name;
		this.name=name;	
	}
	Demo1 (){
		
	}
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("Instance Block");
	}
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(collegeName);
	}
	
	public static void main(String[] args)
	{
		Demo1 d1= new Demo1(1, "Amol");
		Demo1 d2= new Demo1(2, "Sayali");
		//System.out.println(d1.id);
		//System.out.println(d1.name);
		//System.out.println(Demo1.collegeName);
		
		d1.show();
		d2.show();
	}
//output like 
	//1.static block
	//2.instance block
	//3.instance block
	//4constructor o/p
	
}
