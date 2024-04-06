package testnglistener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class l1 implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("SUCESSSS");
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("FAILED");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIPPED");
	}
	
	//ITEstListener : builtin interface: onstart, onfinish, ontestsucess, ontestfailure....
	//class<=> interface
	//right click=> source=> override/implement metods
	

}
