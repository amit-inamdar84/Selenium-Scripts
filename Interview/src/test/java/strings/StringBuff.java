package strings;
/**String buffer is used to create mutable strings. Means we can modify the string once it is created
 * String buffer is a class in Java same as String class except it is mutable
 * It is synchronized. i.e. thread safe. When multiple threads try to access resources data corruption will not happen.
 * Difference between String buffer and String class
 * String is slow and consumes more memory when you concat because every time it creates new instance
 * String buff is fast and consumes less memory.
 * String class overrides equals method of object class
 * String buff does not override equals method.
 * Methods - equals, append, insert, replace, delete, reverse, capacity, ensureCapacity
 * @author AMIT
 * 
 */

public class StringBuff {
	//Constructors of string buffer class.
	//StringBuffer() - Creates an empty string buffer with initial capacity of 16.
	//StringBuffer(String str) - Creates a string buffer with the specified string. The initial capacity of the string buffer is
    //16 plus the length of the string argument.
	//StringBuffer(int capacity) - Creates an empty string buffer with specified capacity as length.
	
	public static void main(String[] args) {		
		//Testing constructors
		StringBuffer s2 = new StringBuffer();
		System.out.println("Empty?" +s2);
		System.out.println(s2.capacity());
		
		StringBuffer s3 = new StringBuffer("Constructor test");
		System.out.println(s3);
		System.out.println(s3.capacity());
		
		StringBuffer s4 = new StringBuffer(64);
		System.out.println(s4.capacity());
		System.out.println("---------------");
		
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
		System.out.println("---------------");
		
		//append() - Appends to the end of specified string.
		StringBuffer str = new StringBuffer("app test");
		System.out.println(str);
		str.append("n");
		System.out.println(str);
		System.out.println(str.equals(str));//Separate equals method in StringBuffer class. Not overridden.
		System.out.println("---------------");
		
		//insert() - Inserts the given string in the current string at the given position
		s3.insert(11, "fill");
		System.out.println(s3);
		System.out.println(s3.capacity());
		
		//replace() - Replaces the given string from specified begin index to end index
		s3.replace(11, 15, " ");
		System.out.println(s3);
		
		//delete - Deletes the string from specified begin index till specified end index.
		StringBuffer s5 = new StringBuffer("Delete Test");
		System.out.println(s5);
		s5.delete(6, 7);
		System.out.println(s5);
		
		//Reverse method - Non-existent in string class but exists in String buffer class.
		s5.reverse();
		System.out.println(s5);
		System.out.println("-------------------------");
		
		
		//Capacity method - Returns the current capacity of the buffer. Default is 16.
		//Capacity increases by (old capacity*2)+2
		StringBuffer s6 = new StringBuffer();
		System.out.println(s6.capacity());
		s6.append("01234567891234567");//Inserting 17 characters. 16+17=33
		System.out.println(s6.capacity());
		System.out.println("-------------------------");
		
		//Ensure capacity: Ensures that given capacity is the minimum to current capacity.
		//When capacity increases using formula old capacity*2)+2, we can specify a capacity greater than the result of this formula.
		//Ex: initial capacity is 16. Next should be 34. We can specify 36. Next should be (36*2)+2=74. We can specify 75.
		StringBuffer s7 = new StringBuffer();
		System.out.println(s7.capacity());
		s7.append("as12as12as12as12");//16+16=32
		s7.ensureCapacity(36);
		System.out.println(s7.capacity());
		s7.ensureCapacity(75);
		System.out.println(s7.capacity());
	}
}
