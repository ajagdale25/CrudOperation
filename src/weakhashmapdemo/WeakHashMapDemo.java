package weakhashmapdemo;

import java.util.*;

public class WeakHashMapDemo
{
	public static void main(String[] args) 
	{
			Emp e1 = new Emp(1, "Amol");
			Emp e2 = new Emp(2, "Sandesh");
			Emp e3 = new Emp(3, "Ashutosh");
			Emp e4 = new Emp(4, "Bbb");
			Map<Emp, String> hm= new HashMap<>();
			hm.put(e1, "B");
			hm.put(e2, "C");
			hm.put(e3, "D");
			hm.put(e4, "E");
			Map<Emp, String> wm= new WeakHashMap<>(hm);
			/*wm.put(e1, "B");
			wm.put(e2, "C");
			wm.put(e3, "D");
			wm.put(e4, "E");
			e1=null;*/
			
			//e3= null;
			System.out.println("\nbefore.....");
			System.out.println(hm);
			System.out.println(wm);
			e1=null;

			System.gc();
			System.out.println("\nAfter");
			System.out.println(hm);
			System.out.println(wm);
			System.out.println(hm.size());
			System.out.println(wm.size());
			

	}
}
class Emp
{
	int id;
	String name;
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		/*if (id != other.id)
			return false;*/
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
