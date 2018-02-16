package com.scp.serialization;

import java.io.*;

public class TestSerializedInstanceOf {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog1 d= new Dog1();
		Cat1 c= new Cat1();
		Rat1 r= new Rat1();	
		FileOutputStream fos= new FileOutputStream("Obj.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		FileInputStream fis= new FileInputStream("Obj.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Object o=ois.readObject();
		if(o instanceof Dog1)
		{
			Dog1 d2= (Dog1) o;
		}
		else if(o instanceof Cat1)
		{
			Cat1 c2= (Cat1) o;
		}
		System.out.println("Animal: "+d.name);
		System.out.println("Animal: "+c.name);
		System.out.println("Animal: "+r.name);
		
	}
}
class Dog1 implements Serializable
{
	String name= "Dog";
}
class Cat1 implements Serializable
{
	String name= "Cat";
}
class Rat1 implements Serializable
{
	String name= "Rat";

}