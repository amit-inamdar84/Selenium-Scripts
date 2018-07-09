package instanceInitializerBlock;
//The child class IIB is invoked after the parent class constructor is invoked.
//This class will have default constructor kept by compiler. Here super() is invoked and parent class constructor will be called
//Hence first parent class IIB will execute, then parent class constructor and then the child class IIB

public class ChildIIB extends ParentIIB{
	
	{
		System.out.println("Child class IIB");
	}

	public static void main(String[] args) {
		ChildIIB obj = new ChildIIB();

	}

}
