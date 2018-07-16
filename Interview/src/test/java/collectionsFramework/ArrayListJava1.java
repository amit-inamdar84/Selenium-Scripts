package collectionsFramework;

import java.util.ArrayList;
import java.util.List;

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
		
		//arrayList.retainAll(arrayList1);
		//System.out.println(arrayList);
		
		System.out.println(arrayList.get(2));
		
		System.out.println(arrayList1.contains(40));
		
		System.out.println(arrayList.containsAll(arrayList1));

	}

}
