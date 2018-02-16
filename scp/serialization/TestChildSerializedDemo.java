package com.scp.serialization;

import java.io.*;

public class TestChildSerializedDemo {
	public static void main(String[] args) throws Exception {
		C c = new C();
		c.i=888;
		c.j=999;
		System.out.println(c.i+"......"+c.j);
		FileOutputStream fos= new FileOutputStream("Obj.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(c);
		
		FileInputStream fis= new FileInputStream("Obj.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		C c1= (C) ois.readObject();
		System.out.println(c1.i+"......"+c1.j);
	}
}
class P{
	int i= 10;
}
class C extends P implements Serializable
{
	int j=20;
}