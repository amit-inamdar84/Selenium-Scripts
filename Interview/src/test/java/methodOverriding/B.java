package methodOverriding;
//As per overriding rules at compile time method call will happen from parent class and at run time it will call child class method.
//However if the data type in argument list of overridden method is different it will call parent class method.
//The return type of overridden method must match with that of parent class.

public class B extends A{
	
	public void test(int a, double b) {
		System.out.println("From B");
	}
	
	int test1(){
		System.out.println("test 1 from child");
		return 8;
	}

	public static void main(String[] args) {
		A obj = new B();
		obj.test(5, 8.5555);
		System.out.println(obj.test1());

	}

}
