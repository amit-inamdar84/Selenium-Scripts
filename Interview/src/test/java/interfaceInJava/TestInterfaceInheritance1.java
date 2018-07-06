package interfaceInJava;
//As InterfaceInJava2 extends both InterfaceInJava and InterfaceInJava1
//and this class implements InterfaceInJava2 we need to implement methods
//of all these interfaces
//Above is called interface inheritance

public class TestInterfaceInheritance1 implements InterfaceInJava2{

	public static void main(String[] args) {
		TestInterfaceInheritance1 obj = new TestInterfaceInheritance1();
		obj.test1();
		obj.test10();
		obj.test2();
		obj.testint();
		obj.multiply();
		obj.sum();
		obj.subtract();
		
		//When we create reference of interface which has not implemented other interfaces
		//we can only access methods of that interface
		InterfaceInJava1 obj1 = new TestInterfaceInheritance1();
		obj1.test10();
		obj1.subtract();

	}

	public void test1() {
		System.out.println("Method from InterfaceInJava");
		
	}

	public void test2() {
		System.out.println("Method from InterfaceInJava");
		
	}

	public void sum() {
		System.out.println("Method from InterfaceInJava");
		
	}

	public void multiply() {
		System.out.println("Method from InterfaceInJava");
		
	}

	public void test10() {
		System.out.println("Method from InterfaceInJava1");
		
	}

	public void subtract() {
		System.out.println("Method from InterfaceInJava1");
		
	}

	public void testint() {
		System.out.println("Method from InterfaceInJava2");
		
	}

}
