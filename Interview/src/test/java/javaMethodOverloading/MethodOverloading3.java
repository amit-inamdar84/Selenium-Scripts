package javaMethodOverloading;
//Static methods can be overloaded but cannot be overriden.

public class MethodOverloading3 {
	public static void add(int a){
		System.out.println(a);
	}
	
	public static void add(double a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		int a = 10;
		double d = 3.0;
		MethodOverloading3 obj = new MethodOverloading3();
		obj.add(a);
		obj.add(d);
		
	}

}
