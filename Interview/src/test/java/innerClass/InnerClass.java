package innerClass;
//One class within another class is called inner class
//Inner class can access private member of outer class
//Code is optimized
//Readable code
//Create object of inner class: OuterClass.InnerClass obj1 = obj.new InnerClass();

public class InnerClass {
	private int i = 10;

	class B {
		public void display() {
			// Printing value of instance variable
			System.out.println(i);
		}

		public void display(int i) {
			// Printing value of local variable
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		InnerClass.B obj1 = obj.new B();
		obj1.display();
		obj1.display(5);

	}

}
