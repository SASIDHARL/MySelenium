package com.test.Listeners;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{
	 public WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart method");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess method");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver =null;
		// TODO Auto-generated method stub
		System.out.println("onTestFailure method");
		System.out.println("Failed method name : "+result.getMethod().getMethodName()+"\n" + "Failed Class name : "+result.getClass().getName());
		String sTestClassName=result.getTestClass().getRealClass().getSimpleName();
        System.out.println("Test class name ..."+sTestClassName);
        String sFileName=result.getName();
        System.out.println("Test method name ..."+sFileName);
       
        String sTestClassName1 = result.getTestClass().getName();
        System.out.println("sTestClassName1 : "+sTestClassName1);
	
	
    }
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped method");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage method");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart method");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish method");
	}

}
