package com.selenium.tyss.actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KidsSectionMyntraMoveToElement {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https://www.myntra.com/");
	WebElement kidsSection = driver.findElement(By.linkText("Kids"));
	Actions action = new Actions(driver);
	action.moveToElement(kidsSection).click().perform();
	Thread.sleep(5000);
	driver.quit();
}
}
