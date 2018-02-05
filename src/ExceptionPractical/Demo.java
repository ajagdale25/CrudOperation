package ExceptionPractical;

import java.util.Scanner;

/**
 * @author Amol
 *
 */
public class Demo 
{
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int i = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int j= sc.nextInt();
		
		int k=0;
		try{
			k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can not divide by zero ");	
		}
		if(k!=0)
		System.out.println("Answer Is :" +k);
		System.out.println("Amol Jagdale");
	}	
}
