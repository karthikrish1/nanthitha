package testngdepe;

import org.testng.annotations.Test;

public class d1 {
	
	//dependsonMethods: create connection between test cases
	
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("hi");
	}
	
	@Test(priority=1,dependsOnMethods="t1")
	public void t2()
	{
		System.out.println("hello");
	}
	
	//t1: pass    t2: pass
	//t1: fail    t2: skipped 

}
