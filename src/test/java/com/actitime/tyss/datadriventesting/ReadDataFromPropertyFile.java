package com.actitime.tyss.datadriventesting;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile 
{
  public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
	Properties cd= new Properties();
	cd.load(fis);
	String actiTimeurl = cd.getProperty("url");
	System.out.println("actiTimeurl = " + actiTimeurl);
	String actiTimeuserName = cd.getProperty("username");
	System.out.println("actiTimeuserName = " + actiTimeuserName);
	String actiTimepassWord = cd.getProperty("password");
	System.out.println("actiTimepassWord = " + actiTimepassWord);
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get(actiTimeurl);
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys(actiTimeuserName);
	WebElement passWord = driver.findElement(By.name("pwd"));
	passWord.sendKeys(actiTimepassWord);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(5000);
	driver.quit();
}
}
