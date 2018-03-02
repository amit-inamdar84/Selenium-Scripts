package com.amit.web.corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInJava {
	//Hash map contains key value pair
	//Key is unique while value can duplicate
	//Only one null key can be stored and multiple null values are allowed
	//It maintains no order

	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		//Only two values are printed as key are duplicated
		hashMap.put(1,"Test1");
		hashMap.put(2,"Test2");
		hashMap.put(1,"Test1");
		hashMap.put(2,"Test2");
		
		System.out.println(hashMap);
		System.out.println("-----------------------------");
		
		Map<Integer,String> hashMap1 = new HashMap<Integer,String>();
		//Key value is overwritten by latest value
		hashMap1.put(1,"Test1");
		hashMap1.put(2,"Test2");
		hashMap1.put(1,"Test3");
		hashMap1.put(2,"Test4");
		hashMap1.put(null, "Test4");
		
		System.out.println(hashMap1);
		System.out.println("-----------------------------");
		
		Map<Integer,String> hashMap2 = new HashMap<Integer,String>();
		hashMap2.put(1,"Test1");
		hashMap2.put(2,"Test2");
		hashMap2.put(3,"Test3");
		hashMap2.put(4,"Test4");
		hashMap2.put(null, "Test5");
		
		//Method 1
		Set<Integer> keySet = hashMap2.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext()){
			//System.out.println("Printing Keys: " +itr.next());
			System.out.println("Printing Values: " +hashMap2.get(itr.next()));
		}
		System.out.println("-----------------------------");
		
		//Method 2
		for(Map.Entry<Integer,String> entry:hashMap2.entrySet()){
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		System.out.println("-----------------------------");
		
		Map<Integer,String> hashMap3 = new HashMap<Integer,String>();
		hashMap3.put(80,"Amit");
		hashMap3.put(90,"Vedha");
		hashMap3.put(100,"Arpita");
		hashMap3.put(60,"Divit");
		hashMap3.put(70, "Shailesh");
		
		//Method 3
		Set<Entry<Integer, String>> entry = hashMap3.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entry.iterator();
		while(itr1.hasNext()) {
			//System.out.println(itr1.next().getKey());
			System.out.println(itr1.next().getValue());
		}

	}

}
