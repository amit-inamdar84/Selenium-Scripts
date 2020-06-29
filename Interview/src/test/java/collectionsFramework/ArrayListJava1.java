package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListJava1 {

	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(2);
		arrayList.add("test");
		arrayList.add(true);
		arrayList.add(2.9);

		System.out.println(arrayList);

		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(2);
		arrayList1.add(2);
		arrayList1.add(300);
		arrayList1.add(400);

		// retainAll method retains all elements common between two collections
		// arrayList.retainAll(arrayList1);
		// System.out.println(arrayList);

		System.out.println(arrayList.get(2));

		System.out.println(arrayList1.contains(40));

		// Returns true if this list contains all of the elements of the
		// specified collection
		System.out.println(arrayList.containsAll(arrayList1));

		List<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(1);
		arrayList2.add(2);
		arrayList2.add(300);
		arrayList2.add(400);

		List<Integer> arrayList3 = new ArrayList<Integer>();
		arrayList3.add(1);
		arrayList3.add(3);
		arrayList3.add(300);
		arrayList3.add(400);

		System.out.println("Array list equality: " + arrayList2.equals(arrayList3));
		
		Iterator<Integer> itr =  arrayList3.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("--------------------");
		
		List<Integer> arrayList4 = new ArrayList<Integer>();
		arrayList4.add(8);
		arrayList4.add(10);
		arrayList4.add(150);
		arrayList4.add(75);
		
		System.out.println(arrayList4);
		ListIterator<Integer> itr1 = arrayList4.listIterator();
		while(itr1.hasNext()){
			System.out.println("Forward list: " +itr1.next());
		}
		
		while(itr1.hasPrevious()){
			System.out.println("Backward list: " +itr1.previous());
		}

	}

}
