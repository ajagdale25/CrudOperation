import java.util.Scanner;

public class RemoveWord {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String inputString = sc.nextLine();
		String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
		System.out.println(newInputString);
		sc.close();
		
	}

}
