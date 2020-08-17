package javaMethodOverloading;

public class MethodOverloading1 {

	// Overloaded main method
	public static void main(String args) {
		System.out.println("This is overloaded main method");
	}

	// Overloaded main method
	public static void main(int args) {
		System.out.println("This is another overloaded main method");
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.calculateArea(3.5f);
		obj.calculateArea(8, 9);
		obj.calculateArea(10);

		MethodOverloading1.main(5);
		MethodOverloading1.main("Test");
		//MethodOverloading1.main(args);
	}

}
