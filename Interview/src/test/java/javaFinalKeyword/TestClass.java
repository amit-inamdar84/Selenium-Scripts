package javaFinalKeyword;
//Constructor cannot be declared final. It can be public, private,default or protected

import java.util.ArrayList;
import java.util.List;

public class TestClass extends FinalMethodClass {

	// Final variable cannot be reassigned
	final float f = 1;
	final char c;

	TestClass() {
		// If final variable is not initialized we can initialize in constructor
		c = 'a';
	}

	public void test2() {
		System.out.println("Overriden method from parent class");
	}

	public static void main(String[] args) {
		// Accessing final class using object creation of parent class
		FinalClass obj1 = new FinalClass();
		obj1.test();
		System.out.println("-------------------------");

		// Making collection reference variable final
		final List<String> ref = new ArrayList<String>();
		ref.add("Collection");
		ref.add("List");
		System.out.println(ref);

		// Accessing final method of other class
		TestClass obj = new TestClass();
		obj.test1();
		obj.test2();
		// Final variables can be accessed in child class through inheritance
		System.out.println("Final variables access from parent class: " + obj.i);
		System.out.println("-------------------------");

		// Accessing final method of other class using reference of parent class
		FinalMethodClass obj3 = new TestClass();
		obj3.test1();
		obj3.test2();
		obj3.test3();
		System.out.println("-------------------------");

		// Accessing final method of other class using object of parent class
		FinalMethodClass obj4 = new FinalMethodClass();
		obj4.test2();

	}

}
