package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava1 {
	public static void main(String[] args) {
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(7);
		hashSet2.add(55);
		hashSet2.add(44);
		hashSet2.add(67);
		hashSet2.add(34);
		
		Iterator<Integer> itr = hashSet2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
