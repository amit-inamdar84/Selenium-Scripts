package methodOverriding;

public class B extends A{
	
	public void test(int a, double b) {
		System.out.println("From B");
	}

	public static void main(String[] args) {
		A obj = new B();
		obj.test(5, 8.5555);

	}

}
