package strings;

import java.util.Arrays;
import java.util.List;

//int indexOf() method returns index of given character, value or substring
//int indexOf(int ch) returns index of 1st occurrence of character in a string
//int indexOf(int ch, int fromIndex) returns index of 1st occurrence of character starting from specified index. Useful when we need to retrieve 2nd occurrence.
//Here ch is in int because it is unicode code point representation of character.
//int indexOf(String str) returns index of given string
//int indexOf(String str, int fromIndex)  returns index of given string starting from specified index
//If not found returns -1
//lastIndexOf: Returns the last index of given character, value or substring.
//Overloaded methods of lastIndexOf() - same as IndexOf
//lastIndexOf(int ch, int fromIndex) - If index argument is specified, then it will search for character before the index.

public class String5 {
	public static void main(String[] args) {
		String s = "Test Index";
		String s1 = "est";
		System.out.println(s.indexOf('T'));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('e', 6));
		System.out.println("-----------------------");

		System.out.println(s.indexOf("ex"));
		System.out.println(s.indexOf(s1));
		System.out.println(s.indexOf("ex", 4));
		System.out.println("-----------------------");

		// join() method
		String str = String.join("$", "Amit", "Ramesh", "Inamdar");
		System.out.println("See here: "+str);
		List<String> list = Arrays.asList("Amit", "Ramesh", "Inamdar");
		System.out.println(list);
		String str1 = String.join("|",list);
		System.out.println(str1);
		System.out.println("-----------------------");

		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.lastIndexOf('e', 2));
		System.out.println(s.length());
		System.out.println("-----------------------");
		
        //Replace all occurrences of old char to new char.
		//public String replace(char oldChar, char newChar)
		String replace = s.replace('s', 'a');
		System.out.println(replace);
		System.out.println("-----------------------");
		
        //Replaces entire string or character sequence with new string/sequence
		//public String replaceAll(String regex, String replacement)
		String replaceall = s.replaceAll("Index", "Selenium");
		System.out.println(replaceall);
		System.out.println("-----------------------");
		
        //Splits a string based on a delimiter and returns a string array.
		//public String[] split(String regex)
		String test = "Java;test";
		String[] split = test.split(";");
		for (String w : split) {
			System.out.println(w);
		}
		System.out.println("-----------------------");
		
		String test1 = "Amit,Ramesh,Inamdar";
		String [] splitest = test1.split(",");
		for(String w : splitest){
			System.out.println(w);
		}
		System.out.println("-----------------------");
		
        //startsWith() checks if a string starts with a given prefix
		//public boolean startsWith(String prefix)
		System.out.println(test.startsWith("Test"));
		System.out.println(test.startsWith("Ja"));
		System.out.println("-----------------------");
		
        //This method returns a part of string.
		//public String substring(int beginIndex)
		//The substring begins with the character at the specified index and extends to the end of this string.
		//public String substring(int beginIndex, int endIndex)
		//The substring begins with the character at the specified index and extends to the character at index endIndex - 1.
		System.out.println(test.substring(4));
		System.out.println(test.substring(2, 9));
		System.out.println("-----------------------");
		
        //This method converts string to a character array.
		//public char[] toCharArray()
		char ch[] = test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		// Reverse string
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("-----------------------");
		
        //toLowerCase()
		//public String toLowerCase()
		String acc = "PUBLIC";
		System.out.println(acc.toLowerCase());
		
		//toUpperCase()
		//public String toUpperCase()
		String name = "name";
		System.out.println(name.toUpperCase());
	}

}
