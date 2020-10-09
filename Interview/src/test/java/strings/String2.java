package strings;

public class String2 {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = "ABC";
		String s4 = "CDF";
		String s5 = "cdf";

		// equals method in string class will check for content.
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		// equals method compares content case-sensitive
		System.out.println(s4.equals(s5));
		// equalsIgnoreCase compares contents ignores case
		System.out.println(s4.equalsIgnoreCase(s5));
		System.out.println("---------------------------");

		// ==check for object reference
		String s6 = "ABC";
		String s7 = "ABC";
		String s8 = new String("ABC");
		// s6 and s7 are in same constant pool
		System.out.println(s6 == s7);
		// s7 is in constant pool and s8 in non-constant pool
		System.out.println(s7 == s8);

		// compareTo() method compares given string with current string
		// lexicographically. i.e. alphabetical order. Returns positive if str1>str2 or
		// negative number if str1<str2 or 0 if str1=str2.
		// It basically does a sequential comparison of letters in the string
		// that have the same position.
		String str1 = "Amit";
		String str2 = "TCEE";
		String str3 = "Wabtec";
		String str4 = "Amit";

		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str3.compareTo(str4));
		System.out.println(str1.compareTo(str4));

	}

}
