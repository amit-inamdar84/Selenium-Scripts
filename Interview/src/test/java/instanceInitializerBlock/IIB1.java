package instanceInitializerBlock;
//IIB used to initialize instance data members of the class
//IIB will get executed per object. If we have 3 objects IIB will execute 3 times.
//IIB will execute during run time before object initialization
//If we want some pre-requisite data for a object we can  use IIB
//Multiple IIB's will execute in the order they appear
//Final static variables cannot be initialized using IIB.

public class IIB1 {
	int speed;
	int gear;
	static int b;

	IIB1() {
		System.out.println("Speed is: " + speed);
		System.out.println("Gear is: " + gear);
		System.out.println("Brake is: " + b);
	}

	{
		speed = 100;
	}

	{
		gear = 4;
	}
	
	{
		b=4;
	}

	public static void main(String[] args) {
		IIB1 obj = new IIB1();
		IIB1 obj1 = new IIB1();
	}

}
