package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		Assert.assertFalse(false);
	}
	
	@Test
	public void test4() {
		Assert.assertFalse(true);
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(1, 1);
	}
	
	@Test
	public void test6() {
		Assert.assertNotEquals("XYZ", "ABC");
	}

}
