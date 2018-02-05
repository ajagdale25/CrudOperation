package TreeSetDemo;

import java.util.LinkedHashSet;
import java.util.*;

public class Employee {
	int id;
	String Name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", Name=" + Name + "]";
	}


	public static void main(String[] args) 
	{
		Employee e1= new Employee(1, "Amol");
		Employee e2= new Employee(2, "Gita Vishwas");
		Employee e3= new Employee(3, "Harsh");
		Employee e4= new Employee(4, "Shanktiman");
		Employee e5= new Employee(10, "Sayali");
		Set<Object> s= new LinkedHashSet<>();
		//Set s= new HashSet();
		s.add(1);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e5);
		s.add(e4);
		s.add(e1);
	
		System.out.println(s);


		


	}

}
