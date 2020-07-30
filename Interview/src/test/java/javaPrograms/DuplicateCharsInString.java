package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Logic: Convert string to char array and one by one insert them in a map of type character and integer.
//While inserting if character is being inserted first time assign count 1 by inserting the value as 1. (Key value pair)
//If character is being inserted second time, insert the char as key and its value as get existing value of char and add 1 to it.
//Run a keyset iterator on map and print only those characters whose value is greater than 1.

public class DuplicateCharsInString {
	String str = "thisisseleniumtest";

	public void findDuplicateChars(String s) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		//for each character in char array.
		for (Character ch : chars) {
			//if character already exists insert it, get its previous value and add 1 to it so that repeat count is available.
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
				//If not already inserted just insert and store value 1 as count.
			} else {
				charMap.put(ch, 1);
			}
		}
        
		//Iterate over the keys
		Set<Character> keys = charMap.keySet();
		for (Character ch : keys) {
			if (charMap.get(ch) > 1) {//If count of a particular character is more than 1 means it has repeated. Print only those items and its count.
				System.out.println("Printing duplicate character where count greater than 1: "+ch + "---" + charMap.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		DuplicateCharsInString obj = new DuplicateCharsInString();
		obj.findDuplicateChars(obj.str);

	}

}
