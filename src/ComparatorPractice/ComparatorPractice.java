package ComparatorPractice;

import java.util.*;

public class ComparatorPractice {

	public static void main(String[] args) 
	{
		Staff st1= new Staff(1, "X");
		Staff st2= new Staff(5, "a");
		Staff st3= new Staff(7, "B");
		Staff st4= new Staff(2, "C");
		Staff st5= new Staff(2, "C");
		Staff st6= st3;
		
		//List<Staff> l= new LinkedList<>();
		Set<Staff> l= new HashSet<Staff>();
		l.add(st1);
		l.add(st2);
		l.add(st3);
		l.add(st4);
		l.add(st5);
		l.add(st6);
		System.out.println("Before Sorting.......");
		System.out.println(l);
		Set<Staff> s= new TreeSet<>(new IdFactor());
		System.out.println("******************************************************");
		s.addAll(l);
		System.out.println(s);
		
		
		
		Comparator<Staff> cp = new Comparator<Staff>() {

			@Override
			public int compare(Staff o1, Staff o2) {
				return o1.id- o2.id;
			}
		};
		
		
		
		//System.out.println("After Sorting.......");
		/*Collections.sort(l, new IdFactor());
		System.out.println(l);
		Collections.sort(l, new NameFactor());
		System.out.println(l);*/
		
		

		
	}

}
class Staff
{
	int id;
	String name;
	public Staff(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + "]";
	}
	
}
class IdFactor implements Comparator<Staff> 
{

	@Override
	public int compare(Staff i1, Staff i2) {
		return i1.id-i2.id;
	}
	
}
class NameFactor implements Comparator<Staff> 
{

	@Override
	public int compare(Staff o1, Staff o2) {
		return o1.name.compareTo(o2.name);
	}
	
}