package com.scp.string;

public class TestClass{
	public static void main(String[] args) {
		String string= "ajagdale25";
		String number=string.replaceAll("[^0-9]", "");
		System.out.println("Number In String Format: "+number);	
		int i= Integer.parseInt(number);
		System.out.println("After converting into int: "+i);
		int sum=0;
		int add;
		System.out.println("Addtion of Number: ");
		while(i>0)
		{
			add= i % 10;
			sum= sum+add;
			i= i/10;
		}
		System.out.println(sum);
	}
}