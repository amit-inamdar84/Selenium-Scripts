package interfaceInJava;

public class ExtendAbstractClass extends AbstractClass {
	
	ExtendAbstractClass(){
		
	}
	
	ExtendAbstractClass(int i){
		super(1);
		//Constructor placed only for calling parent class para constructor
	}

	@Override
	public void test2() {
		System.out.println("test2 from child class - Overriden from parent abstract class");

	}

	public void test10() {
		System.out.println("test10 from interface. Unimplemented in abstract but implemented in child class");

	}

	public void subtract() {
		System.out.println("subtract method from interface. Unimplemented in abstract but implemented in child class");

	}

	public static void main(String[] args) {
		//Child class reference and object
		//Methods from both child and parent class are accessible at compile time.
		//At run time child class method will be called. If doesnt exist parent method will be called.
		ExtendAbstractClass obj = new ExtendAbstractClass();
		obj.test1();
		obj.test2();
		obj.test10();
		obj.subtract();
		System.out.println(obj.a);

		//Reference of parent abstract class and object of child class.
		//At compile time only methods from parent abstract class will be called.
		//At run time as test2() is implemented in this class it will be called.
		//test10 and subtract methods are from InterfaceInJava1 which were unimplemented in abstract class.
		AbstractClass obj1 = new ExtendAbstractClass();
		obj1.test1();
		obj1.test2();
		obj1.test10();
		obj1.subtract();
		System.out.println(obj1.a);
		
		//Creating object to call para constructor.
		ExtendAbstractClass obj2 = new ExtendAbstractClass(1); 

	}

}
