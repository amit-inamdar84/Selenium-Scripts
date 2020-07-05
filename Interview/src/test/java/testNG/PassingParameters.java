package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameters {
//The parameter to the method in this class is provided by testng.xml tag <parameter></parameter>. If value is not specified then the value specified in
//@Optional annotation is considered.
//@Optional annotation can be specified for multiple parameters in a test. Separate one for each parameter.
//Multiple parameter can be specified in testng file within different parameter tags and can be passed to multiple @Test methods
//Multiple parameters can be specified in @Parameters tag.
	
	@Test
	@Parameters({"Name","Age"})
	public void test1(@Optional("XYZ") String Name, @Optional("22") String Age) {
		System.out.println("Name: " +Name);
		System.out.println("Age: " +Age);
	}
	
	@Test
	@Parameters("Place")
	public void test2(@Optional("Delhi") String Place) {
		System.out.println("Place: " +Place);
	}

}
