package testNG;

import org.testng.annotations.Test;

public class GroupsInTestng {
	
	@Test(groups={"Sanity"})
	public void test1(){
		System.out.println("Running test1 in Sanity group");
	}
	
	@Test(groups={"Sanity","regression"})
	public void test2(){
		System.out.println("Running test2 in Sanity and regression group");
	}
	
	@Test(groups={"regression"})
	public void test3(){
		System.out.println("Running test3 in regression group");
	}
}
