package collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//Linked list accepts duplicate elements - Same as Array list
//Maintains insertion order - Same as Array list
//Non-synchronized - Same as Array list
//Differences:
//Manipulation is fast as no shifting needs to happen. Array list manipulation is slower.
//Retrieval is slower in linked list. It is faster in Array list as it is index based.
//Few additional methods in linked list which are not in Array List - addFirst, addLast, getFirst, getLast
//Array list implements only the list interface. Linked list implements list interface and also Queue interface.
//Array list is better for storing and accessing data. Linked list is better for manipulating data.
//In doubly linked list we can add or remove elements from both side
//Head points to first node and Last node reference will point to NULL
//Each node contains data and pointer to the next node.
//It also acts a list and queue because it implements list and deque interfaces
//Two constructors - LinkedList() and LinkedList(Collection c)
//Methods- add, addFirst, addLast, size, contains, remove, getFirst, getLast, indexOf, clear.


public class LinkedListInJava {

	public static void main(String[] args) {
		LinkedListInJava obj = new LinkedListInJava();
		System.out.println(obj.toString());
		List<Object> linkedList = new LinkedList<Object>();
		linkedList.add(20);
		linkedList.add(77.77);
		linkedList.add("String");
		linkedList.add(false);
		linkedList.add('A');
		linkedList.add(obj);
		
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		System.out.println(linkedList.contains('A'));
		System.out.println(linkedList.indexOf(false));
		System.out.println("---------------------------------------------");
		
		//linkedList.clear();
		
		System.out.println(linkedList.isEmpty());
		
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		linkedList1.add(20);
		linkedList1.add(45);
		linkedList1.add(66);
		linkedList1.add(32);
		linkedList1.add(5);	
		
		System.out.println(linkedList1);
		System.out.println(linkedList1.getFirst());
		System.out.println(linkedList1.getLast());
		System.out.println(linkedList1.get(1));
		System.out.println("---------------------------------------------");
		
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.addAll(linkedList1);
		System.out.println(linkedList2);
		linkedList2.addFirst(80);
		linkedList2.addLast(2);
		System.out.println("Updated list: " +linkedList2);
		
		Iterator<Integer> itr = linkedList2.iterator();
		while(itr.hasNext()){
			System.out.println("Updated list using iterator: " +itr.next());
		}
		
		LinkedList<Integer> linkedList3 = new LinkedList<Integer>(linkedList2);
		System.out.println("Using constructor to create linked list from existing collection: "+linkedList3);
	}

}
