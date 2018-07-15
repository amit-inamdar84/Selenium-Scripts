package strings;

import java.util.Arrays;
import java.util.List;

//int indexOf() method returns index of given character, value or substring

//int indexOf(int ch) returns index of 1st occurrence of character in a string
//int indexOf(int ch, int fromIndex) returns index of 1st occurrence of character starting from specified index
//int indexOf(String str) returns index of given string
//int indexOf(String str, int fromIndex)  returns index of given string starting from specified index
//If not found returns -1

public class String5 {
	public static void main(String[] args) {
		String s = "Test Index";
		System.out.println(s.indexOf('T'));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('x', 6));
		System.out.println("-----------------------");

		System.out.println(s.indexOf("ex"));
		System.out.println(s.indexOf("ex", 4));
		System.out.println("-----------------------");

		// join() method
		String str = String.join("$", "Amit", "Ramesh", "Inamdar");
		System.out.println(str);
		List<String> list = Arrays.asList("Amit", "Ramesh", "Inamdar");
		String str1 = String.join("|", "Amit", "Ramesh", "Inamdar");
		System.out.println(str1);
		System.out.println("-----------------------");

		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.lastIndexOf('e', 2));
		System.out.println(s.length());
		System.out.println("-----------------------");

		String replace = s.replace('s', 'a');
		System.out.println(replace);
		System.out.println("-----------------------");

		String replaceall = s.replaceAll("Index", "Selenium");
		System.out.println(replaceall);
		System.out.println("-----------------------");

		String test = "Java;test";
		String[] split = test.split(";");
		for (String w : split) {
			System.out.println(w);
		}
		System.out.println("-----------------------");

		System.out.println(test.startsWith("Test"));
		System.out.println(test.startsWith("Ja"));
		System.out.println("-----------------------");

		System.out.println(test.substring(4));
		System.out.println(test.substring(2, 8));
		System.out.println("-----------------------");

		char ch[] = test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		// Reverse string
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
