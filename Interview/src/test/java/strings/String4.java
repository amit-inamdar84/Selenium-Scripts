package strings;

 //contains() method will match sequence of character and return true or false
 //public boolean contains(CharSequence s)
 //Throws null pointer exception if sequence is null.
 //endsWith(): Checks if given string ends with predefined suffix. Returns true or false.
 //public boolean endsWith(String suffix)
 //The java.util.Locale class object represents a specific geographical, political, or cultural region.
 //Locale is a mechanism for identifying objects, not a container for the objects themselves.
 //format(): This method returns the formatted string by given locale, format and arguments.
 //public static String format(String format, Object... args)
 //public static String format(Locale loc, String format, Object... args)
 //%s – for strings; %f – for floats; %d – for integers; %x - hexadecimal; %c - Character; %tc - Date and time; %tr - Time
 //getBytes() - This method is in String class. It will convert the string into an array of bytes.

public class String4 {
	public static void main(String[] args) {
		String name = "XYZABC";
		String address = "Test";
		int num = 5852;
		System.out.println(name.contains("Amti"));
		System.out.println(name.contains("DFC"));
		System.out.println(name.contains("ABC"));
		System.out.println("----------------------");

		System.out.println(name.endsWith("CAB"));
		System.out.println(name.endsWith("ABC"));
		System.out.println("----------------------");

		//format specifier syntax - %[argument number][flags][width][.precision]type
		//%[flags - comma or left justification or parenthesis for -ve numbers)
		//[width] - defines minimum no of characters that will be used
		//[.precision] - Set no of decimal places for floating and double
		//type - d or f or c or s etc. This is the only mandatory option required. Rest are optional.
		String s1 = String.format("My name is %s", name);
		System.out.println(s1);
		//We can specify the argument positions using %1$, %2$,..format specifiers
		System.out.println(String.format("My name is %1$s,and %2$s is:", name,address));
		//Here we are formatting the floating number by adding 4 decimal places
		System.out.println(String.format("Earning is %.4f", 55.55));
		//Here we are left padding a number with 0’s and converting the number to a formatted String.
		//%05d indicates insert 0 on left and print total 5 digit integers.
		System.out.println(String.format("%05d", num));
		System.out.println("----------------------");

		byte[] array1 = name.getBytes();
		for (byte b : array1) {
			System.out.print(b);

		}

	}

}
