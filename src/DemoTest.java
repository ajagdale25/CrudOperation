import java.util.*;

public class DemoTest 
{
	public static void main(String[] args)
	{
		List l= new ArrayList();
		l.add("Amol");
		l.add(1000);
		System.out.println(l);
		
		List l1= new LinkedList(l);
		l1.add(200);
		l1.add(300);
		l1.add(l);
		System.out.println(l1.get(4));
		System.out.println(l1);
		
		Set s= new HashSet(l1);
		s.add("Jagdale");
		//s.add(l1);
		System.out.println(s);
		
				
	}
}
