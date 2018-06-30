package com.amit.web.corejava;

public class ConstructorInJava {
	// Constructor is called when we create a object
	// It has no return type and should be named same as class name
	// When we have a parameterized constructor, we cannot create object of
	// default constructor
	// Constructor overloading is possible

	int a;
	int b;

	// Default constructor - Provides default value 0 and null to objects
	ConstructorInJava() {
		System.out.println("Default constructor");
	}

	// Parameterized constructor
	ConstructorInJava(int a) {
		this.a = a;
		System.out.println(a);
	}

	// Constructor overloading
	ConstructorInJava(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ConstructorInJava obj = new ConstructorInJava();
		ConstructorInJava obj1 = new ConstructorInJava(6);
		ConstructorInJava obj2 = new ConstructorInJava(9, 10);

	}

}
