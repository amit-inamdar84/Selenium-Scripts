package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedStringCharacter {
	String s = "hello";

	public static char getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (counts.containsKey(c)) {
				counts.put(c, counts.get(c) + 1);
			} else {
				counts.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");

	}

	public static void main(String[] args) {
		FirstNonRepeatedStringCharacter obj = new FirstNonRepeatedStringCharacter();
		char c = getFirstNonRepeatedChar(obj.s);
		System.out.println("First occurence of non-repeated character: " + c);
	}
}
