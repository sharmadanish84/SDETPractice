package com.abcd.tyss.testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeCriticalTestCase {
@Test(timeOut = 8000)
public void timeCriticalTestCase(){
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/signup");
	driver.quit();
}
}
