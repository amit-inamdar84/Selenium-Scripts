package com.amit.web.corejava;

import java.util.ArrayList;
import java.util.List;

public class TestClass extends FinalMethodClass{
	char ch[]={'A','m','i','t'};
	String s1 = new String(ch);
	int a = 10;
	
	//Final variable cannot be reassigned
	final float f = 1;
	final char c;
	
	TestClass() {
		//If final variable is not initialized we can initialize in constructor
		c='a';
	}
	
	void display(){
		System.out.println(a);
		//f=2;
	}
	
	public void test2() {
		System.out.println("Overriden method from parent class");
	}

	public static void main(String[] args) {
/*		int x=20;
		String s2 = "Selenium";
		String s3 = new String("Selenium");
		String s4 = "Suzuki";
		String s5 = "Access";
		String s6 = new String("125");
		String s7 = "Amit Ramesh Inamdar";
		int b = (int) 'b';
		
		TestClass obj = new TestClass();
		System.out.println(obj.ch);
		System.out.println(obj.s1);
		obj.display();
		System.out.println("-------------------------");
		System.out.println(x);
		System.out.println("-------------------------");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s4.concat(s5).concat(s6));
		System.out.println(s4.compareTo(s5));
		System.out.println("-------------------------");
		System.out.println(b);
		System.out.println("-------------------------");
		System.out.println(s4.charAt(5));
		System.out.println(s5.contains("cce"));
		System.out.println("-------------------------");
		String[] split = s7.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);*/
		System.out.println("-------------------------");
		
		//Accessing final class using object creation of parent class
		FinalClass obj1 = new FinalClass();
		obj1.test();
		System.out.println("-------------------------");
		
		//Making collection reference variable final
		List<String> ref = new ArrayList<String>();
		ref.add("Collection");
		ref.add("List");
		//ref=new Vector();
		
		
		//Accessing final method of other class
		TestClass obj = new TestClass();
		obj.test1();
		obj.test2();
		//Final variables can be accessed in child class through inheritance
		System.out.println("Final variables access from parent class: " +obj.i);
		System.out.println("-------------------------");
		
		//Accessing final method of other class using reference of parent class
		FinalMethodClass obj3 = new TestClass();
		obj3.test1();
		obj3.test2();
		obj3.test3();
		System.out.println("-------------------------");
		
		//Accessing final method of other class using object of parent class
		FinalMethodClass obj4 = new FinalMethodClass();
		obj4.test2();
		

	}

}
