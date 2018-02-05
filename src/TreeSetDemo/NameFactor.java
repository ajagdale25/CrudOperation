package TreeSetDemo;

import java.util.*;

public class NameFactor implements Comparator<ComparatorDemo>{

	@Override
	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		return o1.name.compareTo(o2.name);
	}

}
