package VarArgs;

public class VarArgs {
	static void m1(int k,String...a)
	{
		System.out.println("K: "+k);

		for(String i: a)
		{
			System.out.println(i);
		}	
	}
	static void m1(int ...k)
	{
		for(int j: k)
		{
			System.out.println(">>>>>>>>>>>>>>>>>>"+j);
		}	
	}

	public static void main(String[] args)
	{
		m1(1,1);
		m1(1,"Amol Jagdale", "Sawpnil");
		m1(5, "A", "B","C", "D");
		//m1(100, 34957, 8456637);
	}

}
