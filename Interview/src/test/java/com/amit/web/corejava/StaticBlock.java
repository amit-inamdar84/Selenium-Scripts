package com.amit.web.corejava;

//Static block is used for initializing static variables. This block gets executed when the class is loaded into the memory.
//Multiple static block can exist within a class and will get executed in same sequence in which they have been written.
//Static block execution does not depend on object creation

public class StaticBlock {
	static String City;
	static int id;
	static boolean isMetro;
	static char code;
	static long area;
	static float percent;
	static double budget;
	
	static{
		City = "Bengaluru";
		id = 55;
	}
	
	static{
		isMetro = true;
	}
	
	static{
		code = 'X';
		area = 568796332;
		percent = 50.55f;
		budget = 8965352.25;
	}
	
	public static void main(String[] args) {
		System.out.println(City);
		System.out.println(id);
		//System.out.println("Value of isMetro: " +isMetro+" Value of code: "+code+ " Value of area: " +area+ " Value of percent: "+percent+ " Value of budget: " +budget);
		System.out.println(isMetro+" "+code+ " " +area+ " "+percent+ " " +budget);
	}
	

}
