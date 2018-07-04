package inheritance;

public class ChildClass1 extends ParentClass1 {

	public void test2() {

	}

	public static void main(String[] args) {
		// We cannot inherit parent class constructor
		// ChildClass1 obj = new ChildClass1(3);

		// We can create reference of parent class and object of child class.
		// However only parent class method can be called and not child class
		// method.

		ParentClass1 obj = new ChildClass1();
		obj.test1();
	}

}
