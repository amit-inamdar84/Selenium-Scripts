package testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RetryFailedTest {

	@Test
	public void test1() {
		Assert.assertTrue(false);
	}

}
