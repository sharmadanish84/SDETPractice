package com.selenium.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LIC {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://licindia.in/");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.linkText("Agents Portal")).click();
		driver.switchTo().alert().accept();
		Set<String> allwindowIds= driver.getWindowHandles();
		   System.out.println(allwindowIds);
		   		   for (String wid : allwindowIds) 
		   {
			System.out.println(wid);
		   }
		//driver.switchTo().window("C581AA6C9C6E0A15918CB86DCD33A0E6");
		//String agenttitle = driver.getTitle();
		//System.out.println(agenttitle);
	}
}
