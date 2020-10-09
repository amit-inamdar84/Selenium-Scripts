package javaStaticAndNonStatic;

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
	
/**
 * Used to initialize static variables
 * When class is loaded into memory static block is executed and is not dependent on object creation
 * Static block will execute before object creation
 * When we have multiple static blocks they will execute in the order they appear
 * Static block will execute only once per object/class	
 */
	static {
		campus = "Common";
	}
	
	public void display() {
		System.out.println(rollNumber + " " + age + " " + college + " " +campus);
	}

	public static void main(String[] args) {
		System.out.println("Debug point");
		StaticAndNonStatic2 obj1 = new StaticAndNonStatic2(1,20);
		obj1.display();
		StaticAndNonStatic2 obj2 = new StaticAndNonStatic2(2,22);
		obj2.display();
		StaticAndNonStatic2 obj3 = new StaticAndNonStatic2(3,23);
		obj3.display();
	}

}
