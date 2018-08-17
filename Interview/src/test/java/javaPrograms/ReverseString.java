package javaPrograms;

public class ReverseString {
	String s1 = "Amit";

	public void reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseString(obj.s1);
	}

}
