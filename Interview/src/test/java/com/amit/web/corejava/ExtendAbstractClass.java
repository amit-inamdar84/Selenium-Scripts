package com.amit.web.corejava;

public class ExtendAbstractClass extends AbstractClass{
	
	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		ExtendAbstractClass obj = new ExtendAbstractClass();
		obj.test1();
		obj.test2();
		System.out.println(obj.a);
		
		AbstractClass obj1 = new ExtendAbstractClass();
		obj1.test1();
		obj1.test2();
		System.out.println(obj1.a);

	}

	public void test10() {
		// TODO Auto-generated method stub
		
	}

	public void subtract() {
		// TODO Auto-generated method stub
		
	}

}
