package com.amit.web.corejava;

public class TestInterfaceInheritance implements InterfaceInJava,InterfaceInJava1{

	public void test1() {
		System.out.println("Calling local method");
		
	}

	public void test2() {
		// TODO Auto-generated method stub
		
	}

	public void test10() {
		// TODO Auto-generated method stub
		
	}
	
	public void test20() {
		
	}
	
	//When implementing interface methods in class directly access variables as they are static
	//No need to create objects to access interface variables
	public void subtract() {
		System.out.println("Subtract i from j: " +(j-i));
		
	}

	public void sum() {
		System.out.println("Sum of i and j is: " +(i+j));
		
	}

	public void multiply() {
		System.out.println("Multiplication of i and j is: " +(i*j));
		
	}
	
	public static void main(String[] args) {
		//Create object using reference of interface
		//All methods and variables of interface will be called at compile time
		//At run time if same variable or method is available in class that method will get called
		InterfaceInJava obj = new TestInterfaceInheritance();
		System.out.println(InterfaceInJava.i);
		System.out.println(InterfaceInJava.j);
		obj.test1();
		obj.test2();
		
		//Create class object
		//All methods of both implemented interfaces(compile time) and class(compile time) can be accessed.
		//However at run time, the methods in class will be called
		TestInterfaceInheritance obj1 = new TestInterfaceInheritance();
		obj1.test1();
		obj1.test2();
		obj1.test10();
		obj1.test20();
		obj1.sum();
		obj1.multiply();
		obj1.subtract();
		
		//We can also access interface variables by using interface name.variable
		System.out.println(InterfaceInJava.i);
		System.out.println(InterfaceInJava.j);
		System.out.println(InterfaceInJava1.k);

	}



}
