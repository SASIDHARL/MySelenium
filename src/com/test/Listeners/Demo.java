package com.test.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void loginFB() {
		System.setProperty("webdriver.firefox.marionette",
				"E:\\SeleniumAutomation\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mukesh@facebook.com");
		driver.findElement(By.id("wronglocator")).sendKeys("dont-tell");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}
}
