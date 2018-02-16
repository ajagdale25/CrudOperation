package com.scp.externalization;

import java.io.*;

public class Student implements Externalizable
{	
	int i;
	int j;
	String name;
	public Student()
	{
		System.out.println("No arg constructor");
	}
	public Student(int i, int j, String name) {
		super();
		this.i = i;
		this.j = j;
		this.name = name;
	}
	public static void main(String[] args) throws Exception {
		Student s1= new Student(10, 200,"Amol Jagdale");
		System.out.println(s1.i+"..."+s1.j+ "..."+s1.name+"...");
		FileOutputStream fos= new FileOutputStream("Obj.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s1);
		System.out.println("After Deserialized..");
		FileInputStream fis= new FileInputStream("Obj.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Student s2= (Student) ois.readObject();
		System.out.println(s2.i+"..."+s2.j+ "..."+s2.name+"...");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String) in.readObject();
		i=in.readInt();
	}

}
	