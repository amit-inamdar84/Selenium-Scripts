package seleniumTutorial;

import org.testng.annotations.Test;

import com.amit.web.helper.assertion.AssertionHelper;
import com.amit.web.testBase.TestBase;

public class TestExtentReports extends TestBase {
	@Test
	public void test1() {
		AssertionHelper.markPass();
	}

	@Test
	public void test2() {
		AssertionHelper.markFail();
	}
}
