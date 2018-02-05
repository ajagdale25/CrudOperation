package MapPractical;

import java.util.*;
import java.util.Map;

/**
 * @author Amol
 *
 */
public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		Emp e1= new Emp(1, "Amol");
		Emp e2= new Emp(1, "Amol");
		Emp e3= new Emp(102, "Pqr");
		Emp e4= new Emp(15, "bcd");
		
		Map<Emp, String> mp= new HashMap<>();
		mp.put(e1, "A");
		mp.put(e2, "D");
		mp.put(e3, "B");
		mp.put(e4, "c");
		
		System.out.println(mp);
		mp.remove(e3);
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		System.out.println(mp.entrySet());
		System.out.println(mp.get(e3));//B
		
		System.out.println("With For Loop......................");
		for (Map.Entry string : mp.entrySet()) 
		{
			System.out.print(string.getKey()+ " "+string.getValue());
		}
		System.out.println();
		
		System.out.println("Using Iterator...................");
		Iterator<Map.Entry<Emp, String>> it= mp.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		System.out.println();
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
	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + "]";
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
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}