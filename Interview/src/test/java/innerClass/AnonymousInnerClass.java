package innerClass;
//A class that does not have name is called Anonymous Inner Class
//We can create object of interface in Anonymous class and implement methods with the main class implementing interface

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
