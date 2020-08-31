package innerClass;
//A class that does not have name is called Anonymous Inner Class
//We can create object of interface in Anonymous class and implement methods within the object.
//They are used whenever you need to override the method of a class or an interface without inheritance.
//Instead of interface we can also use class to create Anonymous class.

public class AnonymousInnerClass {

	public static void main(String[] args) {
		A obj = new A() {

			@Override
			public void run() {
				System.out.println("Anonymous Inner Class implementation");

			}

		};

		obj.run();

	}

}
