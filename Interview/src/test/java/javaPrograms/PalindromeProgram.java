package javaPrograms;

public class PalindromeProgram {
/*	public static void main(String[] args) {
		String s1 = "GADAG";
		String reverse = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			reverse = reverse + s1.charAt(i);
		}
		System.out.println(reverse);
		if (s1.equalsIgnoreCase(reverse)) {
			System.out.println("String is palindrome");
		}

		else {
			System.out.println("Not a palindrome");
		}
	}*/

	// Alternative method
	public static void main(String[] args) {
		String s1 = "GADAG";
		String reverse = "";
		char[] ch = s1.toCharArray();
		for (int i=ch.length-1;i>=0;i--) {
			reverse = reverse + ch[i];
		}
		System.out.println(reverse);
		if (s1.equalsIgnoreCase(reverse)) {
			System.out.println("String is palindrome");
		}

		else {
			System.out.println("Not a palindrome");
		}
	}

}
