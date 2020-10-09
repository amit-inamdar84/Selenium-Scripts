package javaPrograms;

public class ReverseString {
	String s1 = "Amit";
	String reverse = "";

	public void reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.print(reverse);

	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseString(obj.s1);
	}

}
