package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

		Object[][] data = { { 1, 2 }, { 3, 4 },{ 5,6 } };

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

}
