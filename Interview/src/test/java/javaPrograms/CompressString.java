package javaPrograms;
//Output: a3b2c2d1

public class CompressString {
	String s1 = "aaabbccd";
	
	public void compressString(String s1){
		int count = 0;//Counter to count no of occurrences of a character.
		char temp = s1.charAt(0);//Place holder for change in character and comparison within string.
		System.out.println("Length of string: " +s1.length());
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==temp){//if character at i position matches temp character.
				count++;//Increase the count.
			}
			else{//If character occurrences is over and next character is encountered.
				System.out.print(temp+""+count);//Print the character already counted. temp is char and count is its count.
				count=1;//Reset count to 1 as already next character is counted.
				temp=s1.charAt(i);//Reset temp to char at i position as we need to take this one as reference for counting.
			}
		}
		System.out.print(temp+""+count);//Print single occurrence of the character.
	}

	public static void main(String[] args) {
		CompressString obj = new CompressString();
		obj.compressString(obj.s1);

	}

}
