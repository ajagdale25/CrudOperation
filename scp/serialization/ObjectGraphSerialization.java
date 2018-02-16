package com.scp.serialization;

import java.io.*;

public class ObjectGraphSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Parent d= new Parent();
		FileOutputStream fos= new FileOutputStream("Obj.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis= new FileInputStream("Obj.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Parent p1= (Parent)ois.readObject();
		
		System.out.println(p1.c.y.s1);
		System.out.println(p1.c.y.j);

	}
}
class Parent implements Serializable
{
	Child c= new Child();
}
class Child implements Serializable
{
	YoungerChild y= new YoungerChild();
}
class YoungerChild implements Serializable
{
	int j=20;
	String s1= new String("Amol Jagdale");
}