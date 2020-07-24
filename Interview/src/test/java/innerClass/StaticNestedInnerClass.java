package innerClass;
//Inner class with static keyword can access private static instance variable of outer class
//Normal classes cannot be created as static
//To create object of static inner class, we need to first access it in a static way. i.e. OuterClass.Inner class instead of normal way.
//i.e. Test obj = new Test(). Then create a object reference variable obj = new Test().

public class StaticNestedInnerClass {

	private static int a = 10;

	static class Test {
		void display() {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		StaticNestedInnerClass.Test obj = new Test();
		obj.display();
	}

}
