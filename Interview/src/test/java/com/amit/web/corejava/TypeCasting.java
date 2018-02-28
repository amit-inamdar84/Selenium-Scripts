package com.amit.web.corejava;

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
		System.out.println((int) k);
		
		double p = test2();
		System.out.println(p);
		
		int s = test2();
		System.out.println((double) s);
		System.out.println((short) s);
		
		short i = test3();
		System.out.println((double) i);
		System.out.println((int) i);

	}

}
