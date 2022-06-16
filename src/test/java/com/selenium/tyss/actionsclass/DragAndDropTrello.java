package com.selenium.tyss.actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DragAndDropTrello {
	@Test
public static void DragTest() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://trello.com/pftpft1");
	driver.findElement(By.linkText("Log in")).click();
	//limit the search criteria within login form
	WebElement loginForm = driver.findElement(By.id("login-form"));
	WebElement emailID = loginForm.findElement(By.id("user"));
	emailID.clear();
	emailID.sendKeys("peoplefortiptur@gmail.com");
	loginForm.findElement(By.id("login")).click();
	WebElement formLogin = driver.findElement(By.id("form-login"));
	WebElement passWord = formLogin.findElement(By.id("password"));
	passWord.clear();
	passWord.sendKeys("9886947924");
	formLogin.findElement(By.id("login-submit")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@title='pft pft (pftpft1)']")).click();
	driver.findElement(By.xpath("//button/span[text()='Log out']")).click();
	//driver.quit();
	
}
}
