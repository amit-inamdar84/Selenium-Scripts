package javaEnums;
//The Enum in Java is a data type which contains a fixed set of constants.
//According to the Java naming conventions, we should have all constants in capital letters.
//Java Enums can be thought of as classes which have a fixed set of constants.
//The Java enum constants are public, static and final implicitly.
//Enums are used to create our own data type like classes.
//We can define an enum either inside the class or outside the class.
//Java Enum internally inherits the java.lang.Enum class, so it cannot inherit any other class, but it can implement many interfaces. 
//We can have fields, constructors, methods, and main methods in Java enum.
//enum constructor is executed separately for each enum constant at the time of enum class loading.(See Season.java)
//We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.
//Enum improves type safety, can be used in switch, can be traversed.
//The values() method returns an array containing all the values of the enum.
//The valueOf() method returns the value of given constant enum.
//The ordinal() method returns the index of the enum value.
//Every enum constant represents an object of type enum.
//enum type can be passed as an argument to switch statement

public class EnumsInJava {
	//Here we have declared enum inside a class. See Season.java for actual enum.
	enum Season{
		SUMMER,
		WINTER,
		MONSOON
	}
	
	public static void main(String[] args) {
		for(Season s: Season.values()){
			System.out.println(s);
		}
		
		System.out.println("Value of Summer is: "+Season.valueOf("SUMMER"));
		System.out.println("Index of Winter is: "+Season.valueOf("WINTER").ordinal());
		System.out.println("Index of Monsoon is: "+Season.valueOf("MONSOON").ordinal());
	}

}
