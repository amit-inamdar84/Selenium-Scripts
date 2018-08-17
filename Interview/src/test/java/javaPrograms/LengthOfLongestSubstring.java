package javaPrograms;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	String s1 = "Renaissancedwta";

	public int substringLength(String s) {
		char[] charsArray = s.toCharArray();
		int len = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charsArray.length; i++) {
			if (!map.containsKey(charsArray[i])) {
				map.put(charsArray[i], i);
			} else {
				len = Math.max(len, map.size());
				System.out.println(map);
				map.clear();
			}
		}
		System.out.println(map);
		return len;
	}

	public static void main(String[] args) {
		LengthOfLongestSubstring obj = new LengthOfLongestSubstring();
		int max = obj.substringLength(obj.s1);
		System.out.println(max);
	}

}
