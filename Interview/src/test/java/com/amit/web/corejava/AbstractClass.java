package com.amit.web.corejava;

public abstract class AbstractClass implements InterfaceInJava1{
	//Contains implemented and non-implemented methods both
	//We cannot create object of abstract class
	//Abstract keyword can be used for class and method. Variable cannot be abstract
	//When abstract class implements interface we need not implement any methods of interface
	
	int a = 10;
	
	public void test1() {
		System.out.println("This is abstract method");
	}
	
    public abstract void test2();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
