package instanceInitializerBlock;
//IIB used to initialize instance data members of the class
//IIB will get executed per object. If we have 3 objects IIB will execute 3 times.
//IIB will execute during run time before object initialization
//If we want some pre-requisite data for a object we can  use IIB
//Multiple IIB's will execute in the order they appear
//Final static variables cannot be initialized using IIB. But we can initialize static and final variables separately.
//static block start with static keyword and then {}. IIB blocks have no name and are just enclosed within {}.

public class IIB1 {
	int speed;
	int gear;
	static int b;
	static String s;
	final int k;

	IIB1() {
		System.out.println(s);
		System.out.println("Speed is: " + speed);
		System.out.println("Gear is: " + gear);
		System.out.println("Brake is: " + b);
		System.out.println("Fuel capacity is: "+k+" litres");
	}

	{
		speed = 100;
	}

	{
		gear = 4;
	}

	{
		b = 4;
	}
	{
		k=10;
	}
	static {
		s = "Engine started";
	}

	public static void main(String[] args) {
		IIB1 obj = new IIB1();
		IIB1 obj1 = new IIB1();
	}

}
