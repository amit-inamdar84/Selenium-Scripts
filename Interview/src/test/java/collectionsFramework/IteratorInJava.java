package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorInJava {
//Two types - Iterator and list iterator.

	public static void main(String[] args) {
		/*List<Object> arrayList = new ArrayList<Object>();
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
		
		List<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Test1");
		arrayList1.add("Test2");
		arrayList1.add("Test3");
		arrayList1.add("Test4");
		arrayList1.add("Test5");
		
		System.out.println(arrayList1);
		
		Iterator<String> itr1 = arrayList1.iterator();
		while(itr1.hasNext()){ //iterator will go in forward direction 
			System.out.println(itr1.next());
			//itr1.remove();
		}
		
		System.out.println(arrayList1);
		System.out.println("----------------------------------");
		
		//Create objects of class Person
		Person p1 = new Person(25,2000);
		Person p2 = new Person(30,3500);
		Person p3 = new Person(35,10000);
		
		List<Person> arrayList3 = new ArrayList<Person>();
		//Insert objects into array list
		arrayList3.add(p1);
		arrayList3.add(p2);
		arrayList3.add(p3);
		
		//System.out.println(arrayList3);
		//Create class type iterator variable and call iterator method on array list
		Iterator<Person> itr2 = arrayList3.iterator();
		while(itr2.hasNext()){ //iterator will go in forward direction 
			//Create class type object and store current data in list by casting to class type
			Person pt = (Person) itr2.next();
			System.out.println(pt.age+ " "+ pt.salary);//Object.variable to access variables
		}
		
		//System.out.println(arrayList3);
		System.out.println("----------------------------------");
		*/
		
		
		List<Object> linkedList = new LinkedList<Object>();
		linkedList.add(20);
		linkedList.add(77.77);
		linkedList.add("String");
		linkedList.add(false);
		linkedList.add('A');
		
		//Linked list iterator has 2 additional methods - hasPrevious and previous
		ListIterator<Object> itr1 = linkedList.listIterator();
		while(itr1.hasNext()){ //iterator will go in forward direction 
			System.out.println(itr1.next());
		}
		
		while(itr1.hasPrevious()) { //This iterator will go in backward direction. However we need to traverse in forward direction first.
			System.out.println(itr1.previous());
		}
	}

}
