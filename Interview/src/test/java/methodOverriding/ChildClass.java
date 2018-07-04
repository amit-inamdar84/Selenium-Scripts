package methodOverriding;
//Method overriding is a feature in java that allows child class to have the exact same method as in parent class.
//For overriding method name, no of arguments, sequence, return type and data type in argument list should be same.
//Also called run time polymorphism or dynamic dispatch.
//To override correctly, we need to create reference of parent class and object of child class and call parent method.

public class ChildClass extends ParentClass {

	public void test1() {
		System.out.println("Child class test1 method");
	}
    
	//Static method cannot be overridden. However below method can be called by child object
	public static void test3() {
		System.out.println("Child class static method");
	}
	
	//Final method cannot be overridden - Compile time error
/*	final public void test4() {
		System.out.println("Parent class final method");
	}*/

	public static void main(String[] args) {
		ParentClass obj = new ChildClass();
		// During run time compiler will call child class method.
		obj.test1();
		obj.test3();
		
		ChildClass obj1 = new ChildClass();
		obj1.test3();

	}

}
