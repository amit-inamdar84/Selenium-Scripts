package collectionsFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorClass {
//Vector class is thread safe. If multiple resources access vector class data corruption will not happen.
//Whereas in array list and linked list data corruption will happen.
//Vector maintains insertion order and allows duplicate items.
//Iterator will also work for vectors. We also use enums instead which serve same purpose
	
	public static void main(String[] args) {
		List<Object> obj = new Vector<Object>();
		obj.add(20);
		obj.add(98.99);
		obj.add(false);
		obj.add("test");
		obj.add(98.99);
		System.out.println(obj);
		
		Iterator<Object> itr = obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
