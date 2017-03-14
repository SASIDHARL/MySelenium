package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	@Test
	public void test() throws IOException{
		
		/*System.setProperty("webdriver.firefox.marionette", "E:\\SeleniumAutomation\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://aws-qa.digisight.us/user_sessions/new?locale=en");
		String x = driver.findElement(By.linkText("Create new account")).getText();
		System.out.println(x);
		Properties prop = new Properties();
		OutputStream out = null;
		out = new FileOutputStream("config.properties");
		prop.setProperty("PracticeId",x);
		prop.store(out, null);

		
		driver.quit();
	}

}
