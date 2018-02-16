package com.scp.string;

public class Demo
{
	String name= "Amol";
	static String collegeName="YTIET";
	public static void testStatic()
	{
		//System.out.println(name);....Static instance access from static method....
		System.out.println(collegeName);
		System.out.println(Demo.collegeName);
	}
	public void testNonStatic()
	{
		System.out.println(name);//.....non static instance as well as static instance access from non static method....
		System.out.println(collegeName);
		System.out.println(Demo.collegeName);
	}
	public static void main(String[] args) {
		testStatic();
		Demo.testStatic();
		Demo d = new Demo();
		d.testNonStatic();
		d.testStatic();
	}
	
}
