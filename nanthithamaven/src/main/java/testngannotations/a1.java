package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * before test: only once before all the test cases started its execution
	 * after test: only once after all the test cases finished its execution
	 * 
	 * before class: only once afrer befpre test 
	 * after class:  only once before after test 
	 * 
	 * before method:  run before each test case 
	 * aftermethod:    run after each test case 
	 * 
	 * 
	 * before test   : visiting 
	 * befoer class  : max 
	 *    before method: refresh   tc1: title     aftermethod    : deleting cookies 
	 *   before method : refresh   tc2 : clicking    aftermethod : deleting cookies 
	 * after class   : getting url
	 * after test : closing 
	 *  * 
	 * */
	ChromeDriver ob;
	@Test
	public void t1()
	{
		System.out.println(ob.getTitle());
	}
	
	@Test
	public void t2()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	    ob= new ChromeDriver();
	   ob.get("http://www.google.com");
	}
	
	@AfterTest
	public void at()
	{
		ob.quit();
	}
	
	
	@BeforeClass
	public void bct()
	{
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println(ob.getCurrentUrl());
	}
	
	@BeforeMethod
	public void btm()
	{
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void atm()
	{
		ob.manage().deleteAllCookies();
	}


}
