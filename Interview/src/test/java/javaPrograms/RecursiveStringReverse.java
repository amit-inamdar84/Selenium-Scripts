package javaPrograms;
//Logic: Initialize input string and a string to hold reversed string.
//Access the last character of input string, concat with default value of reverse variable declared as "".
//Store the result in same reverse variable.
//Call substring function on input string and trim the last character. Store the string without last character in same input string.
//Perform recursion. Call the same method again with argument as trimmed input string.
//When input string becomes empty it executes the if condition and return empty string.
//Now reverse call will happen in stack and reverse variable value will be returned to calling statement.

public class RecursiveStringReverse {
	String s = "hello";
	String reverse = "";

	public String revString(String str) {
		if(str.length()==0){
			return str;
		}
		reverse = reverse + str.charAt(str.length() - 1);
		str = str.substring(0, str.length() - 1);
		System.out.println("str----" + str);
		System.out.println("reverse----" + reverse);
		revString(str);
		return reverse;
	}

	public static void main(String[] args) {
		RecursiveStringReverse obj = new RecursiveStringReverse();
		System.out.println("Final reversed string value: "+obj.revString(obj.s));
	}

}
