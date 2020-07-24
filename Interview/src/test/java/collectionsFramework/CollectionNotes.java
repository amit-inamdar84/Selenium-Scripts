package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Collections is a framework in java which provides an architecture to store and manipulate a group of objects. Refer image - CollectionsHierarchy.PNG
//Operations such as searching, sorting, insertion, manipulation, deletion etc can be performed by collections.
//We also have a Map interface which has classes like HashMap, LinkedHashMap, TreeMap and HashTable.

public class CollectionNotes {
	public static void main(String[] args) {

		// We can create a reference of interface and object of class
		// These will take any kind of data. int, float, string etc.
		List list = new ArrayList<>();
		Set s1 = new HashSet<>();
		Map m1 = new HashMap<>();

		// We can also create reference of the class and object of the class.
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		// These will also take any kind of data.
		ArrayList n = new ArrayList();//Non generic way
		ArrayList<Object> a2 = new ArrayList<Object>();
		HashSet<Object> a3 = new HashSet<Object>();
		LinkedList<Object> a4 = new LinkedList<Object>();

		// We can also add class type of data. i.e. object.
		// Here p1 object is of Person class type.
		Person p1 = new Person(20, 5000);
		Person p2 = new Person(25, 1000);
		Person p3 = new Person(28, 4000);

		a2.add(p1);
		a3.add(p2);
		a4.add(p3);

	}

}
