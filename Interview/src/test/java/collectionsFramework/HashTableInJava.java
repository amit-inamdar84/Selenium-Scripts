package collectionsFramework;
//Same as hash map but is synchronized
//Null keys and values are not allowed - java.lang.NullPointerException

import java.util.Hashtable;
import java.util.Map;

public class HashTableInJava {

	public static void main(String[] args) {
		Hashtable<Integer,String> t1 = new Hashtable<Integer,String>();
		t1.put(1, "A");
		t1.put(2, "B");
		//t1.put(3, null);
		
		System.out.println(t1);
		
		for(Map.Entry<Integer,String> entry:t1.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
