package javaArrays;

public class Array4 {

	public static void main(String[] args) {
		char[] c1 = {'a','b','c','d'};
		char[] c2 = new char[2];
		
		System.arraycopy(c1, 0, c2, 0, 2);
		System.out.println(c2);

	}

}
