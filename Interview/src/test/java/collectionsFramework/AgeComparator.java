package collectionsFramework;

import java.util.Comparator;

public class AgeComparator implements Comparator<Customer1> {

	@Override
	public int compare(Customer1 o1, Customer1 o2) {
		Customer1 s1 = (Customer1) o1;
		Customer1 s2 = (Customer1) o2;

		if (s1.age == s2.age) {
			return 0;
		}

		else if (s1.age > s2.age) {
			return 1;
		}

		else {
			return -1;
		}
	}

}
