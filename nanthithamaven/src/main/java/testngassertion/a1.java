package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.l1.class)
public class a1 {
	/*
	 * assertion: technique where we will be comparing actual result with obtained result
	 * 
	 * hard 
	 *    provided by Assert builtin class
	 *    static in nature
	 *    assertion fails=> it will fail the test case 
	 *    
	 * soft 
	 *    provided by soft assert builtin class
	 *    nonstatic in nature
	 *    even if it fails-> it will proceed further
	 *    orig inal : invoke assertAll()
	 * 
	 * assertEquals(actual, expected)
	 * assertNotEquals(Actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * 
	 * */
	
	@Test
	public void hr()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		//classname.methdname()
		//Assert.assertEquals(ob.getTitle(), "Googdfdle");
		Assert.assertNotEquals(ob.getTitle(), "Googdfdle");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}

}
