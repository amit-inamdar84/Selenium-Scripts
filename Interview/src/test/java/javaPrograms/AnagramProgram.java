package javaPrograms;
//All characters of 1st string should be present in 2nd string

public class AnagramProgram {
	String s1 = new String("abc");
	String s2 = new String("cbad");

	public void checkAnagram(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					continue;
					//System.out.println("String is anagram");
				}
				else{
					System.out.println("Not an anagram");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		AnagramProgram obj = new AnagramProgram();
		obj.checkAnagram(obj.s1, obj.s2);
	}

}
