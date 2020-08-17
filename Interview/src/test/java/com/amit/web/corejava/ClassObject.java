package com.amit.web.corejava;
//Instances of the class Class represent classes and interfaces in a running Java application.

public class ClassObject {
	public static void main(String[] args) throws ClassNotFoundException {
		ClassObject obj = new ClassObject();
		//Returns the runtime class of this Object
		System.out.println(obj.getClass());
		//Return the same as above. Also initializes the class.
		System.out.println(Class.forName("com.amit.web.corejava.ClassObject"));
		//Returns the class name as string.
		System.out.println(obj.getClass().getName());
	}
}
