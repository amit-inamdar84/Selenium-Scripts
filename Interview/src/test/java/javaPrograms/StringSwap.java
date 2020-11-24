package javaPrograms;
//Concatenate both strings. Now string a is of length a.length()+b.length().
//Overwrite string b by taking substring of a. i.e. from 0 to a.length()-b.length() -1.
//Now b contains contents of string a. 
//Overwrite string a with substring of string a (i.e. concatenated value) using method substring(int index) where index = b.length().
//Note that now b.length() should be calculated with new value of b (i.e. swapped from b)

public class StringSwap {

	public static void main(String[] args) {
		// Declare two strings
		String a = "Hello";
		String b = "Worl";

		// Print String before swapping
		System.out.println("Strings before swap: a = " + a + " and b = " + b);

		// append 2nd string to 1st
		a = a + b;

		// store initial string a in string b
		b = a.substring(0, a.length() - b.length());

		// store initial string b in string a
		System.out.println(b.length());
		a = a.substring(b.length());

		// print String after swapping
		System.out.println("Strings after swap: a = " + a + " and b = " + b);

	}

}
