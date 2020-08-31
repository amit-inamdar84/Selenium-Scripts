package methodOverriding;
//Method overriding is a feature in java that allows child class to have the exact same method as in parent class.
//For overriding method name, no of arguments, sequence, return type and data type in argument list should be same. Also access modifier of the overriding
//method of subclass cannot be more restrictive than the overridden method of parent class.
//Method body can change in child class and have its own implementation.
//Also called run time polymorphism or dynamic dispatch because the method call is determined at run time depending on which class the object belongs to.
//To override correctly, we need to create reference of parent class and object of child class and call parent method.
//Overriding can be done using inheritance only
//It ensures that method call will happen from a class for which object is created and not from referenced class.
//At compile time call happens from referenced class and on run time method call happens from object class.
//Private members, final members and static members cannot be overridden.
//Constructors cannot be overridden as they should match their respective class names.
//Overriding method must have same return type.
//Advantage of overriding is that the class can give its own implementation to a inherited method without modifying parent class code.

public class ChildClass extends ParentClass {

	@Override
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
		//Parent class reference and child class object. Can access only parent class methods at compile time
		ParentClass obj = new ChildClass();
		// During run time compiler will call child class method.
		obj.test1();
		obj.test3();
		
		//Child class object and reference. Can call parent and child class methods at compile time.
		ChildClass obj1 = new ChildClass();
		obj1.test3();
		obj1.test1();
		obj1.test4();

	}

}
