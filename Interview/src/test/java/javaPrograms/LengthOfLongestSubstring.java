package javaPrograms;
//When a character gets repeated in a string the characters preceding excluding repeated character is the length of sub string.
//Convert string to char array.
//Declare a int variable and initialize to 0. This will hold the length of longest sub string.
//Create a arraylist(or hashmap) and run for loop on char array.
//If list doesnt contain the character insert the same, else if repeated, calculate the length of list and store in int variable. Clear the list.
//Repeat the loop for remaining characters. Use max function to compare length of each substring and store in int variable.

import java.util.ArrayList;
import java.util.HashMap;

public class LengthOfLongestSubstring {
	String s1 = "Renaissancedwta";

	public int substringLength(String s) {
		char[] charsArray = s.toCharArray();
		int len = 0;

/*		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charsArray.length; i++) {
			if (!map.containsKey(charsArray[i])) {
				map.put(charsArray[i], i);
			} else {
				len = Math.max(len, map.size());
				System.out.println(map);
				map.clear();
			}
		}*/
		
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < charsArray.length; i++){
			if(!list.contains(charsArray[i])){
				list.add(charsArray[i]);
			}
			
			else{
				len = Math.max(len, list.size());
				System.out.println(list);
				list.clear();
			}
		}
		
		System.out.println(list);
		return len;
	}

	public static void main(String[] args) {
		LengthOfLongestSubstring obj = new LengthOfLongestSubstring();
		int max = obj.substringLength(obj.s1);
		System.out.println(max);
	}

}
