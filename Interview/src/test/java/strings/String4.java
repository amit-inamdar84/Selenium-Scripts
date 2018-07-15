package strings;

/**
 * contains() method will match sequence of character and return true or false
 * 
 * 
 *
 */

public class String4 {
	public static void main(String[] args) {
		String name = "XYZABC";
		int num = 5852;
		System.out.println(name.contains("Amti"));
		System.out.println(name.contains("DFC"));
		System.out.println(name.contains("ABC"));
		System.out.println("----------------------");

		System.out.println(name.endsWith("CAB"));
		System.out.println(name.endsWith("ABC"));
		System.out.println("----------------------");

		String s1 = String.format("My name is %s", name);
		System.out.println(s1);
		System.out.println(String.format("Earning is %.4f", 55.55));
		System.out.println(String.format("%05d", num));
		System.out.println("----------------------");

		byte[] array1 = name.getBytes();
		for (byte b : array1) {
			System.out.print(b);

		}

	}

}
