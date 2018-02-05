package TechnicalApptitude;

public class Test1 {
	public static void main(String[] args) {
		int a=18;
		int b=29;
		if(a > 16 && b<28)//if both condition true then only print if statement otherwise it will print
			// else statement.
		{
			System.out.println("young");
		}
		else
		{
			System.out.println("too young");
		}
		int i=18;
		int j=29;
		if(i > 16 || j<28)//if any condition true then only print if statement otherwise it will print
			// else statement.
		{
			System.out.println("young");
		}
		else
		{
			System.out.println("too young");
		}
	}

}
