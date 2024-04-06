package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class w1 {
	/*testngwaits/webdriver synchronisation technique
	 * 
	 * conditional      : explicit and fluent wait 
	 * unconditional    : implicit wait 
	 * 
	 * 
	 * implicit wait : 
	 * once it is declared all the code which is present after it will take the time limit
	 * 
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
		ob.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//6
		System.out.println(ob.getCurrentUrl());//6
		ob.navigate().refresh();//6
		ob.findElementByLinkText("Imagm,bkjgkues"); //6
		ob.quit();//6
	}

}
