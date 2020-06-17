package instanceInitializerBlock;
//In main method when new keyword passes control to constructor to create object, compiler's super keyword is first encountered.
//Then parent class constructor has the control. So before object initialization parent IIB is executed and then constructor is executed.
//Next child class IIB is executed and then child class constructor.


public class ChildIIB extends ParentIIB{
	
	ChildIIB(){
		System.out.println("Child class constructor");
	}
	
	{
		System.out.println("Child class IIB");
	}

	public static void main(String[] args) {
		ChildIIB obj = new ChildIIB();

	}

}
