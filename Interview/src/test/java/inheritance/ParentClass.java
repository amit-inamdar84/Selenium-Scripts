package inheritance;
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
		System.out.println("Parent class test2");
	}

	protected void test5() {
		System.out.println("Parent class test2");
	}

	final public void test6() {
		System.out.println("Parent class final method");
	}

	public static void main(String[] args) {

	}

}
