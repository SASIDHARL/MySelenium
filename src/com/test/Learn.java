package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Learn {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.firefox.marionette",
				"E:\\SeleniumAutomation\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		
		driver.close();
		/*Assert.assertEquals(actual,dfs, message);
		Assert.assertNotEquals(actual1, actual2);
		Assert.fail();
		Assert.expectThrows(throwableClass, runnable);
		Assert.assertTrue(condition, message);
		Assert.assertSame(actual, expected);
		Assert.expectThrows(throwableClass, runnable);
		Assert.assertThrows(runnable);
		Assert.assertNull(object, message);
		Assert.assertNotSame(actual, expected);
		Assert.assertNotNull(object, message);
		Assert.assertNotEquals(actual1, actual2, delta, message);
		Assert.assertFalse(condition, message);
		Assert.assertEqualsNoOrder(`, expected, message);*/
		
	}
}
