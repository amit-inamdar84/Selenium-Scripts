package com.amit.web.corejava;

public class DataTypeCasting {
	
	public double test1() {
		return 6.9;
	}
	
	public void test2(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		//byte<short<int<long<float<double
		int a = 10;
		double d = 75.99;
		long l = 9;
		float f = 8.9f;
		short s = 2;
		
		//Casting int to double - Autocasting
		//d=a;
		//System.out.println(d);
		
		//Casting double to integer
		//a = (int) d;
		//System.out.println(a);
		
		//Casting float to double
		//d = f;
		//System.out.println(d);
		
		//Casting double to float
		//f = (float) d;
		//System.out.println(f);
		
		//Casting long to short
		//l=s;
		//System.out.println(l);
		
		//Casting short to long
		//s=(short) l;
		//System.out.println(s);
		
		DataTypeCasting obj = new DataTypeCasting();
		double data = obj.test1();
		obj.test2((int) data);

	}

}
