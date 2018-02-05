import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest
{
	public static void main(String[] args) {
		int[]  arr= {1,2,3,4,5,6};
	
		List l = new ArrayList<>();
		l.add(64646);
		l.add(1,"Amol");
		l.add(null);
		l.add(Arrays.toString(arr));
		System.out.println(l);
		ListIterator it= l.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//Collections.synchronizedList(l);
		
		
	}
}
