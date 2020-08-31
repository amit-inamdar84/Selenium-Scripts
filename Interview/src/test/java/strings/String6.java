package strings;
//charAt() - This method return character value at the given index number. The index starts from 0. It returns StringIndexOutOfBoundsException if given index
//number greater the the string or negative index number.
//Syntax: public char charAt(int index)
//getChars(): This method will copy data from string to a character array.
//public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
//srcBegin - begin point in source string; srcEnd(srcEnd+1) - end point in source string; char dst[] - name of character array; dstBegin - begin point in char array
//intern(): Java String intern() method is used for getting the string from the memory if it is already present. This method ensures that all the same strings
//share the same memory. For example, creating a string “hello” 10 times using intern() method would ensure that there will be only one instance of “Hello”
//in the memory and all the 10 references point to the same instance. 

public class String6 {
	String s1 = new String("Selenium");
	
	public static void main(String[] args) {
		String6 obj = new String6();
		System.out.println(obj.s1.charAt(7));
		
		String s1 = "Amit";
		String s2 = "TCEE";
		
		char[] c = new char[6];
		//Src end - index after the last character in the string to copy.
		s1.getChars(0, 4, c, 0);
		for(char arr:c){
			System.out.print(arr);
		}
		System.out.println();
		
		char[] array = {'a','b','c','d','e'};
		s2.getChars(0, 4, array, 1);
		for(char arr:array){
			System.out.print(arr);
		}
		
		System.out.println();
		
		//This method searches the memory pool for the mentioned String, if the string is found then it returns the reference of it, else it
		//allocates a new memory space for the string and assign a reference to it.
		//String created using new keyword will go into non constant pool.
		String str = new String("XOR");
		//String created using literal will go into string constant pool.
		String str1 = "XOR";
		//Return string from constant pool. Now it is same as str1
		String str2 = str.intern();
		//Return false as reference is different
		System.out.println((str==str1));
		//Return true as reference will now be same after using intern method.
		System.out.println(str1==str2);
		String str3 = "Wab";
		String str4 = str3.intern();
		System.out.println(str3 == str4);
		System.out.println("-----------------------");
		
		String a = "";
		String b = "b";
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
	}

}
  