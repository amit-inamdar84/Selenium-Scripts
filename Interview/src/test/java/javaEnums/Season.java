package javaEnums;
//By default enums have their own string values, we can also assign some custom values to enums. 
//We have to create parameterized constructor for this enum class. Why? Because as we know that enum class’s object can’t be create explicitly so for
//initializing we use parameterized constructor. And the constructor cannot be the public or protected it must have private or default modifiers.
//Why? if we create public or protected, it will allow initializing more than one objects. This is totally against enum concept.
//We have to create one getter method to get the value of enums

public enum Season {
	SUMMER("Hot"), WINTER("Cold"), MONSOON("Rainy");
    String type;
	//Constructor is executed automatically at the time of enum class loading once for every constant.
	Season() {
		System.out.println("This is enum constructor");
	}
	
	//This constructor can only be private or default. Else it can be invoked from outside package.
	//Default is required because we can call this enum from a class within this package.
	Season(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}

	public static void main(String[] args) {
		Season obj = Season.MONSOON;
		System.out.println("Static access of enum constants: " + obj);
		
		System.out.println(Season.WINTER.getType());
	}

}
