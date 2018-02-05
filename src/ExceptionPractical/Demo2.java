package ExceptionPractical;

/**
 * @author Amol
 *
 */
public class Demo2 
{
	public static void main(String[] args){
		Demo2 d= new Demo2();
		
		d.show();
		
	
	}
	void show() throws ArithmeticException{
		int i=10;
		int j= 0;
		int k=0;
		try {
			 k=i/j;
		}
		catch(Exception e)
		{
			System.out.println("Cant divide by zero..");
		}
		if(k!=0)
		System.out.println(k);
		System.out.println("Hi");
	}
}
