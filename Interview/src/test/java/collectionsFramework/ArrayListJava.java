package collectionsFramework;

import java.util.ArrayList;
import java.util.List;
//Array list accepts duplicate elements
//Array list prints elements is same order as inserted
//It is non-synchronized
//Data manipulation is slow as shifting needs to happen if any element is removed
//All collections are available in java.util package
//All elements in collections are stored as object. ex: int value 2 is stored as Integer.valueOf(2)
//All methods - add, addAll, remove, removeAll, contains, containsAll, retainAll, get, equals
//Difference between Array and Array list-
//Array is of fixed length whereas Array list can grow dynamically.
//Removal of elements does not shrink array. Array list shrinks on removal.

public class ArrayListJava {

	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add(2);
		arrayList.add("test");
		arrayList.add(true);
		arrayList.add(2.9);

		System.out.println(arrayList);

		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(100);
		arrayList1.add(200);
		// Array list accepts duplicate elements
		arrayList1.add(300);
		arrayList1.add(300);
		arrayList1.add(4, 900);

		// Array list prints elements is same order as inserted
		System.out.println(arrayList1);

		List<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(100);
		arrayList2.add(200);
		arrayList2.add(300);
		arrayList2.add(400);

		arrayList1.addAll(arrayList2);
		System.out.println(arrayList1);
		arrayList1.add(4, 900);
		System.out.println(arrayList1);
		// removeAll method removes all elements common between the specified
		// collections
		arrayList1.removeAll(arrayList2);
		System.out.println(arrayList1);

	}

}
