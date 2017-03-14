package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class Login2 {
	WebDriver driver;
	String x;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.firefox.marionette",
				"E:\\SeleniumAutomation\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test() throws IOException {

		driver.get("https://aws-qa.digisight.us/user_sessions/new?locale=en");
		x = driver.findElement(By.linkText("Create new account")).getText();
		System.out.println(x);

	}

	@Test
	public void test2() throws IOException, InterruptedException {

		driver.get("http://www.google.com");
		System.out.println("X value in anotehr test method : "+x);
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(x);
	

	}
	
	
	@AfterTest
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus())
		{
			try{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
				System.out.println("Screenshot taken");
			}catch (Exception e) {
				System.out.println("Exception while taking screenshot :"+e.getMessage());
				// TODO: handle exception
			}
		}
		
		driver.quit();
		
	}

}
