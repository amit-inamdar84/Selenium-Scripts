package testNG;

import org.testng.annotations.Test;

public class PriorityInTestng {
//Priority starts with 0. If no priority is specified default is 0. When two @Test methods are of 0 priority, they will be run in alphabetical order
//and not in the order they appear in the code.
	
	@Test(priority=2)
	public void test1(){
		System.out.println("Running test1");
	}
	
	@Test(priority=1)
	public void test2(){
		System.out.println("Running test2");
	}
	
	@Test(priority=0)
	public void test3(){
		System.out.println("Running test3");
	}

}
