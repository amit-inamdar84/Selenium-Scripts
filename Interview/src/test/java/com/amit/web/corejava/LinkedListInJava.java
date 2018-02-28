package com.amit.web.corejava;

import java.util.LinkedList;
import java.util.List;

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
	}

}
