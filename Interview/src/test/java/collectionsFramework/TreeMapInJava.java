package collectionsFramework;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapInJava {
//Tree map maintains ascending order wrt keys
//Null keys are not allowed (java.lang.NullPointerException)
//Contains unique elements
//For generic map declaration keys should be of same type (java.lang.ClassCastException). However values can be different type
	
	public static void main(String[] args) {
		
		Map var = new TreeMap();
		var.put(1, "Test1");
		var.put(4, "Test4");
		var.put(2, "Test2");
		var.put(3, "Test3");
		var.put(5, 10);
		
		System.out.println(var);
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(1, "Test1");
		treemap.put(4, "Test4");
		treemap.put(2, "Test2");
		treemap.put(3, "Test3");
		treemap.put(3, "Test");//Value of key will be overwritten with latest value
		
		System.out.println(treemap);
		
		//Method1
		Set<Entry<Integer, String>> map = treemap.entrySet();
		Iterator<Entry<Integer, String>> itr = map.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next().getKey());
			System.out.println(itr.next().getValue());
		}
		
		//Method2
		for(Map.Entry<Integer, String> ref1 : treemap.entrySet()) {
			System.out.println(ref1.getKey()+"-"+ref1.getValue());
		}
		
		TreeMap<Integer, String> treemap1 = new TreeMap<Integer, String>();
		treemap1.put(1, "Test1");
		treemap1.put(4, "Test4");
		treemap1.put(2, "Test2");
		treemap1.put(3, "Test3");
		treemap1.put(null, "Test");//Null is not allowed
		
		System.out.println(treemap1);

	}

}
