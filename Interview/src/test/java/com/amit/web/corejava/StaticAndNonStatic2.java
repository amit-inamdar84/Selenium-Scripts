package com.amit.web.corejava;

public class StaticAndNonStatic2 {
	int rollNumber;
	int age;
	//Static variable can be used to share same data between multiple objects, classes, methods
	static String college;
	static String campus;
	
	StaticAndNonStatic2(int rollNo, int ageData) {
		rollNumber = rollNo;
		age = ageData;
		college = "TCE";
	}
	
	static {
		campus = "Common";
	}
	
	public void display() {
		System.out.println(rollNumber + " " + age + " " + college + " " +campus);
	}

	public static void main(String[] args) {
		StaticAndNonStatic2 obj1 = new StaticAndNonStatic2(1,20);
		obj1.display();
		StaticAndNonStatic2 obj2 = new StaticAndNonStatic2(2,22);
		obj2.display();
		StaticAndNonStatic2 obj3 = new StaticAndNonStatic2(3,23);
		obj3.display();
		

	}

}
