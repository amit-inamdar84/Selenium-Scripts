package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameters {
	
	@Test
	@Parameters({"Name"})
	public void test1(@Optional("XYZ") String Name) {
		System.out.println("Name: " +Name);
	}

}
