package testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerTest {
//This is the class to test listeners to take some action on test pass or test fail.
	
	int i=0;
	@Test
	public void test1(){
		System.out.println("This is test1");
	}
	
	@Test
	public void test2(){
		throw new SkipException("Skipping this test");
	}
	
	@Test(successPercentage=60, invocationCount=5)
	public void test3(){
		i++;
		System.out.println("test3 method invocation count is: "+i);
		if(i==1 || i==2){
			System.out.println("test3 failed");
			Assert.assertEquals(i, 8);
		}
		
	}
	

}
