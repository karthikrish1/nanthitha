package testngattri;

import org.testng.annotations.Test;

public class a1 {

	//test case: nonstatic, @Test, default order: alphabetical order
	
	
	//priority : run the test case in a particular order
	//description: add short note on the test case 
	//group 
	//invocationcount 
	//enabled=false 
	//timeout: fix time limit for test case 
	
	
	@Test(priority=0,description="first",groups="L",invocationCount=5,enabled=false)
	public void t1()
	{
		System.out.println("test case 1");
	}
	
	
	@Test(priority=1,description="Second",groups="L")
	public void m1()
	{
		System.out.println("test case 2");
	}
	
	
	@Test(priority=2,groups="K")
	public void t2()
	{
		System.out.println("test case 3");
	}
}
