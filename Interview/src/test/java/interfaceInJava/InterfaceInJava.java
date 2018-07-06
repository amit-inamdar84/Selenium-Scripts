package interfaceInJava;

public interface InterfaceInJava {
	// It is used to achieve 100% abstraction
	// Has static constants and abstract methods only
	// Supports multiple inheritance
	// We cannot create object of interface because methods are unimplemented
	// We cannot create constructor of interface as hence no use of creating object
	// We can create reference of interface in child class

	// Variables are by default public,static and final
	public static final int i = 10;
	int j = 20;

	// Methods are abstract-non implemented
	// Methods can't be static because methods are implemented
	// Methods are by default public
	void test1();

	void test2();

	void sum();

	void multiply();

	// Few examples of interface
	// Alert, Capabilities, JavascriptExecutor, OutputType<T>, TakesScreenshot,
	// WebDriver, WebElement

}
