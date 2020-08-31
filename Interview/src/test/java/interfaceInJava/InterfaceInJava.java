package interfaceInJava;

public interface InterfaceInJava {
	// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	// It is used to achieve 100% abstraction
	// Has static constants(i.e. public,static and final) and abstract methods only
	// Supports multiple inheritance. i.e. If there are 3 interfaces A,B and C. Interface C can extend interface A and B both. Also a class can implement
	//interface A,B and C.
	// We cannot create object of interface because methods are unimplemented. An object required one separate copy of non-static member which is not available.
	// We cannot create constructor of interface as hence no use of creating object
	// We can create reference of interface in child class
	//An interface will extend another interface whereas a class will implements a interface 
	//If an interface extends one or more interfaces they need not implement the methods from parent interface. But when a class implements one or more interfaces
	//all methods in all those interfaces should be implemented.
	// Variables are by default public,static and final
	public static final int i = 10;
	int j = 20;

	// Methods are abstract-non implemented
	// Methods can't be static because methods are unimplemented.
	// Methods are by default public
	void test1();

	void test2();

	void sum();

	void multiply();

	// Few examples of interface
	// Alert, Capabilities, JavascriptExecutor, OutputType<T>, TakesScreenshot,
	// WebDriver, WebElement
	//We can use interfaces when there are common methods to be implemented. Also when we do not know the exact functionality but we have the features.
	//ROI is common to all banks. This method must exist in the interface so that all classes will mandatorily have to implement it.

}
