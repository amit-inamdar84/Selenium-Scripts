package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAgain {

	@Test
	public void tryAgain() {
		Assert.assertTrue(false);
	}

}
