package com.amit.web.corejava;

public class AccessModifiers {
	//Private - Can be accessed with the class only
	//Methods, variables and constructors can be private. Not classes and interfaces
	//Public - Can be accessed from anywhere. If we are accessing from outside package the class needs to be imported.
	//Protected - Accessed within class, package and sub classes. Class and interface cannot be protected. Methods and fields in interface cannot 
	//be protected
	
	//Access Modifier	within class	within package	outside package by subclass only	outside package
	//Private	              Y	               N	                 N	                        N
	//Default	              Y	               Y	                 N	                        N
	//Protected	              Y	               Y	                 Y	                        N
	//Public	              Y	               Y	                 Y	                        Y
    
	private int i = 55;
	int j = 60;
	protected int k = 85;
	public int p = 96;
	
	private void test1() {
		System.out.println("Private method");
	}
	
	void test2() {
		System.out.println("Default method");
	}
	
	protected void test3() {
		System.out.println("Protected method");
	}
	
	public void test4() {
		System.out.println("Public method");
	}
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.p);
	}

}
