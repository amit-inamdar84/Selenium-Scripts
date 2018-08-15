package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Output: 5,20,54,10

public class PrintDistinctElementsInArray {

	int[] array = { 5, 2, 8, 20, 2, 54, 10, 8 };

	public void findDistinctElements(int[] a) {
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for (Integer i : array) {
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
