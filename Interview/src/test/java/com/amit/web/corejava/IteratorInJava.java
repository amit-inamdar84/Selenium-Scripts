package com.amit.web.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorInJava {
//Two types - Iterator and list iterator.

	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add("test");
		arrayList.add(true);
		arrayList.add(2.9);
		
		System.out.println(arrayList);
		
		Iterator<Object> itr = arrayList.iterator();
		while(itr.hasNext()){ //iterator will go in forward direction 
			System.out.println(itr.next());
			itr.remove();
		}
		
		System.out.println(arrayList);
		System.out.println("----------------------------------");
		
		List<Object> linkedList = new LinkedList<Object>();
		linkedList.add(20);
		linkedList.add(77.77);
		linkedList.add("String");
		linkedList.add(false);
		linkedList.add('A');
		
		//This iterator has 2 additional methods - hasPrevious and previous
		ListIterator<Object> itr1 = linkedList.listIterator();
		while(itr1.hasNext()){ //iterator will go in forward direction 
			System.out.println(itr1.next());
		}
		
		while(itr1.hasPrevious()) { //This iterator will go in backward direction. However we need to traverse in forward direction first.
			System.out.println(itr1.previous());
		}
	}

}
