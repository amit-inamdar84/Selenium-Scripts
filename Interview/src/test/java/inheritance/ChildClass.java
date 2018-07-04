package inheritance;

public class ChildClass extends ParentClass {

	public void test3() {
		System.out.println("Child class test3");
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.test3();
		obj.test2();
		obj.test4();
		obj.test5();
		obj.test6();// Inherited final method from parent class

		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.f);
		System.out.println(obj.s);
	}

}
