package com.amit.web.corejava;
//This is used to invoke current class constructor

//This is used to invoke current class method
//This can be passed as an argument in the method call
//This can be passed as an argument in the constructor call - See classes - ThisKeyword2 and ThisKeyword3
//This is used to return current class instance
//Available only for non static members

public class ThisKeyword1 {

	ThisKeyword1() {
		System.out.println("Default constructor");
	}

	ThisKeyword1(int i) {
		this(); // Call default constructor
		System.out.println("Value of i is: " + i);
	}

	ThisKeyword1(int i, int j) {
		this(i); // Call constructor with 1 argument
		System.out.println("Value of i is: " + i + " and value of j is: " + j);
	}

	public void test1() {
		System.out.println("Method 1");
	}

	public void test2() {
		this.test1();
		System.out.println("Method 2");
	}

	public void test3(ThisKeyword1 obj) {
		System.out.println("Method 3");
		System.out.println(obj);
	}

	public void test4() {
		//Pass this is an argument alternative to passing object of class type
		//test3(this);
		
		ThisKeyword1 obj = new ThisKeyword1();
		test3(obj);
	}
	
	public ThisKeyword1 test5() {
		return this;
		//return new ThisKeyword1(); Alternative return for this
	}

	public static void main(String[] args) {
		ThisKeyword1 obj = new ThisKeyword1(5, 6);
		obj.test4();
	}

}
