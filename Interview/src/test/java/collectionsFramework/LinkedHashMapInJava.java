package collectionsFramework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapInJava {
//Insertion order is maintained
	public static void main(String[] args) {
		Map<String,String> linkedHashMap = new LinkedHashMap<String,String>();
		linkedHashMap.put("1", "ABC");
		linkedHashMap.put("2", "DEF");
		linkedHashMap.put("3", "GHI");
		linkedHashMap.put("4", "JKL");
		linkedHashMap.put(null, "MNO");
		
		System.out.println(linkedHashMap);
		
		//Method1
		Set<Entry<String,String>> ref = linkedHashMap.entrySet();
		Iterator<Entry<String,String>> itr = ref.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getValue());
		}
		
		//Method2
		for(Map.Entry<String, String> ref1 : linkedHashMap.entrySet()) {
			System.out.println(ref1.getKey()+"-"+ref1.getValue());
		}

	}

}
