package collectionsFramework;

import java.util.Comparator;

public class AreaComparator implements Comparator<Customer1>{

	@Override
	public int compare(Customer1 o1, Customer1 o2) {
		Customer1 s1 = (Customer1) o1;
		Customer1 s2 = (Customer1) o2;
		return s1.area.compareTo(s2.area);
	}

}
