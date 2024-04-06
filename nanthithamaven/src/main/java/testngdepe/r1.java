package testngdepe;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class r1 {
	ChromeDriver ob;
	@Test(priority=0,description="visiting",groups="J")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1, description="maximising",groups="J")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing ", invocationCount=3,groups="J")
	public void refreshing()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking ",groups="J")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
		
	}
	
	@Test(priority=4, description="closing",timeOut=3000,dependsOnGroups="J")
	public void closing()
	{
		ob.quit();
	}

}
