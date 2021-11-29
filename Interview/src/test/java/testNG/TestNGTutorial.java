package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//TestNG installation - Install TestNG plugin from eclipse market place. Specify testng dependency in pom.xml

public class TestNGTutorial {
//TestNG Annotation is a piece of code which is inserted inside a program or business logic used to control the flow of execution of test methods.
//After running this program the annotations will be be executed as per the testNG hierarchy and not in the order mentioned below.
//Testng annotation execution order:
/*	BeforeSuite
	BeforeTest
	BeforeClass
	BeforeMethod
	Test
	AfterMethod
	AfterClass
	AfterTest
	AfterSuite*/
//Basically annotation are created using @interface and they contain methods. 
//For parallel test execution - add below line to testng.xml file:
	//<suite name="Suite" parallel="methods" thread-count="2">
	
	@BeforeSuite
	public void test1() {
		//The annotated method will be run before all tests in this suite have run
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void test2() {
		//The annotated method will be run before any test method belonging to the classes inside the <test> tag is run
		System.out.println("@BeforeTest");
	}

	@BeforeClass
	public void test3() {
		//The annotated method will be run before the first test method in the current class is invoked. 
		System.out.println("@BeforeClass");
	}

	@BeforeMethod
	public void test4() {
		//The annotated method will be run before each test method
		System.out.println("@BeforeMethod");
	}

	@Test
	public void test5() {
		System.out.println("@Test");
	}

	@Test
	public void test6() {
		System.out.println("@Test1");
	}

	@AfterSuite
	public void test7() {
		//The annotated method will be run after all tests in this suite have run
		System.out.println("@AfterSuite");
	}

	@AfterTest
	public void test8() {
		//The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run
		System.out.println("@AfterTest");
	}

	@AfterClass
	public void test9() {
		//The annotated method will be run after all the test methods in the current class have been run
		System.out.println("@AfterClass");
	}

	@AfterMethod
	public void test10() {
		//The annotated method will be run after each test method
		System.out.println("@AfterMethod");
	}

}
