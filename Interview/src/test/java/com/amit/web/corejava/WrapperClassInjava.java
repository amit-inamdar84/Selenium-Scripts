package com.amit.web.corejava;

public class WrapperClassInjava {
//Wrapper classes are used to convert primitive data type into object and vice versa
//Primitive data types are not objects and are defined in the language itself
//When we store data in data structures we need to convert 	primitive data types into objects first.
//So we use wrapper class
//Type casting also happens through wrapper classes
//Primitive data type cannot store null value but its wrapper class can.
	
	public static void main(String[] args) {
		boolean data;
		int number;
		double price;
		
		//Converting boolean into Boolean explicitly
		data=true;
		Boolean a = Boolean.valueOf(data);
		System.out.println(a);
		
		//Converting boolean into Boolean internally
		Boolean b = data;
		System.out.println(b);
		
		//Converting int to Integer
		number=10;
		Integer x=Integer.valueOf(number);
		System.out.println(x);
		
		Integer y=number;
		System.out.println(y);
		
		//int t = null;
		Integer t = null;
		Integer obj = new Integer(45);
		System.out.println(obj);

	}

}
