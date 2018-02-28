package com.amit.web.corejava;

public interface InterfaceInJava {
	//It is used to achieve 100% abstraction
	//Has static constants and abstract methods only
	//Members are by default public
	//Supports multiple inheritance
	//We cannot create object of interface
	//We can create reference of interface in child class
	
	//Variables are by default public,static and final
	int i = 10;
	int j = 20;
	
	//Methods are abstract-non implemented
	//Methods can't be static because methods are implemented
	void test1();
	void test2();
	void sum();
	void multiply();
	
	//Few examples of interface
	//Alert, Capabilities, JavascriptExecutor, OutputType<T>, TakesScreenshot, WebDriver, WebElement

}
