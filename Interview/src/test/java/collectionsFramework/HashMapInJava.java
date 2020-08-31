package collectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInJava {
	//Hash map contains key value pair
	//Key is unique while value can duplicate
	//Each key value pair is called an entry.
	//Only one null key can be stored and multiple null values are allowed
	//Hash Map will not maintain insertion order.
	//Map can be used if you have to search, update or delete elements on the basis of key.
	//Hash map methods - put(), putAll(), remove(), get(), containsKey(), keySet(), entrySet(), getKey(), getValue()
	//Entry is a sub interface of map. We can access it using Map.Entry. It provides methods to get key and value -getKey(), getValue()
	//

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
		System.out.println("Null value is: " +hashMap1.get(null));
		System.out.println("-----------------------------");
		
		HashMap<String,String> hp1 = new HashMap<String,String>();
		hp1.put("A:", "Value1");
		hp1.put("B:", "Value2");
		System.out.println("Before map delete: " +hp1);
		hp1.remove("B:");
		System.out.println("After map delete: " +hp1);
		
		Map<Integer,String> hashMap2 = new HashMap<Integer,String>();
		hashMap2.put(1,"Test1");
		hashMap2.put(2,"Test2");
		hashMap2.put(3,"Test3");
		hashMap2.put(4,"Test4");
		hashMap2.put(null, "Test5");
		
		//Map interface is not a part of collection. Hence iterator cannot be directly run over Map.
		//So first we need to use keyset method and convert to Set and then run iterator on it.
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
		Set<Map.Entry<Integer, String>> entry = hashMap3.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entry.iterator();
		while(itr1.hasNext()) {
			//System.out.println(itr1.next());
			Map.Entry<Integer, String> map = (Map.Entry<Integer, String>) itr1.next();
			System.out.println(map.getKey()+ " " +  map.getValue());
		}
		System.out.println("-----------------------------");
		
		HashMap<Integer,String> hashMap4 = new HashMap<Integer,String>();
		hashMap4.putAll(hashMap3);
		System.out.println(hashMap3);
		System.out.println(hashMap4.containsKey(60));
		System.out.println(hashMap4.containsValue("Shailesh"));
		
		System.out.println("-----------------------------");
		
		Person p1 = new Person(25,25000);
		Person p2 = new Person(18,5000);
		Person p3 = new Person(36,100000);
		Person p4 = new Person(38,110000);
		
		HashMap<Integer,Person> hashMap5 = new HashMap<Integer,Person>();
		hashMap5.put(1, p1);
		hashMap5.put(2, p2);
		hashMap5.put(3, p3);
		hashMap5.put(4, p4);
		
		for(Map.Entry<Integer,Person>entry1:hashMap5.entrySet()){
			Person p = entry1.getValue();	
			System.out.println(entry1.getKey()+ " "+p.age+" "+p.salary);
		}
	}

}
