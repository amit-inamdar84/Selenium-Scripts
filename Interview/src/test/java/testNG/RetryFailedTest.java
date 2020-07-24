package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTest {
	int i = 0;

	@Test
	public void test1() {
		while (i < 2) {
			System.out.println("Retrying count: "+i);
			i++;
			System.out.println("Failure");
			Assert.assertTrue(false);
		}
		System.out.println("Passed");
		Assert.assertTrue(true);
	}

}
