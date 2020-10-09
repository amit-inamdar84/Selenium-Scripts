package strings;

public class String7 {
	static int k;
	int i = 10;
	Integer t = 55;
	String s;
	int j = 5;
	
	public static void main(String[] args) {
		String7 obj = new String7();
		//Difference between .valueOf and .toString methods of String class.
		//.valueOf is applicable to both primitive data types and objects.
		//.toString is applicable only for objects.
		//Both return a string representation
		//Another difference in returning null shown in last line of this program.
		System.out.println(String.valueOf(obj.i));
		System.out.println(String.valueOf(obj.t));
		System.out.println(String.valueOf("Value of k: "+obj.k));
		System.out.println(obj.toString());
		//Though t is instance variable it is actually object of Integer class. So we can invoke toString method.
		System.out.println(obj.t.toString());
		//Below statement will give compile time error - Cannot invoke toString() on the primitive type int
		//System.out.println(obj.i.toString());
		System.out.println("Value of j: "+new Integer(obj.j));
		
		System.out.println(String.valueOf(obj.s));//Returns string equivalent of null. i.e. null.
		System.out.println(obj.s.toString());//Throws null pointer exception as object is null.
		
		
	}

}
