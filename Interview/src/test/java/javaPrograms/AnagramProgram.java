package javaPrograms;
//If 2nd string is made up of all characters of 1st string it is called anagram. The sequence can be anything.
//Logic: Loop through each char in 1st string and check if same char exists in 2nd string. If matched delete that char in 2nd string.
//If all char matches 2nd string will be empty.
public class AnagramProgram {
	String s1 = "abc";
	String s2 = "cba";
	
	public boolean isAnagram(String a1, String a2){
		char[] chars = a1.toCharArray();//Convert 1st string to char array to loop through.
		StringBuilder secondString = new StringBuilder(a2);//Convert 2nd string to string builder to use indexOf method.
		for(Character ch:chars){
			int index = secondString.indexOf(""+ch);//Get index of 2nd string char if matches with ch and concat with string.
			System.out.println(index);
			if(index!=-1){//If character does not match indexOf method returns -1.
				secondString.deleteCharAt(index);//If there is a match delete the 2nd string.
			}
		}
		if(secondString.length()==0){//If 2nd string is empty return true as all characters match.
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
