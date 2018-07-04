package methodOverriding;

public class TestOverriding {

	public static void main(String[] args) {
		// Creating object of child class and reference of parent class
		ParentClass obj = new ChildClass();
		obj.test1();
		// Creating object of child class and reference of parent class
		ParentClass obj1 = new ChildClass1();
		obj1.test1();
		// Creating object of child class (No overridden method) and reference
		// of parent class. Parent class method will be called
		ParentClass obj2 = new ChildClass2();
		obj2.test1();

	}

}
