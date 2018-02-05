package TreeSetDemo;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

public class TreeSetEmp 
{
	public static void main(String[] args) {
		TressSetTest e1= new TressSetTest(1, "Amol");
		TressSetTest e2= new TressSetTest(2, "Gita Vishwas");
		TressSetTest e3= new TressSetTest(3, "Harsh");
		TressSetTest e4= new TressSetTest(4, "Shanktiman");
		TressSetTest e5= new TressSetTest(10, "Sayali");
		List<TressSetTest> s= new ArrayList<TressSetTest>();
		//SortedSet<TressSetTest> s= new TreeSet<TressSetTest>();
		//s.add(1);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e5);
		s.add(e4);
		s.add(e1);
		System.out.println("Without Sort.......");// without 
		for(TressSetTest st:s)
		{  
		System.out.println(st.id+" "+st.name);  
		}
		Collections.sort(s); 
		System.out.println("With Sort.......");

		for(TressSetTest st:s)
		{  
		System.out.println(st.id+" "+st.name);  
		}
		
	}
}
