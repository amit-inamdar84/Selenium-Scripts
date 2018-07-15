package strings;
/**String buffer is used to create mutable strings. Means we can modify the string once it is created
 * String buffer is a class in Java same as String class except it is mutable
 * It is synchronized. 2 threads cannot access methods simultaneously
 * Difference between String buffer and String class
 * String is slow and consumes more memory when you concat because every time it creates new instance
 * String buff is fast and consumes less memory.
 * String class overrides equals method of object class
 * String buff does not override equals method.
 * @author AMIT
 *
 */

public class StringBuff {
	
	public static void main(String[] args) {
		String s = "Test1";
		//This statement will not change the original string
		s.concat("Test2");
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("");
		//Below statement will change the original string as it is String buffer
		System.out.println(s1.capacity());
		System.out.println(s1.append("test"));
		System.out.println(s1.capacity());
		s1.append("etsteettetteetetetettetetetet");
		//Capacity increases by (old capacity*2)+2
		System.out.println(s1.capacity());
		
		
	}
	
	

}
