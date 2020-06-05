package com.amit.web.corejava;
//Variable is a name of memory location

//Primitive and non-primitive
//Local, instance and static variables
//Variable declared inside a method is called local variable
//Variable declared inside a class and outside a method is called instance variable. It is not static
//Variable declared as static is static variable. It cannot be local.
//Variable data type can be specified only once

/*
boolean	false	    1 bit   
char	'\u0000'	2 byte    Least value in unicode system. Its value-range lies between '\u0000' to '\uffff'
byte	0	        1 byte    minimum value is -128 and maximum value is 127
short	0	        2 byte    minimum value is -32,768 and maximum value is 32,767
int	    0	        4 byte    minimum value is - 2,147,483,648and maximum value is 2,147,483,647
long	0L	        8 byte
float	0.0f	    4 byte
double	0.0d	    8 byte
 */

public class DataTypeCasting {

	public double test1() {
		return 6.9;
	}

	public void test2(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// byte<short<int<long<float<double
		int a = 10;
		double d = 75.99;
		long l = 9;
		float f = 8.9f;
		short s = 2;

		// Casting int to double - Autocasting
		// d=a;
		// System.out.println(d);

		// Casting double to integer
		// a = (int) d;
		// System.out.println(a);

		// Casting float to double
		// d = f;
		// System.out.println(d);

		// Casting double to float
		// f = (float) d;
		// System.out.println(f);

		// Casting long to short
		// l=s;
		// System.out.println(l);

		// Casting short to long
		// s=(short) l;
		// System.out.println(s);

		DataTypeCasting obj = new DataTypeCasting();
		double data = obj.test1();
		obj.test2((int) data);

	}

}
