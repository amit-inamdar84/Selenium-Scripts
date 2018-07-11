package strings;

public class String3 {

	public static void main(String[] args) {
		String s1 = "Amit" + "Inamdar";
		System.out.println(s1);

		String s2 = "ABC";
		String s3 = "XYZ";
		String s4 = s2.concat(s3);
		System.out.println(s4);

		// Here s5 points to Java
		String s5 = "Java";
		String s6 = "Selenium";
		// Now s5 will point to JavaSelenium
		s5 = s5.concat(s6);
		System.out.println(s5);

	}

}
