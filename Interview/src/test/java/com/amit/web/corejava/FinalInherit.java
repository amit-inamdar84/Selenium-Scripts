package com.amit.web.corejava;

public class FinalInherit extends FinalMethodClass{
	final int k;
	
	
	//Constructor cannot be final as it cannot be inherited.
/*	final FinalInherit(){
		
	}*/
	
	//Below is final method which cannot be overridden
/*	final public void test1() {
		System.out.println("This is final method");
	}*/
	
	{
		//Final variable initialization using IIB
		k=20;
	}
	
	public void test2() {
		System.out.println("This is non-final method");
		//Final variable cannot be changed
		//k = 10;
	}
	
	public static void main(String[] args) {
		FinalInherit obj = new FinalInherit();
		//Final method access using object.
		obj.test1();
		System.out.println(obj.k);
	}

}
