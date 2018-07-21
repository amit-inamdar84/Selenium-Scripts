package innerClass;
//A class within a method is called local inner class
//If a class member has to be accessed only through method we can use local inner class.

public class LocalInnerClass {
	void display() {
		class Test {
			void sum() {
				System.out.println("Sum of two numbers");
			}
		}
		Test obj = new Test();	
		obj.sum();
	}
	
	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}

}
