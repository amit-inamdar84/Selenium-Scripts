package com.amit.web.corejava;
//When you assign value of one data type to another, the two types might not be compatible with each other.
//If types are compatible Java will perform the conversion automatically known as widening or Automatic type conversion.
//For ex: assigning an int value to a long variable.
//If types are not compatible, they need to be casted or converted explicitly.
//byte>>short>>int>>long>>float>>double - Automatic type conversion
//No automatic conversion is supported between numeric to char or boolean. Also boolean and char are not compatible.

public class TypeCasting {
	
	public static double test1() {
		return 7.7;
	}
	
	public static int test2(){
		return 10;
	}
	
	public static short test3() {
		return 3;
	}

	public static void main(String[] args) {
		double k = test1();
		System.out.println(k);
		int a = (int)k;
		System.out.println(a);
		
		double p = test2();
		System.out.println(p);
		
		int s = test2();
		System.out.println((double) s);//No need to explicitly cast here. Still Java allows it.
		System.out.println((short) s);//Explicit cast is required here as int value cannot accommodate in short.
		
		short i = test3();
		double d = i;
		System.out.println(d);
		System.out.println((int) i);//No need to explicitly cast here. Still Java allows it.

	}

}
