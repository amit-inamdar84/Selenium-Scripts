package javaFinalKeyword;
//Final keyword is used to restrict the user to change the implementation of the method or change the initialized value of variable.
//Final variable should always be initialized. It can be done using a constructor and IIB.Static final variable can be initialized using static block.
//Final is applicable to class, method and variable.

public class FinalMethodClass {
	final int i=10;
	static final int j;
	
	//Static final variable can be initialized using static block below
	static{
		j=90;
	}
	
	//Final method can be accessed in child class by inheritance but cannot be overridden
	final public void test1() {
		System.out.println("This is final method");
	}
	
	//Non-final method can be accessed in child class by inheritance and can be overridden
	public void test2() {
		System.out.println("This is non-final method");
	}
	
	//Non-final method can be accessed in child class by inheritance and can be overridden
	public void test3() {
		System.out.println("This is non-final method");
	}
	
	//Printing value of static final variable
	public void test4() {
		System.out.println("Final variable initialized using static block: " +j);
	}

	public static void main(String[] args) {
		FinalMethodClass obj = new FinalMethodClass();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();

	}

}
