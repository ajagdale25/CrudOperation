package DailyPracticals;

import java.util.Scanner;

public class AreaOfObject {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breath");
		int l= sc.nextInt();
		int b= sc.nextInt();
		find(l, b);		
	}
	private static void find(long l, long b) 
	{
		System.out.println("Area is: "+(l*b));
	}
}
