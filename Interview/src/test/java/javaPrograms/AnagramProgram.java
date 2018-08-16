package javaPrograms;

public class AnagramProgram {
	String s1 = "abc";
	String s2 = "cba";
	
	public boolean isAnagram(String a1, String a2){
		char[] chars = a1.toCharArray();
		StringBuilder secondString = new StringBuilder(a2);
		for(Character ch:chars){
			int index = secondString.indexOf(""+ch);
			System.out.println(index);
			if(index!=-1){
				secondString.deleteCharAt(index);
			}
		}
		if(secondString.length()==0){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		AnagramProgram obj = new AnagramProgram();
		boolean isAnagram = obj.isAnagram(obj.s1, obj.s2); 
		System.out.println("Is Anagram? " +isAnagram);
	}

}
