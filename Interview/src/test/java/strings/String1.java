package strings;
//Strings are immutable in java. Once created they cannot be modified. 
//String is a class in java which represents sequence of characters.
//String is in package java.lang. Classes in this package do not require import statement.
//String comparison is done by content and reference - equals(), == and compareTo() methods available
//Some important constructors of String class - String(byte[] byte_arr), String(char[] char_arr), String(StringBuffer s_buffer), String(StringBuilder s_builder), String(String original)
//Methods - equals, equalsIgnoreCase, compareTo, concat, contains, endsWith, format, getBytes,indexOf(int ch), indexOf(int ch, int fromIndex), lastIndexOf(int ch)
//lastIndexOf(int ch, int fromIndex), String.join, replace, replaceAll, split, startsWith, substring, toCharArray, toLowerCase, toUpperCase, charAt, getChars,
//intern, isEmpty.

public class String1 {

	public static void main(String[] args) {
		// Char array when passed to String constructor will convert to a string
		char[] c = { 't', 'e', 's', 't' };
		String s = new String(c);
		System.out.println(s);

		String s1 = "Test";
		s1.concat("Selenium");// String cannot be changed
		System.out.println(s1);

		// Here if string value(or literal) already exists both strings will point to the
		// same literal in string constant pool. String constant pool is an area in heap memory.
		// This makes memory efficient as no new literals are created.
		//In this case the string reference and object is created in stack area. i.e. s2 and s3
		String s2 = "ABC";
		String s3 = "ABC";

		// If we create string using new operator, both strings will point to 2
		// separate objects in heap area
		// However, both objects will point to the literal which is again placed in constant pool area
		// Refer to fig in /Interview/src/test/java/strings/String creation.png
		String s4 = new String("TTE");
		String s5 = new String("TTE");

	}

}
