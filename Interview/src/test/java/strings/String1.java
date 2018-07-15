package strings;

/**
 * Strings are immutable in java. Once created they cannot be modified String is
 * a class in java String represents sequence of characters String comparison is
 * done by content and reference - equals(), == and compareTo() methods
 * available
 * getChars method pending
 */

public class String1 {

	public static void main(String[] args) {
		// Char array when passed to String constructor will convert to a string
		char[] c = { 't', 'e', 's', 't' };
		String s = new String(c);
		System.out.println(s);

		String s1 = "Test";
		s1.concat("Selenium");// String cannot be changed
		System.out.println(s1);

		// Here if string value already exists both strings will point to the
		// same string constant pool
		// This makes memory efficient
		String s2 = "ABC";
		String s3 = "ABC";

		// If we create string using new operator, both strings will point to 2
		// separate objects in heap area
		// However, both objects will point to the literal which is again placed
		// in constant pool area
		String s4 = new String("TTE");
		String s5 = new String("TTE");

	}

}
