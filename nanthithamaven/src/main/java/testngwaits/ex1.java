package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ex1 {

	
	/* 
	 * explcit:  conditional
	 * 
	 * create an object for webrier wait class
	 * pass drver instance and time limit, 
	 * call conditions
	 * code is correct: executes within the time limit, it will proceed further
	 * code is wrong : wait for the completion of time limit, then it will throw up error 
	 * 
	 * 
	 * 
	 * */
	@Test
	public void hr()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(ob,5);
		
		//w.until(ExpectedConditions.titleIs("Gudf"));
		
		//w.until(ExpectedConditions.titleContains("Gd"));
		
		//w.until(ExpectedConditions.alertIsPresent());
		
		//visibility of single element
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
		
		//visibility of more elements
		//collect
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		// clickable or not
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("About")));
		ob.quit();
	}
}
