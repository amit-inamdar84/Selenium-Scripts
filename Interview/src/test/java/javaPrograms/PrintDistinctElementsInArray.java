package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Output: 5,20,54,10
//Logic: Declare a map of type integer and integer. Key to store the array element and value to store its count.
//While inserting if integer is being inserted first time assign count 1 by inserting the value as 1. (Key value pair)
//If integer is being inserted second time, insert the integer as key and its value as get existing value of integer and add 1 to it.
//Run a keyset iterator on map and print only those integers whose value is 1.
public class PrintDistinctElementsInArray {

	int[] array = { 5, 2, 8, 20, 2, 54, 10, 8 };

	public void findDistinctElements(int[] a) {
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for (Integer i : a) {
			if (intMap.containsKey(i)) {
				intMap.put(i, intMap.get(i) + 1);
			} else {
				intMap.put(i, 1);
			}
		}

		Set<Integer> keys = intMap.keySet();
		for (Integer i : keys) {
			if (intMap.get(i) == 1) {
				System.out.println(i + "---" + intMap.get(i));
			}
		}
	}

	public static void main(String[] args) {
		PrintDistinctElementsInArray obj = new PrintDistinctElementsInArray();
		obj.findDistinctElements(obj.array);

	}

}
