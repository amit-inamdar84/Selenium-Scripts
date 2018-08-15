package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	String str = "thisisseleniumtest";

	public void findDuplicateChars(String s) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for (Character ch : chars) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		Set<Character> keys = charMap.keySet();
		for (Character ch : keys) {
			if (charMap.get(ch) > 1) {
				System.out.println(ch + "---" + charMap.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		DuplicateCharsInString obj = new DuplicateCharsInString();
		obj.findDuplicateChars(obj.str);

	}

}
