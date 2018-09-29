package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = { "test1" })
	public void test2() {
		System.out.println("Passes if test1 is passed");
	}

	@Test
	public void test3() {
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "test3" })
	public void test4() {
		System.out.println("Skips if test3 is failed");
	}

}
