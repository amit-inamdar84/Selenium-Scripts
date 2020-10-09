package com.amit.web.corejava;

public class ConstructorInJava {
	// Constructor is called when we create a object
	//Used to initialize the objects of a class
	//Used to initialize global variable
	// It has no return type and should be named same as class name
	//If we do not create a constructor Java compiler will create a default constructor.
	// When we have only a parameterized constructor, we cannot create object of
	// default constructor. i.e. when we have a parameterized constructor in class, Java compiler will not keep default constructor.
	//The parameterized constructor is used to provide different values to the distinct objects. However, you can provide the same values also.
	//Constructors do not participate in inheritance.
	//If you have more than one constructor in a class, it means you have overloaded constructors.
	// Constructor overloading is possible. We need to change parameter num. The below 2 constructors are overloaded.

	int a;
	int b;
	String name;

	// Default constructor - Provides default value 0 and null to objects
	ConstructorInJava() {
		System.out.println("Default constructor:  " +a+ " "+b+ " "+name);
	}

	// Parameterized constructor
	ConstructorInJava(int a) {
		this.a = a;
		System.out.println(this.a);
	}

	// Constructor overloading
	ConstructorInJava(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(this.a + " " + this.b);
	}

	public static void main(String[] args) {
		ConstructorInJava obj = new ConstructorInJava();
		ConstructorInJava obj1 = new ConstructorInJava(6);
		ConstructorInJava obj2 = new ConstructorInJava(9, 10);

	}

}
