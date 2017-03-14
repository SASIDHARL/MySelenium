package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class Physician2 {
	WebDriver driver;
	String x;

	
	@Test
	public void test() throws IOException, InterruptedException, AWTException {
		/*System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.firefox.marionette",
				"E:\\SeleniumAutomation\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		driver.get("https://aws-qa.digisight.us/be/login?locale=en");
		driver.get("https://aws-qa.digisight.us/be/login?locale=en");
		driver.findElement(By.id("user_session_username")).sendKeys("sasidhar.reddy@digisight.net");;
		driver.findElement(By.id("user_session_password")).sendKeys("Pramati123!");;
		driver.findElement(By.xpath("//form[@id='new_user_session']/button")).click();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		 driver.get("https://aws-qa.digisight.us/patients/291?locale=en");
		 
		
		//wait for pageload
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 
		 // click add image button;
		driver.findElement(By.xpath("html/body/div[1]/div/section[5]/table[1]/thead/tr/th[2]/button")).click();
		 driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='new_patient_image']/label[2]/h4")).click();
		driver.switchTo().activeElement();
		
		 StringSelection ss = new StringSelection("C:\\Users\\user\\Desktop\\images\\HealthyEyeFundus.jpg");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		    //imitate mouse events like ENTER, CTRL+C, CTRL+V
		    Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
//		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='new_patient_image']/button[7]")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
	
	
	
	

}
