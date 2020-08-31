package inheritance;
//Inheritance is a feature in java where child class acquires the properties and behaviors of parent class.
//The aim of inheritance is to provide the reusability of code so that a class has to write only the unique features and rest of the common properties
//and functionalities can be extended from the another class.
//Static members and private members do not participate in inheritance.
//We cannot inherit multiple classes in Java. i.e. Class C cannot extends Class A and Class B .
//But Class C can separately extends Class A and Class B can separately extends Class A. 
//And multi level inheritance is allowed. Class B extends A. Class C extends B.


public class ParentClass {
	private int i = 90;// Cannot be inherited in child class
	boolean b = false;
	public char c = 'A';
	protected float f = 2.8f;
	final int s = 55;

	// Private method cannot be inherited in child class
	private void test1() {
		System.out.println("Parent class test1");
	}

	void test2() {
		System.out.println("Parent class test2");
	}

	public void test4() {
		System.out.println("Parent class test4");
	}

	protected void test5() {
		System.out.println("Parent class test5");
	}

	final public void test6() {
		System.out.println("Parent class final method");
	}

	public static void main(String[] args) {

	}

}
