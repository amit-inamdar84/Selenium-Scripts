package interfaceInJava;

public abstract class AbstractClass implements InterfaceInJava1{
	//Contains implemented and non-implemented methods both
	//To make an abstract class we need to make at least one method as abstract. i.e. method prefixed by abstract keyword.
	//Normal classes extends abstract class. One abstract class extends another abstract class.
	//We cannot create object of abstract class because it does not have a complete implementation. 
	//The purpose of an abstract class is to function as a base for subclasses. It acts like a template, or an empty or partially empty structure, you should
	//extend it and build on it before you can use it.
	//Abstract keyword can be used for class and method. Variable cannot be abstract
	//When abstract class implements interface we need not implement any methods of interface
	//But if we implement it is allowed, provided the methods are public by default
	//Also if we implement only one method, then the normal class extending abstract class should implement other methods which is mandatory
	//If a normal class extends abstract class we need to implemented all unimplemented methods
	//If a abstract class extends another abstract class we need NOT implemented any unimplemented methods
	//Abstract class methods are not by default public.
	//Abstract class variables are not by default public, static and final
	//We can create constructor of abstract class.
	//We cannot extend more than 1 abstract class in a normal class- No multiple inheritance
	//We cannot extend more than 1 abstract class in a abstract class- No multiple inheritance
	//We cannot create abstract method in normal class.
	//We cannot create private abstract method in abstract class
	//When we implement abstract class method in child class we cannot narrow down the access modifier
	
	int a = 10;
	
	//Abstract class constructor will execute when child class's default constructor will make super() call.
	AbstractClass() {
		System.out.println("Default constructor of abstract class");
	}
	
	//Abstract class para constructor will execute when child class's para constructor will make super(1) call.
	AbstractClass(int i) {
		System.out.println("Para constructor of abstract class");
	}
	
	public void test1() {
		System.out.println("This is abstract class's non-abstract method");
	}
	
    public abstract void test2();
	

	public static void main(String[] args) {
		//AbstractClass obj= new AbstractClass();

	}

}
