package testNG;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//We can also specify data provider in a different class and use in this class by using dataProviderClass argument in @Test method.

public class DataProviderInTestNG {

	// The data provider must return an Object[][] where each
	// Object[] can be assigned the parameter list of the test method.
	@DataProvider
	public Object[][] testData() {// Returns 2D object array(Any data type).
									// i.e. array of array.
		Object[][] data = new Object[2][2];

		data[0][0] = "ABC";
		data[0][1] = "DEF";
		data[1][0] = "GHI";
		data[1][1] = "JKL";

		return data;
	}

	@DataProvider
	public Object[][] testData1() {// Returns 2D object array(Any data type).
									// i.e. array of array.
		// Object[][] data = new Object[2][2];

		// data[0][0] = 1;
		// data[0][1] = 2;
		// data[1][0] = 3;
		// data[1][1] = 4;

		Object[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		return data;
	}

	@Test(dataProvider = "testData")
	public void test1(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

	@Test(dataProvider = "testData1")
	public void test2(int a, int b) {
		System.out.println(a + " " + b);
	}

	// If you declare your @DataProvider as taking a java.lang.reflect.Method as
	// first parameter, TestNG will pass the current test method for this first
	// parameter. This is particularly useful when several test methods use the
	// same @DataProvider and you want it to return different values depending
	// on which test method it is supplying data for.
	// For example, the following code prints the name of the test method inside
	// its @DataProvider:

	@DataProvider(name = "dp")
	public Object[][] createData(Method m) {
		System.out.println(m.getName()); // print test method name
		return new Object[][] { new Object[] { "Cedric" } };
	}

	@Test(dataProvider = "dp")
	public void test3(String s) {
	}

	@Test(dataProvider = "dp")
	public void test4(String s) {
	}

}
