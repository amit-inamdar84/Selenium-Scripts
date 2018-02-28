package com.amit.web.corejava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInJava {

	public static void main(String[] args) {
		//Enumerations can be used to iterate over vector. Iterator can also be used. But enumerators cannot be used
		//on array list and linked list
		Vector<Object> obj = new Vector<Object>();
		obj.add(20);
		obj.add(98.99);
		obj.add(false);
		obj.add("test");
		obj.add(98.99);
		System.out.println(obj);
		System.out.println("--------------------------");
		
		Enumeration<Object> enu = obj.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}

	}

}
