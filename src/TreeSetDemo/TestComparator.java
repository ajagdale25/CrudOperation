package TreeSetDemo;

import java.util.Collections;
import java.util.*;
import java.util.Set;

public class TestComparator 
{
	public static void main(String[] args)
	{
		ComparatorDemo c1= new ComparatorDemo(1, "Abc");
		ComparatorDemo c2= new ComparatorDemo(2, "Pqr");
		ComparatorDemo c3= new ComparatorDemo(5, "AMolqr");
		ComparatorDemo c4= new ComparatorDemo(3, "aBbc");
		ComparatorDemo c6= new ComparatorDemo(3, "aBbc");
		//List<ComparatorDemo> s= new ArrayList<ComparatorDemo>();
		Set s= new TreeSet(new AgeFactor());
		s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		s.add(c6);
		System.out.println(s);
		//Collections.sort(s, new NameFactor());
		/*for(ComparatorDemo st: s)
		{  
			System.out.println(st.age+" "+st.name);  
		} */ 

	}
}
