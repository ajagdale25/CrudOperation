import java.util.*;

public class ComparatorDemo 
{
	public static void main(String[] args) 
	{
	
		List<Emp> l = new LinkedList<>();
		Emp e1 = new Emp(1, "Amol Jagdale");
		Emp e2 = new Emp(22, "Amit");
		Emp e3 = new Emp(3, "Sayali");
		Emp e4 = new Emp(25, "Baban");
		Emp e5 = new Emp(16, "Baban");

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		
		System.out.println(l);
		
		Set<Emp> h = new HashSet<>();
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		System.out.println("Before ");
		System.out.println(h);
		/*Set<Emp> s1= new TreeSet(new IdFactor());
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		s1.add(e1);

		System.out.println("After");
		System.out.println(s1);*/
		Comparator cp= new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		System.out.println("**************************************");
		System.out.println(l);
		Collections.sort(l,cp );
		System.out.println("______________________________________");
		System.out.println(l);

		
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
	
	
	
}
class IdFactor implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.id- o2.id;
	}
	
}