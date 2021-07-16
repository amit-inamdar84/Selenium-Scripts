package javaPrograms.gsPrograms;

import java.util.HashMap;

public class ProgramToCountCharOccurencesInString {
	public void countCharOcc(String str){
		char[] chars = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(Character ch: chars){
			if(hashMap.containsKey(ch)){
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else{
				hashMap.put(ch,1);
			}
		}
		System.out.println(hashMap);
	}
	
	public static void main(String[] args) {
		String str = "SPY EYE";
		ProgramToCountCharOccurencesInString obj = new ProgramToCountCharOccurencesInString();
		obj.countCharOcc(str);
	}

}
