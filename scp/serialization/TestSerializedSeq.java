package com.scp.serialization;

import java.io.*;

public class TestSerializedSeq {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d= new Dog();
		Cat c= new Cat();
		Rat r= new Rat();	
		FileOutputStream fos= new FileOutputStream("Obj.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		FileInputStream fis= new FileInputStream("Obj.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		Cat c2=(Cat) ois.readObject();
		Rat r2=(Rat) ois.readObject();	
		System.out.println("Animal: "+d2.name);
		System.out.println("Animal: "+c2.name);
		System.out.println("Animal: "+r2.name);
	}
}
class Dog implements Serializable
{
	String name= "Dog";
}
class Cat implements Serializable
{
	String name= "Cat";
}
class Rat implements Serializable
{
	String name= "Rat";

}