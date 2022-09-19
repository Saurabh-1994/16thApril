package listnerpack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Sanity Test is Started");
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("TC is Successfully Passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Screenshot is taken");
	}

}
