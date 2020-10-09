package strings;

public class StringTestClass {
	char ch[] = { 'A', 'm', 'i', 't' };
	String s1 = new String(ch);
	int a = 10;

	void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		int x = 20;
		String s2 = "Selenium";
		String s3 = new String("Selenium");
		String s4 = "Suzuki";
		String s5 = "Access";
		String s6 = new String("125");
		String s7 = "Amit Ramesh Inamdar";
		int b = (int) 'b';

		StringTestClass obj = new StringTestClass();
		System.out.println(obj.ch);
		System.out.println(obj.s1);
		obj.display();
		System.out.println("-------------------------");
		System.out.println(x);
		System.out.println("-------------------------");
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		System.out.println(s4.concat(s5).concat(s6));
		System.out.println(s4.compareTo(s5));
		System.out.println("-------------------------");
		System.out.println(b);
		System.out.println("-------------------------");
		System.out.println(s4.charAt(5));
		System.out.println(s5.contains("cce"));
		System.out.println("-------------------------");
		String[] split = s7.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println("-------------------------");

	}
}
