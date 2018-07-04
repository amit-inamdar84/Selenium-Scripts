package com.amit.web.corejava;

public class MethodOverloading2 {
	//byte<short<int<long<float<double
	
	public void add(long a, long b) {
		System.out.println("add(long a, long b)");
	}
	
	public void add(double a, double b) {
		System.out.println("add(double a, double b)");
	}
	
	public void add(float a, float b) {
		System.out.println("add(float a, float b)");
	}
	
	//For method call - obj.add(5,10) compiler will get confused to call either add(long,long) or add(int,double)
/*	public void add(int a, double b) {
		System.out.println("add(float a, float b)");
	}*/

	public static void main(String[] args) {
		MethodOverloading2 obj = new MethodOverloading2();
		obj.add(5,10);
		obj.add(50.60,10);
		obj.add(8,10.52);
		obj.add(5.8f,10.6f);

	}

}
