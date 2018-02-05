package MapIterates;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Amol
 *
 */
public class Test1 {

	public static void main(String[] args)
	{
		Address ad1= new Address("Mumbai", 410218);
		Address ad2= new Address("Pune", 12345);
		Address ad3= new Address("Latur", 342156);
		Emp e1= new Emp(1, "Amol", ad1);
		Emp e2= new Emp(2, "Sandesh", ad2);
		Emp e3= new Emp(3, "Swapnil", ad3);
		Emp e4= new Emp(4, "Prathmesh", ad2);
		Emp e5= new Emp(5, "Yogesh", ad1);
		Emp e6= new Emp(2, "Sandesh", ad2);

		Map<Emp, String> hp= new HashMap<>();
		hp.put(e1, "A");
		hp.put(e2, "B");
		hp.put(e3, "F");
		hp.put(e4, "C");
		hp.put(e5, "Z");
		hp.put(e6, "Fire");
		
		
		System.out.println("Direct Printing HashMap Object.....................1.");
		System.out.print(hp);

		System.out.println("\nEntrySet HS with Foreach loop.....................2");
		for (Map.Entry<Emp, String> result : hp.entrySet()) {
			System.out.print(result);
		}
		
		System.out.println("\nKeySet HS with Foreach loop........................3.");
		for (Emp result1 : hp.keySet()) {
			System.out.print(result1);
		}
		System.out.println();
		System.out.println("\nPrinting HS Values with foreach loop......................4..");
		for (String result2 : hp.values()) {
			System.out.println(result2);
		}

		System.out.println("\nUsing KeySet HM For loop....................5.");
		for(int i=0; i<hp.size();i++)
		{
			System.out.println(hp.keySet());
			break;
		}
		
		System.out.println("\nUsing Values HM For loop...................6..");
		for(int i=0; i<hp.size();i++)
		{
			System.out.println(hp.values());
			break;
		}

		System.out.println("\nUsing HashMap Iterator....................7.....");
		Iterator<Map.Entry<Emp, String>> itr= hp.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		System.out.println("\nUsing Key HashMap Iterator.....................16....");
		Iterator<Emp> itr1= hp.keySet().iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next());
		}
		System.out.println("\nUsing HashMap Iterator....................17.....");
		Iterator<String> itr2= hp.values().iterator();
		while(itr2.hasNext())
		{
			System.out.print(itr2.next());
		}
		
		System.out.println();
		System.out.println("\nUsing LinkedHashMap....................");
		Map<Emp, String> lh= new LinkedHashMap<>();
		lh.put(e1, "A");
		lh.put(e2, "B");
		lh.put(e3, "F");
		lh.put(e4, "C");
		lh.put(e5, "Z");
		lh.put(e6, "Fire");
		System.out.println("\nDirect Printing LinkedHashMap...........8...");
		System.out.println(lh);
		
		
		System.out.println("\nUsing LinkedHashMap Iterator....................9.....");
		Iterator<Map.Entry<Emp, String>> itr4= lh.entrySet().iterator();
		while(itr4.hasNext())
		{
			System.out.print(itr4.next());
		}
		System.out.println("\nUsing LinkedHashMap Keyset Iterator....................18.....");
		Iterator<Emp> itr5= lh.keySet().iterator();
		while(itr5.hasNext())
		{
			System.out.print(itr5.next());
		}
		System.out.println("\nUsing LinkedHashMap Values Iterator....................19.....");
		
		Iterator<String> itr6= lh.values().iterator();
		while(itr6.hasNext())
		{
			System.out.print(itr6.next());
		}
		
		System.out.println();
		System.out.println("\nEntrySet Linked HS with Foreach loop...................10..");
		for (Map.Entry<Emp, String> result : lh.entrySet()) {
			System.out.print(result);
		}
		
		System.out.println();
		System.out.println("\nKeySet LinkedHS with Foreach loop......................11...");
		for (Emp result1 : lh.keySet()) {
			System.out.print(result1);
		}

		System.out.println();
		System.out.println("\nPrinting LinkedHS Values with foreach loop.....................12...");
		for (String result2 : lh.values()) {
			System.out.println(result2);
		}
		
		System.out.println("\nUsing LinkedKeySet HM For loop....................13.");
		for(int i=0; i<lh.size();i++)
		{
			System.out.println(lh.keySet());
			break;
		}
		
		System.out.println("\nUsing Values LinkedHM For loop...................15..");
		for(int i=0; i<lh.size();i++)
		{
			System.out.println(lh.values());
			break;
		}
		
		Map<Emp, String> ht= new Hashtable<>(lh);
		System.out.println("__Direct Enumeration..._______________20________________");
		System.out.println(ht);
		System.out.println("_________________________________");
		System.out.println("......Enumeration keys and Values...21...");
		if (ht instanceof Hashtable) {
			Hashtable t = (Hashtable) ht;
			Enumeration<Emp> e= t.keys();
			while(e.hasMoreElements())
			{
				Emp em=e.nextElement();
				System.out.print(em+": "+t.get(em));
			}

		}
		System.out.println("\n......Iterator keys>>>>>>>>>>>>>22");
		if (hp instanceof HashMap) {
			HashMap t = (HashMap) hp;
			Iterator<Emp> e= t.keySet().iterator();
			while(e.hasNext())
			{
				Emp em=e.next();
				System.out.print(em+" :"+t.get(em));
			}

		}
	}

}
class Emp
{
	int id;
	String name;
	Address address;
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		//result = prime * result + id;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		/*if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;*/
		return true;
	}
	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
class Address
{
	String city;
	int pinCode;
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
	//	result = prime * result + pinCode;
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		/*if (pinCode != other.pinCode)
			return false;*/
		return true;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}