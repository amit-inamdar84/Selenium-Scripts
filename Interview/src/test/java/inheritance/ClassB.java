package inheritance;

public class ClassB extends ClassA{
	
	//@Override
	//While it is not required to use this annotation when overriding a method, it helps to prevent errors.
	public void test1() {
		System.out.println("Method from ClassB");
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.test1();
		int x =obj.a;
		System.out.println(x);
		
		//Reference of parent class and object of child class. As per ChildClass1.java you can only call parent class methods.
		//However at runtime if the same method exists in child class, that is executed.
		ClassA obj1 = new ClassB();
		obj1.test1();
		
		//reference and object of child class
		//Can call both child class and parent class methods.
		ClassB obj2= new ClassB();
		obj2.test1();
		obj2.test2();
	}

}
