package javaPrograms.gsPrograms;

public class SplitStringForAlphaNumSpecChars {
	public static void splitString(String str){
		char[] ch = str.toCharArray();
		for(Character ctr : ch){
			if(Character.isDigit(ctr)){
				System.out.print("Digits: "+ctr+"\n");
			}
			else if(Character.isAlphabetic(ctr)){
				System.out.print("Alphabets: "+ctr+"\n");
			}
			else{
				System.out.print("Special character: "+ctr+"\n");
			}
		}
		
	}
	
	public static void main(String[] args) {
		String str = "abc123*";
		splitString(str);
	}

}
