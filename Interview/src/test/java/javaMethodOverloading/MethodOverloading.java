package javaMethodOverloading;
//Method overloading is a feature that allows a class to have more than one method to have the same name provide their argument list are different
//No of arguments, Sequence of arguments, Data type in argument list changed.
//Increased code readability, code reuse and cleanliness.
//Also known as compile time polymorphism
//We cannot overload a method just by changing the return type of the method
//It is possible to overload main method by changing argument data type - For ex see MethodOverloading1 class. Those methods will work like normal methods
//When we overload main method, in the original main method we should not call the same method. Leads to stack overflow error.


public class MethodOverloading {

	public void calculateArea(float r) {
		System.out.println("Area of circle is: " + 3.14 * r * r);
	}

	public void calculateArea(int l, int b) {
		System.out.println("Area of rectangle is: " + l * b);
	}

	public void calculateArea(int r) {
		System.out.println("Area of cone is: " + 3 * 3.14 * r);
	}
	
	public int add(int a, int b) {
		return a+b;	
	}
	
	public double add(double a, double b) {
		return a+b;	
	}
	
	public int add(int a, long b) {
		return (int) (a+b);	
	}
	
	public double add(long a, int b) {
		return a+b;	
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.calculateArea(2.5f);
		obj.calculateArea(10, 15);
		obj.calculateArea(5);
		
		System.out.println(obj.add(10, 50));
		System.out.println(obj.add(8.5, 2.5));

	}

}
