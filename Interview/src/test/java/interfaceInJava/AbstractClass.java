package interfaceInJava;

public abstract class AbstractClass implements InterfaceInJava1{
	//Contains implemented and non-implemented methods both
	//We cannot create object of abstract class
	//Abstract keyword can be used for class and method. Variable cannot be abstract
	//When abstract class implements interface we need not implement any methods of interface
	//But if we implement it is allowed, provided the methods are public by default
	//Also if we implement only one method, then the class extending abstract class should implement other methods which is mandatory
	//If a normal class extends abstract class we need to implemented all unimplemented methods
	//If a abstract class extends another abstract class we need NOT implemented any unimplemented methods
	//Abstract class methods are not by default public.
	//Abstract class variables are not by default public, static and final
	//We can create constructor of abstract class.
	//We cannot extend more than 1 abstract class in a normal class- No multiple inheritance
	//We cannot extend more than 1 abstract class in a abstract class- No multiple inheritance
	//When we extend abstract class, child class should also implement constructor if present in abstract class
	//We cannot create abstract method in normal class.
	//We cannot create private abstract method in abstract class
	//When we implement abstract class method in child class we cannot narrow down the access modifier
	
	int a = 10;
	
	//Abstract class constructor
	AbstractClass() {
		
	}
	
	AbstractClass(int i) {
		
	}
	
	public void test1() {
		System.out.println("This is abstract method");
	}
	
    public abstract void test2();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
