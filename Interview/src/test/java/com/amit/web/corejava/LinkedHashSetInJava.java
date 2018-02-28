package com.amit.web.corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
	//Linked hash set will maintain insertion order and is the only difference as against HashSet
		
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(7);
		hashSet2.add(55);
		hashSet2.add(44);
		hashSet2.add(67);
		hashSet2.add(34);
		
		System.out.println(hashSet2);
		
		LinkedHashSet<Integer> linkedHash = new LinkedHashSet<Integer>();
		linkedHash.add(7);
		linkedHash.add(55);
		linkedHash.add(44);
		linkedHash.add(67);
		linkedHash.add(34);
		
		System.out.println(linkedHash);

	}

}
