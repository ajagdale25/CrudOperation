package TreeSetDemo;

import java.util.*;

public class AgeFactor implements Comparator<ComparatorDemo> {


	@Override
	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		if(o1.age==o2.age)
		return 0;
		else if(o1.age > o2.age)
		return 1;
		else
		return -1;
		
	}

}
