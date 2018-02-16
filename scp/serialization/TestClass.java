package com.scp.serialization;

import java.io.*;

public class TestClass {
	
	//Customized Serialization with 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s= new Student();
		System.out.println("Std Name: "+s.name+ "\nPassword: "+s.password);
		
		FileOutputStream fos= new FileOutputStream("Obj.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis= new FileInputStream("Obj.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Student s1= (Student) ois.readObject();
		
		System.out.println("Std Name: "+s1.name+ "\nPassword: "+s1.password);
		
	}
}
class Student implements Serializable
{
	String name="Amol Jagdale";
	transient String password="123456789";
	
	private void writeObject(ObjectOutputStream os) throws IOException
	{
		os.defaultWriteObject();
		String ePassword = "1234" +password;
		os.writeObject(ePassword);
	}
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException
	{
		is.defaultReadObject();
		String ePassword=(String) is.readObject();
		password =ePassword.substring(4);
	}
}