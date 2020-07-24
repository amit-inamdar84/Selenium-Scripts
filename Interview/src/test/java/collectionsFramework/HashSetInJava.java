package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava {
//Hash set stores elements used a mechanism called hashing.
//Hash set will not maintain insertion order
//Will not allow duplicate elements
//Three constructors for hash set - HashSet(), HashSet(Collection c), HashSet(int capacity)
//Difference between List and Set-
//List will maintain insertion order whereas Set will not maintain.
//List will allow duplicate elements whereas Set will allow only unique elements.
	
	public static void main(String[] args) {

			Set hashSet = new HashSet();
			hashSet.add(8);
			hashSet.add(9.8);
			hashSet.add(true);
			hashSet.add("String");
			
			System.out.println(hashSet);
			
			Set<Object> hashSet1 = new HashSet<Object>();
			hashSet1.add(8);
			hashSet1.add(9.8);
			hashSet1.add(9.8);//Duplicate data. This will not be printed in output.
			hashSet1.add(true);
			hashSet1.add("String");
			
			System.out.println(hashSet1);
			
			HashSet<Integer> hashSet2 = new HashSet<Integer>();
			hashSet2.add(7);
			hashSet2.add(55);
			hashSet2.add(44);
			hashSet2.add(67);
			hashSet2.add(34);
			
			System.out.println(hashSet2);
			
			hashSet1.addAll(hashSet2);
			
			System.out.println(hashSet1);

	}

}
