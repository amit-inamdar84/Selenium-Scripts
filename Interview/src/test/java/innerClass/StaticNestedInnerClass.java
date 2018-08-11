package innerClass;
//Inner class with static keyword can access private static instance variable of outer class

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
