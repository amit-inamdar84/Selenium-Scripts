package com.amit.web.corejava;

public class VariablesDataType {
	/*
	 * Variable is a name of memory location 3 types of variables- local,
	 * instance(global) and static. Primitive and non primitive data types. See
	 * image in com.amit.web.screenshots/Temp1.png Variable declared inside a
	 * method is called local variable A variable declared inside the class but
	 * outside the method is instance variable. It cannot be static. A variable
	 * declared as static is static variable. It cannot be local.
	 */

	int data = 50; // Instance variable
	static int m = 1000;// Static variable
	int x,y,z;//Multiple variables of same type can be declared in single line.

	public int method() {
		int a = 10;// local variable
		return a;
	}

	public static void main(String[] args) {
		VariablesDataType obj = new VariablesDataType();
		System.out.println("Instance variable: " +obj.data);
		System.out.println("Static variable: " + m);
		int c = obj.method();
		System.out.println("Local variable: " +c);
	}

	/*Type      Default   Size    Range
	 * boolean   false   1 bit    
	 * char     '\u0000' 2 byte    0 to 65535
	 * byte         0    2 byte   -128 to 127
	 * short        0    2 byte   -32768 to 32767
	 * int          0    4 byte   -2147483648 to 2147483647
	 * long         0L   8 byte 
	 * float       0.0f  4 byte 
	 * double      0.0d  8 byte
	 */
	
	/*
	 * The main difference between primitive and non-primitive data types are:
Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
	 */
	
}
