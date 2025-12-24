package testNG;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamic_code.Baseclass;

public class NormalClass extends Baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		act = new Actions(driver);
		System.out.println("onTestStart");

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		takescreenshot(result.getMethod().getMethodName());
			
			System.out.println("onTestSuccess");
	
	}

	private void takescreenshot(String methodName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("onTestFailur");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		launchbrowser("chrome");
		Hiturl("https://www.limeroad.com/");
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		driver.quit();
		System.out.println("onFinish");

	}
	
	

	

}
