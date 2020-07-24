package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
//Define a class RetryAnalyzer which implements IRetryAnalyzer and implement the its method retry with return type boolean. Define how many times we need to retry.
//Define another class Retry which implements IAnnotationTransformer. In its method transform just call the method:
//annotation.setRetryAnalyzer(RetryAnalyzer.class);
//Mention the above class Retry in listener tag of testng.xml.
//Mention the test cases to be run as usual. Whichever test fails it will be retried.

public class RetryAgain {

	@Test
	public void tryAgain() {
		Assert.assertTrue(false);
	}

}
