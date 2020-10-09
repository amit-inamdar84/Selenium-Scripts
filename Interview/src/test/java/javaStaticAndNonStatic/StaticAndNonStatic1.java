package javaStaticAndNonStatic;

public class StaticAndNonStatic1 {
	static int counter = 0;
	int i = 0;

	StaticAndNonStatic1() {
		// Value of static variable is incremented every time constructor is
		// called.
		counter++;
		// Value of non static variable is not incremented because every object
		// gets separate copy of i.
		i++;
		System.out.println("Value of counter: " + counter + " " + "Value of i: " + i);

	}

	public static void main(String[] args) {
		System.out.println("Debug point");
		StaticAndNonStatic1 obj1 = new StaticAndNonStatic1();// Once object is
																// created it
																// will receive
																// one separate
																// copy of non
																// static
																// variable
		StaticAndNonStatic1 obj2 = new StaticAndNonStatic1();
		StaticAndNonStatic1 obj3 = new StaticAndNonStatic1();
	}

}
