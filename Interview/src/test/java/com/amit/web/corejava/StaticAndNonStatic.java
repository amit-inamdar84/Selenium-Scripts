package com.amit.web.corejava;

public class StaticAndNonStatic {
	// Static members are accessed by class name
	// Non static members are accessed by object
	int i = 80;
	static int j = 90;

	public void test1() {
		System.out.println("This is non-static method");
	}

	public static void test2() {
		System.out.println("This is static method");
	}

	public static void test3() {
		System.out.println("This is also a static method");
	}

	public static void test4() {
		System.out.println("Static method can access static variables but not non-static");
		// System.out.println(i);
		System.out.println(j);
	}

	public void test5() {
		System.out.println("Non-static method can access static and non-static variables");
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj.i);

		System.out.println(StaticAndNonStatic.j);

		obj.test1();// Accesssing non static method using object
		obj.test2();// We can access static method using object but there is a
					// warning
		StaticAndNonStatic.test2();// Accessing static method using class name
		test3();// Since main method is also a static method we can directly
				// call static method without class name
		test4();
		obj.test5();

	}

}
