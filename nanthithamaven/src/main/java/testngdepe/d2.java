package testngdepe;

import org.testng.annotations.Test;

public class d2 {
	@Test(priority=0,groups="M")
	public void t1()
	{
		System.out.println("hi");
	}
	
	@Test(priority=1,groups="M")
	public void t2()
	{
		System.out.println("hello");
	}
	
	@Test(priority=2,groups="M")
	public void t3()
	{
		System.out.println("hi");
		
	}
	
	@Test(priority=3,dependsOnGroups="M")
	public void t4()
	{
		System.out.println("hello");
	}

}
