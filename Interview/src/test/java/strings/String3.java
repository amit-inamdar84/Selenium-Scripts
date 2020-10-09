package strings;

public class String3 {

	public static void main(String[] args) {
		String s1 = "Amit" + "Inamdar";
		System.out.println(s1);
		
        //When 2 strings are concatenated the result can be stored in new string reference.
		String s2 = "ABC";
		String s3 = "XYZ";
		String s = "DEF";
		String s4 = s2.concat(s3).concat(s);
		System.out.println(s4);

		// Here s5 points to Java
		String s5 = "Java";
		String s6 = "Selenium";
		// Now s5 will point to JavaSelenium. s5 is just referring to a new value. The value Java will not change.
		s5 = s5.concat(s6);
		System.out.println(s5);
		
		//Here the first 2 numbers will get added normally. When the string gets added then last 2 numbers will act like string addition.
		String s7 = 40+10+"Amit"+20+30;
		System.out.println(s7);
		
		//Below attempt to change the string itself is not possible.
		String s8 = "Test";
		s8.concat("code");
		System.out.println(s8);
		//However if do the below attempt it is possible to change a string.
		s8 = s8.concat("code");
		System.out.println(s8);

	}

}
