package collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
	    //Hash set will not maintain insertion order and will not allow duplicate elements	
		//Linked hash set will maintain insertion order and will not allow duplicate elements
		//Tree set will print data in ascending order and will not allow duplicate elements
		
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
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(7);
		treeSet.add(55);
		treeSet.add(44);
		treeSet.add(67);
		treeSet.add(34);
		
		System.out.println(treeSet);

	}

}
