package collectionsFramework;

import java.util.LinkedList;
import java.util.List;
//Linked list accepts duplicate elements
//Maintains insertion order
//Non-synchronized
//Manipulation is fast as no shifting needs to happen
//IN doubly linked list we can add or remove elements from both side
//Last node reference will point to NULL
//It also acts a list and queue because it implements list and deque interfaces


public class LinkedListInJava {

	public static void main(String[] args) {
		LinkedListInJava obj = new LinkedListInJava();
		//System.out.println(obj.toString());
		List<Object> linkedList = new LinkedList<Object>();
		linkedList.add(20);
		linkedList.add(77.77);
		linkedList.add("String");
		linkedList.add(false);
		linkedList.add('A');
		linkedList.add(obj);
		
		System.out.println(linkedList);
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
		System.out.println(linkedList1.getLast());
		System.out.println(linkedList1.get(1));
		System.out.println("---------------------------------------------");
		
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.addAll(linkedList1);
		System.out.println(linkedList1);
	}

}
