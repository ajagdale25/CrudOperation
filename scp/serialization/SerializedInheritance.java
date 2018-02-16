package com.scp.serialization;

import java.io.*;

public class SerializedInheritance {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Child3 c= new Child3();
		System.out.println("p Name: "+c.i+ "\nC Name: "+c.j);
		FileOutputStream fos= new FileOutputStream("Obj.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(c);
		
		FileInputStream fis= new FileInputStream("Obj.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Child3 c1= (Child3) ois.readObject();
		System.out.println("p Name: "+c1.i+ "\nC Name: "+c1.j);
	}
}
class Parent3 implements Serializable
{
	int i=10;
	//String pName ="P";
}
class Child3 extends Parent3 
{
	int j=20;
	//String cName="C";
}