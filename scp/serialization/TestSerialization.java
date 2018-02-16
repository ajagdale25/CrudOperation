package com.scp.serialization;

import java.io.*;

public class TestSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Save s1= new Save();
		s1.i=10;
		s1.k=30;
		s1.m=40;
		s1.l=60;

		
		//for writing purpose only...........
		File file= new File("Obj.txt");//FileNotFoundException 
		FileOutputStream fos= new FileOutputStream(file);//IOException thrown
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s1);// After this line inside the Obj.txt file object will store in byte format   
		
		//for reading purpose only............
		FileInputStream fis= new FileInputStream(file);
		ObjectInputStream ois= new ObjectInputStream(fis);
		Save s2= (Save) ois.readObject();//Class Not Found Exception Thrown
		System.out.println("\nValue of I: "+s2.i+ "\nValue of J: "+s2.j+"\nValue of k: "+s2.k+"\nValue of l: "+s2.l+ "\nValue of m: "+s2.m+"\nValue of n: "+s2.n);
	}
}
class Save implements Serializable
{
	static int i;
	final int j=20;
	transient int k;
	static transient int m;
	final transient int n=50;
	int l;
}