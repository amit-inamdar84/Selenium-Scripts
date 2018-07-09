package com.amit.web.corejava;
//This operator is used to test whether the object is an instance of class, subclass or interface

public class InstanceOfOperator {

	public static void main(String[] args) {
		InstanceOfOperator obj = new InstanceOfOperator();
		System.out.println(obj instanceof InstanceOfOperator);

		String s = "Test";
		System.out.println(s instanceof String);

	}

}
