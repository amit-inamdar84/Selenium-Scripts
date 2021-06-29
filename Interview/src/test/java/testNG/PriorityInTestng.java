package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityInTestng {
//Priority starts with 0. If no priority is specified default is 0. When two @Test methods are of 0 priority, they will be run in alphabetical order
//and not in the order they appear in the code.
	
	@BeforeMethod
	public void test20(){
		System.out.println("1");
	}
	
	@AfterMethod
	public void test30(){
		System.out.println("2");
	}
	
	@Test
	public void test1(){
		System.out.println("Running test1");
	}
	
	@Test(enabled=false)
	public void test2(){
		System.out.println("Running test2");
	}
	
	@Test
	public void test3(){
		System.out.println("Running test3");
	}

}
