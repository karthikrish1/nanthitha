package testngattri;

import org.testng.annotations.Test;

public class c1 {
	
	@Test(timeOut=3000)
	public void t1() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("hi");
	}

}
